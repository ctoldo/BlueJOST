package ch.ost.toldo.chapter6.technischerKundendienst2;

import java.util.Scanner;

/**
 * Ein Eingabeleser liest eingetippten Text von der Konsole.
 * Dieser Text wird dann in Wörter zerlegt, die in einer Menge
 * zurückgeliefert werden.
 * 
 * @author     Michael Kölling und David J. Barnes
 * @version    0.2 (2016.02.29)
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
        scanner = new Scanner(System.in);;
    }

    /**
     * Lies eine Zeile von der Konsole und liefere sie als String.
     *
     * @return  eine Zeichenkette, die vom Benutzer eingetippt wurde
     */
    public String gibEingabe() 
    {
        System.out.print("> ");   // Eingabebereitschaft anzeigen
        String eingabezeile = scanner.nextLine();

        return eingabezeile;
    }

}
