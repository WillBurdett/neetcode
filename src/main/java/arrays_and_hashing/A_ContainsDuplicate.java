package arrays_and_hashing;

import java.util.HashSet;

public class A_ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int n:
    nums) {
      if (set.contains(n)){
        return true;
      }
      set.add(n);
    }
    return false;
  }

}
