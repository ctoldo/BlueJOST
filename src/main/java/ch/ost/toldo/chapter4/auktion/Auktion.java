package ch.ost.toldo.chapter4.auktion;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Ein einfaches Modell einer Auktion.
 * Ein Exemplar dieser Klasse hält eine Liste von Posten,
 * die beliebig lang werden kann.
 *
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29
 */
public class Auktion {
  // eine Liste der Posten dieser Auktion
  private ArrayList<Posten> postenliste;
  // die Nummer, die an den nächsten Posten vergeben wird,
  // der für diese Auktion angemeldet wird
  private int naechstePostennummer;

  /**
   * Erzeuge eine neue Auktion.
   */
  public Auktion() {
    postenliste = new ArrayList<>();
    naechstePostennummer = 1;
  }

  /**
   * Melde einen Posten für diese Auktion an.
   *
   * @param beschreibung die Beschreibung des Postens
   */
  public void postenAnmelden(String beschreibung) {
    postenliste.add(new Posten(naechstePostennummer, beschreibung));
    naechstePostennummer++;
  }

  /**
   * Zeige die komplette Liste der Posten dieser Auktion.
   */
  public void zeigePostenliste() {
    for (Posten posten : postenliste) {
      System.out.println(posten.toString());
    }
  }

  /**
   * Gebe für einen Posten ein Angebot ab.
   * Es erfolgt eine Ausgabe, ob das Gebot erfolgreich war oder nicht.
   *
   * @param postennummer der Posten, für den geboten wird
   * @param bieter       die Person, die bietet
   * @param betrag       die Höhe des Gebots
   */
  public void gibGebotAb(int postennummer, Person bieter, long betrag) {
    Posten gewaehlterPosten = gibPosten(postennummer);
    if (gewaehlterPosten != null) {
      boolean erfolgreich = gewaehlterPosten.hoeheresGebot(new Gebot(bieter, betrag));
      if (erfolgreich) {
        System.out.println("Das Gebot für Posten Nummer " + postennummer + " war erfolgreich.");
      } else {
        // Melden, welches Gebot höher ist.
        Gebot hoechstesGebot = gewaehlterPosten.gibHoechstesGebot();
        System.out.println("Posten Nummer " + postennummer + ": Gebot steht bereits bei " + hoechstesGebot.gibHoehe());
      }
    }
  }

  /**
   * Liefere den Posten mit der angegebenen Nummer.
   * Liefere 'null', wenn ein Posten mit dieser Nummer
   * nicht existiert.
   *
   * @param nummer die Nummer des Postens, der geliefert
   *               werden soll
   */
  public Posten gibPosten(int nummer) {
    for (Posten posten : postenliste) {
      if (posten.gibNummer() == nummer) {
        return posten;
      } else if (posten.gibNummer() > nummer) {
        break;
      }
    }
    System.out.println("Einen Posten mit der Nummer: " + nummer + " gibt es nicht.");
    return null;
  }

  public void beenden() {
    for (Posten posten : postenliste) {
      System.out.println("----------");
      System.out.println("Nummer:\t\t\t" + posten.gibNummer());
      System.out.println("Beschreibung:\t" + posten.gibBeschreibung());

      Gebot gebot = posten.gibHoechstesGebot();
      if (gebot == null) {
        System.out.println("Bisher kein Gebot.");
      } else {
        System.out.println("Käufer:\t\t\t" + gebot.gibBieter().gibName());
        System.out.println("Betrag:\t\t\t" + gebot.gibHoehe());
      }

      System.out.println("----------\n");
    }
  }

  public ArrayList<Posten> gibUnverkaufte() {
    ArrayList<Posten> unverkauftePosten = new ArrayList<>();
    for (Posten posten : postenliste) {
      if (posten.gibHoechstesGebot() == null) {
        unverkauftePosten.add(posten);
      }
    }
    return unverkauftePosten;
  }

  /**
   * Entferne den Posten mit der gegebenen Postennummer.
   * @param nummer die Nummer des Postens, der entfernt werden soll.
   * @return den Psoten mit der gegebenen Nummer, oder null falls
   * es einen solchen Posten nicht gibt.
   */
  public Posten entfernePosten(int nummer) {
    Iterator<Posten> it = postenliste.iterator();
    while (it.hasNext()) {
      Posten posten = it.next();
      if (posten.gibNummer() == nummer) {
        it.remove();
        postenliste.remove(posten);
        return posten;
      }
    }
    return null;
  }
}
