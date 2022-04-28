package ch.ost.toldo.chapter9.rechnerKomplett;

import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Eine grafische Schnittstelle für den Rechner. Hier wird keine
 * Berechnung durchgeführt. Diese Klasse ist ausschließlich für
 * die Anzeige auf dem Bildschirm zuständig. Sie lässt die
 * Recheneinheit alle Berechnungen ausführen.
 * 
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29
 */
public class GrafischeSchnittstelle
{
    private Recheneinheit rechner;
    private boolean autorAnzeigen;

    private JFrame fenster;
    private JTextField anzeige;
    private JLabel status;

    /**
     * Erzeuge eine grafische Benutzungsschnittstelle für 
     * eine Recheneinheit.
     * @param recheneinheit  die Recheneinheit
     */
    public GrafischeSchnittstelle(Recheneinheit recheneinheit)
    {
        rechner = recheneinheit;
        autorAnzeigen = true;
        fensterAufbauen();
        fenster.setVisible(true);
    }

    /**
     * Setze die Sichtbarkeit dieser grafischen Schnittstelle.
     * @param sichtbar
     *        true, wenn die Schnittstelle sichtbar sein soll, false sonst
     * 
     */
    public void setzeSichtbarkeit(boolean sichtbar)
    {
        fenster.setVisible(sichtbar);
    }

    /**
     * Baue das Fenster für diese grafische Oberfläche auf.
     */
    private void fensterAufbauen()
    {
        fenster = new JFrame(rechner.gibTitel());
        
        JPanel fensterflaeche = (JPanel)fenster.getContentPane();
        fensterflaeche.setLayout(new BorderLayout(8, 8));
        fensterflaeche.setBorder(new EmptyBorder( 10, 10, 10, 10));

        anzeige = new JTextField();
        fensterflaeche.add(anzeige, BorderLayout.NORTH);

        JPanel tastenfeld = new JPanel(new GridLayout(4, 4));
            zifferntasteHinzufuegen(tastenfeld, 7);
            zifferntasteHinzufuegen(tastenfeld, 8);
            zifferntasteHinzufuegen(tastenfeld, 9);
            tasteHinzufuegen(tastenfeld, "C", () -> rechner.clear());
            
            zifferntasteHinzufuegen(tastenfeld, 4);
            zifferntasteHinzufuegen(tastenfeld, 5);
            zifferntasteHinzufuegen(tastenfeld, 6);
            tasteHinzufuegen(tastenfeld, "?", () -> infoZeigen());
            
            zifferntasteHinzufuegen(tastenfeld, 1);
            zifferntasteHinzufuegen(tastenfeld, 2);
            zifferntasteHinzufuegen(tastenfeld, 3);
            tastenfeld.add(new JLabel(" "));
            
            zifferntasteHinzufuegen(tastenfeld, 0);
            tasteHinzufuegen(tastenfeld, "+", () -> rechner.plus());
            tasteHinzufuegen(tastenfeld, "-", () -> rechner.minus());
            tasteHinzufuegen(tastenfeld, "=", () -> rechner.gleich());
            
        fensterflaeche.add(tastenfeld, BorderLayout.CENTER);

        status = new JLabel(rechner.gibAutor());
        fensterflaeche.add(status, BorderLayout.SOUTH);

        fenster.pack();
    }

    /**
     * Füge dem Tastenfeld eine Taste hinzu.
     * @param panel       der Panel, der die Taste aufnehmen soll
     * @param tastentext  der Text für die Taste
     * @param aktion      die Aktion, die von der Taste ausgeführt werden soll
     */
    private void tasteHinzufuegen(Container panel, String tastentext, Tastenaktion aktion)
    {
        JButton taste = new JButton(tastentext);
        taste.addActionListener(e -> { aktion.act(); auffrischen(); });
        panel.add(taste);
    }

    /**
     * Füge eine Zifferntaste zum Tastenfeld hinzu.
     * @param panel   der Panel, der die Taste aufnehmen soll
     * @param ziffer  die einzelne Ziffer für die Taste
     */
    private void zifferntasteHinzufuegen(Container panel, int ziffer)
    {
        tasteHinzufuegen(panel, "" + ziffer, () -> rechner.zifferGetippt(ziffer));
    }

    /**
     * Frische die grafische Anzeige mit dem aktuellen Wert der
     * Recheneinheit auf.
     */
    private void auffrischen()
    {
        anzeige.setText("" + rechner.gibAnzeigewert());
    }

    /**
     * Wechsle die Informationsausgabe in der Statuszeile zwischen
     * der Autoren- und der Versionsinformation.
     */
    private void infoZeigen()
    {
        if(autorAnzeigen)
            status.setText(rechner.gibVersion());
        else
            status.setText(rechner.gibAutor());

        autorAnzeigen = !autorAnzeigen;
    }
    
    /**
     * Funktionale Schnittstelle für Tastenaktionen.
     */
    @FunctionalInterface
    private interface Tastenaktion
    {
        /**
         * Agiere bei einem Tastendruck.
         */
        public void act();
    }
    
}
