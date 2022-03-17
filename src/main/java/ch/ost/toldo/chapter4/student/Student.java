package ch.ost.toldo.chapter4.student;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Beschreiben Sie hier die Klasse Student.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Student  // hier noch ein Kommentar
{
  // Instanzvariablen
  private String email;
  private String name;
  private String vorname;
  private int geburtsJahr;
  private boolean immatrikuliert = true;
  private Lehrgang besuchtLehrgang;

  /**
   * Konstruktor für Objekte der Klasse Student
   */
  public Student(String name, String vorname) {
    // Parameter --> lokale Variablen
    this.name = name;
    this.vorname = vorname;
  }

  public void setzeEmail(String email) {
    this.email = email;
  }

  public boolean setzeGeburtsJahr(int geburtsJahr) {
    Calendar cal = new GregorianCalendar();
    int alter = cal.get(Calendar.YEAR) - geburtsJahr;
    if (alter >= 18 && alter <= 70) {
      this.geburtsJahr = geburtsJahr;
      return true;
    } else {
      return false;
    }
  }

  public void setzeBesuchtLehrgang(Lehrgang besuchtLehrgang) {
    this.besuchtLehrgang = besuchtLehrgang;
  }

  public String gibEmail() {
    return email;
  }

  public String gibName() {
    return name;
  }

  public String gibVorname() {
    return vorname;
  }

  /*
   * Ausgeben der Informationen auf die Konsole
   */
  public void ausgeben() {
    String immatValue = immatrikuliert ? "immatrikuliert" : "exmatrikuliert";
    System.out.println(vorname.charAt(0) + ". " + name + " (" + immatValue + ")");

    int alter = new GregorianCalendar().get(Calendar.YEAR) - geburtsJahr;
    System.out.println("Geburtsjahr: " + geburtsJahr + " (Alter: " + alter + " Jahre)");

    if (besuchtLehrgang != null) {
      System.out.println("Lehrgang: " + besuchtLehrgang.gibName() + ", Preis: " + besuchtLehrgang.gibPreis());
    } else {
      System.out.println("Lehrgang: nicht erfasst");
    }
  }

  public void exmatrikulieren() {
    immatrikuliert = false;
    setzeBesuchtLehrgang(null);
  }
}
