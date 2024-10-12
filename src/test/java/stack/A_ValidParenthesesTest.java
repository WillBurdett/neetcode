package stack;

import static org.junit.Assert.*;

import org.junit.Test;
import practise.PractisePad;

public class A_ValidParenthesesTest {

  private final PractisePad undertest = new PractisePad();

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
}