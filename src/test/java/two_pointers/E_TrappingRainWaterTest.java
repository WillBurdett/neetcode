package two_pointers;

import static org.junit.Assert.*;

import org.junit.Test;

public class E_TrappingRainWaterTest {

  private E_TrappingRainWater undertest = new E_TrappingRainWater();

  @Test
  public void trap_HappyPath(){
    int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
    int actual = undertest.trap(input);
    int expected = 6;
    assertEquals(expected, actual);
  }

  @Test
  public void trap_HappyPath2(){
    int[] input = {4,2,0,3,2,5};
    int actual = undertest.trap(input);
    int expected = 9;
    assertEquals(expected, actual);
  }

  @Test
  public void trap_HappyPath3(){
    int[] input = {4,2,3};
    int actual = undertest.trap(input);
    int expected = 1;
    assertEquals(expected, actual);
  }


}