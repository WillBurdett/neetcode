package stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class C_EvaluateReversePolishNotationTest {

  private final C_EvaluateReversePolishNotation undertest = new C_EvaluateReversePolishNotation();

  @Test
  public void evalRPN() {
    String[] input = new String[]{"1","2","+","3","*","4","-"};

    int expected = 5;
    int actual = undertest.evalRPN(input);

    assertEquals(expected, actual);
  }
}