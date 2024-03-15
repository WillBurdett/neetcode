package main.java.arrays_and_hashing;

import java.util.HashMap;

public class E_TopKFrequentElements {

  public static int[] topKFrequent(int[] nums, int k) {
    // element : number of occurrences
    // e.g. 1 : 3
    HashMap<Integer, Integer> map = new HashMap<>();
    for (Integer i:
    nums) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }

    // 'Bucket Sort'
    // Notes:
    // - The index is the number of occurrences e.g. 3
    // - The value is the key e.g. 1
    Integer[] frequency = new Integer[nums.length + 1];
    for (Integer i:
        map.keySet()) {
      // e.g. at index 3 (the count), put a 1 (my element from the original list)
      frequency[map.get(i)] = i;
    }

    int[] result = new int[k];
    int index = 0;
    for (int i = frequency.length-1; i >= 0 && index < k; i--) {
      if (frequency[i] == null){
        continue;
      }
      result[index] = frequency[i];
      index++;
    }

    return result;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{1,1,1,2,2,3};
    int k = 2;
   topKFrequent(arr, k);
  }

}
