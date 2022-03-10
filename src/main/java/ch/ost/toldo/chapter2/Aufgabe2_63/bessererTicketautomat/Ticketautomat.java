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

package ch.ost.toldo.chapter2.Aufgabe2_63.bessererTicketautomat;

public class Ticketautomat {
  // Der Preis eines Tickets dieses Automaten.
  private int preis;
  //Betrag der vom Preis abgezogen werden soll
  private int rabattbetrag;
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
    rabattbetrag = 0;
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
   * gibt den Preis unter Berücksichtigung des Rabatts
   */
  public int getPriceIncludingDiscount(){
    return preis - rabattbetrag;
  }

  /**
   * wird benötigt um Rabatt zu definieren
   */
  public void setDiscount(int rabattbetrag) {
    this.rabattbetrag = rabattbetrag;
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
      System.out.println("# " + getPriceIncludingDiscount() + " Cent.");
      System.out.println("##################\n");

      // Die Gesamtsumme um den Ticketpreis erhöhen.
      gesamtsumme = gesamtsumme + getPriceIncludingDiscount();
      // Den Preis von der bisherigen Bezahlung abziehen.
      bisherGezahlt = bisherGezahlt - getPriceIncludingDiscount();
    } else {
      System.out.println("Sie müssen noch mindestens " +
              (getPriceIncludingDiscount() - bisherGezahlt) +
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
    rabattbetrag = 0;
    return wechselgeld;
  }

  public int entleeren() {
    int gesamtsumme = this.gesamtsumme;
    this.gesamtsumme = 0;
    return gesamtsumme;
  }
}
