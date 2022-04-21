package ch.ost.toldo.chapter8.zuulMitEnumsV1;

import java.util.HashMap;

/**
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes
 * Adventure-Game.
 * <p>
 * Diese Klasse h�lt eine Aufz�hlung aller Befehlsw�rter, die dem
 * Spiel bekannt sind. Mit ihrer Hilfe werden eingetippte Befehle
 * erkannt.
 *
 * @author Michael K�lling und David J. Barnes
 * @version 2016.02.29
 */

class Befehlswoerter {
  // eine Abbildung von Befehlsw�rtern auf Elemente des
  // Aufz�hlungstyps Befehlswort
  private HashMap<String, Befehlswort> gueltigeBefehle;

  /**
   * Konstruktor - initialisiere die Befehlsw�rter.
   */
  public Befehlswoerter() {
    gueltigeBefehle = new HashMap<>();
    gueltigeBefehle.put("gehe", Befehlswort.GO);
    gueltigeBefehle.put("hilfe", Befehlswort.HELP);
    gueltigeBefehle.put("beende", Befehlswort.QUIT);
    gueltigeBefehle.put("schaue", Befehlswort.LOOK);
  }


  /**
   * Finde das Befehlswort, das mit einem Befehls-String verkn�pft ist.
   *
   * @param wort das nachzuschlagende Wort (als String)
   * @return das zugeh�rige Befehlswort zu dem Wort oder UNKNOWN,
   * wenn das Wort kein g�ltiges Befehlswort ist
   */
  public Befehlswort gibBefehlswort(String wort) {
    Befehlswort befehlswort = gueltigeBefehle.get(wort);
    if (befehlswort != null) {
      return befehlswort;
    } else {
      return Befehlswort.UNKNOWN;
    }
  }

  /**
   * Pr�fe, ob eine gegebene Zeichenkette ein g�ltiger
   * Befehl ist.
   *
   * @return true  wenn die gegebene Zeichenkette ein g�ltiger
   * Befehl ist, false sonst
   */
  public boolean istBefehl(String eingabe) {
    return gueltigeBefehle.containsKey(eingabe);
  }

  /**
   * Gib alle g�ltigen Befehlsw�rter auf die Konsole aus.
   */
  public void alleAusgeben() {
    for (String befehl : gueltigeBefehle.keySet()) {
      System.out.print(befehl + "  ");
    }
    System.out.println();
  }
}
