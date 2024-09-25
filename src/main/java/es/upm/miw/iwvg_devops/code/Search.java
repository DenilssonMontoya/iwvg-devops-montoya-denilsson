package es.upm.miw.iwvg_devops.code;

import java.util.Comparator;
import java.util.stream.Stream;

public class Search {

  public Fraction findFractionMultiplicationByUserFamilyName(String familyName) {
    return new UsersDatabase()
        .findAll()
        .filter(user -> familyName.equals(user.getFamilyName()))
        .flatMap(user -> user.getFractions().stream())
        .reduce(Fraction::multiply)
        .orElse(null);
  }

  public Fraction findHighestFraction() {
    return new UsersDatabase()
        .findAll()
        .flatMap(user -> user.getFractions().stream())
        .filter(fraction -> fraction.getDenominator() != 0)
        .max(Comparator.comparing(Fraction::decimal))
        .orElse(null);
  }

  public Stream<Double> findDecimalFractionByUserName(String name) {
    return new UsersDatabase()
        .findAll()
        .filter(user -> name.equals(user.getName()))
        .flatMap(user -> user.getFractions().stream())
        .filter(fraction -> fraction.getDenominator() != 0)
        .map(Fraction::decimal);
  }

  public Double findFirstDecimalFractionByUserName(String name) {
    return new UsersDatabase()
        .findAll()
        .filter(user -> name.equals(user.getName()))
        .flatMap(user -> user.getFractions().stream())
        .filter(fraction -> fraction.getDenominator() != 0)
        .findFirst()
        .map(Fraction::decimal)
        .orElse(null);
  }

}
