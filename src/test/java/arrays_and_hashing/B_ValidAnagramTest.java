package arrays_and_hashing;

import static org.junit.Assert.*;

import org.junit.Test;
import practise.PractisePad;

public class B_ValidAnagramTest {

  private PractisePad undertest = new PractisePad();

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

}