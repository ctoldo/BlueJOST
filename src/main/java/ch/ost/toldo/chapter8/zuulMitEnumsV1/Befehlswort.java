package ch.ost.toldo.chapter8.zuulMitEnumsV1;

/**
 * Repräsentationen für alle gültigen Befehlswörter des Spiels.
 *
 * @author Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */
public enum Befehlswort {
  // Ein Wert für jedes Befehlswort, plus eines für nicht
  // erkannte Befehle
  GO, QUIT, HELP, UNKNOWN, LOOK;
}