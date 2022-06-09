package ch.ost.toldo.uebungen.woche11GUI;

import javax.swing.*;
import java.awt.*;

/**
 * @author Claudio Toldo
 * @version 19.05.2022 13:20
 * © 2022 Claudio Toldo
 */
public class GUI {

  public GUI() {
    initGUI();
  }

  private void initGUI() {
    JFrame frame = new JFrame("Ein erster Versuch mit einem GUI");
    frame.setSize(400, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton button = new JButton("Gebe Text aus");
    button.setSize(130, 100);
    button.addActionListener(e -> clickButton());
    frame.add(button);

    frame.setVisible(true);
  }

  public void clickButton() {
    System.out.println("Der Button wurde gedrückt.");
    JDialog dialog = new JDialog();
    JOptionPane.showMessageDialog(dialog, "Der Button wurde gedrückt.", "Button gedrückt", JOptionPane.INFORMATION_MESSAGE);
  }
}
