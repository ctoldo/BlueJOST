/**
 * @author Claudio Toldo
 * @version 05.05.2022 14:26
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.uebungen.woche09fahrzeug;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AutoTest {

  @Test
  void testToString() {
    Auto autoWeiss = new Auto();
    Assertions.assertEquals("Farhzeug weiss mit 4 Räder:\n" +
            " Auto mit 3 Türen.", autoWeiss.toString());
    Auto autoRot = new Auto("rot");
    Assertions.assertEquals("Farhzeug rot mit 4 Räder:\n" +
            " Auto mit 3 Türen.", autoRot.toString());
  }

}