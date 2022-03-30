/*
 * Author: Claudio Toldo
 * Created: 23.03.2022 10:36
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.technischerKundendienst3;

import java.util.ArrayList;
import java.util.Random;

public class ZufallszahlenTester {

  private final Random random;

  public ZufallszahlenTester() {
    random = new Random();
  }

  public void eineZufallszahlAusgeben() {
    System.out.println(random.nextInt());
  }

  public void zufallszahlenAusgeben(int anzahl) {
    for (int i = 0; i < anzahl; i++) {
      eineZufallszahlAusgeben();
    }
  }

  public int wuerfeln() {
    return random.nextInt(1, 7);
  }

  public String gibAntwort() {
    int antwortInt = random.nextInt(3);
    String antwort;

    switch (antwortInt) {
      case 0:
        antwort = "nein";
        break;
      case 1:
        antwort = "ja";
        break;
      default:
        antwort = "vielleicht";
        break;
    }
    return antwort;
  }

  public String gibAntwort(ArrayList<String> antworten) {
    int antwortIndex = random.nextInt(antworten.size());
    return antworten.get(antwortIndex);
  }

  public int zufallszahlAusgeben(int max) {
    return random.nextInt(1, max + 1);
    //oder für 6.20
    //return zufallszahlAusgeben(1, max);
  }

  public int zufallszahlAusgeben(int min, int max) {
    return random.nextInt(min, max + 1);
  }

}
