/**
 * Author: Claudio Toldo
 * Created: 02.03.2022 11:18
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter2.naiverTicketautomat;

public class TicketautomatStarter {

  public static void main(String[] args) {
    executeUebung2_1and2_2();
    executeUebung2_3();
    executeUebung2_42();
  }

  private static void executeUebung2_1and2_2() {
    //Übung 2.1
    Ticketautomat automat1 = new Ticketautomat(300);
    automat1.geldEinwerfen(200);
    int bisherGezahlterBetrag = automat1.gibBisherGezahltenBetrag(); //bisherGezahlterBetrag == 200
    System.out.println(bisherGezahlterBetrag);
    automat1.geldEinwerfen(100);
    bisherGezahlterBetrag = automat1.gibBisherGezahltenBetrag(); //bisherGezahlterBetrag == 300
    System.out.println(bisherGezahlterBetrag);
    automat1.ticketDrucken();

    //Übung 2.2
    bisherGezahlterBetrag = automat1.gibBisherGezahltenBetrag(); //bisherGezahlterBetrag == 0
    System.out.println(bisherGezahlterBetrag);
  }

  private static void executeUebung2_3() {
    //Übung 2.3
    //zu viel -> kein Wechselgeld zurück
    Ticketautomat automat2 = new Ticketautomat(20);
    automat2.geldEinwerfen(30);
    automat2.ticketDrucken();
    //zu wenig -> gibt Ticket trotz zuwenig Geld
    Ticketautomat automat3 = new Ticketautomat(50);
    automat3.geldEinwerfen(10);
    automat3.ticketDrucken();
  }

  private static void executeUebung2_42() {
    Ticketautomat aOne = new Ticketautomat(20);
    Ticketautomat aTwo = new Ticketautomat(80);

    aOne.preisAusgeben();
    aTwo.preisAusgeben();
  }
}
