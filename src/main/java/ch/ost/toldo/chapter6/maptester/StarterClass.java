/*
 * Author: Claudio Toldo
 * Created: 23.03.2022 14:40
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.maptester;

import java.util.HashMap;

public class StarterClass {

  public static void main(String[] args) {
    aufgabe6_28();
  }

  private static void aufgabe6_28() {
    MapTester mapTester = new MapTester();
    mapTester.nummerEintragen("Hansruedi Tremp", "O8000 du grusig");
    mapTester.nummerEintragen("Hansruedi Tremp", "O8000 du bisch grusig");

    System.out.println(mapTester.nummerSuchen("Hansruedi Tremp"));
  }


}
