package ch.ost.toldo.chapter6.technischerKundendienst3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Ein Eingabeleser liest eingetippten Text von der Konsole.
 * Der vom Benutzer eingetippte Text wird zurückgeliefert.
 * 
 * @author     Michael Kölling und David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Eingabeleser
{
    private Scanner scanner;

    /**
     * Erzeuge einen neuen Eingabeleser, der Text von der Konsole
     * einliest.
     */
    public Eingabeleser()
    {
        scanner = new Scanner(System.in);
    }

    /**
     * Lies eine Zeile von der Konsole und liefere sie als String.
     *
     * @return  eine Zeichenkette, die vom Benutzer eingetippt wurde
     */
    public HashSet<String> gibEingabe()
    {
        System.out.print("> ");   // Eingabebereitschaft anzeigen
        String eingabezeile = scanner.nextLine().trim().toLowerCase();

        String[] words = eingabezeile.split(" ");
        return new HashSet<>(Arrays.asList(words));
    }

}
