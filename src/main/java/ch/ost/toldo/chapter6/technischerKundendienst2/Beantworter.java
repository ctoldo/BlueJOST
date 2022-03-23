package ch.ost.toldo.chapter6.technischerKundendienst2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Die Klasse Beantworter beschreibt Exemplare, die 
 * automatische Antworten generieren. Dies ist die zweite Version 
 * dieser Klasse. In dieser Version generieren wir Antworten, 
 * indem wir zufällig eine Antwortphrase aus einer Liste auswählen.
 * 
 * @author     Michael Kölling und David J. Barnes
 * @version    0.2 (2016.02.29)
 */
public class Beantworter
{
    private Random zufallsgenerator;
    private ArrayList<String> antworten;

    /**
     * Erzeuge einen Beantworter
     */
    public Beantworter()
    {
        zufallsgenerator = new Random();
        antworten = new ArrayList<>();
        antwortlisteFuellen();
    }

    /**
     * Generiere eine Antwort.
     * 
     * @return  einen String, der die Antwort enthält
     */
    public String generiereAntwort()
    {
        // Erzeuge eine Zufallszahl, die als Index in der Liste der
        // Antworten benutzt werden kann. Die Zahl wird im Bereich von
        // null (inklusiv) bis zur Größe der Liste (exklusiv) liegen.
        int index = zufallsgenerator.nextInt(antworten.size());
        return antworten.get(index);
    }

    /**
     * Generiere eine Liste von Standardantworten, aus denen wir eine
     * auswählen können, wenn wir keine bessere Antwort wissen.
     */
    private void antwortlisteFuellen()
    {
        antworten.add("Das klingt seltsam. Können Sie das ausführlicher beschreiben?");
        antworten.add("Bisher hat sich noch kein Kunde darüber beschwert. \n" +
                      "Welche Systemkonfiguration haben Sie?");
        antworten.add("Da brauche ich etwas ausführlichere Angaben.");
        antworten.add("Haben Sie geprüft, ob Sie einen Konflikt mit einer DLL haben?");
        antworten.add("Das steht im Handbuch. Haben Sie das Handbuch gelesen?");
        antworten.add("Das klingt alles etwas Wischi-Waschi. Haben Sie einen Experten\n" +
                      "in der Nähe, der das besser beschreiben kann?");                     
        antworten.add("Das ist kein Fehler, das ist eine Systemeigenschaft!");
        antworten.add("Könnten Sie es anders erklären?");
        antworten.add("Haben Sie versucht, die App auf Ihrem Handy auszuführen?");
        antworten.add("Ich habe gerade StackOverflow überprüft - das ist auch keine Lösung.");
    }
}
