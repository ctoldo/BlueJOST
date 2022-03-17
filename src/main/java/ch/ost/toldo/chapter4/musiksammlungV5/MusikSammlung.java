package ch.ost.toldo.chapter4.musiksammlungV5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.Random;

/**
 * Eine Klasse zur Verwaltung von Audiotracks.
 * Die einzelnen Tracks können abgespielt werden.
 *
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29
 */
public class MusikSammlung {
  // Eine ArrayList, in der die Musik-Tracks gespeichert werden können.
  private ArrayList<Track> tracks;
  // Ein Player zum Abspielen der Musik-Tracks.
  private MusikPlayer player;
  // Ein Reader, der Musikdateien lesen und als Tracks laden kann.
  private TrackReader reader;

  /**
   * Erzeuge eine MusikSammlung.
   */
  public MusikSammlung() {
    tracks = new ArrayList<>();
    player = new MusikPlayer();
    reader = new TrackReader();
    liesBibliothek("src/main/java/ch/ost/toldo/chapter4/audio");
    System.out.println("Musikbibliothek wurde geladen. " + gibAnzahlTracks() + " Tracks.");
    System.out.println();
  }

  public void setzteAlbumTitel(String trackTitel, String albumTitel) {
    Optional<Track> trackOptional = tracks.stream().filter(track -> track.gibTitel().equals(trackTitel)).findFirst();
    if (trackOptional.isPresent()) {
      Track track = trackOptional.get();
      track.setzeAlbum(albumTitel);
    } else {
      System.out.println("Track nicht gefunden.");
    }
  }

  /**
   * Füge der Sammlung eine Track-Datei hinzu.
   *
   * @param dateiname der Dateiname des hinzuzufügenden Tracks
   */
  public void dateiHinzufuegen(String dateiname) {
    tracks.add(new Track(dateiname));
  }

  /**
   * entfernt alle Tracks, die in irgendeinem Feld den übergebenen String enthält
   *
   * @param toRemove Zeichenkette, für Filterung
   */
  public void tracksEntfernen(String toRemove) {
    Iterator<Track> iterator = tracks.iterator();
    while (iterator.hasNext()) {
      Track track = iterator.next();
      String titel = track.gibTitel();
      String dateiname = track.gibDateiname();
      String interpret = track.gibInterpret();
      String album = track.gibAlbum();
      if (dateiname.contains(toRemove) || titel.contains(toRemove) || interpret.contains(toRemove) || album.contains(toRemove)) {
        iterator.remove();
      }
    }
  }

  /**
   * Füge der Sammlung einen Track hinzu.
   *
   * @param track der hinzuzufügende Track
   */
  public void trackHinzufuegen(Track track) {
    tracks.add(track);
  }

  /**
   * Spiele einen Track aus der Sammlung.
   *
   * @param index der Index des abzuspielenden Tracks
   */
  public void spieleTrack(int index) {
    if (gueltigerIndex(index)) {
      Track track = tracks.get(index);
      player.starteAbspielen(track.gibDateiname());
      track.erhoeheAbspielFrequenz();
      System.out.println("Sie hoeren gerade: " + track.gibInterpret() + " - " + track.gibTitel());
    }
  }

  public void spieleZufaelligerTrack() {
    Random random = new Random();
    int randomTrack = random.nextInt(0, tracks.size() - 1);
    spieleTrack(randomTrack);
  }

  public void spieleTracksInZuefaelligerReihenfolge() {
    ArrayList<Track> tracks = new ArrayList<>(this.tracks);
    Random random = new Random();
    while (tracks.size() > 0) {

    }

  }

  /**
   * Liefere die Anzahl der Tracks in dieser Sammlung.
   *
   * @return die Anzahl der Tracks in dieser Sammlung
   */
  public int gibAnzahlTracks() {
    return tracks.size();
  }


  /**
   * Gib einen Track aus der Sammlung auf die Konsole aus.
   *
   * @param index der Index des auszugebenden Tracks
   */
  public void trackAusgeben(int index) {
    System.out.print("Track " + index + ": ");
    Track track = tracks.get(index);
    System.out.println(track.gibDetails());
  }

  /**
   * Gib eine Liste aller Tracks in der Sammlung aus.
   */
  public void alleTracksAusgeben() {
    System.out.println("Track-Liste: ");

    for (Track track : tracks) {
      System.out.println(track.gibDetails());
    }
    System.out.println();
  }

  /**
   * Liste alle Tracks zu einem gegebenen Interpreten.
   *
   * @param interpret der Name des Interpreten
   */
  public void bestimmteTracksAusgeben(String interpret) {
    for (Track track : tracks) {
      if (track.gibInterpret().contains(interpret)) {
        System.out.println(track.gibDetails());
      }
    }
  }


  /**
   * Entferne einen Track aus der Sammlung.
   *
   * @param index der Index, des zu entfernenden Tracks
   */
  public void entferneTrack(int index) {
    if (gueltigerIndex(index)) {
      tracks.remove(index);
    }
  }

  /**
   * Spiele den ersten Track aus der Sammlung, falls vorhanden.
   */
  public void spieleErsten() {
    if (tracks.size() > 0) {
      Track track = tracks.get(0);
      player.starteAbspielen(track.gibDateiname());
      track.erhoeheAbspielFrequenz();
    }
  }

  /**
   * Stoppt den Player.
   */
  public void beendeAbspielen() {
    player.stop();
  }

  /**
   * Stelle fest, ob der gegebene Index für die Sammlung gültig ist.
   * Falls nicht, wird eine Fehlermeldung ausgegeben.
   *
   * @param index der zu prüfende Index
   * @return true  wenn der Index gültig ist, andernfalls false
   */
  private boolean gueltigerIndex(int index) {
    // Der Rückgabewert.
    // Setze den Rückgabewert abhängig davon, ob der Index gültig ist oder nicht.
    boolean gueltig;

    if (index < 0) {
      System.out.println("Indizes koennen nicht negativ sein: " + index);
      gueltig = false;
    } else if (index >= tracks.size()) {
      System.out.println("Index ist zu gross: " + index);
      gueltig = false;
    } else {
      gueltig = true;
    }
    return gueltig;
  }

  private void liesBibliothek(String ordnerName) {
    ArrayList<Track> tempTracks = reader.liesTracks(ordnerName, ".mp3");

    // Alle Tracks in die Sammlung einfügen.
    for (Track track : tempTracks) {
      trackHinzufuegen(track);
    }
  }

}
