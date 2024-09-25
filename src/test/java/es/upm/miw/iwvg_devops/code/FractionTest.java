package es.upm.miw.iwvg_devops.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FractionTest {

  private Fraction fraction;

  @Test
  void testNoneArgumentConstructor() {
    fraction = new Fraction();
    assertNotNull(fraction);
    assertEquals(1, fraction.getNumerator());
    assertEquals(1, fraction.getDenominator());
  }

  @Test
  void testAllArgsConstructor() {
    fraction = new Fraction(2, 1);
    assertNotNull(fraction);
    assertEquals(2, fraction.getNumerator());
    assertEquals(1, fraction.getDenominator());
  }

  @Test
  void testDecimal() {
    fraction = new Fraction(3, 2);
    assertNotNull(fraction);
    assertEquals(1.5, fraction.decimal());
  }

  @Test
  void testIsProper() {
    fraction = new Fraction(3, 4);
    assertTrue(fraction.isProper());
  }

  @Test
  void testIsImProper() {
    fraction = new Fraction(3, 2);
    assertTrue(fraction.isImproper());
  }

  @Test
  void testIsEquivalent() {
    Fraction fractionOne = new Fraction(3, 2);
    Fraction fractionTwo = new Fraction(6, 4);
    assertTrue(fractionOne.isEquivalent(fractionTwo));
  }

  @Test
  void testAdd() {
    Fraction fractionBase = new Fraction(3, 2);
    Fraction fractionAddend = new Fraction(6, 4);
    Fraction actualAddedFraction = fractionBase.add(fractionAddend);
    assertEquals(24, actualAddedFraction.getNumerator());
    assertEquals(8, actualAddedFraction.getDenominator());
  }

  @Test
  void testMultiply() {
    Fraction fractionBase = new Fraction(3, 2);
    Fraction fractionMultiplier = new Fraction(6, 4);
    Fraction actualFractionResult = fractionBase.multiply(fractionMultiplier);
    assertEquals(18, actualFractionResult.getNumerator());
    assertEquals(8, actualFractionResult.getDenominator());
  }

  @Test
  void testDivide() {
    Fraction fractionBase = new Fraction(3, 2);
    Fraction fractionMultiplier = new Fraction(6, 4);
    Fraction actualFractionResult = fractionBase.divide(fractionMultiplier);
    assertEquals(12, actualFractionResult.getNumerator());
    assertEquals(12, actualFractionResult.getDenominator());
  }

}
