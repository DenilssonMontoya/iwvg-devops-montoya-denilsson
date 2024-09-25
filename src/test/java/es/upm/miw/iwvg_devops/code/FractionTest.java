package es.upm.miw.iwvg_devops.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class FractionTest {

  private Fraction fraction;


  @Test
  void testNoneArgumentConstructor(){
    fraction = new Fraction();
    assertNotNull(fraction);
    assertEquals(1, fraction.getNumerator());
    assertEquals(1, fraction.getDenominator());
  }

  @Test
  void testAllArgsConstructor(){
    fraction = new Fraction(2,1);
    assertNotNull(fraction);
    assertEquals(2, fraction.getNumerator());
    assertEquals(1, fraction.getDenominator());
  }

  @Test
  void testDecimal(){
    fraction = new Fraction(3,2);
    assertNotNull(fraction);
    assertEquals(1.5, fraction.decimal());
  }

}
