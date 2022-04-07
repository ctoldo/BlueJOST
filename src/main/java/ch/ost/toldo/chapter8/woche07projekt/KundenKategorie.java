/*
 * Author: Claudio Toldo
 * Created: 07.04.2022 13:35
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter8.woche07projekt;

public enum KundenKategorie {
  GROSSKUNDE("Grosskunde"),
  KMUKUNDE("KMU-Kunde"),
  PRIVATKUNDE("privater Kunde");

  private String text;

  KundenKategorie(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return text;
  }
}
