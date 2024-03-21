package two_pointers;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_ValidPalindromeTest {

  private A_ValidPalindrome undertest = new A_ValidPalindrome();

  @Test
  public void longestConsecutiveSequence_noPunctuationValidatesTrue(){
    String str = "Rotator";
    boolean actual = undertest.isPalindrome(str);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void longestConsecutiveSequence_validatesTrue(){
    String str = "A man, a plan, a canal: Panama";
    boolean actual = undertest.isPalindrome(str);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void longestConsecutiveSequence_emptyStringValidatesTrue(){
    String str = " ";
    boolean actual = undertest.isPalindrome(str);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void longestConsecutiveSequence_validatesFalse(){
    String str = "race a car";
    boolean actual = undertest.isPalindrome(str);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  public void longestConsecutiveSequence_numericsValidatesFalse(){
    String str = "0P";
    boolean actual = undertest.isPalindrome(str);
    boolean expected = false;
    assertEquals(expected, actual);
  }

}