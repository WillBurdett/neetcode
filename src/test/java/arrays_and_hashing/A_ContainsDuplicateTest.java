package arrays_and_hashing;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_ContainsDuplicateTest {

  private A_ContainsDuplicate undertest = new A_ContainsDuplicate();

  @Test
  public void containsDuplicate_HappyPath(){
    int[] nums = {1,2,3,1};
    boolean actual = undertest.containsDuplicate(nums);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void containsDuplicate_HappyPath2(){
    int[] nums = {1,2,3,4};
    boolean actual = undertest.containsDuplicate(nums);
    boolean expected = false;
    assertEquals(expected, actual);
  }

}