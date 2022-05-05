package ch.ost.toldo.uebungen.woche09fahrzeug;

/**
 * @author Claudio Toldo
 * @version 05.05.2022 13:48
 * © 2022 Claudio Toldo
 */
public class Fahrrad extends Fahrzeug {

  public Fahrrad(String frb) {
    super(frb, 2);
  }

  @Override
  public String toString() {
    return super.toString() + "\n Fahrrad";
  }
}
