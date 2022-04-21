package ch.ost.toldo.chapter7.automatV4;

import java.util.*;

/**
 * Modelliert einen eindimensionalen elementaren zellulären Automaten.
 * 
 * @author David J. Barnes und Michael Kölling
 * @version  2016.02.29 - Version 4
 */
public class Automat
{
    // Die Anzahl der Zellen.
    private final int anzahlZellen;
    // Der Zustand der Zellen.
    private int[] zustand;
    // Die Zustandstabelle, die die Änderung des nächsten Zustands codiert.
    private int[] zustandstabelle;
    
    /**
     * Erzeuge einen eindimensionalen Automaten, der aus der angegebenen
     * Anzahl an Zellen besteht.
     * @param anzahlZellen  die Anzahl der Zellen im Automaten
     */
    public Automat(int anzahlZellen)
    {
        this.anzahlZellen = anzahlZellen;
        // ein zusätzliches Element zulassen, um Zaunpfahlfehler zu vermeiden
        zustand = new int[anzahlZellen + 1];
        zustandstabelle = new int[] {
             0, 1, 0, 0, 1, 0, 0, 1, // Wolframcode 146
        };
        // den Automaten einrichten mit einer einzelnen 'an'-Zelle in der Mitte
        zustand[anzahlZellen / 2] = 1;
    }
    
    /**
     * Gib den akutellen Zustand des Automaten aus.
     */
    public void ausgeben()
    {
        for(int zellenwert : zustand) {
            System.out.print(zellenwert == 1 ? "*" : " ");
        }
        System.out.println();
    }   
    
    /**
     * Aktualisiere den Automaten auf seinen nächsten Zustand.
     */
    public void aktualisieren()
    {
        // Baut den neuen Zustand in einem anderen Array auf.
        int[] naechsterZustand = new int[zustand.length];
        // 0 verwenden für den nicht existierenden Wert 
        // links von der ersten Zelle
        int links = 0;
        int zentrum = zustand[0];
        for(int i = 0; i < anzahlZellen; i++) {
            int rechts = zustand[i + 1];
            naechsterZustand[i] = berechneNaechstenZustand(links, zentrum, rechts);
            links = zentrum;
            zentrum = rechts;
        }
        
        zustand = naechsterZustand;
    }
    
    /**
     * Setze den Automaten zurück.
     */
    public void zuruecksetzen()
    {
        Arrays.fill(zustand, 0);
        // den Automaten einrichten mit einer einzelnen 'an'-Zelle.
        zustand[anzahlZellen / 2] = 1;
            
    }

    /**
     * Berechne den nächsten Zustand der Zelle im Zentrum
     * anhand der Werte der aktuellen linken, zentralen und 
     * rechten Zelle.
     * Damit wird Wolframcode 110 implementiert.
     * @see    https://en.wikipedia.org/wiki/Wolfram_code
     * @param links    der Zustand der Zelle links vom Zentrum
     * @param zentrum  der Zustand der Zelle im Zentrum
     * @param rechts   der Zustand der Zelle rechts vom Zentrum
     * @return         den neuen Wert des Zentrums (0 oder 1)
     */
    private int berechneNaechstenZustand(int links, int zentrum, int rechts)
    {
        return zustandstabelle[tripletCodieren(links, zentrum, rechts)];
    }

    /**
     * Codiere das 1/0-Triplet (links, zentrum, rechts) als einen
     * ganzzahligen Wert im Bereich 0-7.
     * @param links    der Zustand der Zelle links vom Zentrum (0 oder 1)
     * @param zentrum  der Zustand der Zelle im Zentrum (0 oder 1)
     * @param rechts   der Zustand der Zelle rechts vom Zentrum (0 oder 1)
     * @return  (links,zentrum,rechts) als ein 3-Bit-Wert interpretiert
     */
    private int tripletCodieren(int links, int zentrum, int rechts)
    {
        return links * 4 + zentrum * 2 + rechts;

    }
}
