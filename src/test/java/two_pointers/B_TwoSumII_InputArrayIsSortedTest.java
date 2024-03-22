package two_pointers;

import static org.junit.Assert.*;

import org.junit.Test;

public class B_TwoSumII_InputArrayIsSortedTest {

  private final B_TwoSumII_InputArrayIsSorted undertest = new B_TwoSumII_InputArrayIsSorted();

  @Test
  public void twoSumII_happyPath1(){
    int[] input = {2,7,11,15};
    int target = 9;
    int[] actual = undertest.twoSum(input, target);
    int[] expected = {1, 2};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void twoSumII_happyPath2(){
    int[] input = {2,3,4};
    int target = 6;
    int[] actual = undertest.twoSum(input, target);
    int[] expected = {1, 3};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void twoSumII_happyPath3(){
    int[] input = {-1,0};
    int target = -1;
    int[] actual = undertest.twoSum(input, target);
    int[] expected = {1,2};
    assertArrayEquals(expected, actual);
  }

}