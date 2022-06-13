package ch.ost.toldo.uebungen.woche12Fehler;

import javax.swing.*;

/**
 * @author Claudio Toldo
 * @version 13.06.2022 12:08
 * © 2022 Claudio Toldo
 */
public class GUI {

  public static void main(String[] args) {
    int value = Integer.parseInt(JOptionPane.showInputDialog("Gib einen Wert ein.", 0));
    berechnen(value);
  }

  private static void berechnen(int value) {
    try {
      int resultat = new Berechnung().berechnen(value);
      JOptionPane.showMessageDialog(new JDialog(), "Test erfolgreich mit dem Resultat: " + resultat, "Information", JOptionPane.INFORMATION_MESSAGE);
    } catch (ValueOutOfRangeException | ArithmeticException e) {
      JOptionPane.showMessageDialog(new JDialog(), e.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
    }
    JOptionPane.showMessageDialog(new JDialog(), "Tests druchgeführt", "Information", JOptionPane.INFORMATION_MESSAGE);
  }

}
