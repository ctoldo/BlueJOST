/**
 * Eine Klasse, deren Objekte Informationen über ein Buch halten.
 * Dies könnte Teil einer größeren Anwendung sein, einer
 * Bibliothekssoftware beispielsweise.
 *
 * @author (Ihren Namen hier eintragen.)
 * @version (das heutige Datum eintragen.)
 */

package ch.ost.toldo.chapter2.buchAufgabe;

class Buch {
  // Die Datenfelder
  private String autor;
  private String titel;

  /**
   * Setze den Autor und den Titel, wenn ein Objekt erzeugt wird.
   */
  public Buch(String buchautor, String buchtitel) {
    autor = buchautor;
    titel = buchtitel;
  }

  // weitere Methoden hier einfügen ...
}
