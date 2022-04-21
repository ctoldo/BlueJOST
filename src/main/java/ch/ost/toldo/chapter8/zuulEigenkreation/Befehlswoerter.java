package ch.ost.toldo.chapter8.zuulEigenkreation;

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
  // ein konstantes Array mit den g�ltigen Befehlsw�rtern
  private static final String[] gueltigeBefehle = {
          "go", "quit", "help", "look", "eat", "back"
  };

  /**
   * Konstruktor - initialisiere die Befehlsw�rter.
   */
  public Befehlswoerter() {
    // nichts zu tun momentan ...
  }

  /**
   * Pr�fe, ob eine gegebene Zeichenkette ein g�ltiger
   * Befehl ist.
   *
   * @return 'true', wenn die gegebene Zeichenkette ein g�ltiger
   * Befehl ist, 'false' sonst.
   */
  public boolean istBefehl(String eingabe) {
    for (int i = 0; i < gueltigeBefehle.length; i++) {
      if (gueltigeBefehle[i].equals(eingabe))
        return true;
    }
    // Wenn wir hierher gelangen, wurde die Eingabe nicht
    // in den Befehlsw�rter gefunden.
    return false;
  }

  /**
   * Gib alle g�ltigen Befehlsw�rter zur�ck
   * @return Befehlsliste
   */
  public String gibBefehlsliste() {
    StringBuilder builder = new StringBuilder();
    for (String befehl : gueltigeBefehle) {
      builder.append(befehl).append(" ");
    }
    return builder.toString();
  }
}
