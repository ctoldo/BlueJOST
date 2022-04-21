/*
 * Author: Claudio Toldo
 * Created: 21.04.2022 16:08
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter8.zuulEigenkreation2;

/**
 * Klasse für ein Gegenstandobjekt, dass sich in einem Raum befinden kann.
 *
 * @author Claudio Toldo
 * @version 21.04.2022
 */
public class Gegenstand {
  private final String name;
  private final String beschreibung;
  private final int gewicht;

  public Gegenstand(String name, String beschreibung, int gewicht) {
    this.name = name;
    this.beschreibung = beschreibung;
    this.gewicht = gewicht;
  }

  public int gibGewicht() {
    return gewicht;
  }

  public String gibBeschreibung() {
    return beschreibung;
  }

  public String gibLangeBeschreibung() {
    return "Es befindet sich ein/e " + name + " ("+beschreibung+") mit dem Gewicht von " + gewicht + " kg im Raum.";
  }

  public String getName() {
    return name;
  }
}
