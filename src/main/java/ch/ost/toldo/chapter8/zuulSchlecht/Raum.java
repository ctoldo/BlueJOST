package ch.ost.toldo.chapter8.zuulSchlecht;

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
  public String beschreibung;
  public Raum nordausgang;
  public Raum suedausgang;
  public Raum ostausgang;
  public Raum westausgang;

  /**
   * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
   * hat anfangs keine Ausgänge. Eine Beschreibung hat die Form
   * "in einer Küche" oder "auf einem Sportplatz".
   *
   * @param beschreibung die Beschreibung des Raums
   */
  public Raum(String beschreibung) {
    this.beschreibung = beschreibung;
  }

  /**
   * Definiere die Ausgänge dieses Raums. Jede Richtung
   * führt entweder in einen anderen Raum oder ist 'null'
   * (kein Ausgang).
   *
   * @param norden der Nordausgang
   * @param osten  der Ostausgang
   * @param sueden der Südausgang
   * @param westen der Westausgang
   */
  public void setzeAusgaenge(Raum norden, Raum osten,
                             Raum sueden, Raum westen) {
    if (norden != null) {
      nordausgang = norden;
    }
    if (osten != null) {
      ostausgang = osten;
    }
    if (sueden != null) {
      suedausgang = sueden;
    }
    if (westen != null) {
      westausgang = westen;
    }
  }

  /**
   * @return die Beschreibung dieses Raums
   */
  public String gibBeschreibung() {
    return beschreibung;
  }
}
