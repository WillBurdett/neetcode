package two_pointers;

import java.util.HashMap;

public class B_TwoSumII_InputArrayIsSorted {

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
