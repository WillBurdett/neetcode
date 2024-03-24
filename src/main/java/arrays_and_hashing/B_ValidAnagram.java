package arrays_and_hashing;

import java.util.Arrays;

public class B_ValidAnagram {

  // My Solution
  public static boolean isAnagram(String s, String t) {
    char[] a = s.toCharArray();
    char[] b = t.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    String aSorted = new String(a);
    String bSorted = new String(b);

    return aSorted.equals(bSorted);
  }

  // Other Solution
  public boolean isAnagram2(String s, String t) {
    int[] count = new int[26];

    // Count the frequency of characters in string s
    for (char x : s.toCharArray()) {
      count[x - 'a']++;
    }

    // Decrement the frequency of characters in string t
    for (char x : t.toCharArray()) {
      count[x - 'a']--;
    }

    // Check if any character has non-zero frequency
    for (int val : count) {
      if (val != 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {

    String s = "anagram";
    String t = "nagaram";

    System.out.println(isAnagram(s, t));
  }

}
