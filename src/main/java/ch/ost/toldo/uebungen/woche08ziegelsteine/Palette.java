package ch.ost.toldo.uebungen.woche08ziegelsteine;

/**
 * Eine Palette ist ein Stapel Ziegelsteine auf
 * einem Holzgestell.
 *
 * @author Michael K�lling und David J. Barnes
 * @version 2016.02.29
 */
public class Palette {
  // Grundgewicht des Holzgestells in kg
  private static final double GRUNDGEWICHT = 6.5;
  // Grundh�he des Holzgestells in cm
  private static final double GRUNDHOEHE = 15;

  private Ziegelstein einZiegel;
  private int ziegelProSchicht;
  private int anzahlSchichten;

  /**
   * Erzeuge eine Palette mit einer gegebenen Anzahl Ziegelsteinen.
   *
   * @param ziegelProSchicht die Anzahl der Ziegel, die auf die
   *                         Grundfl�che passen
   * @param anzahlSchichten  die Anzahl der Schichten
   */
  public Palette(int ziegelProSchicht, int anzahlSchichten) {
    this.ziegelProSchicht = ziegelProSchicht;
    this.anzahlSchichten = anzahlSchichten;
    einZiegel = new Ziegelstein(8, 20, 12);
  }

  /**
   * @return die Grundfl�che dieser Palette (in kg)
   */
  public double gibGewicht() {
    int anzahlZiegelsteine = ziegelProSchicht * anzahlSchichten;
    return einZiegel.gibGewicht() * anzahlZiegelsteine;
  }

  /**
   * Gewicht zur�ckgeben und Ziegelstein individuell angeben
   *
   * @param hoehe  die H�he des Ziegelsteins
   * @param breite die Breite des Ziegelsteins
   * @param tiefe  die Tiefe des Ziegelsteins
   * @return das Gewicht in in kg
   */
  public double gibGewicht(int hoehe, int breite, int tiefe) {
    einZiegel = new Ziegelstein(hoehe, breite, tiefe);
    return gibGewicht();
  }

  /**
   * @return die H�he dieses Stapels (in cm)
   */
  public double gibHoehe() {
    return (einZiegel.gibHoehe() * anzahlSchichten) + GRUNDHOEHE;
  }
}
