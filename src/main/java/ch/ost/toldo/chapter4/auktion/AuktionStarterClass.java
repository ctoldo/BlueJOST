/*
 * Author: Claudio Toldo
 * Created: 22.03.2022 18:33
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter4.auktion;

import java.util.ArrayList;
import java.util.LinkedList;

public class AuktionStarterClass {
  public static void main(String[] args) {
//    aufgabe4_48();
//    aufgabe4_52();
    aufgabe4_53();

  }

  private static void aufgabe4_48() {
    Auktion auktion = new Auktion();

    auktion.postenAnmelden("Audi A4"); //Posten 1
    auktion.postenAnmelden("Opel Corsa"); //Posten 2
    auktion.postenAnmelden("BMW M3"); //Posten 3
    auktion.postenAnmelden("Seat Ibiza"); //Posten 4
    auktion.postenAnmelden("Mercedes C63 AMG"); //Posten 5
    auktion.postenAnmelden("Alfa Romeo Giulia"); //Posten 6

    auktion.gibGebotAb(1, new Person("Elis Zeciri"), 4000);
    auktion.gibGebotAb(1, new Person("Maurice Marxer"), 4500);
    auktion.gibGebotAb(2, new Person("Claudio Toldo"), 2500);
    auktion.gibGebotAb(5, new Person("Samuel Stäheli"), 25000);

    auktion.beenden();
  }

  private static void aufgabe4_52() {
    Auktion auktion = new Auktion();
    auktion.postenAnmelden("Audi");
    auktion.postenAnmelden("Opel");
    auktion.postenAnmelden("Seat");
    auktion.postenAnmelden("Fiat");
    auktion.postenAnmelden("Lada");

    auktion.entfernePosten(3);
    auktion.entfernePosten(4);

    auktion.beenden();
  }

  private static void aufgabe4_53() {

  }
}
