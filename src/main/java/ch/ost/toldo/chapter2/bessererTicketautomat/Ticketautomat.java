/**
 * Die Klasse Ticketautomat modelliert einfache Ticketautomaten,
 * die Tickets zu einem Einheitspreis herausgeben.
 * Der Preis für die Tickets eines Automaten kann über den Konstruktor
 * festgelegt werden.
 * Ticketautomaten dieser Klasse prüfen, ob sinnvolle Geldbeträge
 * eingeworfen werden, und drucken ein Ticket nur dann, wenn
 * ausreichend Geld eingeworfen wurde.
 *
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29
 */

package ch.ost.toldo.chapter2.bessererTicketautomat;

public class Ticketautomat {
  // Der Preis eines Tickets dieses Automaten.
  private int preis;
  // Der Betrag, der bisher vom Automatenbenutzer eingeworfen wurde.
  private int bisherGezahlt;
  // Die Geldsumme, die bisher von diesem Automaten eingenommen wurde.
  private int gesamtsumme;

  /**
   * Erzeuge einen Automaten, der Tickets zum angegebenen
   * Preis ausgibt.
   */
  public Ticketautomat(int ticketpreis) {
    preis = ticketpreis;
    bisherGezahlt = 0;
    gesamtsumme = 0;
  }

  /**
   * Liefere den Preis eines Tickets dieses Automaten.
   */
  public int gibPreis() {
    return preis;
  }

  /**
   * Liefere die Höhe des Betrags, der für das nächste Ticket bereits
   * eingeworfen wurde.
   */
  public int gibBisherGezahltenBetrag() {
    return bisherGezahlt;
  }

  /**
   * Nimm den angegebenen Betrag als Anzahlung für das
   * nächste Ticket. Prüfe, ob der Betrag sinnvoll ist.
   */
  public void geldEinwerfen(int betrag) {
    if (betrag > 0) {
      bisherGezahlt = bisherGezahlt + betrag;
    } else {
      System.out.println("Bitte nur positive Beträge verwenden: "
              + betrag);
    }

//    if (betrag <= 0) {
//      System.out.println("Bitte nur positive Beträge verwenden: "
//              + betrag);
//    } else {
//      bisherGezahlt = bisherGezahlt + betrag;
//    }
  }

  /**
   * Drucke ein Ticket, wenn genügend Geld eingeworfen wurde, und
   * ziehe den Ticketpreis vom bisher gezahlten Betrag ab. Gib eine
   * Fehlermeldung aus, falls noch Geld für ein Ticket fehlt.
   */
  public void ticketDrucken() {
    if (bisherGezahlt >= preis) {
      // Den Ausdruck eines Tickets simulieren.
      System.out.println("##################");
      System.out.println("# Die BlueJ-Linie");
      System.out.println("# Ticket");
      System.out.println("# " + preis + " Cent.");
      System.out.println("##################\n");

      // Die Gesamtsumme um den Ticketpreis erhöhen.
      gesamtsumme = gesamtsumme + preis;
      // Den Preis von der bisherigen Bezahlung abziehen.
      bisherGezahlt = bisherGezahlt - preis;
    } else {
      System.out.println("Sie müssen noch mindestens " +
              (preis - bisherGezahlt) +
              " Cent einwerfen.");
    }
  }

  /**
   * Gib das Wechselgeld bzw. den bisher gezahlten Betrag zurück.
   * Setze den bisher gezahlten Betrag zurück auf 0.
   */
  public int wechselgeldAuszahlen() {
    int wechselgeld;
    wechselgeld = bisherGezahlt;
    bisherGezahlt = 0;
    return wechselgeld;
  }
}
