/*
 * Author: Claudio Toldo
 * Created: 10.03.2022 14:40
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter4.student;

public class StudentStarterClass {

  public static void main(String[] args) {
    //version2();
    version3();
  }

  private static void version3() {
    Hochschule ost = new Hochschule("OST");
    Lehrgang winf = new Lehrgang("BscWinf", 1000);
    ost.generiereTestobjekte(winf, 25);
    ost.ausgeben();

    boolean geloescht = ost.studentLoeschen(0);//H. Muster1 fehlt / geloescht == true
    System.out.println("\nIndex 0 gelöscht: " + geloescht);
    int anzahl = ost.studentLoeschen("4");//H. Muster4, Muster14, Muster24 fehlt / anzahl == 1
    System.out.println("Anzahl mit gegebenem String: " + anzahl + "\n");
    ost.ausgeben();

    ost.studentLoeschen("Muster");
    ost.ausgeben();
  }

  private static void version2() {
    Hochschule ost = new Hochschule("OST");
    Lehrgang winf = new Lehrgang("BscWinf", 1000);
    Student cludi = new Student("Toldo", "Claudio");
    cludi.setzeEmail("claudio.toldo@ost.ch");
    cludi.setzeGeburtsJahr(2000);
    ost.studentAufnehmen(cludi);

    ost.ausgeben();

    cludi.setzeBesuchtLehrgang(winf);
    ost.ausgeben();

    cludi.exmatrikulieren();
    ost.ausgeben();
  }

}
