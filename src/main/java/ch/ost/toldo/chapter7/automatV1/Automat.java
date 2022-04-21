package ch.ost.toldo.chapter7.automatV1;

import java.util.Arrays;

/**
 * Modelliert einen eindimensionalen elementaren zellulären Automaten.
 *
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29 - Version 1
 */
public class Automat {
  // Die Anzahl der Zellen.
  private final int anzahlZellen;
  // Der Zustand der Zellen.
  private int[] zustand;

  /**
   * Erzeuge einen eindimensionalen Automaten, der aus der angegebenen
   * Anzahl an Zellen besteht.
   *
   * @param anzahlZellen die Anzahl der Zellen im Automaten
   */
  public Automat(int anzahlZellen) {
    this.anzahlZellen = anzahlZellen;
    zustand = new int[anzahlZellen];
    // den Automaten einrichten mit einer einzelnen 'an'-Zelle in der Mitte
    zustand[anzahlZellen / 2] = 1;
  }

  /**
   * Gib den akutellen Zustand des Automaten aus.
   */
  public void ausgeben() {
    for (int zellenwert : zustand) {
      if (zellenwert == 1) {
        System.out.print("*");
      } else {
        System.out.print(" ");
      }
    }
    System.out.println();
  }

  /**
   * Aktualisiere den Automaten auf seinen nächsten Zustand.
   */
  public void aktualisieren() {
    // Baut den neuen Zustand in einem anderen Array auf.
    int[] naechsterZustand = new int[zustand.length];
    // Aktualisiert den Zustand jeder Zelle,
    // ausgehend von den Zuständen seiner beiden Nachbarn.
    for (int i = 0; i < zustand.length; i++) {
      int links, zentrum, rechts;
      links = i != 0 ? zustand[i - 1] : 0;
      zentrum = zustand[i];
      rechts = i + 1 < zustand.length ? zustand[i + 1] : 0;
      naechsterZustand[i] = (links + zentrum + rechts) % 2;
    }
    zustand = naechsterZustand;
  }

  /**
   * Umgebaute {@link #aktualisieren()}-Methode nach Aufgabe 7.31
   */
  public void aktualisierenV2() {
    // Baut den neuen Zustand in einem anderen Array auf.
    int[] naechsterZustand = new int[zustand.length];
    // Aktualisiert den Zustand jeder Zelle,
    // ausgehend von den Zuständen seiner beiden Nachbarn.
    int links = 0;
    int zentrum = zustand[0];
    int rechts;
    for (int i = 0; i < zustand.length; i++) {
      rechts = i + 1 < zustand.length ? zustand[i + 1] : 0;
      naechsterZustand[i] = berechneNaechstenZustand(links, zentrum, rechts);
      links = zentrum;
      zentrum = rechts;
    }
    zustand = naechsterZustand;
  }

  private int berechneNaechstenZustand(int links, int zentrum, int rechts) {
    return (links + zentrum + rechts) % 2;
  }

  /**
   * Setze den Automaten zurück.
   */
  public void zuruecksetzen() {
    Arrays.fill(zustand, 0);
    // den Automaten einrichten mit einer einzelnen 'an'-Zelle.
    zustand[anzahlZellen / 2] = 1;
  }
}
