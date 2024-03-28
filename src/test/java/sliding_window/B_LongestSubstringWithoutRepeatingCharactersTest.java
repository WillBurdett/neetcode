package sliding_window;

import static org.junit.Assert.*;

import org.junit.Test;

public class B_LongestSubstringWithoutRepeatingCharactersTest {

  private final B_LongestSubstringWithoutRepeatingCharacters undertest =
      new B_LongestSubstringWithoutRepeatingCharacters();

  @Test
  public void lengthOfLongestSubstring_HappyPath1() {
    String input = "abcabcbb";
    int actual = undertest.lengthOfLongestSubstring(input);
    int expected = 3;
    assertEquals(expected, actual);
  }

  @Test
  public void lengthOfLongestSubstring_HappyPath2() {
    String input = "pwwkew";
    int actual = undertest.lengthOfLongestSubstring(input);
    int expected = 3;
    assertEquals(expected, actual);
  }

  @Test
  public void lengthOfLongestSubstring_handlesAllSameLetter() {
    String input = "bbbbb";
    int actual = undertest.lengthOfLongestSubstring(input);
    int expected = 1;
    assertEquals(expected, actual);
  }

  @Test
  public void lengthOfLongestSubstring_handlesFourLetters() {
    String input = "dvdf";
    int actual = undertest.lengthOfLongestSubstring(input);
    int expected = 3;
    assertEquals(expected, actual);
  }

  @Test
  public void lengthOfLongestSubstring_handlesSingleSpace() {
    String input = " ";
    int actual = undertest.lengthOfLongestSubstring(input);
    int expected = 1;
    assertEquals(expected, actual);
  }

}