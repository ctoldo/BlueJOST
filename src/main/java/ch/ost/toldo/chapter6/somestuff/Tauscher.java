/*
 * Author: Claudio Toldo
 * Created: 04.04.2022 16:03
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.somestuff;

public class Tauscher {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    tausche(a, b);
    System.out.println("A: " + a);
    System.out.println("B: " + b);
  }

  private static void tausche(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }
}
