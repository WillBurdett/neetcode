package stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class G_LargestRectangleInHistogramTest {

  private final G_LargestRectangleInHistogram undertest = new G_LargestRectangleInHistogram();

  @Test
  public void largestRectangleArea_happyPath1() {
    final int[] input = new int[]{7,1,7,2,2,4};

    final int expected = 8;
    final int actual = undertest.largestRectangleArea(input);

    assertEquals(expected, actual);
  }

  @Test
  public void largestRectangleArea_happyPath2() {
    final int[] input = new int[]{1,3,7};

    final int expected = 7;
    final int actual = undertest.largestRectangleArea(input);

    assertEquals(expected, actual);
  }

}