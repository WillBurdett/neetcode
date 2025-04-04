package binary_search;

public class G_MedianOfTwoSortedArrays {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    // Get the lengths of the input arrays
    int n = nums1.length, m = nums2.length;

    // Ensure that nums1 is the smaller array to minimize the binary search range
    if (n > m) {
      return findMedianSortedArrays(nums2, nums1);
    }

    // Initialize binary search bounds for nums1
    int leftPointer = 0, rightPointer = n;
    while (leftPointer <= rightPointer) {
      // Calculate midpoints in nums1 and corresponding position in nums2
      int mid1 = (leftPointer + rightPointer) / 2;

      // as mid1 increases, mid2 will now decrease
      int mid2 = (n + m + 1) / 2 - mid1;

      // Calculate the boundary elements on either side of the partitions
      int l1 = (mid1 == 0 ? Integer.MIN_VALUE : nums1[mid1 - 1]); // Left of nums1 partition
      int r1 = (mid1 == n ? Integer.MAX_VALUE : nums1[mid1]);     // Right of nums1 partition

      int l2 = (mid2 == 0 ? Integer.MIN_VALUE : nums2[mid2 - 1]); // Left of nums2 partition
      int r2 = (mid2 == m ? Integer.MAX_VALUE : nums2[mid2]);     // Right of nums2 partition

      // Check if we have a valid partition with all elements in order
      if (l1 <= r2 && l2 <= r1) {
        // If combined length is even, median is the average of the two middle values
        if ((n + m) % 2 == 0) {
          return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
        }
        // If combined length is odd, median is the max of left values
        else {
          return Math.max(l1, l2);
        }
      }

      // Adjust binary search range if partition is invalid
      // If l1 > r2, move right pointer to reduce the left portion of nums1 and reduce l1
      if (l1 > r2) {
        rightPointer = mid1 - 1;
      }
      // If l2 > r1, l2 is the issue. we move left pointer to increase l1 (mid1) which lowers l2 (mid2)
      else {
        leftPointer = mid1 + 1;
      }
    }

    // This line should not be reached for valid input arrays
    return 0.0;
  }

}
