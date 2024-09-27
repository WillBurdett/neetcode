package two_pointers;

import static org.junit.Assert.*;

import org.junit.Test;
import practise.PractisePad;

public class D_ContainerWithMostWaterTest {

  private final PractisePad undertest = new PractisePad();

  @Test
  public void maxArea_HappyPath() {
    int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int actual = undertest.maxArea(input);
    int expected = 49;
    assertEquals(expected, actual);
  }

  @Test
  public void maxArea_HappyPath2() {
    int[] input = {1,1};
    int actual = undertest.maxArea(input);
    int expected = 1;
    assertEquals(expected, actual);
  }

  @Test
  public void maxArea_HappyPath3() {
    int[] input = {2,3,4,5,18,17,6};
    int actual = undertest.maxArea(input);
    int expected = 17;
    assertEquals(expected, actual);
  }

}