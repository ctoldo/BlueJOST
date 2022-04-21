/*
 * Author: Claudio Toldo
 * Created: 21.04.2022 17:08
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter8.zuulEigenkreation2;

import java.util.HashMap;
import java.util.Stack;

public class Spieler {
  private String spielername;
  private Raum aktuellerRaum;
  private Stack<Raum> vorherigeRaeume;
  private HashMap<String, Gegenstand> gegenstaende;
  private int tragkraft;

  public Spieler(String spielername, Raum startRaum, int tragkraft) {
    this.spielername = spielername;
    vorherigeRaeume = new Stack<>();
    gegenstaende = new HashMap<>();
    aktuellerRaum = startRaum;
    this.tragkraft = tragkraft;
  }

  public String gibSpielername() {
    return spielername;
  }

  public Raum gibAktuellerRaum() {
    return aktuellerRaum;
  }

  public void wechsleRaum(Raum naechsterRaum) {
    vorherigeRaeume.push(aktuellerRaum);
    this.aktuellerRaum = naechsterRaum;
  }

  public boolean geheInVorherigenRaum() {
    if (!vorherigeRaeume.isEmpty()) {
      aktuellerRaum = vorherigeRaeume.pop();
      return true;
    }
    //kein vorheriger Raum gefunden
    return false;
  }

  public boolean gegenstandAufnehmen(String name) {
    Gegenstand gegenstand = aktuellerRaum.gegenstandAufnehmen(name);
    if (gegenstand != null && tragkraft >= gegenstand.gibGewicht()) {
      gegenstaende.put(gegenstand.getName(), gegenstand);
      return true;
    }
    return false;
  }

  public boolean gegenstandAblegen(String name) {
    Gegenstand gegenstand = gegenstaende.get(name);
    if (gegenstand != null) {
      aktuellerRaum.gegenstaendeAblegen(gegenstand);
      gegenstaende.remove(name);
      return true;
    }
    return false;
  }

  public String gibGegenstandStatus() {
    StringBuilder builder = new StringBuilder();
    builder.append(spielername).append(" hat folgendes in seinem Besitz:\n");
    gegenstaende.values().forEach(gegenstand -> {
      builder.append(gegenstand.getName());
      builder.append(": ");
      builder.append(gegenstand.gibGewicht());
      builder.append(" kg\n");
    });
    builder.append("Gesamtgewicht: ").append(berechneGesamtgewicht()).append(" kg");
    return builder.toString();
  }

  private int berechneGesamtgewicht() {
    int sum = 0;
    for (Gegenstand gegenstand : gegenstaende.values()) {
      sum += gegenstand.gibGewicht();
    }
    return sum;
  }

  public boolean issMagicMushroom() {
    String mushroomName = "MagicMushroom";
    Gegenstand magicMushroom = gegenstaende.get(mushroomName);
    if (magicMushroom != null) {
      tragkraft += 10;
      gegenstaende.remove(mushroomName);
      return true;
    }
    return false;
  }
}
