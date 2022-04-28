package ch.ost.toldo.uebungen.woche06student;

/**
 * Beschreiben Sie hier die Klasse Lehrgang.
 *
 * @author Claudio Toldo
 * @version 24.03.2022
 */
public class Lehrgang {

  private String name;
  private double preis;

  /**
   * Konstruktor für Objekte der Klasse Lehrgang
   * @param name Name des Lehrgangs
   */
  public Lehrgang(String name) {
    this.name = name;
  }

  /**
   * Konstruktor für Objekte der Klasse Lehrgang
   * @param name Name des Lehrgangs
   * @param preis Preis des Lehrgangs
   */
  public Lehrgang(String name, double preis) {
    this(name);
    this.preis = preis;
  }

  /**
   * Name zurückgeben
   * @return Name des Lehrgangs
   */
  public String gibName() {
    return this.name;
  }

  /**
   * Preis zurückgeben
   * @return Preis des Lehrgangs
   */
  public double gibPreis() {
    return this.preis;
  }

  /**
   * Preis setzen
   * @param preis Preis des Lehrgangs
   */
  public void setzePreis(double preis) {
    this.preis = preis;
  }
}
