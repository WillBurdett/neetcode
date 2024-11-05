package practise;

public class PractisePad {

  /**
   * <h2><strong>Binary Search</strong></h2>
   *
   * You are given an array of distinct integers `nums`, sorted in ascending order, and an integer `target`.
   *
   * Implement a function to search for `target` within `nums`. If it exists, return its index; otherwise, return -1.
   *
   * Your solution must run in O(log n) time.
   *
   * <p><strong>Example 1:</strong></p>
   * <pre>
   * Input: nums = [-1,0,2,4,6,8], target = 4
   * Output: 3
   * </pre>
   *
   * <p><strong>Example 2:</strong></p>
   * <pre>
   * Input: nums = [-1,0,2,4,6,8], target = 3
   * Output: -1
   * </pre>
   *
   * <p><strong>Constraints:</strong></p>
   * <ul>
   *   <li>1 <= nums.length <= 10,000</li>
   *   <li>-10,000 < nums[i], target < 10,000</li>
   * </ul>
   */
  public int search(int[] nums, int target) {
    return -1;
  }

  /**
   * <h2><strong>Binary Search a 2D Matrix</strong></h2>
   *
   * You are given an m x n 2-D integer array `matrix` and an integer `target`.
   *
   * Each row in `matrix` is sorted in non-decreasing order.
   * The first integer of every row is greater than the last integer of the previous row.
   * Return `true` if `target` exists within `matrix`, or `false` otherwise.
   *
   * Your solution should run in O(log(m * n)) time.
   *
   * <p><strong>Example 1:</strong></p>
   * <pre>
   * Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 10
   * Output: true
   * </pre>
   *
   * <p><strong>Example 2:</strong></p>
   * <pre>
   * Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 15
   * Output: false
   * </pre>
   *
   * <p><strong>Constraints:</strong></p>
   * <ul>
   *   <li>m == matrix.length</li>
   *   <li>n == matrix[i].length</li>
   *   <li>1 <= m, n <= 100</li>
   *   <li>-10,000 <= matrix[i][j], target <= 10,000</li>
   * </ul>
   */
  public boolean searchMatrix(int[][] matrix, int target) {
    return false;
  }

  /**
   * <h2><strong>Eating Bananas</strong></h2>
   *
   * You are given an integer array `piles` where `piles[i]` is the number of bananas in the i-th pile.
   * You are also given an integer `h`, which represents the number of hours you have to eat all the bananas.
   *
   * You may decide your bananas-per-hour eating rate of `k`. Each hour, you may choose a pile of bananas and eat `k` bananas from that pile.
   * If the pile has fewer than `k` bananas, you may finish eating the pile, but you cannot eat from another pile in the same hour.
   *
   * Return the minimum integer `k` such that you can eat all the bananas within `h` hours.
   *
   * <p><strong>Example 1:</strong></p>
   * <pre>
   * Input: piles = [1,4,3,2], h = 9
   * Output: 2
   * Explanation:
   * With an eating rate of 2, you can eat the bananas in 6 hours.
   * With an eating rate of 1, you would need 10 hours to eat all the bananas
   * (which exceeds h = 9), so the minimum eating rate is 2.
   * </pre>
   *
   * <p><strong>Example 2:</strong></p>
   * <pre>
   * Input: piles = [25,10,23,4], h = 4
   * Output: 25
   * </pre>
   *
   * <p><strong>Constraints:</strong></p>
   * <ul>
   *   <li>1 <= piles.length <= 1,000</li>
   *   <li>piles.length <= h <= 1,000,000</li>
   *   <li>1 <= piles[i] <= 1,000,000,000</li>
   * </ul>
   */
  public int minEatingSpeed(int[] piles, int h) {
    return 0;
  }

  /**
   *
   * <h2><strong>Find Minimum in Rotated Sorted Array</strong></h2>
   *
   * You are given an array of length `n` that was originally sorted in ascending order and has now been rotated
   * between 1 and `n` times. For example, the array `nums = [1,2,3,4,5,6]` might become:
   *
   * <pre>
   * [3,4,5,6,1,2] if it was rotated 4 times.
   * [1,2,3,4,5,6] if it was rotated 6 times.
   * </pre>
   *
   * Notice that rotating the array 4 times moves the last four elements of the array to the beginning. Rotating
   * the array 6 times produces the original array.
   *
   * Assuming all elements in the rotated sorted array `nums` are unique, return the minimum element of this array.
   *
   * A solution that runs in O(n) time is trivial; can you write an algorithm that runs in O(log n) time?
   *
   * <p><strong>Example 1:</strong></p>
   * <pre>
   * Input: nums = [3,4,5,6,1,2]
   * Output: 1
   * </pre>
   *
   * <p><strong>Example 2:</strong></p>
   * <pre>
   * Input: nums = [4,5,0,1,2,3]
   * Output: 0
   * </pre>
   *
   * <p><strong>Example 3:</strong></p>
   * <pre>
   * Input: nums = [4,5,6,7]
   * Output: 4
   * </pre>
   *
   * <p><strong>Constraints:</strong></p>
   * <ul>
   *   <li>1 <= nums.length <= 1000</li>
   *   <li>-1000 <= nums[i] <= 1000</li>
   * </ul>
   */
  public int findMin(int[] nums) {
    return 0;
  }

  public int searchRotated(int[] nums, int target) {
    return 0;
  }

  // Complete TimeMap in TimeMap class

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    return 0;
  }
}
