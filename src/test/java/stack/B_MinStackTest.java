package stack;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;
import practise.PractisePad;

public class B_MinStackTest {

  private final PractisePad undertest = new PractisePad();

  @Test
  public void push() {
    undertest.push(1);
    List<Integer> expected = List.of(1);
    List<Integer> actual = undertest.getStack();
    assertEquals(expected, actual);
  }

  @Test
  public void pop() {
    undertest.push(1);
    undertest.pop();
    List<Integer> expected = List.of();
    List<Integer> actual = undertest.getStack();
    assertEquals(expected, actual);
  }

  @Test
  public void top() {
    undertest.push(1);
    undertest.push(2);
    undertest.push(3);
    int expected = 3;
    int actual = undertest.top();
    assertEquals(expected, actual);
  }

  @Test
  public void getMin() {
    undertest.push(1);
    undertest.push(2);
    undertest.push(3);
    int expected = 1;
    int actual = undertest.getMin();
    assertEquals(expected, actual);
  }
}