package binary_search;

import static org.junit.Assert.*;

import binary_search.F_TimeBasedKeyValueStore.TimeMap;
import binary_search.F_TimeBasedKeyValueStore.TimeMap.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class F_TimeBasedKeyValueStoreTest {

  private TimeMap timeMap;

  @Before
  public void setup(){
    timeMap = new TimeMap();
  }

  @Test
  public void timeMap_createsEmptyMapOfCorrectTypes(){
    HashMap expected = new HashMap();
    Map<String, List<Pair<Integer, String>>> actual = timeMap.getKeystore();
    assertEquals(expected, actual);
  }

}