/*
 * Author: Claudio Toldo
 * Created: 26.03.2022 16:50
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.kritzeln;

import java.awt.*;

public class StarterClass {
  public static void main(String[] args) {
//    aufgabe6_60();
//    aufgabe6_62();
//    aufgabe6_63();
//    aufgabe6_64();
//    aufgabe6_65();
    aufgabe6_67();
  }

  private static void aufgabe6_60() {
    int width = 400;
    int height = 250;
    Canvas canvas = new Canvas("Aufgabe 6.60", width, height);
    canvas.setVisible(true);

    canvas.setForegroundColor(Color.RED);
    int diameter = 100;
    canvas.fillCircle((width - diameter) / 2, (height - diameter) / 2, diameter);

    canvas.setForegroundColor(Color.YELLOW);
    int rectangleWidth = 100;
    int rectangleHeigth = 50;
    canvas.fillRectangle((width - rectangleWidth) / 2, (height - rectangleHeigth) / 2, rectangleWidth, rectangleHeigth);
  }

  public static void aufgabe6_62() {
    new ZeichnenDemo().zeichneDreieck();
  }

  public static void aufgabe6_63() {
    new ZeichnenDemo().zeichneFuenfeck();
  }

  public static void aufgabe6_64() {
    ZeichnenDemo zeichnenDemo = new ZeichnenDemo();

    zeichnenDemo.zeichneNEck(3);
    zeichnenDemo.zeichneNEck(4);
    zeichnenDemo.zeichneNEck(5);
    zeichnenDemo.zeichneNEck(6);
    zeichnenDemo.zeichneNEck(8);
    zeichnenDemo.zeichneNEck(10);
  }

  private static void aufgabe6_65() {
    ZeichnenDemo zeichnenDemo = new ZeichnenDemo();
    zeichnenDemo.zeichneSpirale();
  }


  private static void aufgabe6_67() {
    ZeichnenDemo zeichnenDemo = new ZeichnenDemo();
    zeichnenDemo.drawSomeShit();
  }
}
