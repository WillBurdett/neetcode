package arrays_and_hashing;

import java.util.Arrays;
import java.util.HashMap;

public class C_TwoSum {

  // Original Solution
  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i == j){
          continue;
        } else {
          if (nums[i] + nums[j] == target){
            return new int[]{i, j};
          }
        }
      }
    }
    return null;
  }

  // Improved Solution
  public static int[] twoSum2(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])){
        return new int[]{map.get(target - nums[i]), i};
      }
      map.put(nums[i], i);
    }
    return new int[]{};
  }

  public static void main(String[] args) {
    int[] numArr = new int[]{2, 7, 11, 15};
    int target = 9;
    System.out.println(Arrays.toString(twoSum2(numArr, target)));
  }
}
