package es.upm.miw.iwvg_devops.code;

public class Search {

  public Fraction findFractionMultiplicationByUserFamilyName(String familyName) {
    return new UsersDatabase()
        .findAll()
        .filter(user -> familyName.equals(user.getFamilyName()))
        .flatMap(user -> user.getFractions().stream())
        .reduce(Fraction::multiply)
        .orElse(null);
  }

}
