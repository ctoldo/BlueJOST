package ch.ost.toldo.uebungen.woche09fahrzeug;

import java.util.ArrayList;

/**
 * @author Claudio Toldo
 * @version 05.05.2022 13:48
 * © 2022 Claudio Toldo
 */
public class Auftrag {

  private final ArrayList<Fahrzeug> fahrzeugListe;

  public Auftrag() {
    fahrzeugListe = new ArrayList<>();
  }

  public void testObjekteErstellen() {
    fahrzeugListe.add(new Auto("rot"));
    fahrzeugListe.add(new Auto("blau"));
    fahrzeugListe.add(new Auto());

    fahrzeugListe.add(new Fahrrad("grün"));
    fahrzeugListe.add(new Fahrrad("pink"));
  }

  public void ausgebenListe() {
    for (Fahrzeug fahrzeug : fahrzeugListe) {
      System.out.println(fahrzeug.toString());
    }
  }


}
