package arrays_and_hashing;

import static org.junit.Assert.*;

import org.junit.Test;

public class F_ProductOfArrayExceptSelfTest {

  private final int[] TEST1_INPUT = {1,2,3,4};
  private final int[] TEST1_EXPECTED = {24,12,8,6};

  private final int[] TEST2_INPUT = {-1,1,0,-3,3};
  private final int[] TEST2_EXPECTED = {0,0,9,0,0};

  @Test
  public void productExceptSelf_TEST1_HappyPath() {
    int[] actual = F_ProductOfArrayExceptSelf.productExceptSelf(TEST1_INPUT);
    assertArrayEquals(TEST1_EXPECTED, actual);
  }

  @Test
  public void productExceptSelf_TEST2_HappyPath() {
    int[] actual = F_ProductOfArrayExceptSelf.productExceptSelf(TEST2_INPUT);
    assertArrayEquals(TEST2_EXPECTED, actual);
  }
}