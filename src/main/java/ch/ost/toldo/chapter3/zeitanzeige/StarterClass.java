/*
 * Author: Claudio Toldo
 * Created: 14.03.2022 11:21
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter3.zeitanzeige;

public class StarterClass {

  public static void main(String[] args) {
    Uhrenanzeige uhrenanzeige = new Uhrenanzeige();

    uhrenanzeige.setzeUhrzeit(0, 24);
    System.out.println(uhrenanzeige.gibUhrzeit());

    uhrenanzeige.setzeUhrzeit(4, 59);
    System.out.println(uhrenanzeige.gibUhrzeit());

    uhrenanzeige.setzeUhrzeit(12, 18);
    System.out.println(uhrenanzeige.gibUhrzeit());

    uhrenanzeige.setzeUhrzeit(18, 55);
    System.out.println(uhrenanzeige.gibUhrzeit());
  }
}
