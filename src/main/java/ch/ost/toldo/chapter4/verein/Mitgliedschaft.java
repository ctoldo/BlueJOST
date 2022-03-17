package ch.ost.toldo.chapter4.verein;

/**
 * Speichert Informationen über die Mitgliedschaft
 * eines Vereinsmitglieds.
 * 
 * @author David J. Barnes und Michael Kölling
 * @version 2016.02.29
 */
public class Mitgliedschaft
{
    // Name des Mitglieds.
    private String name;
    // Der Monat seines Beitritts.
    private int monat;
    // Das Jahr seines Beitritts.
    private int jahr;

    /**
     * Konstruktor für Objekte der Klasse Mitgliedschaft.
     * @param name   der Name des Mitglieds
     * @param monat  der Monat des Beitritts (1 ... 12)
     * @param jahr   das Jahr des Beitritts
     */
    public Mitgliedschaft(String name, int monat, int jahr)
        throws IllegalArgumentException
    {
        if(monat < 1 || monat > 12) {
            throw new IllegalArgumentException(
                "Monat " + monat + " ungültig. Muss im Bereich 1 ... 12 liegen.");
        }
        this.name = name;
        this.monat = monat;
        this.jahr = jahr;
    }
    
    /**
     * @return  den Namen des Mitglieds
     */
    public String gibName()
    {
        return name;
    }
    
    /**
     * @return  den Monat des Beitritts
     *          ein Wert aus dem Bereich 1 ... 12
     */
    public int gibMonat()
    {
        return monat;
    }

    /**
     * @return  das Jahr des Beitritts
     */
    public int gibJahr()
    {
        return jahr;
    }

    /**
     * @return  eine String-Darstellung dieser Mitgliedschaft
     */
    public String toString()
    {
        return "Name: " + name +
               " beigetreten in Monat " +
               monat + " / " + jahr;
    }
}
