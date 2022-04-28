/**
 * Author: Claudio Toldo
 * Created: 10.03.2022 13:59
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.uebungen.woche03student;

public class Hochschule {
  private String name;
  private Student studenten;

  public Hochschule(String name) {
    this.name = name;
  }

  public void ausgeben() {
    System.out.println(name);
    System.out.println("-".repeat(name.length()));
    studenten.ausgeben();
  }

  public void studentAufnehmen(Student student) {
    studenten = student;
  }

  public Student gibAktuellerStudent() {
    return studenten;
  }
}
