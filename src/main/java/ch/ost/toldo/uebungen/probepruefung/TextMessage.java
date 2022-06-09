package ch.ost.toldo.uebungen.probepruefung;

/**
 * @author Claudio Toldo
 * @version 09.06.2022 13:30
 * © 2022 Claudio Toldo
 */
public class TextMessage extends Message implements TextFormat {
  private String textMessage;

  public TextMessage(String subject, String text) {
    super(subject);
    textMessage = text;
  }

  @Override
  public boolean anzeigen(String text) {
    switch (text) {
      case "test":
        System.out.println(TextFormat.FONTTYP);
        break;
      case "productive":
        System.out.println(getSubject() + " " + textMessage);
        break;
      default:
        System.out.println(text);
        break;
    }
    return !text.isEmpty();
  }
}
