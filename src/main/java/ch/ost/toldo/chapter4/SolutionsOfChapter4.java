/*
 * Author: Claudio Toldo
 * Created: 16.03.2022 10:41
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter4;

import ch.ost.toldo.chapter4.musiksammlungV1.StarterClass;
import ch.ost.toldo.chapter4.musiksammlungV2.MusikSammlung;
import ch.ost.toldo.chapter4.musiksammlungV5.Track;
import ch.ost.toldo.chapter4.verein.Mitgliedschaft;
import ch.ost.toldo.chapter4.verein.Verein;

public class SolutionsOfChapter4 {

  /**
   * 4.1
   * siehe {@link StarterClass#aufgabe4_1()}
   */

  /**
   * 4.2
   * siehe {@link StarterClass#aufgabe4_2()}
   * Gibt kein Fehler da dieser Falls bereits abgefangen wird in {@link ch.ost.toldo.chapter4.musiksammlungV1.MusikSammlung#entferneDatei(int)} das bereits handeln kann
   */

  /**
   * 4.3
   * siehe {@link StarterClass#aufgabe4_3()}
   * Element mit index 1 rückt nach auf index 0, 0es-Element weg ist.
   */

  /**
   * 4.4
   * private ArrayList<Buch> bibliothek;
   */

  /**
   * 4.5
   * ArrayList<Student> cs101;
   */

  /**
   * 4.6
   * private ArrayList<MusikTrack> tracks;
   */

  /**
   * 4.7
   * bibliothek = new ArrayList<>();
   * bibliothek = new ArrayList<Buch>();
   * cs101 = new ArrayList<>();
   * cs101 = new ArrayList<Student>();
   * tracks = new ArrayList<>();
   * tracks = new ArrayList<Musiktrack>();
   */

  /**
   * 4.8
   * siehe {@link StarterClass#aufgabe4_8()}
   * size liefert 10 wenn 10 Elemente vorhanden sind
   */

  /**
   * 4.9
   * siehe {@link StarterClass#aufgabe4_9()}
   */

  /**
   * 4.10
   * Index 14, da ArrayList bei 0 anfängt zu zählen
   */

  /**
   * 4.11
   * siehe {@link StarterClass#aufgabe4_11()}
   */

  /**
   * 4.12
   * siehe {@link StarterClass#aufgabe4_12()}
   */

  /**
   * 4.13
   * Index 5
   */

  /**
   * 4.14
   * siehe {@link ch.ost.toldo.chapter4.musiksammlungV1.MusikSammlung#indexPruefen(int)}
   * & {@link StarterClass#aufgabe4_14()}
   * Index in leerer Sammlung prüfen funktioniert auch, da die Sammlung nicht null ist und size 0 liefert.
   */

  /**
   * 4.15
   * siehe {@link ch.ost.toldo.chapter4.musiksammlungV1.MusikSammlung}
   */

  /**
   * 4.16
   * siehe {@link ch.ost.toldo.chapter4.musiksammlungV1.MusikSammlung#dateiAusgeben(int)}
   * & {@link ch.ost.toldo.chapter4.musiksammlungV1.MusikSammlung#entferneDatei(int)}
   */

  /** 4.17
   *  siehe {@link ch.ost.toldo.chapter4.musiksammlungV2.StarterClass#aufgabe4_17()}
   *  Titel, die nicht existieren führen dazu, dass das Programm crasht mit einer NullPointerException
   */

  /**
   * 4.18
   * public void alleDateienAusgeben(){}
   * Keine Parameter notwendig, da diese bereits in der ArrayList sind
   * Rückgabetyp ist auch keiner nötig, da die Daten direkt ausgegeben werden.
   */

  /**
   * 4.19
   * Ja, könnte man so schreiben
   * Soviele wie in der Liste sind -> Für unseren Fall mit den 4 MP3-Dateien also vier Aufrufe
   */

  /**
   * 4.20
   * siehe {@link MusikSammlung#alleDateienAusgeben()}
   */

  /**
   * 4.21
   * siehe {@link ch.ost.toldo.chapter4.musiksammlungV2.StarterClass#aufgabe4_21()}
   */

  /**
   * 4.24
   * siehe {@link MusikSammlung#alleDateienAusgeben()} alternativ...
   */

  /**
   * 4.25
   * siehe {@link ch.ost.toldo.chapter4.musiksammlungV3.StarterClass#aufgabe4_25()}
   * Ohne Treffer wird nichts ausgegeben (ausser 4.26 bereits gemacht)
   */

  /**
   * 4.26
   * siehe {@link ch.ost.toldo.chapter4.musiksammlungV3.MusikSammlung#bestimmteDateienAusgeben(String)}
   */

  /**
   * 4.27
   * siehe {@link ch.ost.toldo.chapter4.musiksammlungV3.MusikSammlung#interpretenDateienAnspielen(String)}
   * & {@link ch.ost.toldo.chapter4.musiksammlungV3.StarterClass#aufgabe4_27()}
   */

  /**
   * 4.28
   * for (Track track : tracks){}
   */

  /**
   * 4.29
   * boolean gefunden = false;
   * while (nicht (gefunden)) {
   *   if (die Schlüssel sind am nächsten Ort) {
   *     gefunden = true;
   *   }
   * }
   */

  /**
   * 4.30
   * public void vielfacheVonFuenf(){
   *   int currentValue = 10;
   *   int endValue = 95;
   *   while (currentValue <= endValue) {
   *     if (currentValue % 5 == 0) {
   *       System.out.println(currentValue);
   *     }
   *     currentValue++;
   *   }
   * }
   */

  /**
   * 4.31
   * int addition = 0;
   * int currentNumber = 1;
   * while (currentNumber <= 10) {
   *   addition += currentNumber;
   *   currentNumber++;
   * }
   */

  /**
   * 4.32
   * public int summieren(int a, int b) {
   *   int sum = 0;
   *   int counter = a;
   *   while (counter <= b) {
   *     sum += counter;
   *     counter++;
   *   }
   * }
   */

  /**
   * 4.33
   * public boolean istPrim(int n){
   *   int value = 2;
   *   while (value < n){
   *     if (n % value == 0) {
   *       return false;
   *     }
   *     value++;
   *   }
   *   return true;
   * }
   */

  /**
   * 4.34
   * public int findeErste(String suchbegriff){
   *   int index = 0;
   *   boolean amSuchen = true;
   *   int listSize = dateien.size();
   *
   *   while (amSuchen && index < listSize) {
   *     String dateiname = dateien.get(index);
   *     if (dateiname.contains(suchbegriff)) {
   *       amSuchen = false;
   *     } else {
   *       index++;
   *     }
   *   }
   *
   *   if (amSuchen) {
   *     return -1
   *   } else {
   *     return index;
   *   }
   * }
   */

  /**
   * 4.35
   * siehe {@link ch.ost.toldo.chapter4.musiksammlungV5.Track#abspielFrequenz}
   * & {@link Track#gibAbspielFrequenz()}
   * & {@link Track#erhoeheAbspielFrequenz()}
   * & {@link Track#setzeDetails(String, String, String)}
   */

  /**
   * 4.36
   * siehe {@link ch.ost.toldo.chapter4.musiksammlungV5.MusikSammlung#spieleTrack(int)}
   * & {@link ch.ost.toldo.chapter4.musiksammlungV5.MusikSammlung#spieleErsten()}
   */

  /**
   * 4.37
   * siehe {@link ch.ost.toldo.chapter4.musiksammlungV5.StarterClass#aufgabe4_37()}
   * & {@link Track#album}, {@link Track#gibAlbum()}, {@link Track#setzeAlbum(String)}, {@link Track#gibDetails()}
   */

  /**
   * 4.38
   * {@link ch.ost.toldo.chapter4.musiksammlungV5.StarterClass#aufgabe4_38()}
   * & {@link ch.ost.toldo.chapter4.musiksammlungV5.MusikPlayer#playerVorbereiten(String)}
   */

  /**
   * 4.39
   * {@link ch.ost.toldo.chapter4.musiksammlungV5.MusikSammlung#tracksEntfernen(String)}
   */

  /**
   * 4.40
   * siehe {@link ch.ost.toldo.chapter4.verein.Verein}
   */

  /**
   * 4.41
   * siehe {@link Verein#anzahlMitglieder()}
   */

  /**
   * 4.42
   * siehe {@link Verein#beitreten(Mitgliedschaft)}
   * & {@link ch.ost.toldo.chapter4.verein.StarterClass#aufgabe4_42()}
   */

  /**
   * 4.43
   * siehe {@link ch.ost.toldo.chapter4.musiksammlungV5.MusikSammlung#spieleZufaelligerTrack()}
   * & {@link ch.ost.toldo.chapter4.musiksammlungV5.StarterClass#aufgabe4_43()}
   */

  /**
   * 4.44
   * Wenn alle Songs gleich häufig gespielt werden sollen, dann müssen jeweils alle Songs mit der tiefsten Anzahl Frequenzen gefiltert werden und aus diesen random eins augewählt werden.
   * Damit wäre aber kein echtes Zufallsprinzip mehr... was ich schade finde
   * Lieblingstracks vorziehen wäre zwar auch möglich mit dieser Info aber dann ist es wirklich nicht mehr richtig Random.
   */

  /**
   * 4.45
   *
   */

}
