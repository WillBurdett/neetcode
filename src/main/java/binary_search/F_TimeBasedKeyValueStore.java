package binary_search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class F_TimeBasedKeyValueStore {

  static class TimeMap {

    // A map to store each key with a list of timestamped values.
    // Each key maps to a list of pairs, where each pair contains a timestamp and a value.
    private Map<String, List<Pair<Integer, String>>> keyStore;

    // Constructor initializes the keyStore map.
    public TimeMap() {
      keyStore = new HashMap<>();
    }

    // method added for testing only
    public Map<String, List<Pair<Integer, String>>> getKeystore(){
      return keyStore;
    }

    // Adds a new (timestamp, value) pair for a given key.
    public void set(String key, String value, int timestamp) {
      // If the key does not exist, initialize it with an empty list.
      // Then, add the new (timestamp, value) pair to the list.
      keyStore.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair<>(timestamp, value));
    }

    // Retrieves the latest value associated with the given key at or before the specified timestamp.
    public String get(String key, int timestamp) {
      // Get the list of timestamped values for the key, or an empty list if the key does not exist.
      List<Pair<Integer, String>> values = keyStore.getOrDefault(key, new ArrayList<>());

      // Initialize pointers for binary search
      int left = 0, right = values.size() - 1;

      // Variable to store the latest valid result found within the timestamp limit
      String result = "";

      // Binary search to find the latest value at or before the given timestamp
      while (left <= right) {
        int mid = left + (right - left) / 2;

        // If the mid timestamp is less than or equal to the target timestamp
        if (values.get(mid).getKey() <= timestamp) {
          // Update result to the value at mid, as it's valid within the timestamp range
          result = values.get(mid).getValue();

          // Move left pointer to mid + 1 to search for potentially later valid timestamps
          left = mid + 1;
        } else {
          // If the mid timestamp is too recent, narrow the search to the left half
          right = mid - 1;
        }
      }

      // Return the latest valid value found, or an empty string if none was found
      return result;
    }

    // Inner class to store a pair of values (key and value).
    public static class Pair<K, V> {
      private final K key;  // The timestamp
      private final V value;  // The value associated with the timestamp

      // Constructor to initialize the key and value of the pair.
      public Pair(K key, V value) {
        this.key = key;
        this.value = value;
      }

      // Getter for the key (timestamp)
      public K getKey() {
        return key;
      }

      // Getter for the value associated with the timestamp
      public V getValue() {
        return value;
      }
    }
  }

}
