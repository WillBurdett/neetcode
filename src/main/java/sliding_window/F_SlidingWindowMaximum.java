package sliding_window;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F_SlidingWindowMaximum {

  // OFFICIAL SOLUTION (DEQUE pronounced DECK or DE-QUEUE)
  public int[] maxSlidingWindow(int[] nums, int k) {
  List<Integer> result = new ArrayList<>();
  int l = 0;
  int r = 0;
  ArrayDeque<Integer> q = new ArrayDeque<>();

  while (r < nums.length){
    // pop smaller values from q
    while (q.size() != 0 && nums[q.peekLast()] < nums[r]){
      q.pollLast();
    }
    q.offerLast(r);

    // remove left val from window
    if (l > q.peekFirst()){
      q.pollFirst();
    }

    // check our window is at least size k
    if (r + 1 >= k){
      result.add(nums[q.peekFirst()]);
      l++;
    }
     r++;
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  // ORIGINAL SOLUTION
  public int[] maxSlidingWindowOriginal(int[] nums, int k) {
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

  public int findMaxInteger(int[] arr){
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }

}
