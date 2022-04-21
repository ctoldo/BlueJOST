/*
 * Author: Claudio Toldo
 * Created: 21.04.2022 10:20
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter7.automatV1;

public class AutomatV1StarterClass {
  public static void main(String[] args) {
//    aufgabe7_24();
    aufgabe7_25();
  }

  private static void aufgabe7_24() {
    AutomatController automatController = new AutomatController();
    automatController.schritt();
    automatController.schritt();
    automatController.schritt();
    automatController.schritt();

    automatController.starten(20);
  }

  private static void aufgabe7_25() {
    AutomatController automatController = new AutomatController();
    automatController.starten(10);

    automatController.zuruecksetzen();

    automatController.starten(10);
  }


}
