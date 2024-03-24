package two_pointers;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;

public class C_3SumTest {

  private final C_3Sum undertest = new C_3Sum();

  @Test
  public void threeSum_happyPath1(){
    int[] input = {-1,0,1,2,-1,-4};
    List<List<Integer>> actual = undertest.threeSum(input);
    List<List<Integer>> expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
    assertEquals(expected, actual);
  }

  @Test
  public void threeSum_happyPath2(){
    int[] input = {0,1,1};
    List<List<Integer>> actual = undertest.threeSum(input);
    List<List<Integer>> expected = List.of();
    assertEquals(expected, actual);
  }

  @Test
  public void threeSum_happyPath3(){
    int[] input = {0,0,0};
    List<List<Integer>> actual = undertest.threeSum(input);
    List<List<Integer>> expected = List.of(List.of(0,0,0));
    assertEquals(expected, actual);
  }


}