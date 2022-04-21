package ch.ost.toldo.chapter7.brain;

import java.util.*;

/**
 * Eine Zelle in einem zweidimensionalen zellulären Automaten.
 * Die Zelle hat mehrere mögliche Zustände.
 * Dies ist eine Implementierung der Regeln von "Brian's Brain".
 * @see https://en.wikipedia.org/wiki/Brian%27s_Brain
 * 
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29
 */
public class Zelle
{
    // Die möglichen Zustände.
    public static final int LEBEND = 0, TOT = 1, STERBEND = 2;
    // Die Anzahl der möglichen Zustände.
    public static final int ANZ_ZUSTAENDE = 3;

    // Der Zustand der Zelle.
    private int zustand;
    // Die Nachbarn der Zelle.
    private Zelle[] nachbarn;

    /**
     * Setze den Anfangszustand auf TOT.
     */
    public Zelle()
    {
        this(TOT);
    }
    
    /**
     * Setze den Anfangszustand.
     * @param anfangszustand  der Anfangszustand
     */
    public Zelle(int anfangszustand)
    {
        zustand = anfangszustand;
        nachbarn = new Zelle[0];
    }
    
    /**
     * Lege den nächsten Zustand dieser Zelle fest, basierend auf 
     * dem Zustand der Nachbarn.
     * Dies ist eine Implementierung der Regeln für "Brian's Brain".
     * @return  den nächsten Zustand
     */
    public int gibNaechstenZustand()
    {
        if(zustand == TOT) {
            // Zähle die Anzahl der Nachbarn, die LEBEND sind.
            int lebendZaehler = 0;
            for(Zelle n : nachbarn) {
                if(n.gibZustand() == LEBEND) {
                    lebendZaehler++;
                }
            }
            return lebendZaehler == 2 ? LEBEND : TOT;
        }
        else if(zustand == STERBEND) {
            return TOT;
        }
        else {
            return STERBEND;
        }
    }
    
    /**
     * Erhalte die Liste der benachbarten Zellen und erstelle eine Kopie.
     * @param nachbarnListe  die benachbarten Zellen
     */
    public void setzeNachbarn(ArrayList<Zelle> nachbarnListe)
    {
        nachbarn = new Zelle[nachbarnListe.size()];
        nachbarnListe.toArray(nachbarn);
    }

    /**
     * Gib den Zustand dieser Zelle aus.
     * @return  den Zustand
     */
    public int gibZustand()
    {
        return zustand;
    }
    
    /**
     * Setze den Zustand dieser Zelle.
     * @param  den Zustand
     */
    public void setzeZustand(int zustand)
    {
        this.zustand = zustand;
    }   
    
}
