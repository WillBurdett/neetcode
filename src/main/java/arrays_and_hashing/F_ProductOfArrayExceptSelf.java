package arrays_and_hashing;

public class F_ProductOfArrayExceptSelf {

  public static int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    // Notes:
    // Calculating then storing the prefixed values
    // e.g. for [1, 2, 3, 4] we store [1, 1, 2, 6]
    // 1 is our default starting sum as nothing comes before it
    int prefix = 1;
    for (int i = 0; i < nums.length ; i++) {
      result[i] = prefix;
      prefix *= nums[i];
    }

    // Calculating the final values by multiplying the stored prefixed values
    // with the newly calculated postfix values (reversing through our array)

    // e.g.
    // - for the original array [1, 2, 3, 4]
    //   the prefixes were:     [1, 1, 2, 6]
    //   the postfixes end up:  [24, 12, 4, 1]

    // - postfix = 1 (as nothing comes after the end of our array)
    // - 1 (postfix for nums[3]) * 6 (prefix for nums[3]) = 6 (put that as results[3]!)

    // - postfix = 4 (1 (postfix) * 4 (nums[3])
    // - 2 (our prefix for the value 3 i.e. nums[2]) * 4 (our calculated postfix) = 8 (put that as results[2]!)

    // - postfix = 12 (4 (postfix) * 3 (nums[2])
    // - 1 (our prefix for the value 2 i.e. nums[1]) * 12 (postfix) = 12 (put that as results[1]!)

    // - postfix = 24 (12 (postfix) * 2 (nums[1])
    // - 1 (our prefix for the value 1 i.e. nums[0]) * 24 (postfix) = 24 (put that as results[0]!)

    int postfix = 1;
    for (int i = nums.length-1; i >= 0 ; i--) {
      result[i] *= postfix;
      postfix *= nums[i];
    }

    return result;
  }

  public static void main(String[] args) {
    int[] input = {1,2,3,4};
    System.out.println(productExceptSelf(input));
  }

}
