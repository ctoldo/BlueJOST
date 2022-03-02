/**
 * Author: Claudio Toldo
 * Created: 02.03.2022 15:48
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter2.bessererTicketautomat;

public class TicketautomatStarter {

  public static void main(String[] args) {
    execute2_46();
  }

  private static void execute2_46() {
    Ticketautomat automat = new Ticketautomat(50);
    System.out.println(automat.gibBisherGezahltenBetrag());
    automat.geldEinwerfen(10);
    System.out.println(automat.gibBisherGezahltenBetrag());
    automat.geldEinwerfen(10);
    System.out.println(automat.gibBisherGezahltenBetrag());
    automat.geldEinwerfen(20);
    System.out.println(automat.gibBisherGezahltenBetrag());
    automat.geldEinwerfen(0);
    System.out.println(automat.gibBisherGezahltenBetrag());
    automat.geldEinwerfen(10);
    System.out.println(automat.gibBisherGezahltenBetrag());

    //null einwerfen kompiliert nicht
  }
}
