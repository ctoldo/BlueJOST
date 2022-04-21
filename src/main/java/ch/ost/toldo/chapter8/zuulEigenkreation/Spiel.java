package ch.ost.toldo.chapter8.zuulEigenkreation;

import java.util.Stack;

/**
 * Dies ist die Hauptklasse der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches, textbasiertes
 * Adventure-Game. Ein Spieler kann sich in einer Umgebung bewegen,
 * mehr nicht. Das Spiel sollte auf jeden Fall ausgebaut werden,
 * damit es interessanter wird!
 * <p>
 * Zum Spielen muss eine Instanz dieser Klasse erzeugt werden und
 * an ihr die Methode "spielen" aufgerufen werden.
 * <p>
 * Diese Instanz erzeugt und initialisiert alle anderen Objekte
 * der Anwendung: Sie legt alle Räume und einen Parser an und
 * startet das Spiel. Sie wertet auch die Befehle aus, die der
 * Parser liefert, und sorgt für ihre Ausführung.
 *
 * @author Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */

public class Spiel {
  private final Parser parser;
  private Raum aktuellerRaum;
  private final Stack<Raum> vorgaengerRaeume;

  /**
   * Erzeuge ein Spiel und initialisiere die interne Raumkarte.
   */
  public Spiel() {
    raeumeAnlegen();
    parser = new Parser();
    vorgaengerRaeume = new Stack<>();
  }

  /**
   * Erzeuge alle Räume und verbinde ihre Ausgänge miteinander.
   */
  private void raeumeAnlegen() {
    Raum draussen, zara, ochsnersport, coop, gang, parkhaus;

    // die Räume erzeugen
    gang = new Raum("im Gang");
    draussen = new Raum("vor dem Einkaufszentrum");
    zara = new Raum("im Zara");
    ochsnersport = new Raum("im Ochsner Sport");
    coop = new Raum("im Coop");
    parkhaus = new Raum("im Parkhaus");

    //setze Ausgänge
    parkhaus.setzeAusgaenge("east", draussen);
    draussen.setzeAusgaenge("west", parkhaus);

    parkhaus.setzeAusgaenge("top", gang);
    gang.setzeAusgaenge("down", parkhaus);

    gang.setzeAusgaenge("south", draussen);
    draussen.setzeAusgaenge("north", gang);

    gang.setzeAusgaenge("west", zara);
    zara.setzeAusgaenge("east", gang);

    gang.setzeAusgaenge("north", coop);
    coop.setzeAusgaenge("south", gang);

    gang.setzeAusgaenge("east", ochsnersport);
    ochsnersport.setzeAusgaenge("west", gang);

    //setze Gegenstände
    gang.gegenstaendeAblegen(new Gegenstand("Bänkli", "ein Sitzbänkli", 250));
    draussen.gegenstaendeAblegen(new Gegenstand("Fahne", "Schweizer-Fahne", 10));
    zara.gegenstaendeAblegen(new Gegenstand("Unterhose", "Tanga", 1), new Gegenstand("Hose", "blaue Jeans", 2));
    ochsnersport.gegenstaendeAblegen(new Gegenstand("Langhantel", "für den starken Mann", 30));
    coop.gegenstaendeAblegen(new Gegenstand("Pfanne", "teflonbeschichtete Bratpfanne", 2));
    parkhaus.gegenstaendeAblegen(new Gegenstand("Auto", "Audi A4 Avant", 2000));

    aktuellerRaum = draussen;  // das Spiel startet draussen
  }

  /**
   * Die Hauptmethode zum Spielen. Läuft bis zum Ende des Spiels
   * in einer Schleife.
   */
  public void spielen() {
    willkommenstextAusgeben();

    // Die Hauptschleife. Hier lesen wir wiederholt Befehle ein
    // und führen sie aus, bis das Spiel beendet wird.

    boolean beendet = false;
    while (!beendet) {
      Befehl befehl = parser.liefereBefehl();
      beendet = verarbeiteBefehl(befehl);
    }
    System.out.println("Danke für dieses Spiel. Auf Wiedersehen.");
  }

  /**
   * Einen Begrüßungstext für den Spieler ausgeben.
   */
  private void willkommenstextAusgeben() {
    System.out.println();
    System.out.println("Willkommen zu \"Finde Max im Einkaufszentrum\"");
    System.out.println("Tippen Sie 'help', wenn Sie Hilfe brauchen.");
    System.out.println();
    System.out.println(aktuellerRaum.gibLangeBeschreibung());
  }

  /**
   * Verarbeite einen gegebenen Befehl (führe ihn aus).
   *
   * @param befehl der zu verarbeitende Befehl.
   * @return true    wenn der Befehl das Spiel beendet, false sonst
   */
  private boolean verarbeiteBefehl(Befehl befehl) {
    boolean moechteBeenden = false;

    if (befehl.istUnbekannt()) {
      System.out.println("Ich weiss nicht, was Sie meinen ...");
      return false;
    }
    String befehlswort = befehl.gibBefehlswort();
    if (befehlswort.equals("help")) {
      hilfstextAusgeben();
    } else if (befehlswort.equals("go")) {
      wechsleRaum(befehl);
    } else if (befehlswort.equals("quit")) {
      moechteBeenden = beenden(befehl);
    } else if (befehlswort.equals("look")) {
      System.out.println(aktuellerRaum.gibLangeBeschreibung());
    } else if (befehlswort.equals("eat")) {
      essen();
    } else if (befehlswort.equals("back")) {
      geheInVorherigenRaum(befehl);
    }

    return moechteBeenden;
  }

  /**
   * geht in den vorherigen Raum falls möglich
   * @param befehl back Befehl um zu prüfen, ob ein zweites wort eingegeben wurde
   */
  private void geheInVorherigenRaum(Befehl befehl) {
    if (befehl.hatZweitesWort()) {
      System.out.println("Was soll das zweite Wort bedeuten?");
    } else {
      if (!vorgaengerRaeume.empty()) {
        aktuellerRaum = vorgaengerRaeume.pop();
        System.out.println(aktuellerRaum.gibLangeBeschreibung());
      } else {
        System.out.println("Es gibt keinen vorherigen Raum");
      }
    }
  }


  // Implementierung der Benutzerbefehle:

  /**
   * Gib Hilfsinformationen aus.
   * Hier geben wir eine etwas alberne und unklare Beschreibung
   * aus, sowie eine Liste der Befehlswörter.
   */
  private void hilfstextAusgeben() {
    System.out.println("Sie haben sich verlaufen. Sie sind allein.");
    System.out.println("Sie irren auf dem Unigelände herum.");
    System.out.println();
    System.out.println("Ihnen stehen folgende Befehle zur Verfügung:");
    System.out.println(parser.gibBefehle());
  }

  /**
   * Versuche, in eine Richtung zu gehen. Wenn es einen Ausgang gibt,
   * wechsele in den neuen Raum, ansonsten gib eine Fehlermeldung
   * aus.
   */
  private void wechsleRaum(Befehl befehl) {
    if (!befehl.hatZweitesWort()) {
      // Gibt es kein zweites Wort, wissen wir nicht, wohin...
      System.out.println("Wohin möchten Sie gehen?");
      return;
    }

    String richtung = befehl.gibZweitesWort();

    // Wir versuchen, den Raum zu verlassen.
    Raum naechsterRaum = aktuellerRaum.gibAusgang(richtung);

    if (naechsterRaum == null) {
      System.out.println("Dort ist keine Tür!");
    } else {
      vorgaengerRaeume.push(aktuellerRaum);
      aktuellerRaum = naechsterRaum;
      System.out.println(aktuellerRaum.gibLangeBeschreibung());
    }
  }

  /**
   * "quit" wurde eingegeben. Überprüfe den Rest des Befehls,
   * ob das Spiel wirklich beendet werden soll.
   *
   * @return true  wenn der Befehl das Spiel beendet, false sonst
   */
  private boolean beenden(Befehl befehl) {
    if (befehl.hatZweitesWort()) {
      System.out.println("Was soll beendet werden?");
      return false;
    } else {
      return true;  // Das Spiel soll beendet werden.
    }
  }

  /**
   * Der Benutzer stillt seinen Hunger.
   */
  private void essen() {
    System.out.println("Sie haben nun gegessen und sind nicht mehr hungrig");
  }
}
