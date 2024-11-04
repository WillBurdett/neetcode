package binary_search;

import static org.junit.Assert.*;

import org.junit.Test;
import practise.PractisePad;

public class A_BinarySearchTest {

  private final PractisePad undertest = new PractisePad();

  @Test
  public void search_happyPath1() {
    final int target = 4;
    final int[] nums = new int[]{-1,0,2,4,6,8};

    final int expected = 3;
    final int actual = undertest.search(nums, target);

    assertEquals(expected, actual);
  }

  @Test
  public void search_happyPath2() {
    final int target = 3;
    final int[] nums = new int[]{-1,0,2,4,6,8};

    final int expected = -1;
    final int actual = undertest.search(nums, target);

    assertEquals(expected, actual);
  }
}