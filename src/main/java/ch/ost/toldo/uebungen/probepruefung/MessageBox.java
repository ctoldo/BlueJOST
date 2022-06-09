package ch.ost.toldo.uebungen.probepruefung;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @author Claudio Toldo
 * @version 09.06.2022 13:30
 * © 2022 Claudio Toldo
 */
public class MessageBox {

  private TreeMap<String, Message> messages;

  public MessageBox() {
    messages = new TreeMap<>();
  }

  public void testMethode() {
    TextMessage textMessage = new TextMessage("Auftrag", "Gerne bestelle ich ...");
    char[] audio = new char[1000];
    AudioMessage audioMessage = new AudioMessage("Auto", audio);
    messages.put(textMessage.getSubject(), textMessage);
    messages.put(audioMessage.getSubject(), audioMessage);

    for (Iterator<Message> it = messages.values().iterator(); it.hasNext(); ) {
      Message message = it.next();
      if (message.getStatus() != Status.DELETED && message instanceof TextMessage) {
        ((TextMessage) message).anzeigen("productive");
      }
    }

    System.out.println("Gesamtanzahl Messages: " + Message.getAnzahlMessages());
  }
}
