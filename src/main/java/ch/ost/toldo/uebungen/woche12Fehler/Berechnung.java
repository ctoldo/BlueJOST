package ch.ost.toldo.uebungen.woche12Fehler;

/**
 * @author Claudio Toldo
 * @version 13.06.2022 12:05
 * © 2022 Claudio Toldo
 */
public class Berechnung {

  public int berechnen(int value) throws ValueOutOfRangeException {
    if (value < 0 || value > 1000) {
      throw new ValueOutOfRangeException(value);
    }
    return 1000 / value;
  }
}