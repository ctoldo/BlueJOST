package ch.ost.toldo.chapter4.musiksammlungV5;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Eine Hilfsklasse für unsere Musik-Software. Diese Klasse kann Dateien mit einer bestimmten
 * Endung aus einem beliebigen Ordner des Dateisystems lesen. Sie geht davon aus, dass der Dateiname
 * den Interpreten und den Titel enthält.
 * 
 * Die Dateinamen der Audiotracks müssen daher einem vorgegebenen Standardformat folgen: auf den Namen
 * des Interpreten folgt, getrennt durch einen Bindestrick der Track-Titel. Zum Beispiel: TheBeatles-HereComesTheSun.mp3
 * 
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29
 */
public class TrackReader
{
    /**
     * Erzeuge einen Track-Reader, mit dem Tracks aus dem Musikbibliotheks-Ordner gelesen werden können.
     */
    public TrackReader()
    {
        // Hier gibt es nichts zu tun.
    }
    
    /**
     * Lies Musikdateien mit der angegebenen Endung aus dem angegebenen Bibliotheksordner.
     * @param ordner  der Ordner, in dem nach Dateien gesucht werden soll
     * @param suffix  die Endung für den Audiotyp
     */
    public ArrayList<Track> liesTracks(String ordner, String suffix)
    {
        File audioOrdner = new File(ordner);
        File[] audioDateien = audioOrdner.listFiles((verz, name) -> 
                    name.toLowerCase().endsWith(suffix));
                
        // Füge alle übereinstimmden Dateien in die Track-Sammlung ein.
        ArrayList<Track> tracks = 
            Arrays.stream(audioDateien).
                   map(datei -> dekodiereDetails(datei)).
                   collect(Collectors.toCollection(ArrayList::new));
        return tracks;
    }

    /**
     * Versuche die Angaben zu Interpret und Titel aus dem Dateinamen zu extrahieren.
     * Geht davon aus, dass der Dateiname folgendes Format hat:
     *     interpret-titel.mp3
     * @param datei  die Track-Datei
     * @return       ein Track-Objekt mit den entsprechenden Angaben
     */
    private Track dekodiereDetails(File datei)
    {
        // Die benötigte Information.
        String interpret = "unbekannt";
        String titel = "unbekannt";
        String dateiname = datei.getPath();
        
        // Sucht im Dateinamen nach dem Interpreten und dem Titel.
        String details = datei.getName();
        String[] komponenten = details.split("-");
        
        if(komponenten.length == 2) {
            interpret = komponenten[0];
            String titelKomponente = komponenten[1];
            // Dateierweiterung entfernen.
            komponenten = titelKomponente.split("\\.");
            if(komponenten.length >= 1) {
                titel = komponenten[0];
            }
            else {
                titel = titelKomponente;
            }
        }
        return new Track(interpret, titel, dateiname);
    }
}
