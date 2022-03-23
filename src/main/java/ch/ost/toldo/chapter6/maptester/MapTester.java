/*
 * Author: Claudio Toldo
 * Created: 23.03.2022 14:36
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.chapter6.maptester;

import java.util.HashMap;

public class MapTester {
  private HashMap<String, String> kontakte;

  public MapTester() {
    kontakte = new HashMap<>();
  }

  public void nummerEintragen(String name, String nummer) {
    kontakte.put(name, nummer);
  }

  public String nummerSuchen(String name) {
    return kontakte.get(name);
  }
}
