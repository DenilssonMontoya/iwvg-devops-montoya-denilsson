package es.upm.miw.iwvg_devops.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

public class SearchTest {

  @Test
  void testFindFractionMultiplicationByUserFamilyName() {
    Search search = new Search();
    Fraction actualFractionMultiplied =
        search.findFractionMultiplicationByUserFamilyName("Torres");

    assertNotNull(actualFractionMultiplied);
    assertEquals(0, actualFractionMultiplied.getNumerator());
    assertEquals(0, actualFractionMultiplied.getDenominator());
  }

  @Test
  void testFindHighestFraction() {
    Search search = new Search();
    Fraction actualHighestFraction = search.findHighestFraction();

    assertNotNull(actualHighestFraction);
    assertEquals(2, actualHighestFraction.getNumerator());
    assertEquals(1, actualHighestFraction.getDenominator());
  }

  @Test
  void testFindDecimalFractionByUserName() {
    Search search = new Search();
    List<Double> expectedDecimalFraction = List.of(1d, 1d, 1d);
    List<Double> actualDecimalFraction =
        search.findDecimalFractionByUserName("Paula").toList();

    assertNotNull(actualDecimalFraction);
    assertEquals(expectedDecimalFraction, actualDecimalFraction);
  }

  @Test
  void testFindFirstDecimalFractionByUserName() {
    Search search = new Search();
    Double actualDecimal = search.findFirstDecimalFractionByUserName("Oscar");
    assertNotNull(actualDecimal);
    assertEquals(0, actualDecimal);
  }

}
