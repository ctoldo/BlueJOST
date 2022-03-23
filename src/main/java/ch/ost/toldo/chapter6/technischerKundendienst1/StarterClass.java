/*
 * Author: Claudio Toldo
 * Created: 23.03.2022 10:24
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.technischerKundendienst1;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;

public class StarterClass {
  public static void main(String[] args) {
//    start();
//    aufgabe6_16();
//    aufgabe6_17();
    aufgabe6_18();
    SecureRandom secureRandom = new SecureRandom();
  }

  private static void start() {
    Kundendienstsystem kundendienstsystem = new Kundendienstsystem();
    kundendienstsystem.starten();
  }

  private static void aufgabe6_16() {
    ZufallszahlenTester tester = new ZufallszahlenTester();
    System.out.println(tester.wuerfeln());
    System.out.println(tester.wuerfeln());
    System.out.println(tester.wuerfeln());
    System.out.println(tester.wuerfeln());
    System.out.println(tester.wuerfeln());
    System.out.println(tester.wuerfeln());
    System.out.println(tester.wuerfeln());
  }

  private static void aufgabe6_17() {
    ZufallszahlenTester tester = new ZufallszahlenTester();
    System.out.println(tester.gibAntwort());
    System.out.println(tester.gibAntwort());
    System.out.println(tester.gibAntwort());
    System.out.println(tester.gibAntwort());
    System.out.println(tester.gibAntwort());
    System.out.println(tester.gibAntwort());
    System.out.println(tester.gibAntwort());
  }

  private static void aufgabe6_18() {
    ZufallszahlenTester tester = new ZufallszahlenTester();
    ArrayList<String> antworten = new ArrayList<>();
    antworten.add("Negatief");
    antworten.add("Sicher nicht!");
    antworten.add("Frag doch Hansruedi");
    antworten.add("Ob du behindert bist?");
    antworten.add("Gib auf");
    antworten.add("Du, ich habe keinen Plan");

    System.out.println(tester.gibAntwort(antworten));
    System.out.println(tester.gibAntwort(antworten));
    System.out.println(tester.gibAntwort(antworten));
    System.out.println(tester.gibAntwort(antworten));
    System.out.println(tester.gibAntwort(antworten));
    System.out.println(tester.gibAntwort(antworten));
    System.out.println(tester.gibAntwort(antworten));
  }
}
