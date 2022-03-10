/**
 * Author: Claudio Toldo
 * Created: 10.03.2022 13:41
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter2.heizungsaufgabe;

//2.93, 2.94
public class Heizung {
  private double temperatur;
  private double min;
  private double max;
  private double schrittweite;


  public Heizung(double minTemp, double maxTemp) {
    temperatur = 15.0;
    schrittweite = 5.0;
    min = minTemp;
    max = maxTemp;
  }

  public void waermer() {
    if (temperatur + schrittweite <= max) {
      temperatur += schrittweite;
    }
  }

  public void kuehler() {
    if (temperatur - schrittweite >= min) {
      temperatur -= schrittweite;
    }
  }

  public double getTemperatur() {
    return temperatur;
  }

  public void setSchrittweite(double schrittweite) {
    if (schrittweite >= 0) {
      this.schrittweite = schrittweite;
    } else {
      System.out.println("Schrittweite darf nicht negativ sein.");
    }
  }
}
