package ch.ost.toldo.chapter8.zuulMitEnumsV2;

/**
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes 
 * Adventure-Game.
 * 
 * Objekte dieser Klasse halten Informationen über Befehle,
 * die der Benutzer eingegeben hat. Ein Befehl besteht momentan
 * aus zwei Teilen: einem Befehlswort und einer Zeichenkette 
 * (zum Beispiel sind beim Befehl "nimm karte" die beiden
 * Zeichenketten "nimm" und "karte").
 * 
 * Befehle werden von Benutzern dieser Klasse auf Gültigkeit
 * überprüft. Wenn ein Spieler einen ungültigen Befehl eingegeben
 * hat (ein unbekanntes Befehlswort), dann ist das Befehlswort <null>.
 *
 * Wenn der Befehl nur aus einem Wort bestand, dann ist das
 * zweite Wort <null>.
 * 
 * @author  Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */

class Befehl
{
    private Befehlswort befehlswort;
    private String zweitesWort;

    /**
     * Erzeuge ein Befehlsobjekt. beide Parameter müssen angegeben werden,
     * aber der zweite darf 'null' sein.
     * @param befehlswort  das Befehlswort. UNKNOWN, wenn dieser Befehl nicht
     *                     vom Spiel erkannt wurde.
     * @param zweitesWort  das zweite Wort des Befehls. Darf null sein.
     */
    public Befehl(Befehlswort befehlswort, String zweitesWort)
    {
        this.befehlswort = befehlswort;
        this.zweitesWort = zweitesWort;
    }

    /**
     * Liefere das Befehlswort (das erste Wort) dieses Befehls.
     * Wenn der Befehl nicht verstanden wurde, ist das Ergebnis
     * UNKNOWN.
     * @return  das Befehlswort
     */
    public Befehlswort gibBefehlswort()
    {
        return befehlswort;
    }

    /**
     * @return  das zweite Wort dieses Befehls
     *          liefere 'null', wenn es kein zweites Wort gab
     */
    public String gibZweitesWort()
    {
        return zweitesWort;
    }

    /**
     * @return  true, wenn dieser Befehl nicht verstanden wurde
     */
    public boolean istUnbekannt()
    {
        return (befehlswort == Befehlswort.UNKNOWN);
    }

    /**
     * @return  true, wenn dieser Befehl ein zweites Wort hat
     */
    public boolean hatZweitesWort()
    {
        return (zweitesWort != null);
    }
}

