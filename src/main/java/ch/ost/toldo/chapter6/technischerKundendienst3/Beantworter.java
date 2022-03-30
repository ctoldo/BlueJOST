package ch.ost.toldo.chapter6.technischerKundendienst3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * Die Klasse Beantworter beschreibt Exemplare, die
 * automatische Antworten generieren.
 *
 * @author Michael K�lling und David J. Barnes
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

    //f�r erste Version
    antworten = new ArrayList<>();
    antwortlisteFuellen();

    //f�r ab 6.33
    antwortMap = new HashMap<>();
    antwortMapBefuellen();
  }

  /**
   * Erzeuge eine Antwort.
   *
   * @return einen String, der die Antwort enth�lt
   */
  public String generiereStandardAntwort() {
    return antworten.get(zufallsgenerator.nextInt(antworten.size()));
  }

  /**
   * Generiere eine Liste von Standardantworten, aus denen wir eine
   * ausw�hlen k�nnen, wenn wir keine bessere Antwort wissen.
   */
  private void antwortlisteFuellen() {
    antworten.add("Das klingt seltsam. K�nnen Sie das ausf�hrlicher beschreiben?");
    antworten.add("Bisher hat sich noch kein Kunde dar�ber beschwert.\n" +
            "Welche Systemkonfiguration haben Sie?");
    antworten.add("Da brauche ich etwas ausf�hrlichere Angaben.");
    antworten.add("Haben Sie gepr�ft, ob Sie einen Konflikt mit einer DLL haben?");
    antworten.add("Das steht im Handbuch. Haben Sie das handbuch gelesen?");
    antworten.add("Das klingt alles etwas Wischi-Waschi. Haben Sie einen Experten\n in der N�he, der das besser beschreiben kann?");
    antworten.add("Das ist kein Fehler, das ist eine Systemeigenschaft!");
    antworten.add("K�nnten Sie es anders erkl�ren");
    antworten.add("Haben Sie versucht, die App auf Ihrem Handy auszuf�hren?");
    antworten.add("Ich habe gerade StackOverflow �berpr�ft - das ist auch keine L�sung.");
  }

  /**
   * Erzeuge eine Antwort.
   *
   * @return einen String, der die Antwort enth�lt
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
            "f�r Ihren Prozessor sollte diese Probleme l�sen.\n" +
            "Haben Sie ein Problem mit unserer Software?");
    antwortMap.put("fehler", "Wissen Sie, jede Software hat Fehler. Aber unsere  Entwickler\n" +
            "arbeiten sehr hart daran, diese Fehler zu beheben.\n" +
            "K�nnen Sie das Problem ein wenig genauer beschreiben?");
    antwortMap.put("teuer", "Unsere Preise sind absolute Marktpreise. Haben Sie sich mal umgesehen\n" +
            "und wirklich unser Leistungsspektrum verglichen?");
    antwortMap.put("bug", "Das ist kein Bug, das ist ein Feature!");
    antwortMap.put("problem", "Das Problem ist h�ufig 30cm vor dem Bildschirm.\n" +
            "Schon einmal daran gedacht?");
  }
}
