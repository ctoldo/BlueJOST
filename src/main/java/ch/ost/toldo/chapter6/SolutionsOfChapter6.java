/*
 * Author: Claudio Toldo
 * Created: 23.03.2022 09:36
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6;

import ch.ost.toldo.chapter6.technischerKundendienst1.Beantworter;
import ch.ost.toldo.chapter6.technischerKundendienst1.StarterClass;
import ch.ost.toldo.chapter6.technischerKundendienst1.ZufallszahlenTester;
import ch.ost.toldo.chapter6.technischerKundendienstKomplett.Kundendienstsystem;

import java.util.ArrayList;

public class SolutionsOfChapter6 {

  /**
   * 6.1
   * {@link Kundendienstsystem#starten()} ausprobieren
   */

  /**
   * 6.2
   * 1. Allgemeine Informationen zur Klasse
   * 2. Zusammenfassung der Konstruktoren
   * 3. Zusammenfassung der public-Methoden
   * 4. Konstruktoren detailiert beschrieben
   * 5. public-Methoden detailiert beschrieben
   */

  /**
   * 6.3
   * Beide Methoden prüfen, ob der String, auf dem diese Methode aufgerufen wird mit dem String im Parameter anfängt
   * Die Variante ohne Offset fängt beim ersten Zeichen an (offset = 0), die Methode mit Offset erst beim Zeichen mit diesem Index
   */

  /**
   * 6.4
   * boolean endsWith(String prefix)
   * Also Rückgabetyp ist ein Boolean, der aussagt ob der Text mit dem Prefix endet
   * Parameter ist ein String, der eben zur Prüfung zur Verfügung stehen soll
   */

  /**
   * 6.5
   * int length()
   * keine Parameter, Rückgabetyp int -> also Anzahl Zeichen
   */

  /**
   * 6.6
   * JavaDoc von Oracle geöffnet und danach gesucht
   */

  /**
   * 6.7
   * public String trim()
   * Methode entfernt Leerzeichen am Ende und am Anfang eines Strings
   * Aus " ASDF " würde "ASDF"
   * Aus "   " würde ""
   * Aus "  ASDF" würde "ASDF"
   */

  /**
   * 6.8
   * String eingabe = leser.gibEingabe().trim();
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.Kundendienstsystem#starten()
   * Testen mit {@link StarterClass#start()}
   * Leerzeichen werden toleriert
   */

  /**
   * 6.9
   * String eingabe = leser.gibEingabe().trim().toLowerCase();
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.Kundendienstsystem#starten()
   * Testen mit {@link StarterClass#start()}
   */

  /**
   * 6.10
   * boolean
   */

  /**
   * 6.11
   * if(eingabe.equals("ade")) {}
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.Kundendienstsystem#starten()
   * Testen mit {@link StarterClass#start()}
   */

  /**
   * 6.12
   * java.util.Random
   * Also java.util
   * Damit kann man zufällig Zahlen generieren lassen
   * Instanzierung mit new Random();
   * Generierung mit variabelnname.nextInt(minimum, maximum) oder variabelnname.nextInt(maximum)
   * auch methode für double vorhanden variabelnname.nextDouble()
   * ebenso auch für boolean und float
   */

  /**
   * 6.13
   * new Random().nextInt();
   */

  /**
   * 6.14
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.ZufallszahlenTester
   */

  /**
   * 6.15
   * random.nextInt(100);
   * Werte 0 <= x < 100
   */

  /**
   * 6.16
   * @see ZufallszahlenTester#wuerfeln()
   * @see StarterClass#aufgabe6_16()
   */

  /**
   * 6.17
   * @see ZufallszahlenTester#gibAntwort()
   * @see StarterClass#aufgabe6_17()
   */

  /**
   * 6.18
   * @see ZufallszahlenTester#gibAntwort(ArrayList)
   * @see StarterClass#aufgabe6_18()
   */

  /**
   * 6.19
   * @see ZufallszahlenTester#zufallszahlAusgeben(int)
   */

  /**
   * 6.20
   * @see ZufallszahlenTester#zufallszahlAusgeben(int) im Kommentar
   * @see ZufallszahlenTester#zufallszahlAusgeben(int, int)
   */

  /**
   * 6.21
   * würde auch gehen
   * SecureRandom ist eine Ableitung von Random... Alles was Random kann, kann SecureRandom auch
   * Der Algorythmus darf nicht zu einfach zu verstehen sein. Das heisst es braucht eine gute Verschlüsselung und die kann damit erreicht werden.
   */

  /**
   * 6.22
   * @see Beantworter
   */

  /**
   * 6.23
   * Hinzufügen und löschen funktionert solange mindestens ein Eintrag vorhanden ist.
   * Maximum muss mindestens 1 sein.
   */

  /**
   * 6.24
   * Eine Map ist eine Kombination aus Key und Value
   * Der Value ist über den Key auffindbar
   * aus diesem Datensatz wird ein Hash gebildet, der für eine schnelle Suche nützlich ist.
   */

  /**
   * 6.25
   * Ungefähr alles was mit put, get remove zutun hat benötigt diese Parameter, damit die Map typsicher ist
   * Der Key muss überall vom gleichen Objekttyp sein und der Value ebenso
   * HashMap<KeyClass, ValueClass> map = new HashMap<>()
   * Es kann für beides der gleiche Objekttyp genutzt werden. Nur die gleiche Instanz macht keinen Sinn
   * Idealerweise ist der Key aber ein int oder eine String und kein grosses Objekt mit viel Inhalt
   */

  /**
   * 6.26
   * hashmapname.size();
   */

  /**
   * 6.27
   * @see ch.ost.toldo.chapter6.maptester.MapTester
   */

  /**
   * 6.28
   * wird überschrieben
   * @see ch.ost.toldo.chapter6.maptester.StarterClass
   */

  /**
   * 6.29
   * neuer Eintrag wird erfasst
   */

  /**
   * 6.30
   * Mit map.containsKey() oder map.containsValue()
   * Oder alternativ:
   * Nullcheck nach get
   * Abbildung ab = abbildungen.get(key);
   * if(ab == null){
   *   ...
   * } else {
   *   ...
   * }
   */

  /**
   * 6.31
   * es wird null retourniert
   */

  /**
   * 6.32
   * for loop um map.keySet()
   * irgendwie so:
   * for (Object key : map.keySet()) {
   *   System.out.println(key.toString);
   * }
   */

  /**
   * 6.33
   * @see Beantworter#generiereAntwort(String)
   * @see Beantworter#antwortMapBefuellen()
   * @see Beantworter#Beantworter()
   */

  /**
   * 6.34
   * Ein wichtiger Unterschied ist, dass das Set nicht sortiert ist und die Liste schon
   * Ansonsten sind Hash-Suchen schneller als wenn der gesamte Wert verglichen werden muss
   * Beides sind Collections nur mit Value und ohne Key
   */



}
