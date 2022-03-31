package ch.ost.toldo.chapter7.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * Beschreiben Sie hier die Klasse Hochschule.
 *
 * @author Claudio Toldo
 * @version 24.03.2022
 */
public class Hochschule {

  public static final String HOCHSCHULNAME ="OST";

  private String name;
  private ArrayList<Student> studentenListe;
  private TreeMap<String, Student> studentenMap;

  /**
   * benötigt für Programmstart
   * @param args Argumente, hier keine notwendig
   */
  public static void main(String[] args) {
    Hochschule hs = new Hochschule();
    Lehrgang lehrgang = new Lehrgang("winf", 1000);

    generiereTestDaten(15, lehrgang, hs);

    hs.ausgebenAlphabetisch();
  }

  private static void generiereTestDaten(int anzahlObjekte, Lehrgang lehrgang, Hochschule hs) {
    for (int i = 0; i < anzahlObjekte; i++) {
      Student student = new Student("Nachname" + i, "Vorname" + i);
      student.setzeBesuchtLehrgang(lehrgang);
      hs.studentAufnehmen(student);
    }
  }

  /**
   * Konstruktor für Objekte der Klasse Hochschule
   *
   */
  public Hochschule() {
    this.name = HOCHSCHULNAME;
    studentenListe = new ArrayList<>();
    studentenMap = new TreeMap<>();
  }

  /**
   * Studenten ausgeben auf die Konsole
   */
  public void ausgeben() {
    System.out.println("Hochschule: " + name);
    System.out.println("Anzahl: " + Student.ANZAHL_OBJEKTE);
    System.out.println("-----------------------------");
    for (Student student : studentenListe) {
      student.ausgeben();
    }
  }

  /**
   * neuer Student hinzufügen
   *
   * @param student Nachname des Studenten
   */
  public void studentAufnehmen(Student student) {
    studentenMap.put(student.gibEmail(), student);
    studentenListe.add(student);
  }

  /**
   * alle Studenten-Emails in alphabetischer Reihenfolge ausgeben
   */
  public void ausgebenAlphabetisch() {
    for (String email : studentenMap.keySet()) {
      Student student = studentenMap.get(email);
      student.ausgeben();
    }
  }

  /**
   * Student löschen mit gegebenem Lehrgang
   *
   * @param suchString Text nach dem gesucht werden soll
   * @return Anzahl gelöschter Studenten
   */
  public int loescheStudenten(String suchString) {
    int anzahlGeloeschte = 0;
    Iterator<String> it = studentenMap.keySet().iterator();

    while (it.hasNext()) {
      String emailAddress = it.next();
      Student student = studentenMap.get(emailAddress);
      if (student.gibName().contains(suchString) || student.gibVorname().contains(suchString) || emailAddress.contains(suchString)) {
        it.remove();
        anzahlGeloeschte++;
      }
    }
    return anzahlGeloeschte;
  }
}
