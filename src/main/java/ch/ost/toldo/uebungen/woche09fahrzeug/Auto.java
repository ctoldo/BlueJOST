package ch.ost.toldo.uebungen.woche09fahrzeug;

/**
 * @author Claudio Toldo
 * @version 05.05.2022 13:48
 * © 2022 Claudio Toldo
 */
public class Auto extends Fahrzeug {
  private int anzahlTueren;

  public Auto(String frb) {
    super(frb, 4);
    anzahlTueren = 3;
  }

  public Auto() {
    this("weiss");
  }

  @Override
  public String toString() {
    return super.toString() + "\n Auto mit " + anzahlTueren + " Türen.";
  }
}
