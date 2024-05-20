package sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F_SlidingWindowMaximum {

  public static int[] maxSlidingWindow(int[] nums, int k) {
    List<Integer> result = new ArrayList<>();
    int l = 0;
    for (int r = 0; r < nums.length; r++) {
      if (r < k - 1){
        continue;
      }
      result.add(findMaxInteger(Arrays.copyOfRange(nums, l, r + 1)));
      l++;
      System.out.println(result);
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  public static int findMaxInteger(int[] arr){
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }

  public static void main(String[] args) {
    int[] nums = {1,2,1,0,4,2,6};
    int k = 3;
    System.out.println(maxSlidingWindow(nums, k));
  }

}
