package ch.ost.toldo.uebungen.probepruefung;

/**
 * @author Claudio Toldo
 * @version 09.06.2022 13:30
 * © 2022 Claudio Toldo
 */
public class AudioMessage extends Message{

  private char[] audioMessage;

  public AudioMessage(String subject, char[] audioMessage) {
    super(subject);
    this.audioMessage = audioMessage;
  }

}
