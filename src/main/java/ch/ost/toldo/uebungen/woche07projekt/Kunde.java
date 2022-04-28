/*
 * Author: Claudio Toldo
 * Created: 07.04.2022 13:35
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.uebungen.woche07projekt;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;

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

  public String getName() {
    return name;
  }

  public String getKategorie() {
    return kategorie.toString();
  }

  public void displayKunde() {
    if (kategorie == null) {
      System.out.println(name + " ist noch keiner Kundenkategorie zugewiesen!");
      return;
    }

    switch (kategorie) {
      case GROSSKUNDE:
        System.out.println(name + " ist ein wichtiger " + kategorie);
        break;
      case KMUKUNDE:
        System.out.println(name + " ist " + kategorie);
        break;
      case PRIVATKUNDE:
        System.out.println(name + " ist ein unwichtiger " + kategorie);
        break;
    }
  }

  public static void testProzedur(int anzahl) {
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
    for (int i = kunden.length - 1; i >= 0; i--) {
      kunden[i].displayKunde();
      System.out.println();
    }

    System.out.println("----------------\n");

    //Ausgabe soirtiert nach Kundenkategorie und Name
    System.out.println("Ausgabe sortiert nach Kundenkategorie - Name");
    TreeMap<String, Kunde> kundenMap = new TreeMap<>();
    for (Kunde kunde : kunden) {
      kundenMap.put(kunde.getKategorie() + " - " + kunde.getName(), kunde);
    }

    for(Iterator<String> it = kundenMap.keySet().iterator(); it.hasNext(); ){
      String key = it.next();
      Kunde kunde = kundenMap.get(key);
      kunde.displayKunde();
    }

    //oder kompakt
    //for(Iterator<String> it = kundenMap.keySet().iterator(); it.hasNext(); ){
    //  kundenMap.get(it.next()).displayKunde();
    //}

    //oder
    //Iterator<String> it = kundenMap.keySet().iterator();
    //while (it.hasNext()) {
    //  String key = it.next();
    //  kundenMap.get(key).displayKunde();
    //}

    //oder
    //for (Kunde kunde : kundenMap.values()) {
    //  kunde.displayKunde();
    //}




  }

}