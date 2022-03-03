/**
 * Author: Claudio Toldo
 * Created: 03.03.2022 14:32
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter2.student;

public class Studienadministration {

  /**
   * Name der Hochschule
   */
  private final String nameDerHochschule;
  /**
   * aktuelle Studenteninstanz
   */
  private Student aktuellerStudent;

  /**
   * Konstruktor für Studienadministration
   */
  public Studienadministration(String nameDerHochschule) {
    this.nameDerHochschule = nameDerHochschule;
  }

  /**
   * erstellt neuen Student und weist aktuellerStudent diesen zu
   */
  public void neuerStudent(String name, String vorname, int geburtsjahr) {
    aktuellerStudent = new Student(name, vorname);
    aktuellerStudent.setGeburtsjahr(geburtsjahr);
  }

  /**
   * gibt Infos zur Hochschule und zum aktuellen Studenten aus
   */
  public void ausgeben() {
    System.out.println(nameDerHochschule);
    aktuellerStudent.ausgeben();
  }

  /**
   * setzt aktuellen Student auf null
   * GarbageCollector löscht die Referenz später automatisch
   */
  public void aktuellerStudentLoeschen() {
    aktuellerStudent = null;
  }
}
