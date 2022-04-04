/*
 * Author: Claudio Toldo
 * Created: 28.03.2022 16:29
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.baelle;

public class StarterClass {
  public static void main(String[] args) {
    aufgabe6_68();
//    aufgabe6_71();
  }

  private static void aufgabe6_68() {
    new BallDemo().springenLassen(10);
  }

  private static void aufgabe6_71() {
    new BallDemo().kastenSpringen(10);
  }
}
