/**
 * Author: Claudio Toldo
 * Created: 24.02.2022 17:55
 * © 2022 Claudio Toldo
 */
package ch.ost.toldo.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestPerson {

  @Test
  void testSetterAndGetter() {
    Person person = new Person();
    person.setName("Hanswurst");
    Assertions.assertEquals("Hanswurst", person.getName());
  }

}