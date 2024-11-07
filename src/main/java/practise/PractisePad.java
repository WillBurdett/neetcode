package practise;

public class PractisePad {

  /**
   * <h2><strong>Buy and Sell Stock</strong></h2>
   *
   * Calculates the maximum profit from a single buy-sell transaction of NeetCoin.
   *
   * <p>Given an integer array {@code prices} where {@code prices[i]} is the price of NeetCoin on the {@code i}-th day,
   * this method returns the maximum profit achievable from a single buy-sell transaction. The transaction
   * must involve buying on one day and selling on a later day. If no profit is possible, the method returns 0.
   *
   * <p>Examples:
   * <pre>
   * Example 1:
   * Input: prices = [10,1,5,6,7,1]
   * Output: 6
   * Explanation: Buy on day 1 at price 1 and sell on day 4 at price 7, for a profit of 6 (7 - 1).
   *
   * Example 2:
   * Input: prices = [10,8,7,5,2]
   * Output: 0
   * Explanation: No profitable transactions can be made, thus the max profit is 0.
   * </pre>
   *
   * <p>Constraints:
   * <ul>
   *   <li>{@code 1 <= prices.length <= 100}</li>
   *   <li>{@code 0 <= prices[i] <= 100}</li>
   * </ul>
   */
  public int maxProfit(int[] prices) {
    return 0;
  }

  /**
   * <h2><strong>Longest Substring Without Duplicates</strong></h2>
   *
   * Finds the length of the longest substring without duplicate characters in a given string.
   *
   * <p>Given a string {@code s}, this method calculates the length of the longest substring
   * that contains only unique characters. A substring is defined as a contiguous sequence
   * of characters within the string.
   *
   * <p>Examples:
   * <pre>
   * Example 1:
   * Input: s = "zxyzxyz"
   * Output: 3
   * Explanation: The substring "xyz" is the longest without duplicate characters.
   *
   * Example 2:
   * Input: s = "xxxx"
   * Output: 1
   * </pre>
   *
   * <p>Constraints:
   * <ul>
   *   <li>{@code 0 <= s.length <= 1000}</li>
   *   <li>{@code s} may consist of any printable ASCII characters.</li>
   * </ul>
   */
  public int lengthOfLongestSubstring(String s) {
    return 0;
  }


  /**
   * <h2><strong>Longest Repeating Substring With Replacement</strong></h2>
   *
   * Returns the length of the longest substring with only one distinct character after at most {@code k} replacements.
   *
   * <p>Given a string {@code s} consisting of only uppercase English characters and an integer {@code k},
   * this method calculates the length of the longest substring that can be achieved by replacing up to {@code k} characters
   * in the string. The resulting substring must contain only one distinct character.
   *
   * <p>Examples:
   * <pre>
   * Example 1:
   * Input: s = "XYYX", k = 2
   * Output: 4
   * Explanation: Replace either all 'X's with 'Y's or all 'Y's with 'X's to get a uniform substring of length 4.
   *
   * Example 2:
   * Input: s = "AAABABB", k = 1
   * Output: 5
   * </pre>
   *
   * <p>Constraints:
   * <ul>
   *   <li>{@code 1 <= s.length <= 1000}</li>
   *   <li>{@code 0 <= k <= s.length}</li>
   * </ul>
   */
  public int characterReplacement(String s, int k) {
    return 0;
  }

  /**
   * <h2><strong>Permutation String</strong></h2>
   *
   * Checks if {@code s2} contains a permutation of {@code s1}.
   *
   * <p>Given two strings {@code s1} and {@code s2}, this method returns {@code true} if any permutation of
   * {@code s1} exists as a substring of {@code s2}. Otherwise, it returns {@code false}. Both strings contain
   * only lowercase English letters.
   *
   * <p>Examples:
   * <pre>
   * Example 1:
   * Input: s1 = "abc", s2 = "lecabee"
   * Output: true
   * Explanation: The substring "cab" is a permutation of "abc" and is present in "lecabee".
   *
   * Example 2:
   * Input: s1 = "abc", s2 = "lecaabee"
   * Output: false
   * </pre>
   *
   * <p>Constraints:
   * <ul>
   *   <li>{@code 1 <= s1.length, s2.length <= 1000}</li>
   * </ul>
   */
  public boolean checkInclusion(String s1, String s2) {
    return false;
  }

  /**
   * <h2><strong>Minimum Window With Characters</strong></h2>
   *
   * Finds the shortest substring in {@code s} that contains all characters of {@code t}, including duplicates.
   *
   * <p>Given two strings {@code s} and {@code t}, this method returns the shortest substring of {@code s}
   * such that every character in {@code t} is present in the substring, including duplicates.
   * If no such substring exists, an empty string is returned.
   *
   * <p>It is assumed that the correct output is always unique.
   *
   * <p>Examples:
   * <pre>
   * Example 1:
   * Input: s = "OUZODYXAZV", t = "XYZ"
   * Output: "YXAZ"
   * Explanation: "YXAZ" is the shortest substring that includes "X", "Y", and "Z" from string t.
   *
   * Example 2:
   * Input: s = "xyz", t = "xyz"
   * Output: "xyz"
   *
   * Example 3:
   * Input: s = "x", t = "xy"
   * Output: ""
   * </pre>
   *
   * <p>Constraints:
   * <ul>
   *   <li>{@code 1 <= s.length <= 1000}</li>
   *   <li>{@code 1 <= t.length <= 1000}</li>
   *   <li>{@code s} and {@code t} consist of uppercase and lowercase English letters.</li>
   * </ul>
   */
  public String minWindow(String s, String t) {
    return "";
  }

  /**
   * <h2><strong>Sliding Window Maximum</strong></h2>
   *
   * Finds the maximum element in each sliding window of size {@code k} across the array {@code nums}.
   *
   * <p>Given an integer array {@code nums} and an integer {@code k}, this method returns a list of the
   * maximum elements for each window of size {@code k} as it slides from the left to the right edge of the array.
   * At each step, the window moves one position to the right.
   *
   * <p>Examples:
   * <pre>
   * Example 1:
   * Input: nums = [1, 2, 1, 0, 4, 2, 6], k = 3
   * Output: [2, 2, 4, 4, 6]
   *
   * Explanation:
   * Window position            Max
   * ---------------           -----
   * [1  2  1] 0  4  2  6        2
   *  1 [2  1  0] 4  2  6        2
   *  1  2 [1  0  4] 2  6        4
   *  1  2  1 [0  4  2] 6        4
   *  1  2  1  0 [4  2  6]       6
   * </pre>
   *
   * <p>Constraints:
   * <ul>
   *   <li>{@code 1 <= nums.length <= 1000}</li>
   *   <li>{@code -1000 <= nums[i] <= 1000}</li>
   *   <li>{@code 1 <= k <= nums.length}</li>
   * </ul>
   */
  public int[] maxSlidingWindow(int[] nums, int k) {
    return new int[]{};
  }
}
