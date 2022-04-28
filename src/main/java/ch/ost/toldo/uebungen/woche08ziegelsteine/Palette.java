package ch.ost.toldo.uebungen.woche08ziegelsteine;

/**
 * Eine Palette ist ein Stapel Ziegelsteine auf
 * einem Holzgestell.
 *
 * @author Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */
public class Palette {
  // Grundgewicht des Holzgestells in kg
  private static final double GRUNDGEWICHT = 6.5;
  // Grundhöhe des Holzgestells in cm
  private static final double GRUNDHOEHE = 15;

  private Ziegelstein einZiegel;
  private int ziegelProSchicht;
  private int anzahlSchichten;

  /**
   * Erzeuge eine Palette mit einer gegebenen Anzahl Ziegelsteinen.
   *
   * @param ziegelProSchicht die Anzahl der Ziegel, die auf die
   *                         Grundfläche passen
   * @param anzahlSchichten  die Anzahl der Schichten
   */
  public Palette(int ziegelProSchicht, int anzahlSchichten) {
    this.ziegelProSchicht = ziegelProSchicht;
    this.anzahlSchichten = anzahlSchichten;
    einZiegel = new Ziegelstein(8, 20, 12);
  }

  /**
   * @return die Grundfläche dieser Palette (in kg)
   */
  public double gibGewicht() {
    int anzahlZiegelsteine = ziegelProSchicht * anzahlSchichten;
    return einZiegel.gibGewicht() * anzahlZiegelsteine;
  }

  /**
   * Gewicht zurückgeben und Ziegelstein individuell angeben
   *
   * @param hoehe  die Höhe des Ziegelsteins
   * @param breite die Breite des Ziegelsteins
   * @param tiefe  die Tiefe des Ziegelsteins
   * @return das Gewicht in in kg
   */
  public double gibGewicht(int hoehe, int breite, int tiefe) {
    einZiegel = new Ziegelstein(hoehe, breite, tiefe);
    return gibGewicht();
  }

  /**
   * @return die Höhe dieses Stapels (in cm)
   */
  public double gibHoehe() {
    return (einZiegel.gibHoehe() * anzahlSchichten) + GRUNDHOEHE;
  }
}
