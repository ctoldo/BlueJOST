/*
 * Author: Claudio Toldo
 * Created: 04.04.2022 16:53
 * � 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter7;

public class SolutionsOfChapter7 {

  /**
   * 7.1
   * @see ch.ost.toldo.chapter7.weblogAuswertung.StarterClass#aufgabe7_1()
   * Stunde 12 mit 9 Eintr�gen
   *
   * 7.2
   * Person[] leute;
   *
   * 7.3
   * boolean[] verfuegbar;
   *
   * 7.4
   * z13 -> Deklariation
   * z25 -> Initialisierung
   * z38 -> Anzahl erh�hen in f�r gegebene Stunde
   * z51 -> L�nge f�r for-Loop holen
   * z52 -> Wert f�r Stunde auslesen und ausgeben
   *
   * 7.5
   * "[]int zaehler;" ist falsch, korrekt w�re "int[] zaehler;"
   * "boolean[5000] belegt;" ist falsch, korrekt w�re "boolean[] belegt;". die 5000 k�nnen dann bei "new boolean[5000]" mitgegeben werden.
   *
   * 7.6
   * temparaturen = new doouble[60];
   * urls = new String[90];
   * automaten = new Ticketautomat[5];
   *
   * 7.7
   * Keine. Es wird nur der Platz daf�r reserviert.
   *
   * 7.8
   * double[] preise = new double[50]; -> also mit eckigen klammern um 50
   *
   * 7.9
   * IndexOutOfBoundsException
   *
   * 7.10
   * @see ch.ost.toldo.chapter7.weblogAuswertung.ProtokollAuswerter#stundendatenAusgeben()
   * im Kommentar
   *
   * 7.11
   * public void hoehereAusgeben(double[] noten, double mittelwert) {
   *   for (int index = 0; index < noten.length; index++) {
   *     if (noten[index] > mittelwert) {
   *       System.out.println(noten[index]);
   *     }
   *   }
   * }
   *
   * 7.12
   * @see ch.ost.toldo.chapter7.weblogAuswertung.StarterClass#aufgabe7_12()
   * bei mir hat das keine Eintr�ge erstellt. Der Fehler lag am FileWriter in {@link ch.ost.toldo.chapter7.weblogAuswertung.LogdateiErzeuger#erzeugeEintrag()}
   * anstatt den FileWriter erst im try-Block zu initialisieren sollte dieser in den Klammern direkt nach dem try initialisiert werden. Damit sollte es funktionieren.
   * (Begr�ndung: Der FileWriter muss wieder geschlossen werden, wenn er nicht mehr gebracht wird. Damit wird das sauber gemacht, auch wenn ein Fehler auftritt.)
   *
   * 7.13
   * @see ch.ost.toldo.chapter7.weblogAuswertung.ProtokollAuswerter#anzahlZugriffe()
   *
   * 7.14
   * Teste Methode aus 7.13
   * @see ch.ost.toldo.chapter7.weblogAuswertung.StarterClass#aufgabe7_14()
   *
   * 7.15
   * @see ch.ost.toldo.chapter7.weblogAuswertung.ProtokollAuswerter#aktivsteStunde()
   *
   * 7.16
   * @see ch.ost.toldo.chapter7.weblogAuswertung.ProtokollAuswerter#ruhigsteStunde()
   *
   * 7.17
   * die erste die gefunden wird mit diesem Wert...
   *
   * 7.18
   * @see ch.ost.toldo.chapter7.weblogAuswertung.ProtokollAuswerter#aktivsteZweiStunden()
   *
   * 7.19 & 7.20
   * nicht gel�st
   *
   * 7.21
   * selber lesen
   *
   * 7.22
   * Mit einem Array k�nnten effektiv nur die maximale Anzahl Studenten hinzugef�gt werden.
   * Es spielt aber von dieser Seite her keine Rolle, da sowieso gepr�ft werden muss, ob noch Platz ist, da es sonst eine Exception g�be.
   * F�r die ArrayList spricht, dass nur soviel Platz reserviert wird, wie auch n�tig ist, w�hrend das Array f�r alle m�glichen Studenten einen Platz reserviert -> es emphiehlt sich ArrayList
   * Ausserdem ist das Handling in einer ArrayList einfacher, da irrelevant ist, in welcher Reihenfolge die Studenten abgelegt werden. Der Index muss f�r den Add/Remove nicht zwingend bekannt sein.
   *
   * 7.23
   * @see ch.ost.toldo.chapter4.musiksammlungV3.MusikSammlung#alleDateienAusgeben()
   *
   * 7.24
   * @see ch.ost.toldo.chapter7.automatV1.AutomatV1StarterClass#aufgabe7_24()
   *
   * 7.25
   * @see ch.ost.toldo.chapter7.automatV1.AutomatV1StarterClass#aufgabe7_25()
   * Es wird neu gezeichnet. Das Muster wird aber wieder das genau gleiche
   *
   * 7.26
   * 2 fill Methoden
   * 1. eine mit int[] und val -> schreibt in jedes Feld diesen Wert
   * 2. eine mit int[], fromIndex, toIndex, val -> schreibt in jedes Feld in dieser Range den val
   * die erste Variante wird beim zur�cksetzen genutzt, um die Felder wieder auf 0 zu setzen.
   *
   * 7.27
   * wenn die n�chsten Zeilen exakt den vorherigen Werten entsprechen gibt es das gleiche Muster.
   * Ansonsten wird das erste mal ein anderes Muster gezeichnet und nach dem zur�cksetzen wieder das Alte.
   *
   * 7.28
   * @see ch.ost.toldo.chapter7.automatV1.Automat#aktualisieren()
   *
   * 7.29
   * die �nderung des bestehenden Arrays h�tte eine Ver�nderung des Musters zur Folge
   *
   * 7.30
   * zu faul eine andere L�sung zu finden, aber einfacher wird sie wohl kaum.
   *
   * 7.31
   * @see ch.ost.toldo.chapter7.automatV1.Automat#aktualisierenV2()
   *
   * 7.32
   * @see ch.ost.toldo.chapter7.automatV1.Automat#berechneNaechstenZustand(int links, int zentrum, int rechts)
   *
   * 7.33
   * keine Lust darauf
   *
   * 7.34
   * @see ch.ost.toldo.chapter7.automatV1.Automat#aktualisierenV2()
   *
   * ab 7.35
   * nicht mehr gemacht, da auch nicht wirklich relevant
   */
}
