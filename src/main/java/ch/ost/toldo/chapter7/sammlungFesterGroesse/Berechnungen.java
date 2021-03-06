/*
 * Author: Claudio Toldo
 * Created: 31.03.2022 14:04
 * ? 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter7.sammlungFesterGroesse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Berechnungen {

  /**
   * berechnet die Fakult?t f?r die ?bergebene Zahl
   * und gibt die Rechnung und die Zwischenresultate aus.
   * zahl muss folgendes erf?llen: 1 < zahl < 100
   *
   * @param zahl Zahl von der die Fakult?t berechnet werden soll
   */
  public static void ausgebenFakultaet(int zahl) {
    if (!(zahl > 1 && zahl < 100)) {
      System.out.println("Wert nicht innerhalb der unterst?tzen Range (2 - 99).");
      return;
    }

    double fakultaet = 1;
    double[] zwischenresultate = new double[zahl - 1];
    System.out.print("1");
    for (int i = 2; i <= zahl; i++) {
      fakultaet *= i;
      zwischenresultate[i - 2] = fakultaet;
      System.out.print(" x " + i);
    }
    System.out.println(" = " + fakultaet);

    for (double zwischenresultat : zwischenresultate) {
      System.out.println(zwischenresultat);
    }
  }

  /**
   * berechnet den Druchmesser, den Kreisumfang und die Kreisfl?che
   * f?r den gegebenen Radius und gibt diese aus.
   *
   * @param radius radius, auf dem die Berechnungen basieren sollen
   */
  public static void kreisBerechnungen(double radius) {
    double durchmesser = radius * 2;
    double kreisumfang = durchmesser * Math.PI;
    double kreisflaeche = Math.pow(radius, 2) * Math.PI;
    System.out.println("Durchmesser:\t" + durchmesser);
    System.out.println("Kreisumfang:\t" + kreisumfang);
    System.out.println("Kreisfl?che:\t" + kreisflaeche);
  }

  /**
   * generiert Lottozahlen zwischen 1 und maxWert (inklusive)
   *
   * @param anzahl   Anzahl Lottozahlen
   * @param maxWert  H?chster m?glicher Zahlenwert
   * @param ausgeben ob, die Lottozahlen ausgegeben werden sollen?
   * @return lottozahlen
   */
  public static int[] gibLottozahlen(int anzahl, int maxWert, boolean ausgeben) {
    int[] lottozahlen = new int[anzahl];
    for (int i = 0; i < anzahl; i++) {
      int lottozahl = 0;
      while (!isNewNumber(lottozahl, lottozahlen)) {
        lottozahl = (int) (Math.random() * maxWert + 1);
        //oder einfacher, aber ohne Math:
        //Random random = new Random();
        //lottozahl = random.nextInt(1, maxWert + 1);
      }
      lottozahlen[i] = lottozahl;
      if (ausgeben) {
        System.out.println(lottozahl);
      }
    }
    return lottozahlen;
  }

  private static boolean isNewNumber(int lottozahl, int[] lottozahlen) {
    if (lottozahl == 0) {
      return false;
    }
    for (int lz : lottozahlen) {
      if (lz == lottozahl) {
        return false;
      }
    }
    return true;
  }
}