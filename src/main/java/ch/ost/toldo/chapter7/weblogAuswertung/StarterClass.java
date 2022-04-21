/*
 * Author: Claudio Toldo
 * Created: 04.04.2022 16:52
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter7.weblogAuswertung;

import java.io.File;

public class StarterClass {

  public static void main(String[] args) {
//    aufgabe7_1();
//    aufgabe7_12();
    aufgabe7_14();
  }

  private static void aufgabe7_1() {
    ProtokollAuswerter protokollAuswerter = new ProtokollAuswerter();
    protokollAuswerter.analysiereStundendaten();
    protokollAuswerter.stundendatenAusgeben();
  }

  private static void aufgabe7_12() {
    String path = "C:/Users/claud/IdeaProjects/BlueJOST/target/classes/"; //In BlueJ vermutlich nicht nötig
    String dateiname = "log7_12.txt";
    LogdateiErzeuger logdateiErzeuger = new LogdateiErzeuger();
    logdateiErzeuger.erzeugeDatei(path + dateiname, 40);

    ProtokollAuswerter protokollAuswerter = new ProtokollAuswerter(dateiname);
    protokollAuswerter.analysiereStundendaten();
    protokollAuswerter.stundendatenAusgeben();

    File file = new File(path + dateiname);
    file.delete();
  }

  private static void aufgabe7_14() {
    String path = "C:/Users/claud/IdeaProjects/BlueJOST/target/classes/"; //In BlueJ vermutlich nicht nötig
    String dateiname = "log7_14.txt";
    LogdateiErzeuger logdateiErzeuger = new LogdateiErzeuger();
    logdateiErzeuger.erzeugeDatei(path + dateiname, 40);

    ProtokollAuswerter protokollAuswerter = new ProtokollAuswerter(dateiname);
    protokollAuswerter.analysiereStundendaten();
    System.out.println(protokollAuswerter.anzahlZugriffe()); //40

    File file = new File(path + dateiname);
    file.delete();
  }

}
