/**
 * Eine Klasse, deren Objekte Informationen über ein Buch halten.
 * Dies könnte Teil einer größeren Anwendung sein, einer
 * Bibliothekssoftware beispielsweise.
 *
 * @author (Ihren Namen hier eintragen.)
 * @version (das heutige Datum eintragen.)
 */

package ch.ost.toldo.chapter2.buchAufgabe;

class Buch {
  // Die Datenfelder
  private String autor;
  private String titel;
  //2.85
  private int seiten;
  //2.88
  private String refNummer;
  //2.91
  private int ausgeliehen;
  //2.92
  private boolean kursText;

  /**
   * Setze den Autor und den Titel, wenn ein Objekt erzeugt wird.
   */
  public Buch(String buchautor, String buchtitel, int buchseiten, boolean kursText) {
    autor = buchautor;
    titel = buchtitel;
    //2.85
    seiten = buchseiten;
    //2.88
    refNummer = "";
    //2.92
    this.kursText = kursText;
  }

  //2.83
  public String getAutor() {
    return autor;
  }

  //2.83
  public String getTitel() {
    return titel;
  }

  //2.85
  public int getSeiten() {
    return seiten;
  }

  //2.88, 2.90
  public void setRefNummer(String ref) {
    if (ref.length() >= 3) {
      refNummer = ref;
    } else {
      System.out.println("RefNummer zu kurz.");
    }
  }

  //2.88
  public String getRefNummer() {
    return refNummer;
  }

  //2.91
  public int getAusgeliehen() {
    return ausgeliehen;
  }

  //2.91
  public void ausleihen() {
    ausgeliehen++;
  }

  //2.92
  public boolean isKursText() {
    return kursText;
  }

  //2.84
  public void autorAusgeben() {
    System.out.println("Autor: " + autor);
  }

  //2.84
  public void titelAusgeben() {
    System.out.println("Titel: " + titel);
  }

  public void seitenAusgeben() {
    System.out.println("Seiten: " + seiten);
  }

  //2.89
  public void refNummerAusgeben() {
    if (!refNummer.isEmpty()) {
      System.out.println("RefNummer: " + refNummer);
    }
  }

  //2.91
  public void ausgeliehenAusgeben() {
    System.out.println("Ausgeliehen: " + ausgeliehen);
  }

  //2.87
  public void detailsAusgeben() {
    titelAusgeben();
    autorAusgeben();
    seitenAusgeben();
    //2.89
    refNummerAusgeben();
    //2.91
    ausgeliehenAusgeben();
  }
}
