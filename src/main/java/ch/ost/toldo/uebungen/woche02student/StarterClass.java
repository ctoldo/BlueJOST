/**
 * Author: Claudio Toldo
 * Created: 03.03.2022 14:38
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.uebungen.woche02student;

public class StarterClass {
  public static void main(String[] args) {
    Student s1 = new Student("Müller", "Hans");
    s1.ausgeben();
    Student s2 = new Student("Muster", "Peter");
    s2.ausgeben();

    Studienadministration studAdmin = new Studienadministration("OST");
    studAdmin.neuerStudent("Mustermann", "Isolde", 1988);
    studAdmin.ausgeben();
  }
}
