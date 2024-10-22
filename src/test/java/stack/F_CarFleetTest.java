package stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class F_CarFleetTest {

  private final F_CarFleet undertest = new F_CarFleet();


  @Test
  public void carFleet_happyPath1() {
    final int target = 10;
    final int[] position = new int[]{1,4};
    final int[] speed = new int[]{3,2};

    final int expected = 1;
    final int actual = undertest.carFleet(target, position, speed);

    assertEquals(expected, actual);
  }

  @Test
  public void carFleet_happyPath2() {
    final int target = 10;
    final int[] position = new int[]{4,1,0,7};
    final int[] speed = new int[]{2,2,1,1};

    final int expected = 3;
    final int actual = undertest.carFleet(target, position, speed);

    assertEquals(expected, actual);
  }

  @Test
  public void carFleet_happyPath3() {
    final int target = 10;
    final int[] position = new int[]{6,8};
    final int[] speed = new int[]{3,2};

    final int expected = 2;
    final int actual = undertest.carFleet(target, position, speed);

    assertEquals(expected, actual);
  }
}