/**
 * Author: Claudio Toldo
 * Created: 10.03.2022 13:59
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter4.student;

import java.util.ArrayList;
import java.util.Iterator;

public class Hochschule {
  private String name;
  private ArrayList<Student> studenten;

  public Hochschule(String name) {
    this.name = name;
    studenten = new ArrayList<>();
  }

  public void ausgeben() {
    System.out.println(name);
    System.out.println("-".repeat(name.length()));
    System.out.println("Total Studenten: " + studenten.size());
    System.out.println();
    studenten.forEach(student -> {
      student.ausgeben();
      System.out.println();
    });
  }

  public void studentAufnehmen(Student student) {
    studenten.add(student);
  }

  public void studentLoeschen(Student student) {
    studenten.remove(student);
  }

  public boolean studentLoeschen(int index) {
    Student removedStudent = studenten.remove(index);
    return removedStudent != null;
  }

  public int studentLoeschen(String stringImNamen) {
    int counter = 0;
    Iterator<Student> studentIterator = studenten.iterator();
    while (studentIterator.hasNext()) {
      Student student = studentIterator.next();
      if (student.gibName().contains(stringImNamen)) {
        studentIterator.remove();
        studentLoeschen(student);
        counter++;
      }
    }
    return counter;
  }

  public void generiereTestobjekte(Lehrgang lehrgang, int anzahlObjekte) {
    for (int i = 1; i <= anzahlObjekte; i++) {
      Student student = new Student("Muster" + i, "Hans" + i);
      student.setzeBesuchtLehrgang(lehrgang);
      student.setzeEmail("hans.muster" + i + "@fh.ch");
      student.setzeGeburtsJahr(2000);
      studentAufnehmen(student);
    }

    //oder mit while:
    /*
    int i = 1;
    while (i <= anzahlObjekte) {
      Student student = new Student("Muster" + i, "Hans" + i);
      student.setzeBesuchtLehrgang(lehrgang);
      student.setzeEmail("hans.muster" + i + "@fh.ch");
      student.setzeGeburtsJahr(2000);
      studentAufnehmen(student);
      i++;
    }*/
  }
}
