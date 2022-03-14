package ch.ost.toldo.chapter3.mailSystem;

/**
 * Eine Klasse, die einfache Nachrichten modelliert. Eine Nachricht hat
 * einen Absender und einen Empfänger und enthält Text.
 *
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29
 */
public class Nachricht {
  // Der Absender der Nachricht
  private String absender;
  // Der gewünschte Empfänger der Nachricht
  private String empfaenger;
  // Der Text der Nachricht
  private String text;
  private String betreff;

  /**
   * Erzeuge eine Nachricht vom gegebenen 'absender' an den gegebenen
   * 'empfaenger' mit dem gegebenen 'text'.
   *
   * @param absender   der Absender dieser Nachricht
   * @param empfaenger der gewünschte Empfänger dieser Nachricht
   * @param text       der Text der Nachricht
   * @param betreff
   */
  public Nachricht(String absender, String empfaenger, String text, String betreff) {
    this.absender = absender;
    this.empfaenger = empfaenger;
    this.text = text;
    this.betreff = betreff;
  }

  /**
   * @return den Absender dieser Nachricht
   */
  public String gibAbsender() {
    return absender;
  }

  /**
   * @return den gewünschten Empfänger dieser Nachricht
   */
  public String gibEmpfaenger() {
    return empfaenger;
  }

  /**
   * @return den Text dieser Nachricht
   */
  public String gibText() {
    return text;
  }

  public String gibBetreff() {
    return betreff;
  }

  /**
   * Gib Informationen über diese Nachricht auf der Konsole aus.
   */
  public void ausgeben() {
    System.out.println("Von:\t\t" + absender);
    System.out.println("An:\t\t\t" + empfaenger);
    System.out.println("Betreff:\t" + betreff);
    System.out.println("Text:\n" + text);
  }
}
