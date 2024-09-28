package arrays_and_hashing;

import static org.junit.Assert.*;

import org.junit.Test;
import practise.PractisePad;

public class A_ContainsDuplicateTest {

  private PractisePad undertest = new PractisePad();

  @Test
  public void containsDuplicate_HappyPath(){
    int[] nums = {1,2,3,1};
    boolean actual = undertest.hasDuplicate(nums);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void containsDuplicate_HappyPath2(){
    int[] nums = {1,2,3,4};
    boolean actual = undertest.hasDuplicate(nums);
    boolean expected = false;
    assertEquals(expected, actual);
  }

}