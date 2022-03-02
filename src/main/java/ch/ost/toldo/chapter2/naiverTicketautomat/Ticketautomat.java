/**
 * Die Klasse Ticketautomat modelliert einfache Ticketautomaten,
 * die Tickets zu einem Einheitspreis herausgeben.
 * Der Preis für die Tickets eines Automaten kann über den Konstruktor
 * festgelegt werden.
 * Ein Ticketautomat ist insofern 'naiv', dass er seinen Benutzern
 * vertraut, dass sie genügend Geld einwerfen, bevor sie sich ein Ticket
 * ausdrucken lassen.
 * Außerdem nimmt er an, dass sinnvolle Beträge eingeworfen werden.
 *
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29
 */

package ch.ost.toldo.chapter2.naiverTicketautomat;

public class Ticketautomat {
  // Der Preis eines Tickets dieses Automaten.
  private int preis;
  // Der Betrag, der bisher vom Automatenbenutzer eingeworfen wurde.
  private int bisherGezahlt;
  // Die Geldsumme, die bisher von diesem Automaten eingenommen wurde.
  private int gesamtsumme;

  /**
   * Erzeuge eine Maschine, die Tickets zum angegebenen Preis
   * (in Cent) ausgibt.
   * Zu beachten: Der Preis muss größer als null sein,
   * der Automat überprüft dies jedoch nicht.
   */
  public Ticketautomat(int ticketpreis) {
    preis = ticketpreis;
    bisherGezahlt = 0;
    gesamtsumme = 0;
  }

  /**
   * Erzeuge eine Maschine, die Tickets zum angegebenen Preis
   * (in Cent) ausgibt.
   */
  public Ticketautomat() {
    this(1000);
  }

  /**
   * Liefere den Preis eines Tickets dieses Automaten (in Cent).
   */
  public int gibPreis() {
    return preis;
  }

  /**
   * setze Preis auf Ticketautomat
   */
  public void setzePreis(int preis){
    this.preis = preis;
  }

  /**
   * Liefere die Höhe des Betrags, der für das nächste Ticket bereits
   * eingeworfen wurde.
   */
  public int gibBisherGezahltenBetrag() {
    return bisherGezahlt;
  }

  /**
   * Liefert den Betrag, den die Maschine bisher insgesamt umgesetzt hat.
   */
  public int gibGesamtsumme() {
    return gesamtsumme;
  }

  /**
   * leert die Gesamtsumme
   */
  public void leeren() {
    gesamtsumme = 0;
  }

  /**
   * Nimm den angegebenen Betrag als Anzahlung für das
   * nächste Ticket.
   */
  public void geldEinwerfen(int betrag) {
    bisherGezahlt += betrag;
  }

  public void meldung() {
    System.out.println("Bitte werfen Sie den passenden Betrag ein.");
  }

  public void preisAusgeben(){
    System.out.println("Der Preis eines Tickets beträgt " + preis + " Cent.");
  }

  /**
   * Drucke ein Ticket.
   * Aktualisiere die eingenommene Gesamtsumme und setze den gezahlten
   * Betrag auf null.
   */
  public void ticketDrucken() {
    // Den Ausdruck eines Tickets simulieren.
    System.out.println("##################");
    System.out.println("# Die BlueJ-Linie");
    System.out.println("# Ticket");
    System.out.println("# " + preis + " Cent.");
    System.out.println("##################");
    System.out.println();

    // Die Gesamtsumme mit dem eingezahlten Betrag aktualisieren.
    gesamtsumme = gesamtsumme + bisherGezahlt;
    // Die bisherige Bezahlung zurücksetzen.
    bisherGezahlt = 0;
  }
}
