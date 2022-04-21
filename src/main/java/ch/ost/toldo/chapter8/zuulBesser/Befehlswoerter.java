package ch.ost.toldo.chapter8.zuulBesser;

/**
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes 
 * Adventure-Game.
 * 
 * Diese Klasse hält eine Aufzählung aller Befehlswörter, die dem
 * Spiel bekannt sind. Mit ihrer Hilfe werden eingetippte Befehle
 * erkannt.
 *
 * @author  Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */

class Befehlswoerter
{
    // ein konstantes Array mit den gültigen Befehlswörtern
    private static final String gueltigeBefehle[] = {
        "go", "quit", "help"
    };

    /**
     * Konstruktor - initialisiere die Befehlswörter.
     */
    public Befehlswoerter()
    {
        // nichts zu tun momentan...
    }

    /**
     * Prüfe, ob eine gegebene Zeichenkette ein gültiger
     * Befehl ist.
     * @return true  wenn die gegebene Zeichenkette ein gültiger
     *               Befehl ist, false sonst
     */
    public boolean istBefehl(String eingabe)
    {
        for(int i = 0; i < gueltigeBefehle.length; i++) {
            if(gueltigeBefehle[i].equals(eingabe))
                return true;
        }
        // Wenn wir hierher gelangen, wurde die Eingabe nicht
        // in den Befehlswörter gefunden.
        return false;
    }

    /**
     * Gib alle gültigen Befehlswörter auf die Konsole aus.
     */
    public void alleAusgeben() 
    {
        for(String befehl : gueltigeBefehle) {
            System.out.print(befehl + "  ");
        }
        System.out.println();
    }
}
