package arrays_and_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class E_TopKFrequentElements {

  public int[] topKFrequent(int[] nums, int k) {
    // Step 1: Count the frequency of each element
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }

    // Step 2: Create a list of buckets where index is frequency
    List<List<Integer>> bucket = new ArrayList<>();
    for (int i = 0; i <= nums.length; i++) {
      bucket.add(new ArrayList<>());
    }

    // Step 3: Fill the bucket with numbers based on their frequencies
    for (Integer j : map.keySet()) {
      bucket.get(map.get(j)).add(j);
    }

    // Step 4: Collect the top k frequent elements
    int[] res = new int[k];
    int elementsAdded = 0;

    for (int i = bucket.size() - 1; i >= 0 && elementsAdded < k; i--) {
      if (!bucket.get(i).isEmpty()) {
        for (int num : bucket.get(i)) {
          if (elementsAdded < k) {
            res[elementsAdded] = num;
            elementsAdded++;
          } else {
            break;
          }
        }
      }
    }

    return res;
  }

}
