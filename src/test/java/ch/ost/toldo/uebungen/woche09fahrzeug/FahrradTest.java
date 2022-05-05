/**
 * @author Claudio Toldo
 * @version 05.05.2022 14:29
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.uebungen.woche09fahrzeug;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FahrradTest {

  @Test
  void testToString() {
    Fahrrad weiss = new Fahrrad("weiss");
    Assertions.assertEquals("Farhzeug weiss mit 2 Räder:\n" +
            " Fahrrad", weiss.toString());
  }

}