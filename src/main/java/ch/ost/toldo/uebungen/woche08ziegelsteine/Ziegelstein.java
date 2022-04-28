package ch.ost.toldo.uebungen.woche08ziegelsteine;

/**
 * Die Klasse Ziegelstein modelliert einfache Ziegelsteine.
 *
 * @author Michael K�lling und David J. Barnes
 * @version 2016.02.29
 */
public class Ziegelstein {
  // Konstante: Gewicht pro Kubikzentimeter in Gramm
  private static final int GEWICHT_PRO_CM3 = 2;

  private int hoehe;
  private int breite;
  private int tiefe;

  /**
   * Erzeuge einen Ziegelstein. Die Parameter geben die
   * Kantenl�ngen in Zentimetern an.
   *
   * @param hoehe  die H�he des Ziegelsteins
   * @param breite die Breite des Ziegelsteins
   * @param tiefe  die Tiefe des Ziegelsteins
   */
  public Ziegelstein(int hoehe, int breite, int tiefe) {
    this.hoehe = hoehe;
    this.breite = breite;
    this.tiefe = tiefe;
  }

  /**
   * @return die Gr��e der Oberfl�che dieses Ziegelsteins
   * in Quadratzentimetern
   */
  public double gibOberflaeche() {
    int seite1 = breite * hoehe;
    int seite2 = breite * tiefe;
    int seite3 = tiefe * hoehe;
    return (seite1 + seite2 + seite3) * 2;
  }

  /**
   * @return das Gewicht dieses Ziegelsteins in kg
   */
  public double gibGewicht() {
    return (gibVolumen() * GEWICHT_PRO_CM3) / 1000.0;
  }

  /**
   * @return das Volumen dieses Ziegelsteins in Kubikzentimetern
   */
  public int gibVolumen() {
    return breite * hoehe * tiefe;
  }

  /**
   * @return die H�he dieses Ziegelsteins in Zentimetern
   */
  public double gibHoehe() {
    return hoehe;
  }
}
