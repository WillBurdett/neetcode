package binary_search;

import static org.junit.Assert.*;

import org.junit.Test;

public class E_SearchInRotatedSortedArrayTest {

  private final E_SearchInRotatedSortedArray undertest = new E_SearchInRotatedSortedArray();

  @Test
  public void search_targetFoundReturnsIndex() {
    final int[] nums = new int[]{3,4,5,6,1,2};
    final int target = 1;

    final int expected = 4;
    final int actual = undertest.search(nums, target);

    assertEquals(expected, actual);
  }

  @Test
  public void search_cannotFindTargetReturnsNegativeOne() {
    final int[] nums = new int[]{3,5,6,0,1,2};
    final int target = 4;

    final int expected = -1;
    final int actual = undertest.search(nums, target);

    assertEquals(expected, actual);
  }
}