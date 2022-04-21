package ch.ost.toldo.chapter7.brain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

/**
 * Eine GUI für die Umgebung, mit Laufzeitkontrollen.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version  2016.02.29
 */
public class Umgebungsansicht extends JFrame
{
    // Die längste Verzögerung für die Animation, in Millisekunden.
    private static final int LONGEST_DELAY = 1000;
    // Farben für die unterschiedlichen Zellzustände.
    private static final Color[] colors = {
        Color.WHITE, // Alive
        new Color(68, 100, 129), // Dead
        new Color(204, 196, 72),  // Dying
    };
    
    private GridView view;
    private final Umgebung umg;
    private boolean running;
    private int delay;
    
    /**
     * Constructor for objects of class EnvironmentView
     * @param umg
     */
    public Umgebungsansicht(Umgebung umg, int reihen, int spalten)
    {
        super("Zellulärer 2-D-Automat");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(20, 20);
        this.umg = umg;
        this.running = false;
        setDelay(50);
        setupControls();
        setupGrid(reihen, spalten);
        pack();
        setVisible(true);
    }

    /**
     * Setup a new environment of the given size.
     * @param reihen The number of rows.
     * @param spalten The number of cols;
     */
    private void setupGrid(int reihen, int spalten)
    {
        Container contents = getContentPane();
        view = new GridView(reihen, spalten);
        contents.add(view, BorderLayout.CENTER);
    }
    
    /**
     * Show the states of the cells.
     */
    public void zeigeZellen()
    {
        Zelle[][] zellen = umg.gibZellen();
        if(!isVisible()) {
            setVisible(true);
        }
        
        view.preparePaint();
        for(int reihe = 0; reihe < zellen.length; reihe++) {
            Zelle[] zellReihe = zellen[reihe];
            int anzSpalten = zellReihe.length;
            for(int spalte = 0; spalte < anzSpalten; spalte++) {
                int zustand = zellReihe[spalte].gibZustand();
                view.drawMark(spalte, reihe, colors[zustand]);
            }
        }
        
        view.repaint();
    }
    
    /**
     * Set up the animation controls.
     */
    private void setupControls()
    {
        // Continuous running.
        final JButton start = new JButton("Start");
        start.addActionListener(e -> {
            if(!running) {
                running = true;
                try {
                    new Runner().execute();
                }
                catch(Exception ex) {
                }
            }
        });
        
        // Single stepping.
        final JButton schritt = new JButton("Schritt");
        schritt.addActionListener(e -> {
            running = false;
            umg.schritt();
            zeigeZellen();
        });
        
        // Pause the animation.
        final JButton pause = new JButton("Pause");
        pause.addActionListener(e -> running = false);
        
        // Reset of the environment
        final JButton reset = new JButton("Neu");
        reset.addActionListener(e -> {
            running = false;
            umg.zuruecksetzen();
            zeigeZellen();
        });
        
        // Randomize the environment.
        final JButton zufallsaufbau = new JButton("Zufall");
        zufallsaufbau.addActionListener(e -> {
            running = false;
            umg.zufallsaufbau();
            zeigeZellen();
        });
        
        Container contents = getContentPane();
        
        // A speed controller.
        final JSlider speedSlider = new JSlider(0, 100);
        speedSlider.addChangeListener(e -> {
            setDelay(speedSlider.getValue());
        });
        Container speedPanel = new JPanel();
        speedPanel.setLayout(new GridLayout(2, 1));
        speedPanel.add(new JLabel("Animationsgeschwindigkeit", SwingConstants.CENTER));
        speedPanel.add(speedSlider);
        contents.add(speedPanel, BorderLayout.NORTH);
        
        // Place the button controls.
        JPanel controls = new JPanel();
        controls.add(start);
        controls.add(schritt);
        controls.add(pause);
        controls.add(reset);
        controls.add(zufallsaufbau);
        
        contents.add(controls, BorderLayout.SOUTH);
    }

    
    /**
     * Set the animation delay.
     * @param speedPercentage (100-speedPercentage) as a percentage of the LONGEST_DELAY.
     */
    private void setDelay(int speedPercentage)
    {
        delay = (int) ((100.0 - speedPercentage) * LONGEST_DELAY / 100);
    }
    
    /**
     * Provide stepping of the animation.
     */
    private class Runner extends SwingWorker<Boolean, Void>
    {
        @Override
        /**
         * Repeatedly single-step the environment as long
         * as the animation is running.
         */
        public Boolean doInBackground()
        {
            while(running) {
                umg.schritt();
                zeigeZellen();
                try {
                    Thread.sleep(delay);
                }
                catch(InterruptedException e) {
                }
            }
            return true;
        }
    }


    /**
     * Provide a graphical view of a rectangular grid.
     */
    @SuppressWarnings("serial")
    private class GridView extends JPanel
    {
        private final int GRID_VIEW_SCALING_FACTOR = 10;

        private final int gridWidth, gridHeight;
        private int xScale, yScale;
        private Dimension size;
        private Graphics g;
        private Image fieldImage;

        /**
         * Create a new GridView component.
         */
        public GridView(int height, int width)
        {
            gridHeight = height;
            gridWidth = width;
            size = new Dimension(0, 0);
        }

        /**
         * Tell the GUI manager how big we would like to be.
         */
        @Override
        public Dimension getPreferredSize()
        {
            return new Dimension(gridWidth * GRID_VIEW_SCALING_FACTOR,
                                 gridHeight * GRID_VIEW_SCALING_FACTOR);
        }

        /**
         * Prepare for a new round of painting. Since the component
         * may be resized, compute the scaling factor again.
         */
        public void preparePaint()
        {
            if(! size.equals(getSize())) {
                size = getSize();
                fieldImage = view.createImage(size.width, size.height);
                g = fieldImage.getGraphics();

                xScale = size.width / gridWidth;
                if(xScale < 1) {
                    xScale = GRID_VIEW_SCALING_FACTOR;
                }
                yScale = size.height / gridHeight;
                if(yScale < 1) {
                    yScale = GRID_VIEW_SCALING_FACTOR;
                }
            }
        }
        
        /**
         * Paint on grid location on this field in a given color.
         */
        public void drawMark(int x, int y, Color color)
        {
            g.setColor(color);
            g.fillRect(x * xScale, y * yScale, xScale-1, yScale-1);
        }

        /**
         * The field view component needs to be redisplayed. Copy the
         * internal image to screen.
         */
        @Override
        public void paintComponent(Graphics g)
        {
            if(fieldImage != null) {
                Dimension currentSize = getSize();
                if(size.equals(currentSize)) {
                    g.drawImage(fieldImage, 0, 0, null);
                }
                else {
                    // Rescale the previous image.
                    g.drawImage(fieldImage, 0, 0, currentSize.width, currentSize.height, null);
                }
            }
        }
    }
}
