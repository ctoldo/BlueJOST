/*
 * Author: Claudio Toldo
 * Created: 26.03.2022 15:39
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.somestuff;

import java.util.Arrays;

public class SortierenTest {
  public static void main(String[] args) {
    executeSomeShit();
  }

  private static void executeSomeShit() {
    int[] zahlen = {7, 30, 45, 3, 1, 80, 39, 15, 12, 5, 19, 69, 420, 4};
    Arrays.sort(zahlen);

    for (int i = 0; i < zahlen.length; i++) {
      System.out.print(zahlen[i]);
      if (i < zahlen.length - 1) {
        System.out.print(", ");
      } else{
        System.out.println();
      }
    }

  }
}
