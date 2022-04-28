/**
 * @author Claudio Toldo
 * @version 28.04.2022 14:29
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.uebungen.woche08ziegelsteine;


import org.junit.jupiter.api.*;

class PaletteTest {

  @BeforeAll
  static void beforeAll() {

  }

  @BeforeEach
  void beforeEach() {

  }

  @AfterEach
  void afterEach() {

  }

  @AfterAll
  static void afterAll() {

  }

  @Test
  void testGibGewicht() {
    Palette palette = new Palette(10, 10);
    Assertions.assertEquals(384.0, palette.gibGewicht(), 0.01);
    Assertions.assertEquals(384.0, palette.gibGewicht(8, 20, 12), 0.01);
    Assertions.assertEquals(200.0, palette.gibGewicht(10, 20, 5), 0.01);

    palette = new Palette(9, 7);
    Assertions.assertEquals(241.92, palette.gibGewicht(), 0.01);
    Assertions.assertEquals(184.33, palette.gibGewicht(11, 19, 7), 0.01);
  }

}