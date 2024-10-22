package stack;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;

public class D_GenerateParenthesesTest {

  D_GenerateParentheses undertest = new D_GenerateParentheses();

  @Test
  public void generateParenthesis_happyPathFor1() {
    int input = 1;

    List<String> expected = List.of("()");
    List<String> actual = undertest.generateParenthesis(input);

    assertEquals(expected, actual);
  }

  @Test
  public void generateParenthesis_happyPathFor3() {
    int input = 3;

    List<String> expected = List.of("((()))","(()())","(())()","()(())","()()()");
    List<String> actual = undertest.generateParenthesis(input);

    assertEquals(expected, actual);
  }
}