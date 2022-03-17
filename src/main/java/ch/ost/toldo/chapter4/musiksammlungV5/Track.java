package ch.ost.toldo.chapter4.musiksammlungV5;

/**
 * Speichere die Details von Musiktiteln (Tracks),
 * wie z.B. den Interpreten, den Titel und den Dateinamen.
 *
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29
 */
public class Track {
  // Der Interpret.
  private String interpret;
  // Der Titel des Tracks.
  private String titel;
  // Wo der Track gespeichert ist.
  private String dateiname;
  // Amnzahl wie häufig der Titel abgespielt wurde
  private int abspielFrequenz;

  private String album;

  /**
   * Konstruktor für Objekte der Klasse Track.
   *
   * @param interpret der Interpret des Titels
   * @param titel     der Titel des Tracks
   * @param dateiname die Track-Datei
   */
  public Track(String interpret, String titel, String dateiname) {
    setzeDetails(interpret, titel, dateiname);
  }

  /**
   * Konstruktor für Objekte der Klasse Track.
   * Geht davon aus, dass der Dateiname nicht dekodiert werden kann, um
   * den tatsächlichen Interpreten und Titel zu ermitteln.
   *
   * @param dateiname die Track-Datei
   */
  public Track(String dateiname) {
    setzeDetails("unbekannt", "unbekannt", dateiname);
  }

  /**
   * Liefere den Interpreten.
   *
   * @return der Interpret
   */
  public String gibInterpret() {
    return interpret;
  }

  /**
   * Liefere den Titel.
   *
   * @return der Titel
   */
  public String gibTitel() {
    return titel;
  }

  /**
   * Liefere den Dateinamen.
   *
   * @return der Dateiname
   */
  public String gibDateiname() {
    return dateiname;
  }

  /**
   * Liefere die Abspielfrequenz
   *
   * @return die Abspielfrequenz
   */
  public int gibAbspielFrequenz() {
    return abspielFrequenz;
  }

  /**
   * Inkrementiert die Abspielfrequenz
   */
  public void erhoeheAbspielFrequenz() {
    abspielFrequenz++;
  }

  /**
   * Lieferet Album
   *
   * @return Album
   */
  public String gibAlbum() {
    return album;
  }

  /**
   * setzt Album
   *
   * @param album Album des Tracks
   */
  public void setzeAlbum(String album) {
    this.album = album;
  }

  /**
   * Liefere Details über den Track: Interpret, Titel und Dateiname.
   *
   * @return die Track-Details
   */
  public String gibDetails() {
    String albumString = !album.isEmpty() ? " aus " + album : "";
    return interpret + ": " + titel + albumString + " (Datei: " + dateiname + ")";
  }

  /**
   * Lege die Details des Tracks fest.
   *
   * @param interpret der Interpret des Titels
   * @param titel     der Titel des Tracks
   * @param dateiname die Track-Datei
   */
  private void setzeDetails(String interpret, String titel, String dateiname) {
    this.interpret = interpret;
    this.titel = titel;
    this.dateiname = dateiname;
    abspielFrequenz = 0;
    album = "";
  }

}
