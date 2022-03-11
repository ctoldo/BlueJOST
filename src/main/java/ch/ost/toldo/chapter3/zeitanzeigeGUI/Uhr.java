package ch.ost.toldo.chapter3.zeitanzeigeGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Eine sehr einfache GUI (Graphical User Interface) für die Uhrenanzeige.
 * In dieser Implementierung rückt die Uhr pro Sekunde um 3 Minuten vor, um
 * das Testen der Anzeige zu beschleunigen.
 * 
 * @author Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */
public class Uhr
{
    private JFrame fenster;
    private JLabel label;
    private Uhrenanzeige uhr;
    private boolean uhrLaeuft = false;
    private TimerThread timerThread;
    
    /**
     * Konstruktor für ein Objekt von Uhr
     */
    public Uhr()
    {
        fensterErzeugen();
        uhr = new Uhrenanzeige();
    }
    
    /**
     * 
     */
    private void starten()
    {
        uhrLaeuft = true;
        timerThread = new TimerThread();
        timerThread.start();
    }
    
    /**
     * 
     */
    private void anhalten()
    {
        uhrLaeuft = false;
    }
    
    /**
     * 
     */
    private void vorruecken()
    {
        uhr.taktsignalGeben();
        label.setText(uhr.gibUhrzeit());
    }
    
    /**
     * 'Info'-Funktion: Zeige Informationen zur Anwendung.
     */
    private void zeigeInfo()
    {
        JOptionPane.showMessageDialog (fenster, 
                    "Uhr Version 1.0\n" +
                    "Eine einfache Benutzeroberfläche für das 'Java lernen mit BlueJ'-Projekt Zeitanzeige",
                    "Info Uhr", 
                    JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * 'Beenden'-Funktion: Beenden der Anwendung.
     */
    private void beenden()
    {
        System.exit(0);
    }

    
    /**
     * Erzeuge das Swing-Fenster und seinen Inhalt.
     */
    private void fensterErzeugen()
    {
        fenster = new JFrame("Uhr");
        JPanel contentPane = (JPanel)fenster.getContentPane();
        contentPane.setBorder(new EmptyBorder(1, 60, 1, 60));

        menuezeileErzeugen(fenster);
        
        //Ein Layout mit hübschen Abständen definieren
        contentPane.setLayout(new BorderLayout(12, 12));
        
        // Das mittige Anzeigefeld erzeugen
        label = new JLabel("00:00", SwingConstants.CENTER);
        Font anzeigeSchrift = label.getFont().deriveFont(96.0f);
        label.setFont(anzeigeSchrift);
        //imagePanel.setBorder(new EtchedBorder());
        contentPane.add(label, BorderLayout.CENTER);

        // Die Werkzeugleiste mit den Knöpfen erzeugen
        JPanel werkzeugleiste = new JPanel();
        werkzeugleiste.setLayout(new GridLayout(1, 0));
        
        JButton startKnopf = new JButton("Start");
        startKnopf.addActionListener(e -> starten());
        werkzeugleiste.add(startKnopf);
        
        JButton anhaltenKnopf = new JButton("Stop");
        anhaltenKnopf.addActionListener(e -> anhalten());;
        werkzeugleiste.add(anhaltenKnopf);

        JButton vorrueckenKnopf = new JButton("Vorrücken");
        vorrueckenKnopf.addActionListener(e -> vorruecken());
        werkzeugleiste.add(vorrueckenKnopf);

        // Werkzeugleiste mit Flow-Layout zur räumlichen Trennung in ein Panel legen
        JPanel flow = new JPanel();
        flow.add(werkzeugleiste);
        
        contentPane.add(flow, BorderLayout.SOUTH);
        
        // Aufbau abgeschlossen - Komponenten arrangieren      
        fenster.pack();
        
        // Das Fenster in die Bildschirmmitte platzieren und anzeigen
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        fenster.setLocation(d.width/2 - fenster.getWidth()/2, d.height/2 - fenster.getHeight()/2);
        fenster.setVisible(true);
    }
    
    /**
     * Erzeugen der Menüzeile.
     * 
     * @param fenster   das Fenster, in das die Menüleiste eingefügtwerden soll
     */
    private void menuezeileErzeugen(JFrame fenster)
    {
        final int SHORTCUT_MASK =
            Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();

        JMenuBar menuezeile = new JMenuBar();
        fenster.setJMenuBar(menuezeile);
        
        JMenu menue;
        JMenuItem eintrag;
        
        // Das Datei-Menü erzeugen
        menue = new JMenu("Datei");
        menuezeile.add(menue);
        
        eintrag = new JMenuItem("Info...");
            eintrag.addActionListener(e -> zeigeInfo());
        menue.add(eintrag);

        menue.addSeparator();
        
        eintrag = new JMenuItem("Beenden");
            eintrag.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
            eintrag.addActionListener(e -> beenden());
        menue.add(eintrag);
    }
    
    class TimerThread extends Thread
    {
        public void run()
        {
            while (uhrLaeuft) {
                vorruecken();
                pause();
            }
        }
        
        private void pause()
        {
            try {
                Thread.sleep(300);   // Pause für 300 Millisekunden
            }
            catch (InterruptedException exc) {
            }
        }
    }
}