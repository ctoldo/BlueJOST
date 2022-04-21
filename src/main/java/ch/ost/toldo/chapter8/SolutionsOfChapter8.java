/*
 * Author: Claudio Toldo
 * Created: 21.04.2022 11:24
 * � 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter8;


public class SolutionsOfChapter8 {
  /**
   * 8.1
   * - Spiel, bei dem man sich in den R�umen bewegen kann
   * - help, go, quit
   * - help gibt Infos aus, go wechselt raum, quit beendet spiel
   * - 5 R�ume
   * - Nein ich zeichne nicht
   *
   * 8.2
   * -Befehl -> Befehlsobjekt, dass die Anweisungen enth�lt falls diese vertanden wurden
   * -Befehlswoerter -> Enth�lt die g�ltigen Befehle und die Pr�fung, ob die Eingabe ein g�ltiger Befehl war
   * -Parser -> liest die Eingabe und liefert einen neuen Befehl
   * -Raum -> Objekt, dass die Infors enth�lt wo die Ausg�nge in andere R�ume sind
   * -Spiel -> Initialisiert das ganze... Hauptklasse, die alles zusammenf�hrt
   *
   * 8.3
   * hat nichts mit Programmierung zu tun
   *
   * 8.4
   * meine l�sung {@link ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#raeumeAnlegen()}
   *
   * 8.5
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#rauminfoAusgeben()
   *
   * 8.6
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Raum#gibAusgang(String)
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#wechsleRaum(Befehl)
   *
   * 8.7
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Raum#gibAusgaengeAlsString()
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#rauminfoAusgeben()
   *
   * 8.8
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#raeumeAnlegen()
   *
   * 8.9
   * gibt alle Keys, die in der Map abgelegt sind als Set zur�ck
   *
   * 8.10
   * 1. Holt alle Ausg�nge, die gespeichert sind
   * 2. f�gt diese in der for-each-Schleife dem ergebnis-String an
   * 3. gibt diesen String mit allen Ausg�ngen zur�ck
   *
   * 8.11
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Raum#gibLangeBeschreibung()
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#rauminfoAusgeben()
   *
   * 8.12
   * 1x Spiel -> darin:
   *  1x Parser -> darin:
   *    1x Befehlswoerter -> darin:
   *      1x String-Array mit 3 Eintr�gen
   *    1x Scanner
   *  6x Raum -> darin:
   *    1x String
   *    1x HashMap leer
   *
   * 8.13
   * es gibt ein paar Objekte mehr
   *  + zus�tzlicher Scanner kurzfristig
   *  + zus�tzlicher String der in Befehl �bergeht
   *  + neuer Befehl
   *
   * 8.14
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Befehlswoerter#gueltigeBefehle
   * sicher nicht eine Methode umsehen machen... gibt ja bereits {@link ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#rauminfoAusgeben()}
   * ansonsten
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#verarbeiteBefehl(Befehl)
   *
   * 8.15
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Befehlswoerter#gueltigeBefehle
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#verarbeiteBefehl(Befehl)
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#essen()
   *
   * 8.16
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Befehlswoerter#gibBefehlsliste()
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Parser#gibBefehle()
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#hilfstextAusgeben()
   *
   * 8.17
   * Ja, Spiel m�sste immernoch angepasst werden
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#verarbeiteBefehl(Befehl)
   *
   * 8.18
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Befehlswoerter#gibBefehlsliste()
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Parser#gibBefehle()
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#hilfstextAusgeben()
   *
   * 8.19
   * Model -> Datenhaltung
   * View -> GUI/Konsole
   * Controller -> Handling des ganzen
   * Diese 3 Sachen sollten mehr oder wenig komplett unabh�ngig funktionieren und Austauschbar sein. Lediglich eine einheitliche Schnittstelle muss vorhanden sein
   *
   * 8.20
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#raeumeAnlegen()
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Gegenstand
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Raum#gibLangeBeschreibung()
   *
   * 8.21
   * Die Zeichenkette sollte in Spiel erzeugt werden. Dort wird auch der Gegenstand dem Raum hinzugef�gt.
   * Die Ausgabe erfolgt auch in Spiel, jedoch kommt der Text von Gegenstand, �ber Raum, in die Klasse Spiel damit, damit nicht alle Klassen mit dem UI arbeiten m�ssen
   *
   * 8.22
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Raum#gegenstaende
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Raum#gegenstaendeAblegen(Gegenstand...)
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Raum#gibLangeBeschreibung()
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#raeumeAnlegen()
   *
   * 8.23
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#verarbeiteBefehl(Befehl)
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#geheInVorherigenRaum(Befehl)
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#vorherigerRaum
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#wechsleRaum(Befehl)
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Befehlswoerter#gueltigeBefehle
   *
   * 8.24
   * wird dank des Checks in #geheInVorherigenRaum korrekt gehandelt
   *
   * 8.25
   * es springt wieder in den vorherigen Raum. Meiner Meinung nach macht das Sinn, ausser man m�chte weiter z�r�ck bis max zum Start des Spiels
   *
   * 8.26
   * Stack implementiert in Spiel
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#vorgaengerRaeume
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#wechsleRaum(Befehl)
   * @see ch.ost.toldo.chapter8.zuulEigenkreation.Spiel#geheInVorherigenRaum(Befehl)
   *
   * 8.27
   * Testen, dass alle Kommandos richtig funktionieren
   * Testen, dass die Ausgaben wie erwartet sind
   * Testen, dass alles korrekt verkn�pft wurde
   *
   * 8.28
   * diverse Anpassungen in {@link ch.ost.toldo.chapter8.zuulEigenkreation2.Spiel}
   * @see ch.ost.toldo.chapter8.zuulEigenkreation2.Spieler
   *
   * 8.29 / 8.30
   * @see ch.ost.toldo.chapter8.zuulEigenkreation2.Befehlswoerter#gueltigeBefehle
   * @see ch.ost.toldo.chapter8.zuulEigenkreation2.Spiel#verarbeiteBefehl(Befehl)
   * @see ch.ost.toldo.chapter8.zuulEigenkreation2.Spieler#gegenstandAufnehmen(String)
   * @see ch.ost.toldo.chapter8.zuulEigenkreation2.Spieler#gegenstandAblegen(String)
   * @see ch.ost.toldo.chapter8.zuulEigenkreation2.Spieler#gegenstaende
   *
   * 8.31
   * neues Attribut bei Spieler -> tragkraft
   * @see ch.ost.toldo.chapter8.zuulEigenkreation2.Spieler#gegenstandAufnehmen(String)
   *
   * 8.32
   * @see ch.ost.toldo.chapter8.zuulEigenkreation2.Spieler#gibGegenstandStatus()
   * @see ch.ost.toldo.chapter8.zuulEigenkreation2.Spiel#verarbeiteBefehl(Befehl)
   *
   * 8.33
   * @see ch.ost.toldo.chapter8.zuulEigenkreation2.Spiel#essen(String) angepasst
   * Anstatt Muffin werden Pilzli konsumiert
   * @see ch.ost.toldo.chapter8.zuulEigenkreation2.Spieler#issMagicMushroom()
   *
   * 8.34
   * selber machen
   *
   * 8.35
   * @see ch.ost.toldo.chapter8.zuulMitEnumsV1.Befehlswort
   * @see ch.ost.toldo.chapter8.zuulMitEnumsV1.Befehlswoerter#Befehlswoerter()
   * @see ch.ost.toldo.chapter8.zuulMitEnumsV1.Spiel#verarbeiteBefehl(Befehl)
   *
   * 6.36
   * funktioniert jetzt mit den neuen Befehlen
   *
   * 6.37
   * Im Willkommenstext steht immernoch help
   *
   * 6.38
   * @see ch.ost.toldo.chapter8.zuulMitEnumsV1.Richtung
   *
   * 6.39
   * nur �nderung in {@link ch.ost.toldo.chapter8.zuulMitEnumsV2.Befehlswort} reicht nicht
   * �nderung muss auch in Switch in {@link ch.ost.toldo.chapter8.zuulMitEnumsV2.Spiel#verarbeiteBefehl(Befehl)} gemacht werden
   *
   * 6.40
   * Ja, �ndert in diesem Projekt automatisch
   *
   * ab 6.41
   * nicht mehr gel�st, da sehr zeitintensiv
   */
}
