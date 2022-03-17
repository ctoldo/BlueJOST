/*
 * Author: Claudio Toldo
 * Created: 16.03.2022 10:41
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter4.musiksammlungV1;

import java.util.ArrayList;

public class StarterClass {

  public static void main(String[] args) {
    aufgabe4_1();
    aufgabe4_2();
    aufgabe4_3();
    aufgabe4_8();
    aufgabe4_9();
    aufgabe4_11();
    aufgabe4_12();
    aufgabe4_14();
    aufgabe4_15();


  }

  private static void aufgabe4_1() {
    MusikSammlung musikSammlung = new MusikSammlung();
    musikSammlung.dateiHinzufuegen("track1.mp3");
    musikSammlung.dateiHinzufuegen("track2.mp3");
    musikSammlung.dateiHinzufuegen("track3.mp3");
    musikSammlung.dateiHinzufuegen("track4.mp3");
    musikSammlung.dateiHinzufuegen("track5.mp3");

    System.out.println("Anzahl Dateien: " + musikSammlung.gibAnzahlDateien());
    musikSammlung.dateiAusgeben(0);
    musikSammlung.dateiAusgeben(1);
    musikSammlung.dateiAusgeben(2);
    musikSammlung.dateiAusgeben(3);
    musikSammlung.dateiAusgeben(4);
  }

  private static void aufgabe4_2() {
    MusikSammlung musikSammlung = new MusikSammlung();
    try {
      musikSammlung.entferneDatei(0);
      System.out.println("Kein Fehler!");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private static void aufgabe4_3() {
    MusikSammlung musikSammlung = new MusikSammlung();
    musikSammlung.dateiHinzufuegen("track1.mp3");
    musikSammlung.dateiHinzufuegen("track2.mp3");

    musikSammlung.dateiAusgeben(0);
    musikSammlung.dateiAusgeben(1);

    musikSammlung.entferneDatei(0);
    musikSammlung.dateiAusgeben(0);
  }

  private static void aufgabe4_8() {
    ArrayList<Integer> testList = new ArrayList<>();
    testList.add(1);
    testList.add(2);
    testList.add(3);
    testList.add(4);
    testList.add(5);
    testList.add(6);
    testList.add(7);
    testList.add(8);
    testList.add(9);
    testList.add(10);

    System.out.println(testList.size());
  }

  private static void aufgabe4_9() {
    ArrayList<Integer> testList = new ArrayList<>();
    testList.add(1);
    testList.add(2);
    testList.add(3);
    testList.add(4);
    testList.add(5);
    testList.add(6);
    testList.add(7);
    testList.add(8);
    testList.add(9);
    testList.add(10);

    System.out.println(testList.get(4)); //5es Element da ArrayList bei anfängt zu zählen...
  }

  private static void aufgabe4_11() {
    String lieblingstrack = "I Got Bitches";
    ArrayList<String> dateien = new ArrayList<>();
    dateien.add(lieblingstrack);
  }

  private static void aufgabe4_12() {
    ArrayList<String> verabredungen = new ArrayList<>();
    verabredungen.add("Roger Federer"); //Index 0, Element 1
    verabredungen.add("Yann Sommer"); // Index 1, Element 2
    verabredungen.add("Wendy Holdner"); //Index 2, Element 3
    verabredungen.add("Corinne Suter"); //Index 3, Element 4
    verabredungen.add("Dini Muetter"); //Index 4, Element 5
    verabredungen.add("Mike Shiva"); //Index 5, Element 6

    verabredungen.remove(2); //= Wendy Holdener
  }

  private static void aufgabe4_14() {
    MusikSammlung musikSammlung = new MusikSammlung();
    musikSammlung.indexPruefen(4); //leer sollte Fehlermeldung bringen
    musikSammlung.indexPruefen(0); //leer sollte Fehlermeldung bringen
    musikSammlung.indexPruefen(-1); //negativ sollte Fehlermeldung bringen

    musikSammlung.dateiHinzufuegen("test1.mp3");
    musikSammlung.dateiHinzufuegen("test2.mp3");
    musikSammlung.dateiHinzufuegen("test3.mp3");
    musikSammlung.dateiHinzufuegen("test4.mp3");
    musikSammlung.dateiHinzufuegen("test5.mp3");
    musikSammlung.dateiHinzufuegen("test6.mp3");

    musikSammlung.indexPruefen(0); //ok
    musikSammlung.indexPruefen(2); //ok
    musikSammlung.indexPruefen(5); //ok
    musikSammlung.indexPruefen(6); //Ausserhalb gültiger Index -> Fehlermeldung
    musikSammlung.indexPruefen(-1); //negativ -> Fehlermeldung
  }

  private static void aufgabe4_15() {
    MusikSammlung musikSammlung = new MusikSammlung();
    System.out.println(musikSammlung.gueltgierIndex(4)); //leer -> false
    System.out.println(musikSammlung.gueltgierIndex(0)); //leer -> false
    System.out.println(musikSammlung.gueltgierIndex(-1)); //negativ -> false

    musikSammlung.dateiHinzufuegen("test1.mp3");
    musikSammlung.dateiHinzufuegen("test2.mp3");
    musikSammlung.dateiHinzufuegen("test3.mp3");
    musikSammlung.dateiHinzufuegen("test4.mp3");
    musikSammlung.dateiHinzufuegen("test5.mp3");
    musikSammlung.dateiHinzufuegen("test6.mp3");

    System.out.println(musikSammlung.gueltgierIndex(0)); //ok -> true
    System.out.println(musikSammlung.gueltgierIndex(2)); //ok -> true
    System.out.println(musikSammlung.gueltgierIndex(5)); //ok -> true
    System.out.println(musikSammlung.gueltgierIndex(6)); //Ausserhalb gültiger Index -> false
    System.out.println(musikSammlung.gueltgierIndex(-1)); //negativ -> false
  }
}