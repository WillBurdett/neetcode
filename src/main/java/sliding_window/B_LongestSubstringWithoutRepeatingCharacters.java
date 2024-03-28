package sliding_window;

import java.util.HashSet;
import java.util.Set;

public class B_LongestSubstringWithoutRepeatingCharacters {

  public int lengthOfLongestSubstring(String s) {
    int result = 0;
    int l = 0;

    Set <Character> set = new HashSet<>();
    for (int r = 0; r < s.length(); r++) {
      while (set.contains(s.charAt(r))){
        set.remove(s.charAt(l));
        l++;
      }
      set.add(s.charAt(r));
      result = Math.max(result, set.size());
    }
    return result;
  }

}
