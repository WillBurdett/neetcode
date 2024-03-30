package sliding_window;

import static org.junit.Assert.*;

import org.junit.Test;

public class C_LongestRepeatingCharacterReplacementTest {

  private final C_LongestRepeatingCharacterReplacement undertest = new C_LongestRepeatingCharacterReplacement();

  @Test
  public void characterReplacement_HappyPath1() {
    String str = "ABAB";
    int k = 2;
    int actual = undertest.characterReplacement(str, k);
    int expected = 4;
    assertEquals(expected, actual);
  }

  @Test
  public void characterReplacement_HappyPath2() {
    String str = "AABABBA";
    int k = 1;
    int actual = undertest.characterReplacement(str, k);
    int expected = 4;
    assertEquals(expected, actual);
  }

  @Test
  public void characterReplacement_HappyPath3() {
    String str = "ABAA";
    int k = 0;
    int actual = undertest.characterReplacement(str, k);
    int expected = 2;
    assertEquals(expected, actual);
  }

  @Test
  public void characterReplacement_HappyPath4() {
    String str = "ABBB";
    int k = 2;
    int actual = undertest.characterReplacement(str, k);
    int expected = 4;
    assertEquals(expected, actual);
  }
}