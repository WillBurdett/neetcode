package binary_search;

public class D_FindMinimumInRotatedSortedArray {

  public int findMin(int[] nums) {
    int l = 0; // Initialize the left pointer to the start of the array (index 0)
    int r = nums.length - 1; // Initialize the right pointer to the end of the array (last index)

    // Loop until the left pointer crosses the right pointer
    while (l <= r) {
      // If the sub-array between l and r is already sorted, the minimum element is nums[l]
      if (nums[l] <= nums[r]) {
        return nums[l]; // Return the leftmost element as the smallest
      }

      // Find the middle index
      int mid = l + ((r - l) / 2);

      // If the middle element is greater than or equal to the leftmost element...
      // it means the smallest element is in the right half of the array
      if (nums[mid] >= nums[l]) {
        l = mid + 1; // Move the left pointer to mid + 1 to search the right half
      } else {
        // Otherwise, the smallest element is in the left half, so adjust the right pointer
        r = mid; // Shrink the right pointer to mid
      }
    }

    // If the loop completes without returning, return 0 as a fallback value (edge case handling)
    return 0;
  }

}
