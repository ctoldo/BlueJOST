/*
 * Author: Claudio Toldo
 * Created: 04.04.2022 15:47
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.starwars;

public class Namensgenerator {

  public static void main(String[] args) {
    generiereStarWarsNamen("Claudio", "Toldo", "Nigg", "Vaduz");
  }

  public static String generiereStarWarsNamen(String vorname, String nachname, String maedchenname, String geburtsort) {
    if (vorname.length() < 2){
      System.err.println("Vorname zu kurz");
      return "";
    } else if (nachname.length() < 3) {
      System.err.println("Nachname zu kurz");
      return "";
    } else if (maedchenname.length() < 2) {
      System.err.println("Mädchenname zu kurz");
      return "";
    } else if (geburtsort.length() < 3) {
      System.err.println("Geburtsort zu kurz");
      return "";
    } else {
      String swVorname = nachname.substring(0, 3) + vorname.substring(0, 2).toLowerCase();
      String swNachname = maedchenname.substring(0, 2) + geburtsort.substring(0, 3).toLowerCase();
      System.out.println(swVorname + " " + swNachname);
      return swVorname + " " + nachname;
    }
  }
}
