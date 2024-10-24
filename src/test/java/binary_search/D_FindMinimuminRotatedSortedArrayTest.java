package binary_search;

import static org.junit.Assert.*;

import org.junit.Test;

public class D_FindMinimuminRotatedSortedArrayTest {

  private final D_FindMinimumInRotatedSortedArray undertest = new D_FindMinimumInRotatedSortedArray();

  @Test
  public void findMin_happyPath1() {
    final int[] input = new int[]{3,4,5,6,1,2};

    final int expected = 1;
    final int actual = undertest.findMin(input);

    assertEquals(expected, actual);
  }

  @Test
  public void findMin_happyPath2() {
    final int[] input = new int[]{4,5,0,1,2,3};

    final int expected = 0;
    final int actual = undertest.findMin(input);

    assertEquals(expected, actual);
  }

  @Test
  public void findMin_happyPath3() {
    final int[] input = new int[]{4,5,6,7};

    final int expected = 4;
    final int actual = undertest.findMin(input);

    assertEquals(expected, actual);
  }

}