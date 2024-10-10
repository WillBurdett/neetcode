package sliding_window;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;
import practise.PractisePad;

public class F_SlidingWindowMaximumTest {

  PractisePad undertest = new PractisePad();

  @Test
  public void maxSlidingWindowOfficial_HappyPath() {
    int[] nums = {1,2,1,0,4,2,6};
    int k = 3;

    int[] expected = {2,2,4,4,6};
    int[] actual = undertest.maxSlidingWindow(nums, k);

    assertArrayEquals(expected, actual);
  }
}