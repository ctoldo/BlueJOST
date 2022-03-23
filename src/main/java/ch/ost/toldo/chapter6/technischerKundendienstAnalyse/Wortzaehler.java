package ch.ost.toldo.chapter6.technischerKundendienstAnalyse;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Aufzeichnungen, wie häufig jedes Wort vom Benutzer
 * eingegeben wurde.
 * 
 * @author     Michael Kölling und David J. Barnes
 * @version    1.0 (2016.02.29)
 */
public class Wortzaehler
{
    // Jedes Wort wird mit einer Zählung verbunden.
    private HashMap<String, Integer> zaehlungen;

    /**
     * Erzeuge einen Wortzähler.
     */
    public Wortzaehler()
    {
        zaehlungen = new HashMap<>();
    }
    
    /**
     * Aktualisiere die Zählungen aller Wörter in der Eingabe.
     * @param eingabe  eine Menge von Wörtern, die vom Benutzer eingegeben wurden
     */
    public void woerterHinzufuegen(HashSet<String> eingabe)
    {
        for(String wort : eingabe) {
            int zaehler = zaehlungen.getOrDefault(wort, 0);
            zaehlungen.put(wort, zaehler + 1);
        }
    }
}
