package arrays_and_hashing;

import static org.junit.Assert.*;

import org.junit.Test;

public class B_ValidAnagramTest {

  private B_ValidAnagram undertest = new B_ValidAnagram();

  @Test
  public void isAnagram_true(){
    String s ="racecar";
    String t = "carrace";

    boolean actual = undertest.isAnagram(s, t);
    assertTrue(actual);
  }

  @Test
  public void isAnagram_false(){
    String s ="jar";
    String t = "jam";

    boolean actual = undertest.isAnagram(s, t);
    assertFalse(actual);
  }

  @Test
  public void isAnagram2_true(){
    String s ="racecar";
    String t = "carrace";

    boolean actual = undertest.isAnagram2(s, t);
    assertTrue(actual);
  }

  @Test
  public void isAnagram2_false(){
    String s ="jar";
    String t = "jam";

    boolean actual = undertest.isAnagram2(s, t);
    assertFalse(actual);
  }

}