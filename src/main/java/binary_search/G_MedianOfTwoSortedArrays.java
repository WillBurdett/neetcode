package binary_search;

public class G_MedianOfTwoSortedArrays {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    // Ensure A is the smaller array and B is the larger array
    // This allows us to perform binary search on the smaller array for efficiency
    int[] A = nums1.length <= nums2.length ? nums1 : nums2;
    int[] B = nums1.length <= nums2.length ? nums2 : nums1;

    // Calculate the total number of elements in both arrays
    int total = nums1.length + nums2.length;
    // Calculate half of the total number of elements
    // This will help in partitioning the arrays correctly
    int half = total / 2;

    // Initialize binary search bounds for the smaller array A
    int l = 0;  // Left bound starts at the beginning of array A
    int r = A.length;  // Right bound starts at the end of array A (inclusive)

    // Perform binary search to find the correct partition
    while (l <= r) {
      // Calculate the middle index for array A based on current bounds
      int i = (l + r) / 2;
      // Calculate the corresponding index in array B to maintain the left half
      int j = half - i;

      // Handle edge cases where partition index is out of bounds
      // Aleft is the maximum element on the left side of the partition in A
      int Aleft = (i > 0) ? A[i - 1] : Integer.MIN_VALUE;  // Use MIN_VALUE if out of bounds
      // Aright is the minimum element on the right side of the partition in A
      int Aright = (i < A.length) ? A[i] : Integer.MAX_VALUE;  // Use MAX_VALUE if out of bounds

      // Bleft is the maximum element on the left side of the partition in B
      int Bleft = (j > 0) ? B[j - 1] : Integer.MIN_VALUE;  // Use MIN_VALUE if out of bounds
      // Bright is the minimum element on the right side of the partition in B
      int Bright = (j < B.length) ? B[j] : Integer.MAX_VALUE;  // Use MAX_VALUE if out of bounds

      // Check if the current partition is valid
      // Valid partition means the maximum of left sides is less than or equal to the minimum of right sides
      if (Aleft <= Bright && Bleft <= Aright) {
        // If the total number of elements is even, the median is the average of the two middle values
        if (total % 2 == 0) {
          return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
        }
        // If the total number of elements is odd, the median is the middle value of the right partition
        return Math.min(Aright, Bright);
      }
      // If Aleft is too large, move the right boundary left to reduce A's maximum in the partition
      else if (Aleft > Bright) {
        r = i - 1;  // Decrease right bound to search the left side of A
      }
      // If Bleft is too large, move the left boundary right to increase A's maximum in the partition
      else {
        l = i + 1;  // Increase left bound to search the right side of A
      }
    }
    // If no valid partition is found, throw an exception indicating invalid input
    throw new IllegalArgumentException("Input arrays are not sorted or not valid.");
  }

}
