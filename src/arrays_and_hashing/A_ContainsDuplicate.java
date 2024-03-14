package arrays_and_hashing;

import java.util.HashSet;

public class A_ContainsDuplicate {

  public static boolean containsDuplicate(int[] nums) {
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

  public static void main(String[] args) {

    int[] numTrue = new int[]{1,2,3,1};
    int[] numFalse = new int[]{1,2,3,4};

    System.out.println(containsDuplicate(numFalse));
  }

}
