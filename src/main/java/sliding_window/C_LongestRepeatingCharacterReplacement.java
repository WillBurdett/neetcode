package sliding_window;

import java.util.HashMap;

public class C_LongestRepeatingCharacterReplacement {


  // OFFICIAL SOLUTION
  public int characterReplacement(String s, int k) {
    HashMap <Character, Integer> count = new HashMap<>();
    int res = 0;

    int l = 0;
    int maxFreq = 0;

    for (int r = 0; r < s.length(); r++) {
      int num = count.getOrDefault(s.charAt(r), 0);
      num++;
      count.put(s.charAt(r), num);

      maxFreq = Math.max(maxFreq, count.get(s.charAt(r)));

      while ((r - l + 1) - maxFreq > k){
        num = count.getOrDefault(s.charAt(l), 1);
        num--;
        count.put(s.charAt(l), num);
        l++;
      }

      res = Math.max(res, r - l + 1);
    }
    return res;
  }

  // UNOFFICIAL BUT FASTER SOLUTION
  public int characterReplacementUnofficial(String s, int k) {
    int[] freq = new int[26];
    int mostFreqLetter = 0;
    int left = 0;
    int max = 0;

    for(int right = 0; right < s.length(); right++){
      freq[s.charAt(right) - 'A']++;
      mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(right) - 'A']);

      int lettersToChange = (right - left + 1) - mostFreqLetter;
      if(lettersToChange > k){
        freq[s.charAt(left) - 'A']--;
        left++;
      }

      max = Math.max(max, right - left + 1);
    }

    return max;
  }

}
