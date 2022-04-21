package ch.ost.toldo.chapter7.brain;

import java.security.SecureRandom;
import java.util.*;

/**
 * Verwaltet die Umgebung eines zweidimensionalen zellulären Automaten.
 * 
 * @author David J. Barnes
 * @version  2016.02.29
 */
public class Umgebung
{
    // Standardgröße für die Umgebung.
    private static final int STANDARD_ZEILEN = 50;
    private static final int STANDARD_SPALTEN = 50;
    
    // Das Zellengitter.
    private Zelle[][] zellen;
    // Visualisierung der Umgebung.
    private final Umgebungsansicht ansicht;

    /**
     * Erzeuge eine Umgebung der Standardgröße.
     */
    public Umgebung()
    {
        this(STANDARD_ZEILEN, STANDARD_SPALTEN);
    }

    /**
     * Erzeuge eine Umgebung der angegebenen Größe.
     * @param anzahlZeilen   die Anzahl der Zeilen
     * @param anzahlSpalten  die Anzahl der Spalten
     */
    public Umgebung(int anzahlZeilen, int anzahlSpalten)
    {
        setup(anzahlZeilen, anzahlSpalten);
        zufallsaufbau();
        ansicht = new Umgebungsansicht(this, anzahlZeilen, anzahlSpalten);
        ansicht.zeigeZellen();
    }
    
    /**
     * Führe einen Schritt des Automaten aus.
     */
    public void schritt()
    {
        int anzahlZeilen = zellen.length;
        int anzahlSpalten = zellen[0].length;
        // Aufbau eines Datensatzes für den nächsten Zustand jeder Zelle.
        int[][] naechsteZustaende = new int[anzahlZeilen][anzahlSpalten];
        // Jede Zelle auffordern, ihren nächsten Zustand festzulegen.
        for(int zeile = 0; zeile < anzahlZeilen; zeile++) {
            int[] zeileVonZustaende = naechsteZustaende[zeile];
            for(int spalte = 0; spalte < anzahlSpalten; spalte++) {
                zeileVonZustaende[spalte] = zellen[zeile][spalte].gibNaechstenZustand();
            }
        }
        // Aktualisieren der Zellzustände.
        for(int zeile = 0; zeile < anzahlZeilen; zeile++) {
            int[] zeileVonZustaende = naechsteZustaende[zeile];
            for(int spalte = 0; spalte < anzahlSpalten; spalte++) {
                setzeZellzustand(zeile, spalte, zeileVonZustaende[spalte]);
            }
        }
    }
    
    /**
     * Setze den Zustand des Automaten zurück auf TOT für alle Zellen.
     */
    public void zuruecksetzen()
    {
        int anzahlZeilen = zellen.length;
        int anzahlSpalten = zellen[0].length;
        for(int zeile = 0; zeile < anzahlZeilen; zeile++) {
            for(int spalte = 0; spalte < anzahlSpalten; spalte++) {
                setzeZellzustand(zeile, spalte, Zelle.TOT);
            }
        }
    }
    
    /**
     * Erzeuge einen zufälligen Aufbau.
     */
    public void zufallsaufbau()
    {
        int anzahlZeilen = zellen.length;
        int anzahlSpalten = zellen[0].length;
        SecureRandom rand = new SecureRandom();
        for(int zeile = 0; zeile < anzahlZeilen; zeile++) {
            for(int spalte = 0; spalte < anzahlSpalten; spalte++) {
                setzeZellzustand(zeile, spalte, rand.nextInt(Zelle.ANZ_ZUSTAENDE));
            }
        }
    }
    
    /**
     * Setze den Zustand einer Zelle.
     * @param zeile    die Zeile der Zelle
     * @param spalte   die Spalte der Zelle
     * @param zustand  der Zustand der Zelle
     */
    public void setzeZellzustand(int zeile, int spalte, int zustand)
    {
        zellen[zeile][spalte].setzeZustand(zustand);
    }
    
    /**
     * Liefere das Zellengitter.
     * @return  das Zellengitter
     */
    public Zelle[][] gibZellen()
    {
        return zellen;
    }
    
    /**
     * Richte eine neue Umgebung der angegebenen Größe ein.
     * @param anzahlZeilen   die Anzahl der Zeilen
     * @param anzahlSpalten  die Anzahl der Spalten
     */
    private void setup(int anzahlZeilen, int anzahlSpalten)
    {
        zellen = new Zelle[anzahlZeilen][anzahlSpalten];
        for(int zeile = 0; zeile < anzahlZeilen; zeile++) {
            for (int spalte = 0; spalte < anzahlSpalten; spalte++) {
                zellen[zeile][spalte] = new Zelle();
            }
        }
        setupNachbarn();
    }
    
    /**
     * Gib jeder Zelle eine Liste ihrer Nachbarn.
     */
    private void setupNachbarn()
    {
        int anzahlZeilen = zellen.length;
        int anzahlSpalten = zellen[0].length;
        // 8 Nachbarn plus die Zelle selbst
        ArrayList<Zelle> nachbarn = new ArrayList<>(9);
        for(int zeile = 0; zeile < anzahlZeilen; zeile++) {
            for(int spalte = 0; spalte < anzahlSpalten; spalte++) {
                Zelle zelle = zellen[zeile][spalte];
                // Dieser Prozess wird auch für die Zelle selbst ausgeführt.
                for(int dz = -1; dz <= 1; dz++) {
                    for(int ds = -1; ds <= 1; ds++) {
                        int nz = (anzahlZeilen + zeile + dz) % anzahlZeilen;
                        int ns = (anzahlSpalten + spalte + ds) % anzahlSpalten;
                        nachbarn.add(zellen[nz][ns]);
                    }
                }
                // Die Menge der Nachbarn sollte die Zelle an Position (zeile,spalte)
                // nicht enthalten, deshalb wird sie entfernt.
                nachbarn.remove(zelle);
                zelle.setzeNachbarn(nachbarn);
                nachbarn.clear();
            }
        }
    }
}
