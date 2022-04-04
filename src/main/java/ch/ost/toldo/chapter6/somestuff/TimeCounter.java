/*
 * Author: Claudio Toldo
 * Created: 04.04.2022 15:03
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.somestuff;

public class TimeCounter {

  public static void main(String[] args) {

    long start = System.currentTimeMillis();

    for (int counter = 1; counter <= 1000; counter++) {
      //do nothing
    }

    long end = System.currentTimeMillis();

    long timeNeeded = end - start;
    System.out.println(timeNeeded + " Millisekunden");
  }
}
