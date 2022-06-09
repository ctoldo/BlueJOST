package ch.ost.toldo.uebungen.probepruefung;

import java.awt.Font;

/**
 * Interface für TextFormat
 *
 * @author Claudio Toldo
 * @version 09.06.2022 13:19
 * © 2022 Claudio Toldo
 */
public interface TextFormat {


  /* hier keine Kommentar nötig -> Klassenvariable */
  /* implizit static final */
  Font FONTTYP = new Font("Arial", Font.BOLD, 11);

  /**
   * Zeigt Text im richtigen Format an
   *
   * @param text Text der angezeigt werde soll
   * @return true -> Ausgabe ok / false -> Fehler in Anzeige
   */
  boolean anzeigen(String text);

}
