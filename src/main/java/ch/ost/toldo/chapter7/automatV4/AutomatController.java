package ch.ost.toldo.chapter7.automatV4;

/**
 * Einen elementaren zellulären Automaten einrichten und steuern.
 * 
 * @author David J. Barnes und Michael Kölling
 * @version  2016.02.29
 */
public class AutomatController
{
    // Der Automat.
    private Automat auto;
    
    /**
     * Erzeuge einen AutomatController.
     * @param anzahlZellen  die Anzahl der Zellen im Automaten.
     */
    public AutomatController(int anzahlZellen)
    {
        auto = new Automat(anzahlZellen);
        auto.ausgeben();
    }
    
    /**
     * Erzeuge einen AutomatController mit einer
     * vorgegebenen Anzahl an Zellen.
     */
    public AutomatController()
    {
        this(50);
    }
    
    /**
     * Führe den Automaten mit der vorgegebenen Anzahl an Schritten aus.
     * @param anzSchritte  die Anzahl an Schritten
     */
    public void starten(int anzSchritte)
    {
        for(int schritt = 1; schritt <= anzSchritte; schritt++) {
            schritt();
        }
    }
    
    /**
     * Führe einen Schritt des Automaten aus.
     */
    public void schritt()
    {
        auto.aktualisieren();
        auto.ausgeben();
    }
    
    /**
     * Setze den Automaten zurück.
     */
    public void zuruecksetzen()
    {
        auto.zuruecksetzen();
        auto.ausgeben();
    }
}
