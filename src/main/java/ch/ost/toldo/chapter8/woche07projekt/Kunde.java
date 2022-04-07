/*
 * Author: Claudio Toldo
 * Created: 07.04.2022 13:35
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter8.woche07projekt;

import java.util.Random;

public class Kunde {

  private String name;
  private KundenKategorie kategorie;

  public Kunde(String name) {
    this.name = name;
  }

  public void setzeGrosskunde() {
    kategorie = KundenKategorie.GROSSKUNDE;
  }

  public void setzeKMUKunde() {
    kategorie = KundenKategorie.KMUKUNDE;
  }

  public void setzePrivatkunde() {
    kategorie = KundenKategorie.PRIVATKUNDE;
  }

  public String getKategorie() {
    return kategorie.toString();
  }

  public void displayKunde() {
    switch (kategorie) {
      case GROSSKUNDE:
        System.out.println(name + " hier etwas spezielles zu Grosskunde " + kategorie);
        break;
      case KMUKUNDE:
        System.out.println(name + " hier etwas spezielles zu KMU " + kategorie);
        break;
      case PRIVATKUNDE:
        System.out.println(name + " " + kategorie);
        break;
      default:
        System.out.println("Es ist noch keine Kundenkategorie festgelegt!");
    }
  }

  public static void testProzedur() {
    int anzahl = 10;
    Kunde[] kunden = new Kunde[anzahl];

    //Testobjekte erzeugen
    Random random = new Random();
    for (int i = 0; i < anzahl; i++) {
      Kunde kunde = new Kunde("Name" + (i + 1));
      int randomChoice = random.nextInt(3);
      switch (randomChoice) {
        case 0:
          kunde.setzeGrosskunde();
          break;
        case 1:
          kunde.setzeKMUKunde();
          break;
        case 2:
          kunde.setzePrivatkunde();
          break;
      }
      kunden[i] = kunde;
    }

    //Array rückwärts ausgeben
    for (int i = kunden.length-1; i >= 0; i--) {
      kunden[i].displayKunde();
      System.out.println();
    }

    System.out.println("----------------\n");

    //Ausgabe soirtiert nach Kundenkategorie und Name
    System.out.println("Ausgabe sortiert nach Kundenkategorie - Name");
    display(KundenKategorie.GROSSKUNDE, kunden);
    display(KundenKategorie.KMUKUNDE, kunden);
    display(KundenKategorie.PRIVATKUNDE, kunden);
  }

  private static void display(KundenKategorie kategorie, Kunde[] kunden) {
    for (Kunde kunde : kunden) {
      if (kunde.kategorie == kategorie) {
        kunde.displayKunde();
        System.out.println();
      }
    }
  }
}