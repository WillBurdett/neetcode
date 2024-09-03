package arrays_and_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class D_GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    // sorted string : list of anagrams
    HashMap<String, List<String>> result = new HashMap<>();

    for (String s:
    strs) {

      char[] a = s.toCharArray();
      Arrays.sort(a);
      String aSorted = new String(a);

        List<String> list = result.getOrDefault(aSorted, new ArrayList<>());
        list.add(s);
        result.put(aSorted, list);
    }
    return new ArrayList<>(result.values());
  }

}
