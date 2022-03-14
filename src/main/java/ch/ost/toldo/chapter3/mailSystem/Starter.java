/*
 * Author: Claudio Toldo
 * Created: 14.03.2022 14:04
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter3.mailSystem;

public class Starter {
  public static void main(String[] args) {
    MailServer mailServer = new MailServer();
    MailClient mailClient = new MailClient(mailServer, "claudio.toldo@ost.ch");
    mailClient.sendeNachricht("claudio.toldo@ost.ch", "Ich freue mich auf den nächsten Unterricht.\nLG Seppli", "Vorfreude");
    mailClient.naechsteNachrichtAusgeben();
  }
}
