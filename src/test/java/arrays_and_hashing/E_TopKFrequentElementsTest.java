package arrays_and_hashing;

import static org.junit.Assert.*;

import org.junit.Test;

public class E_TopKFrequentElementsTest {

  public final int[] TEST1_INPUT = {1,1,1,2,2,3};
  public final int[] TEST1_EXPECTED = {1,2};
  public final int TEST1_K = 2;

  public final int[] TEST2_INPUT = {1};
  public final int[] TEST2_EXPECTED = {1};
  public final int TEST2_K = 1;

  @Test
  public void topKFrequent_TEST1_HappyPath() {
    int[] actual = E_TopKFrequentElements.topKFrequent(TEST1_INPUT, TEST1_K);
    assertArrayEquals(TEST1_EXPECTED, actual);
  }

  @Test
  public void topKFrequent_TEST2_HappyPath() {
    int[] actual = E_TopKFrequentElements.topKFrequent(TEST2_INPUT, TEST2_K);
    assertArrayEquals(TEST2_EXPECTED, actual);
  }
}