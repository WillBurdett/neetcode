package practise;

/**
 * <h2><strong>Time Based Key-Value Store</strong></h2></h2>
 *
 * A time-based key-value data structure that supports storing multiple values for the same key at specified timestamps,
 * as well as retrieving the most recent value for a key at a specified timestamp.
 * <p>
 * The `TimeMap` class provides methods to set values with timestamps and to get the latest value for a key at or before a specified timestamp.
 * <p>
 * <b>Note:</b> For all calls to `set`, timestamps are in strictly increasing order.
 *
 * <p><b>Example Usage:</b></p>
 * <pre>
 * TimeMap timeMap = new TimeMap();
 * timeMap.set("alice", "happy", 1);     // Stores the key "alice" with value "happy" at timestamp 1.
 * timeMap.get("alice", 1);              // Returns "happy"
 * timeMap.get("alice", 2);              // Returns "happy", as there is no value at timestamp 2, so it returns the value at timestamp 1.
 * timeMap.set("alice", "sad", 3);       // Stores the key "alice" with value "sad" at timestamp 3.
 * timeMap.get("alice", 3);              // Returns "sad"
 * </pre>
 *
 * <p><b>Constraints:</b></p>
 * <ul>
 *     <li>1 <= key.length, value.length <= 100</li>
 *     <li>key and value consist only of lowercase English letters and digits.</li>
 *     <li>1 <= timestamp <= 1000</li>
 * </ul>
 */
public class TimeMap {

  public TimeMap() {

  }

  public void set(String key, String value, int timestamp) {

  }

  public String get(String key, int timestamp) {
    return "";
  }

}
