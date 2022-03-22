package ch.ost.toldo.chapter4.artikelbestand;

import java.util.ArrayList;

/**
 * Verwalte den Bestand eines Unternehmens.
 * Der Bestand ist beschrieben durch einen oder
 * mehrere Artikel.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bestandsverwalter {
  // Das Lager mit den Artikeln
  private ArrayList<Artikel> lager;

  /**
   * Initialisiere den Bestandsverwalter.
   */
  public Bestandsverwalter() {
    lager = new ArrayList<>();
  }

  /**
   * Führe einen neuen Artikel im Lager ein.
   *
   * @param artikel der Artikel, der neue eingeführt werden soll
   */
  public void neuerArtikel(Artikel artikel) {
    if (findeArtikel(artikel.gibNummer()) == null) {
      lager.add(artikel);
    }
  }

  /**
   * Nimm eine Lieferung eines Artikels in das Lager auf.
   * Erhöhe den Lagerbestand um die angegebene Menge.
   *
   * @param nummer die Artikelnummer des Artikels
   * @param menge  die angelieferte Menge
   */
  public void aufnehmen(int nummer, int menge) {
    Artikel artikel = findeArtikel(nummer);
    if (artikel != null) {
      artikel.erhoeheBestand(menge);
    }
  }

  /**
   * Versuche einen Artikel mit der angegebenen Nummer im
   * Bestand zu finden.
   *
   * @param nummer die Nummer des zu findenden Artikels.
   * @return den gefundenen Artikel oder null, falls kein
   * passender Artikel gefunden wird.
   */
  public Artikel findeArtikel(int nummer) {
    for (Artikel artikel : lager) {
      if (artikel.gibNummer() == nummer) {
        return artikel;
      }
    }
    return null;
  }

  /**
   * Versuche einen Artikel mit dem angegebenen String im
   * Bestand zu finden.
   *
   * @param name der Name des zu findenden Artikels.
   * @return den gefundenen Artikel oder null, falls kein
   * passender Artikel gefunden wird.
   */
  public Artikel findeArtikel(String name) {
    for (Artikel artikel : lager) {
      if (artikel.gibName().equals(name)) {
        return artikel;
      }
    }
    return null;
  }

  /**
   * Finde einen Artikel mit der angegebenen Nummer und
   * liefere seine aktuelle Menge im Bestand.
   * Wenn die Nummer auf keinen Artikel passt, wird
   * Null zurückgeliefert.
   *
   * @param nummer die Nummer des Artikels
   * @return die Menge des Artikels im Bestand
   */
  public int mengeImBestand(int nummer) {
    Artikel artikel = findeArtikel(nummer);
    if (artikel != null) {
      return artikel.gibBestand();
    } else {
      return 0;
    }
  }

  /**
   * Informationen über alle Artikel ausgeben.
   */
  public void alleArtikelAnzeigen() {
    for (Artikel artikel : lager) {
      System.out.println(artikel);
    }
  }

  public void printDetailsOfProductsWithFewerAmount(int menge) {
    for (Artikel artikel : lager) {
      if (artikel.gibBestand() < menge) {
        System.out.println(artikel);
      }
    }
  }
}
