/*
 * Author: Claudio Toldo
 * Created: 10.03.2022 14:40
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter3.student;

public class StudentStarterClass {

  public static void main(String[] args) {
    Hochschule ost = new Hochschule("OST");
    Lehrgang winf = new Lehrgang("BscWinf", 1000);
    Student cludi = new Student("Toldo", "Claudio");
    cludi.setEmail("claudio.toldo@ost.ch");
    cludi.setGeburtsJahr(2000);
    ost.studentAufnehmen(cludi);

    ost.ausgeben();

    cludi.setBesuchtLehrgang(winf);
    ost.ausgeben();

    cludi.exmatrikulieren();
    ost.ausgeben();
  }

}
