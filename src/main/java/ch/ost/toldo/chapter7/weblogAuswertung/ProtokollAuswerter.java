package ch.ost.toldo.chapter7.weblogAuswertung;

/**
 * Eine Klasse, die das Protokoll eines Webservers
 * in Hinsicht auf Zugriffe pro Stunde auswertet.
 *
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29
 */
public class ProtokollAuswerter {
  // Hier werden die Zugriffe für die Stunden berechnet.
  private int[] zugriffeInStunde;
  // Verwendung eines LogdateiLesers.
  private LogdateiLeser leser;

  /**
   * Erzeuge ein Objekt, das die Zugriffe in den
   * Stunden eines Tages zählt.
   */
  public ProtokollAuswerter() {
    // Das Array-Objekt erzeugen, das die Zugriffe
    // in den einzelnen Stunden eines Tages zählt.
    zugriffeInStunde = new int[24];
    // Den Leser für die Logdatei erzeugen.
    leser = new LogdateiLeser();
  }

  /**
   * Erzeuge ein Objekt, das die Zugriffe in den
   * Stunden eines Tages zählt.
   *
   * @param dateiname Pfad der Datei, die ausgewertet werden soll
   */
  public ProtokollAuswerter(String dateiname) {
    // Das Array-Objekt erzeugen, das die Zugriffe
    // in den einzelnen Stunden eines Tages zählt.
    zugriffeInStunde = new int[24];
    // Den Leser für die Logdatei erzeugen.
    leser = new LogdateiLeser(dateiname);
  }

  /**
   * Analysiere die in der Logdatei erfassten Zugriffsdaten.
   */
  public void analysiereStundendaten() {
    while (leser.hasNext()) {
      Logeintrag eintrag = leser.next();
      int stunde = eintrag.gibStunde();
      zugriffeInStunde[stunde]++;
    }
  }

  /**
   * Gib die Anzahl der Zugriffe in den Stunden eines
   * Tages nach Stunden sortiert auf der Konsole aus.
   * Diese Werte sollten zuerst mit einem Aufruf von
   * 'analysiereStundendaten' berechnet werden.
   */
  public void stundendatenAusgeben() {
    System.out.println("Stunde: Zugriffe");

//  7.10
//    int hs = 0;
//    while (hs < zugriffeInStunde.length) {
//      System.out.println(hs + ": " + zugriffeInStunde[hs]);
//      hs++;
//    }


    for (int stunde = 0; stunde < zugriffeInStunde.length; stunde++) {
      System.out.println(stunde + ": " + zugriffeInStunde[stunde]);
    }
  }

  /**
   * Gib die Zeilen der Logdatei auf der Konsole aus.
   */
  public void logdateiAusgeben() {
    leser.datenAusgeben();
  }

  /**
   * berechnet die Gesamtzahl an Logeintragen und gibt diese zurück
   *
   * @return Gesamtzahl an Log-Einträgen
   */
  public int anzahlZugriffe() {
    int gesamt = 0;
    for (int i = 0; i < zugriffeInStunde.length; i++) {
      gesamt += zugriffeInStunde[i];
    }

    //oder mit for-each
    /*
    for (int zugriffe : zugriffeInStunde) {
      gesamt += zugriffe;
    }
    */

    return gesamt;
  }

  /**
   * gibt die Stunde mit den meisten Logeinträgen zurück
   * @return aktivste Stunde
   */
  public int aktivsteStunde() {
    int aktivsteStunde = 0;
    for (int aktuelleStunde = 1; aktuelleStunde < zugriffeInStunde.length; aktuelleStunde++) {
      if (zugriffeInStunde[aktuelleStunde] > zugriffeInStunde[aktivsteStunde]) {
        aktivsteStunde = aktuelleStunde;
      }
    }
    return aktivsteStunde;
  }

  /**
   * gibt die Stunde mit am wenigsten Logeinträgen zurück
   * @return ruhigste Stunde
   */
  public int ruhigsteStunde() {
    int ruhigsteStunde = 0;
    for (int aktuelleStunde = 1; aktuelleStunde < zugriffeInStunde.length; aktuelleStunde++) {
      if (zugriffeInStunde[aktuelleStunde] < zugriffeInStunde[ruhigsteStunde]) {
        ruhigsteStunde = aktuelleStunde;
      }
    }
    return ruhigsteStunde;
  }

  /**
   * gibt die erste Stunde des aktivsten zweistündigen Abschnitts zurück
   * @return erste Stunde von aktivstem Zwei-Stunden-Abschnitt
   */
  public int aktivsteZweiStunden() {
    int ersteStunde = 0;
    int hoechsteSumme = 0;
    for (int i = 0; i < zugriffeInStunde.length - 1; i++) {
      int sum = zugriffeInStunde[i] + zugriffeInStunde[i + 1];
      if (sum > hoechsteSumme) {
        ersteStunde = i;
        hoechsteSumme = sum;
      }
    }
    return ersteStunde;
  }
}
