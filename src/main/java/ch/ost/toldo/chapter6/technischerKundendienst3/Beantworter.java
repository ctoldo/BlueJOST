package ch.ost.toldo.chapter6.technischerKundendienst3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * Die Klasse Beantworter beschreibt Exemplare, die
 * automatische Antworten generieren.
 *
 * @author Michael Kölling und David J. Barnes
 * @version 0.1 (2016.02.29)
 */
public class Beantworter {

  private Random zufallsgenerator;
  private ArrayList<String> antworten;
  private HashMap<String, String> antwortMap;

  /**
   * Erzeuge einen Beantworter - nichts Besonderes zu tun.
   */
  public Beantworter() {
    zufallsgenerator = new Random();

    //für erste Version
    antworten = new ArrayList<>();
    antwortlisteFuellen();

    //für ab 6.33
    antwortMap = new HashMap<>();
    antwortMapBefuellen();
  }

  /**
   * Erzeuge eine Antwort.
   *
   * @return einen String, der die Antwort enthält
   */
  public String generiereStandardAntwort() {
    return antworten.get(zufallsgenerator.nextInt(antworten.size()));
  }

  /**
   * Generiere eine Liste von Standardantworten, aus denen wir eine
   * auswählen können, wenn wir keine bessere Antwort wissen.
   */
  private void antwortlisteFuellen() {
    antworten.add("Das klingt seltsam. Können Sie das ausführlicher beschreiben?");
    antworten.add("Bisher hat sich noch kein Kunde darüber beschwert.\n" +
            "Welche Systemkonfiguration haben Sie?");
    antworten.add("Da brauche ich etwas ausführlichere Angaben.");
    antworten.add("Haben Sie geprüft, ob Sie einen Konflikt mit einer DLL haben?");
    antworten.add("Das steht im Handbuch. Haben Sie das handbuch gelesen?");
    antworten.add("Das klingt alles etwas Wischi-Waschi. Haben Sie einen Experten\n in der Nähe, der das besser beschreiben kann?");
    antworten.add("Das ist kein Fehler, das ist eine Systemeigenschaft!");
    antworten.add("Könnten Sie es anders erklären");
    antworten.add("Haben Sie versucht, die App auf Ihrem Handy auszuführen?");
    antworten.add("Ich habe gerade StackOverflow überprüft - das ist auch keine Lösung.");
  }

  /**
   * Erzeuge eine Antwort.
   *
   * @return einen String, der die Antwort enthält
   */
  public String generiereAntwort(HashSet<String> keyWoerter) {
    for (String wort : keyWoerter) {
      String antwort = antwortMap.get(wort);
      if (antwort != null) {
        return antwort;
      }
    }
    return generiereStandardAntwort();
  }

  private void antwortMapBefuellen() {
    antwortMap.put("langsam", "Ich vermute, dass das mit Ihrer HArdware zu tun hat. Ein Upgrade\n" +
            "für Ihren Prozessor sollte diese Probleme lösen.\n" +
            "Haben Sie ein Problem mit unserer Software?");
    antwortMap.put("fehler", "Wissen Sie, jede Software hat Fehler. Aber unsere  Entwickler\n" +
            "arbeiten sehr hart daran, diese Fehler zu beheben.\n" +
            "Können Sie das Problem ein wenig genauer beschreiben?");
    antwortMap.put("teuer", "Unsere Preise sind absolute Marktpreise. Haben Sie sich mal umgesehen\n" +
            "und wirklich unser Leistungsspektrum verglichen?");
    antwortMap.put("bug", "Das ist kein Bug, das ist ein Feature!");
    antwortMap.put("problem", "Das Problem ist häufig 30cm vor dem Bildschirm.\n" +
            "Schon einmal daran gedacht?");
  }
}
