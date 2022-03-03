/**
 * Author: Claudio Toldo
 * Created: 03.03.2022 14:29
 * � 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter2.student;

public class Student {

  /**
   * Emailadresse
   */
  private String email;
  /**
   * Nachname
   */
  private final String name;
  /**
   * Vorname
   */
  private final String vorname;
  /**
   * Geburtsjarhr
   */
  private int geburtsjahr;
  /**
   * Info ob Student immatrikuliert ist
   */
  private final boolean immatrikuliert;

  /**
   * Konstruktor f�r Student
   */
  public Student(String name, String vorname) {
    this.name = name;
    this.vorname = vorname;
    immatrikuliert = true;
  }

  /**
   * gibt die relevanten Informationen f�r den aktuellen Studenten aus
   */
  public void ausgeben() {
    System.out.println(vorname + " " + name);
    System.out.println("Immatrikuliert: " + immatrikuliert);
    System.out.println("Geburtsjahr: " + geburtsjahr);

  }

  /**
   * setzt das Geburtsjahr f�r den Studenten
   */
  public void setGeburtsjahr(int geburtsjahr) {
    this.geburtsjahr = geburtsjahr;
  }

  /**
   * gibt Emailadresse zur�ck
   */
  public String getEmail() {
    return email;
  }

  /**
   * gibt Nachname zur�ck
   */
  public String getName() {
    return name;
  }

  /**
   * gibt Vorname zur�ck
   */
  public String getVorname() {
    return vorname;
  }
}