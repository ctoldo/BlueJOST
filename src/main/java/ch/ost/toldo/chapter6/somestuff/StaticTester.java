/*
 * Author: Claudio Toldo
 * Created: 04.04.2022 15:09
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.somestuff;

public class StaticTester {

  public static void main(String[] args) {
    staticToStatic();
    staticToInstance();

    StaticTester staticTester = new StaticTester();
    staticTester.instanceToStatic();
    staticTester.instanceToInstance();
  }

  private static void staticToStatic() {
    printTestStatic();
  }

  private static void staticToInstance() {
    StaticTester staticTester = new StaticTester();
    staticTester.printTest();
  }

  private void instanceToStatic() {
    printTestStatic();
  }

  private void instanceToInstance() {
    printTest();
  }

  private static void printTestStatic() {
    System.out.println("Ich bin eine statische Methode");
  }

  private void printTest() {
    System.out.println("Ich bin eine Instanzmethode");
  }

}
