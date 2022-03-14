/*
 * Author: Claudio Toldo
 * Created: 11.03.2022 17:08
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter3.nummernanzeige;

public class NummernanzeigeStarter {
  public static void main(String[] args) {
    Nummernanzeige stunden = new Nummernanzeige(24);
    Nummernanzeige minuten = new Nummernanzeige(60);

    Nummernanzeige na = new Nummernanzeige(6);
    System.out.println(na.gibWert());
    na.setzeWert(30);
    System.out.println(na.gibWert());
    na.erhoehen();
    System.out.println(na.gibWert());
  }
}
