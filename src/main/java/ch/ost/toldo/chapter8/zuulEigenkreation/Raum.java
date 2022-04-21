package ch.ost.toldo.chapter8.zuulEigenkreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Diese Klasse modelliert Räume in der Welt von Zuul.
 * <p>
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes
 * Adventure-Game.
 * <p>
 * Ein "Raum" repräsentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen Räumen über Ausgänge verbunden.
 * Mögliche Ausgänge liegen im Norden, Osten, Süden und Westen.
 * Für jede Richtung hält ein Raum eine Referenz auf den
 * benachbarten Raum.
 *
 * @author Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */
public class Raum {
  private final String beschreibung;
  private final HashMap<String, Raum> ausgaenge;
  private final ArrayList<Gegenstand> gegenstaende;


  /**
   * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
   * hat anfangs keine Ausgänge. Eine Beschreibung hat die Form
   * "in einer Küche" oder "auf einem Sportplatz".
   *  @param beschreibung die Beschreibung des Raums
   *
   */
  public Raum(String beschreibung) {
    this.beschreibung = beschreibung;
    gegenstaende = new ArrayList<>();
    ausgaenge = new HashMap<>();
  }

  /**
   * Definiere einen Ausgang aus diesem Raum
   *
   * @param richtung    die Richtung, in der der Ausgang liegen soll
   * @param nachbarRaum der Raum, der über diesen Ausgang erreicht wird
   */
  public void setzeAusgaenge(String richtung, Raum nachbarRaum) {
    ausgaenge.put(richtung, nachbarRaum);
  }

  /**
   * nimmt eine beliebige Anzahl an Gegenständen entgegen und fügt diese der Liste hinzu
   * @param gegenstaende Gegenstände, die hinzugefügt werden sollen
   */
  public void gegenstaendeAblegen(Gegenstand... gegenstaende) {
    this.gegenstaende.addAll(Arrays.asList(gegenstaende));
  }

  public Raum gibAusgang(String richtung) {
    return ausgaenge.get(richtung);
  }

  /**
   * @return die Beschreibung dieses Raums
   */
  public String gibBeschreibung() {
    return beschreibung;
  }

  public String gibLangeBeschreibung() {
    StringBuilder langeBeschreibung = new StringBuilder("Sie sind " + gibBeschreibung() + ".\n" + gibAusgaengeAlsString());
    gegenstaende.forEach(gegenstand -> langeBeschreibung.append("\n").append(gegenstand.gibLangeBeschreibung()));
    return langeBeschreibung.toString();
  }

  /**
   * Liefere eine Beschreibung der Ausgänge dieses Raumes,
   * beispielsweise "Ausgänge: north west".
   *
   * @return eine Beschreibung der verfügbaren Ausgänge
   */
  private String gibAusgaengeAlsString() {
    StringBuilder ausgaengeString = new StringBuilder("Ausgänge:");
    for (String key : ausgaenge.keySet()) {
      ausgaengeString.append(" ").append(key);
    }
    return ausgaengeString.toString();
  }
}
