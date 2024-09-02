package arrays_and_hashing;

import static org.junit.Assert.*;

import org.junit.Test;

public class C_TwoSumTest {

  private C_TwoSum undertest = new C_TwoSum();

  @Test
  public void twoSum_happyPath1(){
    int[] input = {3,4,5,6};
    int target = 7;

    int[] expected = {0, 1};
    int[] actual = undertest.twoSum(input, target);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void twoSum_happyPath2(){
    int[] input = {4,5,6};
    int target = 10;

    int[] expected = {0, 2};
    int[] actual = undertest.twoSum(input, target);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void twoSum_happyPath3(){
    int[] input = {5,5};
    int target = 10;

    int[] expected = {0, 1};
    int[] actual = undertest.twoSum(input, target);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void twoSum2_happyPath1(){
    int[] input = {3,4,5,6};
    int target = 7;

    int[] expected = {0, 1};
    int[] actual = undertest.twoSum2(input, target);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void twoSum2_happyPath2(){
    int[] input = {4,5,6};
    int target = 10;

    int[] expected = {0, 2};
    int[] actual = undertest.twoSum2(input, target);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void twoSum2_happyPath3(){
    int[] input = {5,5};
    int target = 10;

    int[] expected = {0, 1};
    int[] actual = undertest.twoSum2(input, target);
    assertArrayEquals(expected, actual);
  }

}