/*
 * Author: Claudio Toldo
 * Created: 10.03.2022 14:40
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.student;

public class StudentStarterClass {

  public static void main(String[] args) {
    Hochschule hs = new Hochschule("ost");
    Lehrgang lehrgang = new Lehrgang("winf", 2000);

    hs.studentAufnehmen(new Student("Zottel", "Hans"));
    hs.studentAufnehmen(new Student("Marxer", "Maurice"));
    hs.studentAufnehmen(new Student("Stäheli", "Samule"));
    hs.studentAufnehmen(new Student("Toldo", "Claudio"));

    //alphabetisch ausgeben
    hs.ausgebenAlphabetisch();

    int i1 = hs.loescheStudenten("claudio");
    System.out.println(i1);

    int i = hs.loescheStudenten("ost.ch");
    System.out.println(i);

    hs.ausgebenAlphabetisch();
  }
}
