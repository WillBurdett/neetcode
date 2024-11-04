package binary_search;

import static org.junit.Assert.*;

import org.junit.Test;
import practise.PractisePad;

public class B_SearchA2DMatrixTest {

  private final PractisePad undertest = new PractisePad();

  @Test
  public void searchMatrix_happyPath1() {
    final int target = 10;
    final int[][] nums = new int[][]{new int[]{1,2,4,8}, new int[]{10,11,12,13},new int[]{14,20,30,40}};

    final boolean expected = true;
    final boolean actual = undertest.searchMatrix(nums, target);

    assertEquals(expected, actual);
  }

  @Test
  public void searchMatrix_happyPath2() {
    final int target = 15;
    final int[][] nums = new int[][]{new int[]{1,2,4,8}, new int[]{10,11,12,13},new int[]{14,20,30,40}};

    final boolean expected = false;
    final boolean actual = undertest.searchMatrix(nums, target);

    assertEquals(expected, actual);
  }
}