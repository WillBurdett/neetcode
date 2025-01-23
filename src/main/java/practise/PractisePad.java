package practise;

import java.util.ArrayList;
import java.util.List;

public class PractisePad {

  /**
   * <h2><strong>Valid Palindrome</strong></h2>
   *
   * Determines if a given string is a palindrome.
   *
   * <p>Given a string {@code s}, this method returns {@code true} if it is a palindrome and {@code false} otherwise.
   * A palindrome is defined as a string that reads the same forward and backward, ignoring case and
   * all non-alphanumeric characters.
   *
   * <p>Examples:
   * <pre>
   * Example 1:
   * Input: s = "Was it a car or a cat I saw?"
   * Output: true
   * Explanation: After considering only alphanumeric characters, we have "wasitacaroracatisaw",
   * which is a palindrome.
   *
   * Example 2:
   * Input: s = "tab a cat"
   * Output: false
   * Explanation: "tabacat" is not a palindrome.
   * </pre>
   *
   * <p>Constraints:
   * <ul>
   *   <li>{@code 1 <= s.length <= 1000}</li>
   *   <li>{@code s} consists of only printable ASCII characters.</li>
   * </ul>
   */
  public boolean isPalindrome(String s) {
    return false;
  }

  /**
   * <h2><strong>Two Integer Sum II</strong></h2>
   *
   * Finds the indices of two numbers in a sorted array that add up to a given target.
   *
   * <p>Given a sorted array of integers {@code numbers} in non-decreasing order, this method
   * returns the indices {@code [index1, index2]} (1-indexed) of two numbers such that their sum
   * equals the given {@code target}. The indices must satisfy {@code index1 < index2}, and the
   * same element cannot be used twice.
   *
   * <p>The solution must use {@code O(1)} additional space.
   *
   * <p>Examples:
   * <pre>
   * Example 1:
   * Input: numbers = [1, 2, 3, 4], target = 3
   * Output: [1, 2]
   * Explanation: The sum of 1 and 2 is 3. Since the array is 1-indexed, we return [1, 2].
   * </pre>
   *
   * <p>Constraints:
   * <ul>
   *   <li>{@code 2 <= numbers.length <= 1000}</li>
   *   <li>{@code -1000 <= numbers[i] <= 1000}</li>
   *   <li>{@code -1000 <= target <= 1000}</li>
   *   <li>There will always be exactly one valid solution.</li>
   * </ul>
   */
  public int[] twoSum(int[] numbers, int target) {
    return new int[]{};
  }

  /**
   * <h2><strong>3Sum</strong></h2>
   *
   * Finds all unique triplets in an array that sum up to zero.
   *
   * <p>Given an array of integers {@code nums}, this method returns all unique triplets
   * {@code [nums[i], nums[j], nums[k]]} such that {@code nums[i] + nums[j] + nums[k] == 0},
   * with the condition that the indices {@code i}, {@code j}, and {@code k} are distinct.
   * The output does not contain any duplicate triplets, and the triplets can be returned
   * in any order.
   *
   * <p>Examples:
   * <pre>
   * Example 1:
   * Input: nums = [-1, 0, 1, 2, -1, -4]
   * Output: [[-1, -1, 2], [-1, 0, 1]]
   * Explanation:
   * - nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
   * - nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
   * - nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
   * Distinct triplets are [-1, -1, 2] and [-1, 0, 1].
   *
   * Example 2:
   * Input: nums = [0, 1, 1]
   * Output: []
   * Explanation: The only possible triplet does not sum up to 0.
   *
   * Example 3:
   * Input: nums = [0, 0, 0]
   * Output: [[0, 0, 0]]
   * Explanation: The only possible triplet sums up to 0.
   * </pre>
   *
   * <p>Constraints:
   * <ul>
   *   <li>{@code 3 <= nums.length <= 1000}</li>
   *   <li>{@code -10^5 <= nums[i] <= 10^5}</li>
   * </ul>
   */
  public List<List<Integer>> threeSum(int[] nums) {
    return new ArrayList<>();
  }

  /**
   * <h2><strong>Container With Most Water</strong></h2>
   *
   * Finds the maximum amount of water a container can store given an array of heights.
   *
   * <p>Given an array of integers {@code height} where {@code height[i]} represents the height
   * of the {@code i}-th bar, this method determines the maximum area of water a container can
   * store. The container is formed by choosing two bars, and its width is the distance between
   * the bars.
   *
   * <p>Examples:
   * <pre>
   * Example 1:
   * Input: height = [1, 7, 2, 5, 4, 7, 3, 6]
   * Output: 36
   * Explanation: The maximum container is formed by the bars at indices 1 and 7, with height 7
   * and width 6, resulting in an area of 7 * 6 = 36.
   *
   * Example 2:
   * Input: height = [2, 2, 2]
   * Output: 4
   * Explanation: The container is formed by the first and last bars, with height 2 and width 2,
   * resulting in an area of 2 * 2 = 4.
   * </pre>
   *
   * <p>Constraints:
   * <ul>
   *   <li>{@code 2 <= height.length <= 1000}</li>
   *   <li>{@code 0 <= height[i] <= 1000}</li>
   * </ul>
   */
  public int maxArea(int[] heights) {
    return 0;
  }

  /**
   * <h2><strong>Trapping Rain Water</strong></h2>
   *
   * Calculates the maximum amount of water that can be trapped between bars in an elevation map.
   *
   * <p>Given an array of non-negative integers {@code height}, where each value {@code height[i]}
   * represents the height of a bar (with a width of 1), this method returns the maximum amount of
   * water that can be trapped between the bars.
   *
   * <p>Examples:
   * <pre>
   * Example 1:
   * Input: height = [0, 2, 0, 3, 1, 0, 1, 3, 2, 1]
   * Output: 9
   * Explanation: The maximum water is trapped between the bars at indices 1 through 7.
   * </pre>
   *
   * <p>Constraints:
   * <ul>
   *   <li>{@code 1 <= height.length <= 1000}</li>
   *   <li>{@code 0 <= height[i] <= 1000}</li>
   * </ul>
   */
  public int trap(int[] height) {
    return 0;
  }

}
