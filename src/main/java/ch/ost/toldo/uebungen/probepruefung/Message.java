package ch.ost.toldo.uebungen.probepruefung;

/**
 * @author Claudio Toldo
 * @version 09.06.2022 13:29
 * © 2022 Claudio Toldo
 */
public abstract class Message {

  // statische Integer-Variable, um Anzahl der Messages zu zählen -> Instanzvariable
  private static int anzahlMessages;
  //private String-Variable für Betreff -> Instanzvariable
  private String subject;
  //Versand-Status der Nachricht -> protected, damit Subklassen direkt Zugriff haben -> Instanzvariable
  protected Status status;

  //Konstruktor der Methode
  public Message(String subject) {
    this.subject = subject;
    anzahlMessages++;
  }

  //gibt die Anzahl Messages, die erstellt wurden zurück -> Klassenmethode
  public static int getAnzahlMessages() {
    return anzahlMessages;
  }

  //gibt den Betreff der Nachricht zurück -> Instanzmethode
  public String getSubject() {
    return subject;
  }

  //gibt den Status der Nachricht zurück -> Instanzmethode
  public Status getStatus() {
    return status;
  }

}
