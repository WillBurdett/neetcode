package two_pointers;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;
import practise.PractisePad;
import utils.Utils;

public class A_ValidPalindromeTest {

  private PractisePad undertest = new PractisePad();

  @Test
  public void isPalindrome_noPunctuationValidatesTrue(){
    String str = "Rotator";
    boolean actual = undertest.isPalindrome(str);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void isPalindrome_validatesTrue(){
    String str = "A man, a plan, a canal: Panama";
    boolean actual = undertest.isPalindrome(str);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void isPalindrome_emptyStringValidatesTrue(){
    String str = " ";
    boolean actual = undertest.isPalindrome(str);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void isPalindrome_validatesFalse(){
    String str = "race a car";
    boolean actual = undertest.isPalindrome(str);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  public void isPalindrome_numericsValidatesFalse(){
    String str = "0P";
    boolean actual = undertest.isPalindrome(str);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  public void isPalindrome_handlesVeryLongPalindrome() throws IOException {
    String str = Utils.inputToString("src/main/resources/inputs/palindrome.txt");
    boolean actual = undertest.isPalindrome(str);
    boolean expected = true;
    assertEquals(expected, actual);
  }

}