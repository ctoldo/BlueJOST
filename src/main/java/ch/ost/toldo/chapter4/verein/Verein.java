package ch.ost.toldo.chapter4.verein;

import java.util.ArrayList;

/**
 * Speichert Details �ber Vereinsmitgliedschaften.
 *
 * @author Claudio Toldo
 * @version 16.03.2022
 */
public class Verein {
  // Definieren Sie alle notwendigen Datenfelder hier...
  ArrayList<Mitgliedschaft> mitgliedschaften;


  /**
   * Konstruktor f�r Objekte der Klasse Verein
   */
  public Verein() {
    // Initialisieren Sie die Datenfelder hier...
    mitgliedschaften = new ArrayList<>();

  }

  /**
   * F�ge ein neues Mitglied in die Mitgliederliste ein.
   *
   * @param mitglied Infos �ber das einzuf�gende Mitglied
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
}
