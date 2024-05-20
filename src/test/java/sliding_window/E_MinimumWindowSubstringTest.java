package sliding_window;

import static org.junit.Assert.*;

import org.junit.Test;

public class E_MinimumWindowSubstringTest {

  E_MinimumWindowSubstring undertest = new E_MinimumWindowSubstring();

  @Test
  public void minWindow_happyPath() {
    String s = "ADOBECODEBANC";
    String t = "ABC";
    String actual = undertest.minWindow(s, t);
    String expected = "BANC";
    assertEquals(expected, actual);
  }

  @Test
  public void minWindow_happyPath4() {
    String s = "ABCDE";
    String t = "ABCD";
    String actual = undertest.minWindow(s, t);
    String expected = "ABCD";
    assertEquals(expected, actual);
  }

  @Test
  public void minWindow_happyPath5() {
    String s = "aa";
    String t = "aa";
    String actual = undertest.minWindow(s, t);
    String expected = "aa";
    assertEquals(expected, actual);
  }

  @Test
  public void minWindow_happyPath2() {
    String s = "a";
    String t = "a";
    String actual = undertest.minWindow(s, t);
    String expected = "a";
    assertEquals(expected, actual);
  }

  @Test
  public void minWindow_happyPath3() {
    String s = "a";
    String t = "aa";
    String actual = undertest.minWindow(s, t);
    String expected = "";
    assertEquals(expected, actual);
  }
}