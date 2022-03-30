/*
 * Author: Claudio Toldo
 * Created: 28.03.2022 17:21
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.baelle;

import java.awt.*;
import java.util.Random;

public class KastenBall {

  private final int borderLeft;
  private final int borderTop;
  private final int borderRight;
  private final int borderBottom;
  private final Random random;
  private final Canvas zeichengrund;
  private int radius;
  private int speed;
  private Color color;
  int xPosition;
  int yPosition;
  int winkel;

  /**
   * Konstruktor für Exemplare von Ball
   *
   * @param borderLeft   die linke Abgrenzung des Rechtecks
   * @param borderTop    die obere Abgrenzung des Rechtecks
   * @param borderRight  die rechte Abgrenzung des Rechtecks
   * @param borderBottom die untere Abgrenzung des Rechtecks
   * @param zeichengrund die Leinwand, auf der dieser Ball gezeichnet wird
   */
  public KastenBall(int borderLeft, int borderTop, int borderRight, int borderBottom, Canvas zeichengrund) {
    this.borderLeft = borderLeft;
    this.borderTop = borderTop;
    this.borderRight = borderRight;
    this.borderBottom = borderBottom;
    this.zeichengrund = zeichengrund;
    random = new Random();
    setRadius();
    setSpeed();
    setColor();
    setStartPosition();
    setWinkel();
  }

  /**
   * Zeichne diesen Ball an der aktuellen Position auf die Leinwand.
   **/
  public void zeichnen() {
    zeichengrund.setForegroundColor(color);
    zeichengrund.fillCircle(xPosition, yPosition, radius * 2);
  }

  /**
   * Lösche diesen Ball an seiner aktuellen Position.
   **/
  public void loeschen() {
    zeichengrund.eraseCircle(xPosition, yPosition, radius * 2);
  }

  /**
   * Bewege diesen Ball entsprechend seiner Position und
   * Geschwindigkeit und zeichne ihn erneut.
   **/
  public void bewegen() {
    // An der aktuellen Position von der Leinwand entfernen.
    loeschen();

    /*TODO Die Grenzen werden noch nicht richtig erkannt wegen der Bewegung
    * das führt dazu, dass die Bälle über die Grenzen hinaus gehen... vlt mal noch korrigieren, dass dies auch korrekt
    * funktioniert
    * neue Position muss anders berechnet werden, da bereits an den Grenzen gewendet werden muss und nicht erst
    * wenn die Grenzen überschritten wurden... die Distanz, die aktuell über die Grenze hinweg bewegt wird muss bereits
    * wieder in die Box gehen... allerdings auch bereits im richtigen Winkel
    * Für den Anfang reicht das aber so
    */
    // Neue Position berechnen.
    calculateNewPosition();

    // Prüfen, ob Grenze erreicht ist, wenn ja Richtung ändern.
    turnAroundIfNeccessary();

    // An der neuen Position erneut zeichnen.
    zeichnen();
  }

  /**
   * Liefere die horizontale Position dieses Balls.
   */
  public int gibXPosition() {
    return xPosition;
  }

  /**
   * Liefere die vertikale Position dieses Balls.
   */
  public int gibYPosition() {
    return yPosition;
  }

  /**
   * setzt auf dem Ball eine zufällige Farbe
   */
  private void setColor() {
    color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
  }

  /**
   * setzt eine zufällige Bewegungsgeschwindigkeit
   */
  private void setSpeed() {
    speed = random.nextInt(1, 10);
  }

  /**
   * setzt eine zufällige Grösse des Balls
   */
  private void setRadius() {
    radius = random.nextInt(2, 10);
  }

  /**
   * setzt eine zufällige Startposition
   */
  private void setStartPosition() {
    xPosition = random.nextInt(borderLeft + radius, borderRight - radius);
    yPosition = random.nextInt(borderTop + radius, borderBottom - radius);
  }

  /**
   * setzt einen zufälligen Winkel, in welche Richtung sich der Ball bewegen soll
   */
  private void setWinkel() {
    winkel = random.nextInt(361);
  }

  /**
   * berechnet die neue Position, an die sich bewegt werden soll
   */
  private void calculateNewPosition() {
    double winkel = Math.toRadians(this.winkel);
    xPosition = (int) Math.round(xPosition + Math.cos(winkel) * speed);
    yPosition = (int) Math.round(yPosition + Math.sin(winkel) * speed);
  }

  /**
   * berechnet Austrittswinkel
   */
  //0 bedeutet rechts, 90  unten, 180 links, 270 oben
  private void turnAroundIfNeccessary() {
    if (touchesCorner()) {
      //berührt Ecke, wenden um 180 Grad
      doOneEigthy();
    } else if (touchesLeftBorder()) {
      //neuer Winkel zwischen 270 und 360 oder 0 und 90
      doOneEigthy();
      winkel = 360 - winkel;
    } else if (touchesRightBorder()) {
      //neuer Winkel zwischen 90 und 270
      doOneEigthy();
      winkel = 360 - winkel;
    } else if (touchesTopBorder()) {
      //neuer Winkel zwischen 0 und 180
      doOneEigthy();
      winkel = 180 - winkel;
    } else if (touchesBottomBorder()) {
      //neuer Winkel zwischen 180 und 360
      doOneEigthy();
      winkel = 540 - winkel;
    }
  }

  /**
   * wendet Winkel um 180°
   */
  private void doOneEigthy() {
    if (winkel >= 180) {
      winkel -= 180;
    } else {
      winkel += 180;
    }
  }

  /**
   * prüft ob linke Wand berührt wird
   * @return ob linke Wand berührt wird
   */
  private boolean touchesLeftBorder() {
    return xPosition - radius <= borderLeft;
  }

  /**
   * prüft ob rechte Wand berührt wird
   * @return ob rechte Wand berührt wird
   */
  private boolean touchesRightBorder() {
    return xPosition + radius >= borderRight;
  }

  /**
   * prüft ob Boden berührt wird
   * @return ob Boden berührt wird
   */
  private boolean touchesBottomBorder() {
    return yPosition - radius >= borderBottom;
  }

  /**
   * prüft ob Dachlinie berührt wird
   * @return ob Dach berührt wird
   */
  private boolean touchesTopBorder() {
    return yPosition + radius <= borderTop;
  }

  /**
   * prüft, ob der Ball in der Ecke ist
   * @return ob Ball in einer der vier Ecken ist
   */
  private boolean touchesCorner() {
    return (touchesLeftBorder() ^ touchesRightBorder()) &&
            (touchesBottomBorder() ^ touchesTopBorder());
  }
}
