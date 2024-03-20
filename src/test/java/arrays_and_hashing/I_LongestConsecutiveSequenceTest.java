package arrays_and_hashing;

import static org.junit.Assert.*;

import org.junit.Test;

public class I_LongestConsecutiveSequenceTest {

  private I_LongestConsecutiveSequence undertest = new I_LongestConsecutiveSequence();

  @Test
  public void longestConsecutiveSequence_HappyPath(){
    int[] nums = {100,4,200,1,3,2};
    int actual = undertest.longestConsecutive(nums);
    int expected = 4;
    assertEquals(expected, actual);
  }

  @Test
  public void longestConsecutiveSequence_startsWithZeros(){
    int[] nums = {0,3,7,2,5,8,4,6,0,1};
    int actual = undertest.longestConsecutive(nums);
    int expected = 9;
    assertEquals(expected, actual);
  }

  @Test
  public void longestConsecutiveSequence_emptyArray(){
    int[] nums = {};
    int actual = undertest.longestConsecutive(nums);
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  public void longestConsecutiveSequence_middleNumberDuplicate(){
    int[] nums = {1,2,0,1};
    int actual = undertest.longestConsecutive(nums);
    int expected = 3;
    assertEquals(expected, actual);
  }

  @Test
  public void longestConsecutiveSequenceOfficial_HappyPath(){
    int[] nums = {100,4,200,1,3,2};
    int actual = undertest.longestConsecutiveOfficial(nums);
    int expected = 4;
    assertEquals(expected, actual);
  }

  @Test
  public void longestConsecutiveSequenceOfficial_startsWithZeros(){
    int[] nums = {0,3,7,2,5,8,4,6,0,1};
    int actual = undertest.longestConsecutiveOfficial(nums);
    int expected = 9;
    assertEquals(expected, actual);
  }

  @Test
  public void longestConsecutiveSequenceOfficial_emptyArray(){
    int[] nums = {};
    int actual = undertest.longestConsecutiveOfficial(nums);
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  public void longestConsecutiveSequenceOfficial_middleNumberDuplicate(){
    int[] nums = {1,2,0,1};
    int actual = undertest.longestConsecutiveOfficial(nums);
    int expected = 3;
    assertEquals(expected, actual);
  }

}