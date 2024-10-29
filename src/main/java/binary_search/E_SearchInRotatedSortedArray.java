package binary_search;

public class E_SearchInRotatedSortedArray {

  public int search(int[] nums, int target) {
    int l = 0; // left index pointing at the start of the array
    int r = nums.length - 1; // right index pointing at the end of the array

    // loop continues as long as there are elements to search within
    while (l <= r) {

      // calculate the middle index to avoid overflow
      int mid = l + ((r - l) / 2);

      // check if the middle element is the target
      if (nums[mid] == target) {
        // if so, return its index
        return mid;
      }

      // check if the left part of the array is sorted
      if (nums[l] <= nums[mid]) {
        // target is out of range of the sorted left side
        if (target > nums[mid] || target < nums[l]) {
          // search the right side
          l = mid + 1;
        } else {
          // search the left side
          r = mid - 1;
        }

        // if the left part is not sorted, the right part must be sorted
      } else {
        // target is out of range of the sorted right side
        if (target < nums[mid] || target > nums[r]) {
          // search the left side
          r = mid - 1;
        } else {
          // search the right side
          l = mid + 1;
        }
      }
    }

    // if target is not found, return -1
    return -1;
  }

}
