/*
 * Author: Claudio Toldo
 * Created: 26.03.2022 15:20
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.test;

public class SomeTestStuff {
  public static void main(String[] args) {
    String s = "Ich:bin:ein:Berliner";
    String[] split = s.split(":");
    System.out.println(split[0]);

  }
}
