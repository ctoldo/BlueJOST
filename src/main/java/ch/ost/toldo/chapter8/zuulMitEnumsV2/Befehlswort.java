package ch.ost.toldo.chapter8.zuulMitEnumsV2;

/**
 * Repräsentationen für alle gültigen Befehlswörter des Spiels,
 * zusammen mit einer Zeichenkette in einer bestimmten Sprachen.
 * 
 * @author  Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */
public enum Befehlswort
{
    // Ein Wert für jedes Befehlswort zusammen mit der dazugehörigen
    // Benutzereingabe
    GO("go"), QUIT("quit"), HELP("help"), UNKNOWN("?"), LOOK("look");
    
    // Das Befehlswort als Zeichenkette
    private String befehlswort;
    
    /**
     * Initialisieren mit dem entsprechenden Befehlswort.
     * @param befehlswort  das Befehlswort als Zeichenkette
     */
    Befehlswort(String befehlswort)
    {
        this.befehlswort = befehlswort;
    }
    
    /**
     * @return  das Befehlswort als Zeichenkette
     */
    public String toString()
    {
        return befehlswort;
    }
}
