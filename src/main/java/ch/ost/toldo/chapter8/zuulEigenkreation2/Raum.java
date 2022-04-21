package ch.ost.toldo.chapter8.zuulEigenkreation2;

import java.util.HashMap;

/**
 * Diese Klasse modelliert R�ume in der Welt von Zuul.
 * <p>
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes
 * Adventure-Game.
 * <p>
 * Ein "Raum" repr�sentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen R�umen �ber Ausg�nge verbunden.
 * M�gliche Ausg�nge liegen im Norden, Osten, S�den und Westen.
 * F�r jede Richtung h�lt ein Raum eine Referenz auf den
 * benachbarten Raum.
 *
 * @author Michael K�lling und David J. Barnes
 * @version 2016.02.29
 */
public class Raum {
  private final String beschreibung;
  private final HashMap<String, Raum> ausgaenge;
  private final HashMap<String, Gegenstand> gegenstaende;


  /**
   * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
   * hat anfangs keine Ausg�nge. Eine Beschreibung hat die Form
   * "in einer K�che" oder "auf einem Sportplatz".
   *
   * @param beschreibung die Beschreibung des Raums
   */
  public Raum(String beschreibung) {
    this.beschreibung = beschreibung;
    gegenstaende = new HashMap<>();
    ausgaenge = new HashMap<>();
  }

  /**
   * Definiere einen Ausgang aus diesem Raum
   *
   * @param richtung    die Richtung, in der der Ausgang liegen soll
   * @param nachbarRaum der Raum, der �ber diesen Ausgang erreicht wird
   */
  public void setzeAusgaenge(String richtung, Raum nachbarRaum) {
    ausgaenge.put(richtung, nachbarRaum);
  }

  public Raum gibAusgang(String richtung) {
    return ausgaenge.get(richtung);
  }

  /**
   * nimmt eine beliebige Anzahl an Gegenst�nden entgegen und f�gt diese der Liste hinzu
   *
   * @param gegenstaende Gegenst�nde, die hinzugef�gt werden sollen
   */
  public void gegenstaendeAblegen(Gegenstand... gegenstaende) {
    for (Gegenstand gegenstand : gegenstaende) {
      this.gegenstaende.put(gegenstand.getName(), gegenstand);
    }
  }

  /**
   * Gibt alle Gegenst�nde in diesem Raum zur�ck
   *
   * @return Gegenst�nde in diesem Raum
   */
  public Gegenstand gegenstandAufnehmen(String name) {
    Gegenstand gegenstand = gegenstaende.get(name);
    if (gegenstand != null) {
      gegenstaende.remove(name);
      return gegenstand;
    } else {
      return null;
    }
  }

  /**
   * @return die Beschreibung dieses Raums
   */
  public String gibBeschreibung() {
    return beschreibung;
  }

  public String gibLangeBeschreibung() {
    StringBuilder langeBeschreibung = new StringBuilder("Sie sind " + gibBeschreibung() + ".\n" + gibAusgaengeAlsString());
    gegenstaende.values().forEach(gegenstand -> langeBeschreibung.append("\n").append(gegenstand.gibLangeBeschreibung()));
    return langeBeschreibung.toString();
  }

  /**
   * Liefere eine Beschreibung der Ausg�nge dieses Raumes,
   * beispielsweise "Ausg�nge: north west".
   *
   * @return eine Beschreibung der verf�gbaren Ausg�nge
   */
  private String gibAusgaengeAlsString() {
    StringBuilder ausgaengeString = new StringBuilder("Ausg�nge:");
    for (String key : ausgaenge.keySet()) {
      ausgaengeString.append(" ").append(key);
    }
    return ausgaengeString.toString();
  }
}
