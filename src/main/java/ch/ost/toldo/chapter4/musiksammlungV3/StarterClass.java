/*
 * Author: Claudio Toldo
 * Created: 16.03.2022 15:15
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter4.musiksammlungV3;

public class StarterClass {
  public static void main(String[] args) throws InterruptedException {
    aufgabe4_25();
    aufgabe4_27();
  }

  private static void aufgabe4_25() {
    MusikSammlung musikSammlung = new MusikSammlung();
    musikSammlung.dateiHinzufuegen("Ich schwanke noch");
    musikSammlung.dateiHinzufuegen("I Got Bitches");
    musikSammlung.dateiHinzufuegen("Deine Freundin");
    musikSammlung.dateiHinzufuegen("Bitches Come and go");
    musikSammlung.dateiHinzufuegen("Area Codes");
    musikSammlung.dateiHinzufuegen("Bitch Better Have My Money");
    musikSammlung.dateiHinzufuegen("Ginseng Strip 2002");

    musikSammlung.bestimmteDateienAusgeben("Bitch"); //3 Treffer
    musikSammlung.bestimmteDateienAusgeben("OST"); // Kein Treffer
  }

  private static void aufgabe4_27() throws InterruptedException {
    String audioPath = "src/main/java/ch/ost/toldo/chapter4/audio/"; //mein absoluter Pfad ist sicher anders, als der, den ihr braucht...
    MusikSammlung musikSammlung = new MusikSammlung();
    musikSammlung.dateiHinzufuegen(audioPath + "BigBillBroonzy-BabyPleaseDontGo1.mp3");
    musikSammlung.dateiHinzufuegen(audioPath + "BlindBlake-EarlyMorningBlues.mp3");
    musikSammlung.dateiHinzufuegen(audioPath + "BlindLemonJefferson-matchBoxBlues.mp3");
    musikSammlung.dateiHinzufuegen(audioPath + "BlindLemonJefferson-OneDimeBlues.mp3");

    musikSammlung.interpretenDateienAnspielen("BlindLemonJefferson");
  }
}
