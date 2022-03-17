/*
 * Author: Claudio Toldo
 * Created: 16.03.2022 16:55
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter4.verein;

public class StarterClass {
  public static void main(String[] args) {
    aufgabe4_42();
  }

  private static void aufgabe4_42() {
    Verein verein = new Verein();
    verein.beitreten(new Mitgliedschaft("Maurice Marxer", 9, 2020));
    verein.beitreten(new Mitgliedschaft("Samuel Stäheli", 9, 2020));
    verein.beitreten(new Mitgliedschaft("Claudio Toldo", 9, 2021));
    verein.beitreten(new Mitgliedschaft("Elis Zeciri", 9, 2021));
    verein.beitreten(new Mitgliedschaft("Piriyangan Srikanthavel", 9, 2021));

    System.out.println(verein.anzahlMitglieder()); //== 5
  }
}
