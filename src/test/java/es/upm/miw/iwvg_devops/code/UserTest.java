package es.upm.miw.iwvg_devops.code;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;

public class UserTest {

  private User user;

  private static final String DEFAULT_ID = UUID.randomUUID().toString();

  private static final String DEFAULT_NAME = "Denilsson";

  private static final String DEFAULT_FAMILY_NAME = "Montoya";

  @Test
  void testNoArgsConstructor(){
    user = new User();

    assertNotNull(user);
    assertTrue(user.getFractions().isEmpty());
    assertNull(user.getId());
    assertNull(user.getName());
    assertNull(user.getFamilyName());
  }

  @Test
  void testAllArgsConstructor(){
    List<Fraction> fractions = List.of(new Fraction());
    user = new User(DEFAULT_ID, DEFAULT_NAME, DEFAULT_FAMILY_NAME, fractions);

    assertNotNull(user);
    assertEquals(DEFAULT_ID, user.getId());
    assertEquals(DEFAULT_NAME, user.getName());
    assertEquals(DEFAULT_FAMILY_NAME, user.getFamilyName());
    assertFalse(user.getFractions().isEmpty());
  };

  @Test
  void testAddFraction(){
    Fraction fraction = new Fraction();
    user = new User();
    user.addFraction(fraction);

    assertTrue(user.getFractions().contains(fraction));
  }

  @Test
  void testFullName(){
    user = new User(DEFAULT_ID, DEFAULT_NAME, DEFAULT_FAMILY_NAME, Collections.emptyList());
    assertEquals(DEFAULT_NAME + " " + DEFAULT_FAMILY_NAME, user.fullName());
  }

  @Test
  void testInitials(){
    user = new User(DEFAULT_ID, DEFAULT_NAME, DEFAULT_FAMILY_NAME, Collections.emptyList());
    assertEquals("D.", user.initials());
  }

}
