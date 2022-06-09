package ch.ost.toldo.uebungen.probepruefung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.*;

/**
 * @author Claudio Toldo
 * @version 09.06.2022 14:38
 * © 2022 Claudio Toldo
 */
class TextMessageTest {

  private TextMessage textMessage;

  @BeforeEach
  void setUp() {
    textMessage = new TextMessage("Betreff", "wa wotsch?");
  }

  @AfterEach
  void tearDown() {
    textMessage = null;
  }

  @Test
  void testAnzeigen() {
    Assertions.assertTrue(textMessage.anzeigen("productive"));
    Assertions.assertFalse(textMessage.anzeigen(""));
  }

}