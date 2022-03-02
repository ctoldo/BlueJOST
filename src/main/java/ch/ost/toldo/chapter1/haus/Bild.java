package ch.ost.toldo.chapter1.haus;

/**
 * Diese Klasse definiert ein einfaches Bild. Um das Bild auf
 * dem Bildschirm anzeigen zu lassen, muss die zeichne-Operation auf
 * einem Exemplar aufgerufen werden.
 * Aber hier steckt mehr drin: Da es eine elektronische Zeichnung ist,
 * kann sie geändert werden. Man kann sie schwarz-weiß anzeigen lassen
 * und dann wieder in Farbe (nachdem sie gezeichnet wurde, ist ja klar).
 * 
 * Diese Klasse ist als frühes Java-Lehrbeispiel mit BlueJ gedacht.
 * 
 * @author  Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */
public class Bild
{
    private Quadrat wand;
    private Quadrat fenster;
    private Dreieck dach;
    private Kreis sonne;
    private boolean gezeichnet;

    /**
     * Konstruktor für Objekte der Klasse Bild
     */
    public Bild()
    {
        wand = new Quadrat();
        fenster = new Quadrat();
        dach = new Dreieck();  
        sonne = new Kreis();
        gezeichnet = false;
    }

    /**
     * Zeichne das Bild.
     */
    public void zeichne()
    {
        if(!gezeichnet) {
            wand.horizontalBewegen(-140);
            wand.vertikalBewegen(20);
            wand.groesseAendern(120);
            wand.sichtbarMachen();
        
            fenster.farbeAendern("schwarz");
            fenster.horizontalBewegen(-120);
            fenster.vertikalBewegen(40);
            fenster.groesseAendern(40);
            fenster.sichtbarMachen();

            dach.groesseAendern(60, 180);
            dach.horizontalBewegen(20);
            dach.vertikalBewegen(-60);
            dach.sichtbarMachen();

            sonne.farbeAendern("gelb");
            sonne.horizontalBewegen(100);
            sonne.vertikalBewegen(-40);
            sonne.groesseAendern(80);
            sonne.sichtbarMachen();
            gezeichnet = true;
        }
    }

    /**
     * Ändere die Darstellung in schwarz-weiß.
     */
    public void inSchwarzWeissAendern()
    {
        wand.farbeAendern("schwarz");
        fenster.farbeAendern("weiss");
        dach.farbeAendern("schwarz");
        sonne.farbeAendern("schwarz");
    }

    /**
     * Ändere die Darstellung in Farbe.
     */
    public void inFarbeAendern()
    {
        wand.farbeAendern("rot");
        fenster.farbeAendern("schwarz");
        dach.farbeAendern("gruen");
        sonne.farbeAendern("gelb");
    }
}
