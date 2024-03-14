package arrays_and_hashing;

import java.util.HashSet;
import java.util.Set;

public class A_ContainsDuplicate {

  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int n:
    nums) {
      set.add(n);
    }
    return set.size() != nums.length ? true : false;
  }

  public static void main(String[] args) {

    int[] numTrue = new int[]{1,2,3,1};
    int[] numFalse = new int[]{1,2,3,4};

    containsDuplicate(numTrue);
  }

}
