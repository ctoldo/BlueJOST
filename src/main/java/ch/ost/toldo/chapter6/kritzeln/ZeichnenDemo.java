package ch.ost.toldo.chapter6.kritzeln;

import ch.ost.toldo.chapter6.baelle.KastenBall;

import java.awt.*;
import java.util.Random;

/**
 * Die Klasse ZeichnenDemo bietet einige kurze Demonstrationen, wie mithilfe der
 * Klasse Stift verschiedene Zeichnungen erzeugt werden können.
 *
 * @author Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */

public class ZeichnenDemo {
  private Canvas meineCanvas;
  private Random zufallsgenerator;

  /**
   * Die Demo vorbereiten. Es wird eine frische Canvas erzeugt und sichtbar gemacht.
   */
  public ZeichnenDemo() {
    meineCanvas = new Canvas("Zeichnen-Demo", 500, 400);
    zufallsgenerator = new Random();
  }

  /**
   * Zeichne ein Quadrat auf den Bildschirm.
   */
  public void zeichneQuadrat() {
    Stift stift = new Stift(320, 260, meineCanvas);
    stift.setzeFarbe(Color.BLUE);

    quadrat(stift);
  }

  /**
   * Zeichne ein grünes Dreieck auf den Bildschirm
   */
  public void zeichneDreieck() {
    Stift stift = new Stift(200, 200, meineCanvas);
    stift.setzeFarbe(Color.GREEN);

    for (int i = 0; i < 3; i++) {
      stift.bewegen(100);
      stift.drehen(-120);
    }
  }

  /**
   * Zeichne ein grünes Fünfeck auf den Bildschirm
   */
  public void zeichneFuenfeck() {
    Stift stift = new Stift(200, 200, meineCanvas);
    stift.setzeFarbe(Color.GREEN);

    for (int i = 0; i < 5; i++) {
      stift.bewegen(100);
      stift.drehen(-(360/5));
    }
  }

  /**
   * Zeichne ein Rad aus mehreren Quadraten.
   */
  public void zeichneRad() {
    Stift stift = new Stift(250, 200, meineCanvas);
    stift.setzeFarbe(Color.RED);

    for (int i = 0; i < 36; i++) {
      quadrat(stift);
      stift.drehen(10);
    }
  }

  public void zeichneNEck(int n) {
    Stift stift = new Stift(200, 350, meineCanvas);
    stift.setzeFarbe(Color.BLACK);

    for (int i = 0; i < n; i++) {
      stift.bewegen(100);
      stift.drehen(-(360/n));
    }
  }

  public void zeichneSpirale() {
    Stift stift = new Stift(10, 10, meineCanvas);
    stift.setzeFarbe(Color.BLACK);
    stift.drehenZu(90);

    for (int distance = 380; distance > 0; distance -= 10) {
      for (int i = 0; i < 2; i++) {
        stift.bewegen(distance);
        stift.drehen(-90);
      }
    }
  }

  /**
   * Zeichne ein Quadrat in der Farbe des Stifts und an der Position des Stifts.
   */
  private void quadrat(Stift stift) {
    for (int i = 0; i < 4; i++) {
      stift.bewegen(100);
      stift.drehen(90);
    }
  }

  /**
   * Zeichne einige zufällige Schnörkel in zufälligen Farben.
   */
  public void buntesGekritzel() {
    Stift stift = new Stift(250, 200, meineCanvas);

    for (int i = 0; i < 10; i++) {
      // wähle zufällig eine Farbe aus
      int rot = zufallsgenerator.nextInt(256);
      int gruen = zufallsgenerator.nextInt(256);
      int blau = zufallsgenerator.nextInt(256);
      stift.setzeFarbe(new Color(rot, gruen, blau));

      stift.zufaelligesGekritzel();
    }
  }

  /**
   * Leere die Zeichenfläche.
   */
  public void leeren() {
    meineCanvas.erase();
  }

  /**
   * Erstelle einige Formen mit Canvas
   */
  public void drawSomeShit() {
    meineCanvas.fillRectangle(100, 250, 100, 100);
    meineCanvas.setForegroundColor(Color.YELLOW);
    meineCanvas.fillCircle(125, 250, 100);
    meineCanvas.setForegroundColor(Color.GREEN);
    meineCanvas.fillRectangle(200, 250, 150, 100);
    meineCanvas.setForegroundColor(Color.BLACK);
    meineCanvas.drawString("Wo isch Problem?", 20, 20);
    meineCanvas.setForegroundColor(Color.RED);
    meineCanvas.drawLine(20, 22, 120, 22);
  }
}
