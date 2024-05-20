package sliding_window;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class F_SlidingWindowMaximumTest {

  F_SlidingWindowMaximum undertest = new F_SlidingWindowMaximum();

  @Test
  public void maxSlidingWindowOfficial_HappyPath() {
    int[] nums = {1,2,1,0,4,2,6};
    int k = 3;

    int[] expected = {2,2,4,4,6};
    int[] actual = undertest.maxSlidingWindow(nums, k);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void maxSlidingWindowOriginal_HappyPath() {
    int[] nums = {1,2,1,0,4,2,6};
    int k = 3;

    int[] expected = {2,2,4,4,6};
    int[] actual = undertest.maxSlidingWindowOriginal(nums, k);

    assertArrayEquals(expected, actual);
  }
}