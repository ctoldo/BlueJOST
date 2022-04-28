/**
 * Author: Claudio Toldo
 * Created: 10.03.2022 13:54
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.uebungen.woche03student;

public class Lehrgang {

  private String name;
  private double preis;

  public Lehrgang(String name) {
    this.name = name;
  }

  public Lehrgang(String name, double preis) {
    this(name);
    this.preis = preis;
  }

  public String getName() {
    return name;
  }

  public double getPreis() {
    return preis;
  }

  public void setPreis(double preis) {
    this.preis = preis;
  }
}
