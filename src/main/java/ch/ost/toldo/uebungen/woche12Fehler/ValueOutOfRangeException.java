package ch.ost.toldo.uebungen.woche12Fehler;

/**
 * @author Claudio Toldo
 * @version 13.06.2022 12:02
 * © 2022 Claudio Toldo
 */
public class ValueOutOfRangeException extends Exception {

  private final int wert;

  public ValueOutOfRangeException(int wert) {
    this.wert = wert;
  }

  @Override
  public String getMessage() {
    return "Ungültiger Zahlenwert, Eingabe war: " + wert;
  }
}
