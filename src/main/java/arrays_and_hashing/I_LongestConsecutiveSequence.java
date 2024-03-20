package arrays_and_hashing;

import java.util.Arrays;

public class I_LongestConsecutiveSequence {

  public static int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
    int currentSequence = 0;
    int currentMax = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i == 0){
        currentSequence++;
        continue;
      }
      if (nums[i] == nums[i-1]){
        continue;
      }
      if (nums[i] - nums[i-1] == 1){
        currentSequence++;
        continue;
      }
      if (currentSequence > currentMax){
        currentMax = currentSequence;
      }
      currentSequence = 1;
    }
    return currentSequence > currentMax ? currentSequence : currentMax;
  }

  public static void main(String[] args) {
    int[] nums = {1,2,0,1};
    longestConsecutive(nums);
  }

}
