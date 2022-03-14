/*
 * Author: Claudio Toldo
 * Created: 10.03.2022 15:10
 * � 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter3;

import ch.ost.toldo.chapter3.nummernanzeige.Nummernanzeige;
import ch.ost.toldo.chapter3.zeitanzeige.Uhrenanzeige;

public class SolutionsOfChapter3 {

  /**
   * 3.5
   * neues {@link ch.ost.toldo.chapter3.nummernanzeige.Nummernanzeige} Objekt erstellen -> Name: "stunden"
   * Rest in Debugger ausf�hren -> Befehl: stunden.erhoehen();
   */

  /**
   * 3.6
   * neues {@link ch.ost.toldo.chapter3.nummernanzeige.Nummernanzeige} Objekt erstellen -> Name: "minuten"
   * Rest in Deb�gger ausf�hren -> Befehl: minuten.erhoehen();
   *
   * N�tig ist eine Pr�fung ob der Wert < als das Limit ist.
   * Falls es gleich das Limit ist muss der Wert wieder auf 0 gesetzt werden. -> Hierbei muss Stunden erh�ht werden.
   * F�r die Stunden
   */

  /**
   * 3.7
   * neues Objekt erstellen und damit ein wenig interagieren.
   */

  /**
   * 3.8
   * Keine ahnung, aber geht nicht da gibWert() keine statische Methode ist.
   * Objektinstanz wird ben�tigt.
   */

  /**
   * 3.9
   * keine Ahnung aber "int" darf nicht �bergeben werden. Nur der Wert/die Variable selber.
   */

  /**
   * 3.13
   * !false == true
   * (34 != 33) && !false
   */

  /**
   * 3.14
   * a == b
   */

  /**
   * 3.15
   * a ^ b
   */

  /**
   * 3.16
   * !(!a || !b)
   */

  /**
   * 3.21
   * 8%3 = 2
   * 8/3 = 2 Rest 2
   * Resultat von Modulo = Rest -> also 2
   */

  /**
   * 3.26
   * siehe {@link Nummernanzeige#erhoehen()}
   * Variante mit Modulo ist knapper und pr�ziser, ifElse f�r mich aber einfacher lesbar.
   */

  /**
   * 3.27
   * Werte der Uhr wurden nicht gesetzt und sind standardm�ssig mit 0 initialisiert.
   * Daher 00:00
   */

  /**
   * 3.28
   * die Werte der Zeitanzeige �ndern sich
   */

  /**
   * 3.29
   * 60x da jedes mal die Minuten erh�ht werden
   * andere Option ist setzeUhrzeit aufzurufen.
   */

  /**
   * 3.30
   * Rechteck fenster;
   * fenster = new Rechteck(400, 500);
   */

  /**
   * 3.32
   * alles gleich ausser Parameter, die als Initialwerte gesetzt werden.
   * anzeigeAktualisieren wird in setzeWert aufgerufen, daher beim zweiten Konstruktor nicht n�tig.
   */

  /**
   * 3.33
   * d1.drucke("Test.docx", true);
   * d1.drucke("Informationen.pdf", false);
   * int status = d1.gibStatus(500);
   * status = d1.gibStatus(300);
   */

  /**
   * 3.37
   * ersetze Befehle in zeichne Methode
   * ... zeichne(...){
   *   ...
   *   setzeFarbe("schwarz", "gelb");
   *   ...
   * }
   *
   * mache neue Methode
   * private setzeFarbe(String fenster, String sonne){
   *   fenster.farbeAendern(fenster);
   *   sonne.farbeAendern(sonne);
   * }
   */

  /**
   * 3.38
   * �nderungen in {@link Uhrenanzeige#anzeigeAktualisieren()}
   */

  /**
   * 3.39
   * pers�nliche Preferenz. Ich bevorzuge, wenn es im 24h Format gespeichert wird.
   */

  /**
   * 3.51
   * Mit dem MailClient k�nnen Nachrichten erstellt werden und mit dem Server verarbeitet werden
   * Ausserdem k�nnen "empfangene" Nachrichten pro Benutzer abgerufen und/oder ausgegeben werden.
   */

  /**
   * 3.54
   * siehe {@link ch.ost.toldo.chapter3.mailSystem.MailClient} && {@link ch.ost.toldo.chapter3.mailSystem.Nachricht}
   * - neues betreff Feld in Nachricht
   * - �bergabe und initilisierung betreff in Konstruktor
   * - Ausgabe �berarbeiten, dass Betreff auch ausgegeben wird
   * - {@link ch.ost.toldo.chapter3.mailSystem.MailClient#sendeNachricht(String, String, String)} mit neuem betreff Parameter, der im Konstruktor der Nachricht �bergeben wird
   */
}
