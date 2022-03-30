package ch.ost.toldo.chapter6.baelle;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * Die Klasse BallDemo bietet eine kurze Demonstration, wie die
 * Klasse Canvas benutzt werden kann.
 *
 * @author Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */

public class BallDemo {
  private Canvas leinwand;

  /**
   * Erzeuge ein Exemplar von BallDemo.
   * Es wird ein frischer Canvas erzeugt und sichtbar gemacht.
   */
  public BallDemo() {
    leinwand = new Canvas("Ball Demo", 600, 500);
  }

  /**
   * Simuliere zwei springende Bälle.
   */
  public void springenLassen(int anzahlBaelle) {
    int boden = 400;   // Position der Bodenlinie

    leinwand.setVisible(true);

    // Den Boden zeichnen.
    leinwand.setForegroundColor(Color.BLACK);
    leinwand.drawLine(50, boden, 550, boden);

    // Die Bälle erzeugen und anzeigen.
    HashSet<Ball> baelle = generiereBaelle(anzahlBaelle, boden);

    // Die Bälle springen lassen.
    while (true) {
      leinwand.wait(50);           // kurze Pause
      baelle.forEach(Ball::bewegen);
      // Stoppen, wenn die Bälle weit genug gesprungen sind.
      if (baelle.stream().anyMatch(ball -> ball.gibXPosition() >= 550)) {
        return;
      }
    }
  }

  private HashSet<Ball> generiereBaelle(int anzahlBaelle, int boden) {
    HashSet<Ball> baelle = new HashSet<>();
    Random random = new Random();

    for (int i = 0; i < anzahlBaelle; i++) {
      int xPos = random.nextInt(50, 400);
      int yPos = random.nextInt(boden);
      int balldurchmesser = random.nextInt(5, 20);
      Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)); //RGB jeweil zwischen 0 und 255
      Ball ball = new Ball(xPos, yPos, balldurchmesser, color, boden, leinwand);
      ball.zeichnen();
      baelle.add(ball);
    }

    return baelle;
  }

  public void kastenSpringen(int anzahlBaelle) {
    int borderLeft = 10;
    int borderRight = 310;
    int borderTop = 10;
    int borderBottom = 310;

    leinwand.setVisible(true);
    leinwand.setForegroundColor(Color.BLACK);
    leinwand.draw(new Rectangle(borderLeft, borderTop, borderRight - borderLeft, borderBottom - borderTop));

    HashSet<KastenBall> baelle = new HashSet<>();
    for (int i = 0; i < anzahlBaelle; i++) {
      KastenBall ball = new KastenBall(borderLeft, borderTop, borderRight, borderBottom, leinwand);
      baelle.add(ball);
      ball.zeichnen();
    }

    // Die Bälle 100x springen lassen.
    for (int i = 0; i < 100; i++) {
      leinwand.wait(50);           // kurze Pause
      baelle.forEach(KastenBall::bewegen);
    }
  }
}
