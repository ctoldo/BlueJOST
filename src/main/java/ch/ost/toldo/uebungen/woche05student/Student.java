package ch.ost.toldo.uebungen.woche05student;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Beschreiben Sie hier die Klasse Student.
 *
 * @author Claudio Toldo
 * @version 24.03.2022
 */
public class Student {

  private String email;
  private String name;
  private String vorname;
  private int geburtsJahr;
  private boolean immatrikuliert = true;
  private Lehrgang besuchtLehrgang;

  /**
   * Konstruktor für Objekte der Klasse Student
   *
   * @param name    Nachname des Studenten
   * @param vorname Vorname des Studenten
   */
  public Student(String name, String vorname) {
    // Parameter --> lokale Variablen
    this.name = name;
    this.vorname = vorname;
    this.email = vorname.toLowerCase() + "." + name.toLowerCase() + "@ost.ch";
  }

  /**
   * E-Mail-Adresse setzen
   *
   * @param email E-Mail-Adresse des Studenten
   */
  public void setzeEmail(String email) {
    this.email = email;
  }

  /**
   * Geburtsjahr setzen
   *
   * @param geburtsJahr Geburtsjahr des Studenten
   * @return true = alles ok, false = geburtsJahr ist nicht ok
   */
  public boolean setzeGeburtsJahr(int geburtsJahr) {
    int alter = new GregorianCalendar().get(Calendar.YEAR) - geburtsJahr;
    if (alter >= 18 && alter <= 70) {
      this.geburtsJahr = geburtsJahr;
      return true;
    }
    return false;
  }

  /**
   * Lehrgang setzen
   *
   * @param lehrgang Lehrgang des Studenten
   */
  public void setzeBesuchtLehrgang(Lehrgang lehrgang) {
    besuchtLehrgang = lehrgang;
  }

  /**
   * Email geben
   *
   * @return E-Mail-Adresse des Studenten
   */
  public String gibEmail() {
    return email;
  }

  /**
   * Namen geben
   *
   * @return Nachname des Studenten
   */
  public String gibName() {
    return name;
  }

  /**
   * Vorname geben
   *
   * @return Vorname des Studenten
   */
  public String gibVorname() {
    return vorname;
  }

  /**
   * Ausgeben der Informationen auf die Konsole
   */
  public void ausgeben() {
    System.out.print(vorname.charAt(0) + ". " + name + " (");
    if (immatrikuliert) {
      System.out.print("immatrikuliert");
    } else {
      System.out.print("exmatrikuliert");
    }
    System.out.println(")");
    System.out.println("Geburtsjahr: " + geburtsJahr);

    if (besuchtLehrgang == null) {
      System.out.println("noch nicht in einen Lehrgang eingeschrieben!");
    } else {
      System.out.println("in den Lehrgang " + besuchtLehrgang.gibName() +
              " eingeschrieben!");
    }
  }

  /**
   * exmatrikuliert den Studenten
   */
  public void exmatrikulieren() {
    immatrikuliert = false;
  }
}
