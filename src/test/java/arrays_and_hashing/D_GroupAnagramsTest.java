package arrays_and_hashing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;
import practise.PractisePad;

public class D_GroupAnagramsTest {

  private PractisePad undertest = new PractisePad();

  @Test
  public void groupAnagrams_happyPath1(){
    String[] input = {"act","pots","tops","cat","stop","hat"};
    List<List<String>> expected = List.of(
        List.of("hat"),
        List.of("act", "cat"),
        List.of("stop", "pots", "tops")
    );
    List<List<String>> actual = undertest.groupAnagrams(input);
    // Convert each sublist in 'expected' to a mutable list and sort them
    List<List<String>> sortedExpected = new ArrayList<>();
    for (List<String> list : expected) {
      List<String> mutableList = new ArrayList<>(list);
      Collections.sort(mutableList);
      sortedExpected.add(mutableList);
    }

    // Sort each sublist in 'actual'
    List<List<String>> sortedActual = new ArrayList<>();
    for (List<String> list : actual) {
      Collections.sort(list);
      sortedActual.add(list);
    }

    // Sort the outer lists
    sortedExpected.sort(Comparator.comparing(Object::toString));
    sortedActual.sort(Comparator.comparing(Object::toString));

    // Compare the two lists
    assertEquals(sortedExpected, sortedActual);
  }

  @Test
  public void groupAnagrams_happyPath2(){
    String[] input = {"x"};
    List<List<String>> expected = List.of(List.of("x"));
    List<List<String>> actual = undertest.groupAnagrams(input);
    assertTrue(expected.containsAll(actual));
  }

  @Test
  public void groupAnagrams_happyPath3(){
    String[] input = {""};
    List<List<String>> expected = List.of(List.of(""));
    List<List<String>> actual = undertest.groupAnagrams(input);
    assertTrue(expected.containsAll(actual));
  }

}