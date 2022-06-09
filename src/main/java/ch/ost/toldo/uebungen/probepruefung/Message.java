package ch.ost.toldo.uebungen.probepruefung;

/**
 * @author Claudio Toldo
 * @version 09.06.2022 13:29
 * � 2022 Claudio Toldo
 */
public abstract class Message {

  // statische Integer-Variable, um Anzahl der Messages zu z�hlen -> Instanzvariable
  private static int anzahlMessages;
  //private String-Variable f�r Betreff -> Instanzvariable
  private String subject;
  //Versand-Status der Nachricht -> protected, damit Subklassen direkt Zugriff haben -> Instanzvariable
  protected Status status;

  //Konstruktor der Methode
  public Message(String subject) {
    this.subject = subject;
    anzahlMessages++;
  }

  //gibt die Anzahl Messages, die erstellt wurden zur�ck -> Klassenmethode
  public static int getAnzahlMessages() {
    return anzahlMessages;
  }

  //gibt den Betreff der Nachricht zur�ck -> Instanzmethode
  public String getSubject() {
    return subject;
  }

  //gibt den Status der Nachricht zur�ck -> Instanzmethode
  public Status getStatus() {
    return status;
  }

}
