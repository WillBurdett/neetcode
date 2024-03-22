package two_pointers;

import java.util.HashMap;

public class B_TwoSumII_InputArrayIsSorted {

  // OFFICIAL SOLUTION
  public int[] twoSumOfficial(int[] numbers, int target) {
    for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
      int curr = numbers[i] + numbers[j];
      if (curr == target){
        return new int[]{i + 1, j + 1};
      } else if (curr > target){
        i--;
      } else if (target > curr){
        j++;
      }
    }
    return null;
  }

  // ORIGINAL SOLUTION
  public int[] twoSum(int[] numbers, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      if (map.containsKey(target - numbers[i])){
        return new int[]{map.get(target - numbers[i]) + 1, i + 1};
      }
      map.put(numbers[i], i);
    }

    return new int[]{};
  }

}
