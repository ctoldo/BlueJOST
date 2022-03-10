/**
 * Die Klasse Ticketautomat modelliert einfache Ticketautomaten,
 * die Tickets zu einem Einheitspreis herausgeben.
 * Der Preis f�r die Tickets eines Automaten kann �ber den Konstruktor
 * festgelegt werden.
 * Ticketautomaten dieser Klasse pr�fen, ob sinnvolle Geldbetr�ge
 * eingeworfen werden, und drucken ein Ticket nur dann, wenn
 * ausreichend Geld eingeworfen wurde.
 *
 * @author David J. Barnes und Michael K�lling
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
   * gibt den Preis unter Ber�cksichtigung des Rabatts
   */
  public int getPriceIncludingDiscount(){
    return preis - rabattbetrag;
  }

  /**
   * wird ben�tigt um Rabatt zu definieren
   */
  public void setDiscount(int rabattbetrag) {
    this.rabattbetrag = rabattbetrag;
  }

  /**
   * Liefere die H�he des Betrags, der f�r das n�chste Ticket bereits
   * eingeworfen wurde.
   */
  public int gibBisherGezahltenBetrag() {
    return bisherGezahlt;
  }

  /**
   * Nimm den angegebenen Betrag als Anzahlung f�r das
   * n�chste Ticket. Pr�fe, ob der Betrag sinnvoll ist.
   */
  public void geldEinwerfen(int betrag) {
    if (betrag > 0) {
      bisherGezahlt = bisherGezahlt + betrag;
    } else {
      System.out.println("Bitte nur positive Betr�ge verwenden: "
              + betrag);
    }

//    if (betrag <= 0) {
//      System.out.println("Bitte nur positive Betr�ge verwenden: "
//              + betrag);
//    } else {
//      bisherGezahlt = bisherGezahlt + betrag;
//    }
  }

  /**
   * Drucke ein Ticket, wenn gen�gend Geld eingeworfen wurde, und
   * ziehe den Ticketpreis vom bisher gezahlten Betrag ab. Gib eine
   * Fehlermeldung aus, falls noch Geld f�r ein Ticket fehlt.
   */
  public void ticketDrucken() {
    if (bisherGezahlt >= preis) {
      // Den Ausdruck eines Tickets simulieren.
      System.out.println("##################");
      System.out.println("# Die BlueJ-Linie");
      System.out.println("# Ticket");
      System.out.println("# " + getPriceIncludingDiscount() + " Cent.");
      System.out.println("##################\n");

      // Die Gesamtsumme um den Ticketpreis erh�hen.
      gesamtsumme = gesamtsumme + getPriceIncludingDiscount();
      // Den Preis von der bisherigen Bezahlung abziehen.
      bisherGezahlt = bisherGezahlt - getPriceIncludingDiscount();
    } else {
      System.out.println("Sie m�ssen noch mindestens " +
              (getPriceIncludingDiscount() - bisherGezahlt) +
              " Cent einwerfen.");
    }
  }

  /**
   * Gib das Wechselgeld bzw. den bisher gezahlten Betrag zur�ck.
   * Setze den bisher gezahlten Betrag zur�ck auf 0.
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
