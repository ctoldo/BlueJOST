package ch.ost.toldo.uebungen.woche05student;

import java.util.*;

/**
 * Beschreiben Sie hier die Klasse Hochschule.
 *
 * @author Claudio Toldo
 * @version 24.03.2022
 */
public class Hochschule {
  private String name;
  private ArrayList<Student> studentenListe;
  private TreeMap<String, Student> studentenMap;

  /**
   * Konstruktor für Objekte der Klasse Hochschule
   *
   * @param name Name der Hochschule
   */
  public Hochschule(String name) {
    this.name = name;
    studentenListe = new ArrayList<>();
    studentenMap = new TreeMap<>();
  }

  /**
   * Studenten ausgeben auf die Konsole
   */
  public void ausgeben() {
    System.out.println("Hochschule: " + name);
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
