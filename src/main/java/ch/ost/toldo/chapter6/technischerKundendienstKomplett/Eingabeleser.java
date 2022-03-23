package ch.ost.toldo.chapter6.technischerKundendienstKomplett;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Ein Eingabeleser liest eingetippten Text von der Konsole.
 * Dieser Text wird dann in Wörter zerlegt, die in einer Menge
 * zurückgeliefert werden.
 * 
 * @author     Michael Kölling und David J. Barnes
 * @version    1.0 (2016.02.29)
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
     * Lies eine Zeile von der Konsole und liefere sie als eine
     * Menge von Wörtern zurück.
     *
     * @return  eine Menge von Zeichenketten, von denen jede ein
     *          vom Benutzer getipptes Wort repräsentiert
     */
    public HashSet<String> gibEingabe() 
    {
        System.out.print("> ");   // Eingabebereitschaft anzeigen
        String eingabezeile = scanner.nextLine().trim().toLowerCase();
        
        String[] wortArray = eingabezeile.split(" "); //Trennung bei Leerzeichen
        
        // Wörter aus dem Array in das Hashset einfügen
        HashSet<String> woerter = new HashSet<>();
        for(String wort : wortArray) {
            woerter.add(wort);
        }

        return woerter;
    }
}
