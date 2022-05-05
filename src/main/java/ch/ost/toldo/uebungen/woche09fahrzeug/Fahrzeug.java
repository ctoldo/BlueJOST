package ch.ost.toldo.uebungen.woche09fahrzeug;

/**
 * @author Claudio Toldo
 * @version 05.05.2022 13:48
 * © 2022 Claudio Toldo
 */
public abstract class Fahrzeug {

  private String farbe;
  private int anzahlRaeder;

  public Fahrzeug(String frb, int anzR) {
    farbe = frb;
    anzahlRaeder = anzR;
  }

  protected String gibFarbe() {
    return farbe;
  }

  protected int gibAnzahlRaeder() {
    return anzahlRaeder;
  }

  public String toString() {
    return "Farhzeug " + farbe + " mit " + anzahlRaeder + " Räder:";
  }

}
