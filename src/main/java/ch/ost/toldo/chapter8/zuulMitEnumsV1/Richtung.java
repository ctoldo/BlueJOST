package ch.ost.toldo.chapter8.zuulMitEnumsV1;

/**
 * @author Claudio Toldo
 * @version 21.04.2022 18:35
 * © 2022 Claudio Toldo
 */
public enum Richtung {

  NORTH ("nord"),
  EAST("osten"),
  SOUTH("sued"),
  WEST("west");

  private final String deutscherBefehl;

  Richtung(String deutscherBefehl) {
    this.deutscherBefehl = deutscherBefehl;
  }

  public String getDeutscherBefehl() {
    return deutscherBefehl;
  }
}
