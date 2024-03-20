package arrays_and_hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class I_LongestConsecutiveSequence {

  // official solution (slower)
  public static int longestConsecutiveOfficial(int[] nums) {
    Set<Integer> numSet = new HashSet<>();
    int longest = 0;

    for (Integer n:
    nums) {
      numSet.add(n);
    }

    for (Integer n:
        numSet) {
      // check if it's start of sequence i.e. has number to left
      if (!numSet.contains(n - 1)){
        int length = 0;
          while (numSet.contains(n + length)){
            length += 1;
          }
         longest = length > longest ? length : longest;
      }
    }

    return longest;
  }

  // original solution (faster)
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
