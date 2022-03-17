/*
 * Author: Claudio Toldo
 * Created: 16.03.2022 14:11
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter4.musiksammlungV2;

public class StarterClass {
  public static void main(String[] args) {
//    aufgabe4_17();
    aufgabe4_21();
  }

  private static void aufgabe4_17() {
    String audioPath = "src/main/java/ch/ost/toldo/chapter4/audio/"; //mein absoluter Pfad ist sicher anders, als der, den ihr braucht...
    MusikSammlung musikSammlung = new MusikSammlung();
    musikSammlung.dateiHinzufuegen(audioPath + "BigBillBroonzy-BabyPleaseDontGo1.mp3");
    musikSammlung.dateiHinzufuegen(audioPath + "BlindBlake-EarlyMorningBlues.mp3");
    musikSammlung.dateiHinzufuegen(audioPath + "BlindLemonJefferson-matchBoxBlues.mp3");
    musikSammlung.dateiHinzufuegen(audioPath + "BlindLemonJefferson-OneDimeBlues.mp3");

    musikSammlung.starteAbspielenDatei(0);
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    musikSammlung.beendeAbspielen();

//    musikSammlung.dateiHinzufuegen("faketaxi.mp3");
//    musikSammlung.starteAbspielenDatei(4);
  }

  private static void aufgabe4_21() {
    MusikSammlung musikSammlung = new MusikSammlung();
    musikSammlung.dateiHinzufuegen("asdf");
    musikSammlung.dateiHinzufuegen("qwer");
    musikSammlung.dateiHinzufuegen("wert");
    musikSammlung.dateiHinzufuegen("ertz");
    musikSammlung.dateiHinzufuegen("rtzu");

    musikSammlung.alleDateienAusgeben();
  }
}
