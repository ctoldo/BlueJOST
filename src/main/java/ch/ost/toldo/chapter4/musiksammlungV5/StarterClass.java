/*
 * Author: Claudio Toldo
 * Created: 16.03.2022 16:09
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter4.musiksammlungV5;

public class StarterClass {
  public static void main(String[] args) throws InterruptedException {
//    aufgabe4_37();
//    aufgabe4_38();
//    aufgabe4_43();
    aufgabe4_45();
  }

  private static void aufgabe4_37() {
    MusikSammlung musikSammlung = new MusikSammlung();
    musikSammlung.setzteAlbumTitel("OneDimeBlues", "Guenther der Starke");

    musikSammlung.alleTracksAusgeben();
  }

  private static void aufgabe4_38() throws InterruptedException {
    MusikSammlung musikSammlung = new MusikSammlung();
    musikSammlung.spieleTrack(0);
    Thread.sleep(2000); //da keine direktEingabe möglich nötig für Test
    musikSammlung.spieleTrack(1);
  }

  private static void aufgabe4_43() throws InterruptedException {
    MusikSammlung musikSammlung = new MusikSammlung();
    musikSammlung.spieleZufaelligerTrack();
    Thread.sleep(5000);
    musikSammlung.beendeAbspielen();
    musikSammlung.spieleZufaelligerTrack();
    Thread.sleep(5000);
    musikSammlung.beendeAbspielen();
    musikSammlung.spieleZufaelligerTrack();
    Thread.sleep(5000);
    musikSammlung.beendeAbspielen();
  }

  private static void aufgabe4_45() {
    MusikSammlung musikSammlung = new MusikSammlung();
    musikSammlung.spieleTracksInZuefaelligerReihenfolge();
  }
}

