package ch.ost.toldo.chapter4.verein;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Speichert Details über Vereinsmitgliedschaften.
 *
 * @author Claudio Toldo
 * @version 16.03.2022
 */
public class Verein {
  // Definieren Sie alle notwendigen Datenfelder hier...
  ArrayList<Mitgliedschaft> mitgliedschaften;


  /**
   * Konstruktor für Objekte der Klasse Verein
   */
  public Verein() {
    // Initialisieren Sie die Datenfelder hier...
    mitgliedschaften = new ArrayList<>();

  }

  /**
   * Füge ein neues Mitglied in die Mitgliederliste ein.
   *
   * @param mitglied Infos über das einzufügende Mitglied
   */
  public void beitreten(Mitgliedschaft mitglied) {
    mitgliedschaften.add(mitglied);
  }

  /**
   * @return die Anzahl der Mitglieder (Mitgliedschaft-Objekte)
   * in diesem Verein
   */
  public int anzahlMitglieder() {
    return mitgliedschaften.size();
  }

  /**
   * Liefere die Anzahl der Mitglieder, die im angegebenen Monat
   * Mitglied geworden sind.
   *
   * @param monat der Monat des Beitritts.
   * @return die Anzahl der Mitglieder, die im Monat beigetreten sind.
   */
  public int beigetretenImMonat(int monat) {
    if (monat > 12 || monat < 1) {
      System.out.println("Kein gültiger Monat.");
      return 0;
    }

    int counter = 0;
    for (Mitgliedschaft mitgliedschaft : mitgliedschaften) {
      if (mitgliedschaft.gibMonat() == monat) {
        counter++;
      }
    }
    return counter;
  }

  /**
   * Entferne alle Mitglieder aus der Sammlung des Vereins, die im
   * angegebenen Monat Mitglied geworden sind, und liefere sie in
   * einem getrennten Sammlungsobjekt zurück.
   *
   * @param monat der Monat des Beitritts.
   * @param jahr  das Jahr des Beitritts
   * @return die neuen Mitglieder des gegebenen Monats und Jahres.
   */
  public ArrayList<Mitgliedschaft> entfernen(int monat, int jahr) {
    ArrayList<Mitgliedschaft> newMembers = new ArrayList<>();
    Iterator<Mitgliedschaft> it = mitgliedschaften.iterator();
    while (it.hasNext()) {
      Mitgliedschaft mitgliedschaft = it.next();
      if (mitgliedschaft.gibMonat() == monat && mitgliedschaft.gibJahr() == jahr) {
        newMembers.add(mitgliedschaft);
        it.remove();
        mitgliedschaften.remove(mitgliedschaft);
      }
    }
    return newMembers;
  }
}
