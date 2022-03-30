/*
 * Author: Claudio Toldo
 * Created: 23.03.2022 09:36
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SolutionsOfChapter6 {

  /**
   * 6.1
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.Kundendienstsystem#starten() ausprobieren
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
   * Testen mit {@link ch.ost.toldo.chapter6.technischerKundendienst1.StarterClass#start()}
   * Leerzeichen werden toleriert
   */

  /**
   * 6.9
   * String eingabe = leser.gibEingabe().trim().toLowerCase();
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.Kundendienstsystem#starten()
   * Testen mit {@link ch.ost.toldo.chapter6.technischerKundendienst1.StarterClass#start()}
   */

  /**
   * 6.10
   * boolean
   */

  /**
   * 6.11
   * if(eingabe.equals("ade")) {}
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.Kundendienstsystem#starten()
   * Testen mit {@link ch.ost.toldo.chapter6.technischerKundendienst1.StarterClass#start()}
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
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.ZufallszahlenTester#wuerfeln()
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.StarterClass#aufgabe6_16()
   */

  /**
   * 6.17
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.ZufallszahlenTester#gibAntwort()
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.StarterClass#aufgabe6_17()
   */

  /**
   * 6.18
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.ZufallszahlenTester#gibAntwort(ArrayList)
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.StarterClass#aufgabe6_18()
   */

  /**
   * 6.19
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.ZufallszahlenTester#zufallszahlAusgeben(int)
   */

  /**
   * 6.20
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.ZufallszahlenTester#zufallszahlAusgeben(int) im Kommentar
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.ZufallszahlenTester#zufallszahlAusgeben(int, int)
   */

  /**
   * 6.21
   * würde auch gehen
   * SecureRandom ist eine Ableitung von Random... Alles was Random kann, kann SecureRandom auch
   * Der Algorythmus darf nicht zu einfach zu verstehen sein. Das heisst es braucht eine gute Verschlüsselung und die kann damit erreicht werden.
   */

  /**
   * 6.22
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.Beantworter
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
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.Beantworter#generiereAntwort(String)
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.Beantworter#antwortMapBefuellen()
   * @see ch.ost.toldo.chapter6.technischerKundendienst1.Beantworter#Beantworter()
   */

  /**
   * 6.34
   * Ein wichtiger Unterschied ist, dass das Set nicht sortiert ist und die Liste schon
   * Ansonsten sind Hash-Suchen schneller als wenn der gesamte Wert verglichen werden muss
   * Beides sind Collections nur mit Value und ohne Key
   */

  /**
   * 6.35
   * Split kann mit Regex (Regular expression, siehe Google)
   * Google hilft auch damit, wie dieser aufgebaut wird...
   * wenn nur ein Zeichen genutzt werden soll stringname.split("*"); (* stellvertretend für das Zeichen, dass für die Trennung genutzt werden soll)
   */

  /**
   * 6.36
   * für Leerzeichen und Tabulatoren
   * objekt.split("[\s]") oder objekt.split(" ")
   *
   * für Doppelpunkt
   * objekt.split(":")
   */

  /**
   * 6.37
   * Daten sind nicht mehr sortiert, dafür alle unique, da Sets keine Duplikate erlauben
   */

  /**
   * 6.38
   * es Werden Leerstrings (also "") im Array mitabgelegt.
   * Könnte zu Problemen führen, je nach Fall
   */

  /**
   * 6.39
   * Damit kann aus einzelnen Elementen direkt eine List (Mutterklasse von ArrayList) erstellt werden
   * Es können als Parameter einzelne Elemente kommagetrennt, oder als Array übergeben werden
   */

  /**
   * 6.40
   * extrem viele
   * unter anderem: stream, binarySearch, compare, copyOf, equals, fill, sort, ...
   */

  /**
   * 6.41
   * @see ch.ost.toldo.chapter6.somestuff.SortierenTest#executeSomeShit()
   */

  /**
   * 6.42
   * @see ch.ost.toldo.chapter6.technischerKundendienst3.Kundendienstsystem#starten()
   * @see ch.ost.toldo.chapter6.technischerKundendienst3.Beantworter#generiereAntwort(HashSet)
   * @see ch.ost.toldo.chapter6.technischerKundendienst3.Eingabeleser#gibEingabe()
   */

  /**
   * 6.43
   * ergänzt um 2 Antworten
   * @see ch.ost.toldo.chapter6.technischerKundendienst3.Beantworter#antwortMapBefuellen()
   */

  /**
   * 6.44
   * ist mir zu blöd
   */

  /**
   * 6.45
   * kein Bock das umzusetzen -> Bei Fragen, Fragen
   * Meine Lösung wäre eine zusätzliche Synonym-Map zu erstellen als Key das Synonym und als Value den Key aus der anderen Antwort-Map
   */

  /**
   * 6.46
   * ist mir zu blöd
   */

  /**
   * 6.47
   * Braucht zusätzliche Einträge in der Map mit keys "wie", "warum", "wer"
   * @see ch.ost.toldo.chapter6.technischerKundendienst3.Beantworter#antwortMapBefuellen()  -> hinzufügen der Einträge hier
   */

  /**
   * 6.48
   * Einfügen, falls der Key nicht schon vorhanden ist
   * Im Gegensatz zum standardmässigen "put" wird hier der Value nicht überschrieben
   */

  /**
   * 6.49
   * @see ch.ost.toldo.chapter6.technischerKundendienstAnalyse.Wortzaehler#zaehlungenAusgeben()
   * @see ch.ost.toldo.chapter6.technischerKundendienstAnalyse.Kundendienstsystem#starten()
   */

  /**
   * 6.50
   * @see ch.ost.toldo.chapter6.technischerKundendienstAnalyse.Beantworter#getMapKeys()
   * @see ch.ost.toldo.chapter6.technischerKundendienstAnalyse.Wortzaehler#unknownWordsZaehlerAusgeben(Set)
   * @see ch.ost.toldo.chapter6.technischerKundendienstAnalyse.Kundendienstsystem#starten()
   */

  /**
   * 6.51
   * selber machen, nützt hier nichts
   */

  /**
   * 6.52
   * Sie werden hervorgehoben
   * Beispiele: @author, @version, @param, @return
   */

  /**
   * 6.53
   * sind eigentlich bereits die wichtigsten
   * @see ist noch gut für Verlinkungen auf andere Methode
   * @deprecated kann auch genutzt werden, wenn eine veraltete Version noch im Code bleiben muss aber nicht mehr für neuen Code genutzt werden soll
   */

  /**
   * 6.54
   * kein bock darauf überall JavaDoc hinzuschreiben
   * ein Beispiel kann man sich am Projekt student nehmen, dort sollte es okay sein
   * vor allem bei public-Methoden sollte das aber sicher gemacht werden
   */

  /**
   * 6.55
   * zeichneQuadrat: setzt Stift auf bestimmten Punkt und zeichnet von da aus eine Linie, macht eine 90° Kurve und macht die nächste Linie (4x)
   * zeichneRad: setzt Stift auf und malt ein Quadrat. Anschliessend wird ein weiters Quadrat mit 10° Schräglage gezeichnet (36x)
   * buntesGekritzel: holt mit Random einen RGB-Farbwert und malt anschliessend wirr Linien, die ebenfalls auf Random basieren
   */

  /**
   * 6.56
   * bewegen: bewegt den Stift in die aktuelle Richtung um die übergebene Distanz, zeichnet, falls Stift abgesetzt
   * bewegenNach: bewegt Stift an die gegeben Koordinaten und zeichent eine Linie
   * drehe: dreht die aktuelle richtung um den Wert im Parameter
   * dreheZu: setz direkt die Richtung, in welche der Stift ausgerichtet ist
   * setzeFarbe: ändert die Stiftfarbe
   * stiftAbheben: zeichnen wird unterbrochen
   * stiftAufsetzen: Stift zeichnet wieder
   * zufaelligesGekritzel: bewegt Stift in zufällige Positionen und zeichnet im Normalfall die Linien
   */

  /**
   * 6.57
   * Kein Bock auf detailliert
   * alles mögliche um Kreise, Rechtecke, etc. zu zeichnen, ausfüllen und zu löschen
   * Ebenso können die Farben dort festgelegt werden
   */

  /**
   * 6.58
   * zeichneRad -> Color.RED
   * zeichneQuadrat -> Color.BLUE
   */

  /**
   * 6.59
   * WHITE, GRAY, BLACK, PINK, ORGANGE, ...
   */

  /**
   * 6.60
   * @see ch.ost.toldo.chapter6.kritzeln.StarterClass#aufgabe6_60()
   */

  /**
   * 6.61
   * canvas.erase();
   */

  /**
   * 6.62
   * @see ch.ost.toldo.chapter6.kritzeln.StarterClass#aufgabe6_62()
   * @see ch.ost.toldo.chapter6.kritzeln.ZeichnenDemo#zeichneDreieck()
   */

  /**
   * 6.63
   * @see ch.ost.toldo.chapter6.kritzeln.ZeichnenDemo#zeichneFuenfeck()
   * @see ch.ost.toldo.chapter6.kritzeln.StarterClass#aufgabe6_63()
   */

  /**
   * 6.64
   * @see ch.ost.toldo.chapter6.kritzeln.ZeichnenDemo#zeichneNEck(int)
   * @see ch.ost.toldo.chapter6.kritzeln.StarterClass#aufgabe6_64()
   */

  /**
   * 6.65
   * @see ch.ost.toldo.chapter6.kritzeln.ZeichnenDemo#zeichneSpirale()
   * @see ch.ost.toldo.chapter6.kritzeln.StarterClass#aufgabe6_65()
   */

  /**
   * 6.66
   * 6 Methoden
   */

  /**
   * 6.67
   * etwas wie
   * @see ch.ost.toldo.chapter6.kritzeln.ZeichnenDemo#drawSomeShit()
   */

  /**
   * 6.68
   * @see ch.ost.toldo.chapter6.baelle.BallDemo#generiereBaelle(int, int)
   * @see ch.ost.toldo.chapter6.baelle.BallDemo#springenLassen(int)
   */

  /**
   * 6.69
   * Ich würde ein HashSet nehmen
   * Iterieren über solche Objekte ist schneller als über eine ArrayList
   * Es wird nie irgendwo eine Sortierung oder ein Index gebraucht
   */

  /**
   * 6.70
   * bereits von Anfang an so implementiert bei 6.68
   */

  /**
   * 6.71 / 6.72
   * würde ich nicht probieren... relativ schwierig
   * @see ch.ost.toldo.chapter6.baelle.KastenBall
   * @see ch.ost.toldo.chapter6.baelle.BallDemo#kastenSpringen(int)
   */

  /**
   * 6.73
   *
   */


}
