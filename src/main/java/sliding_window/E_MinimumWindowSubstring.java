package sliding_window;

import java.util.HashMap;

public class E_MinimumWindowSubstring {

  public String minWindow(String s, String t) {
    if (t.length() > s.length()) {
      return "";
    }

    HashMap <Character, Integer> tMap = new HashMap<>();
    HashMap <Character, Integer> sMap = new HashMap<>();

    for (int i = 0; i < t.length(); i++) {
      int tCount = tMap.getOrDefault(t.charAt(i), 0);
      tCount++;
      tMap.put(t.charAt(i), tCount);
    }

    int have = 0;
    int need = tMap.size();

    int[] res = {-1, -1};
    int resLen = s.length() + 1;

    int l = 0;
    for (int r = 0; r < s.length(); r++) {

      char c = s.charAt(r);

      int sCount = sMap.getOrDefault(c, 0);
      sCount++;
      sMap.put(c, sCount);

      if (tMap.containsKey(c) && tMap.get(c) == sMap.get(c)) {
        have++;
      }

      while (have == need) {
        if (r - l + 1 < resLen) {
          res[0] = l;
          res[1] = r;
          resLen = (r - l + 1);
        }

        sCount = sMap.getOrDefault(s.charAt(l), 1);
        sCount--;
        sMap.put(s.charAt(l), sCount);

        if (tMap.containsKey(s.charAt(l)) && sMap.get(s.charAt(l)) < tMap.get(s.charAt(l))) {
          have--;
        }

        l++;
      }
    }

      return resLen != s.length() + 1 ? s.substring(res[0], res[1] + 1) : "";
    }

}
