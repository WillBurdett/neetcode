package sliding_window;

import static org.junit.Assert.*;

import org.junit.Test;
import practise.PractisePad;

public class D_PermutationInStringTest {

  private final  D_PermutationInString undertest = new  D_PermutationInString();

  @Test
  public void checkInclusion_returnsTrue() {
    String s1 = "ab";
    String s2 = "eidbaooo";
    boolean actual = undertest.checkInclusion(s1, s2);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void checkInclusion_returnsTrue2() {
    String s1 = "adc";
    String s2 = "dcda";
    boolean actual = undertest.checkInclusion(s1, s2);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void checkInclusion_returnsFalse() {
    String s1 = "ab";
    String s2 = "eidboaoo";
    boolean actual = undertest.checkInclusion(s1, s2);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  public void checkInclusion_returnsFalse2() {
    String s1 = "hello";
    String s2 = "ooolleoooleh";
    boolean actual = undertest.checkInclusion(s1, s2);
    boolean expected = false;
    assertEquals(expected, actual);
  }
}