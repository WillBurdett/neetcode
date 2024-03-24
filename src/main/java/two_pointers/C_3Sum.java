package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_3Sum {

  public List<List<Integer>> threeSum(int[] nums) {

    // sort int[] into ascending order
    Arrays.sort(nums);

    // placeholder for result
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      // if duplicate, continue
      if (i != 0 && nums[i] == nums[i-1]){
        continue;
      }

       // left pointer
       int l = i + 1;

       // right pointer
       int r = nums.length - 1;

       // so long as there's no overlap between left and right
       while (l < r) {
         int curr = nums[i] + nums[l] + nums[r];
         if (curr > 0){
           r--;
         } else if (curr < 0){
           l++;
         } else {
           result.add(List.of(nums[i], nums[l], nums[r]));
           l++;
           // once success is found, increment left pointer until at a new number
           while (nums[l] == nums[l - 1] && l < r) {
             l++;
           }
         }
       }
    }

    return result;
  }

}
