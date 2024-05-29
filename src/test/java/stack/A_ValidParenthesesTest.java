package stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_ValidParenthesesTest {

  private final A_ValidParentheses undertest = new A_ValidParentheses();

  @Test
  public void isValid_shortValidStringReturnsTrue() {
    String s = "[]";
    boolean actual = undertest.isValid(s);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void isValid_mediumValidStringReturnsTrue() {
    String s = "([{}])";
    boolean actual = undertest.isValid(s);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void isValid_mediumInvalidStringReturnsFalse() {
    String s = "[(])";
    boolean actual = undertest.isValid(s);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  public void isValidOfficial_shortValidStringReturnsTrue() {
    String s = "[]";
    boolean actual = undertest.isValidUsingHashMap(s);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void isValidOfficial_mediumValidStringReturnsTrue() {
    String s = "([{}])";
    boolean actual = undertest.isValidUsingHashMap(s);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void isValidOfficial_mediumInvalidStringReturnsFalse() {
    String s = "[(])";
    boolean actual = undertest.isValidUsingHashMap(s);
    boolean expected = false;
    assertEquals(expected, actual);
  }
}