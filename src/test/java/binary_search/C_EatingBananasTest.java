package binary_search;

import static org.junit.Assert.*;

import org.junit.Test;
import practise.PractisePad;

public class C_EatingBananasTest {

  private final PractisePad undertest = new PractisePad();

  @Test
  public void minEatingSpeed_happyPath1() {
    final int hours = 9;
    final int[] piles = new int[]{1,4,3,2};

    final int expected = 2;
    final int actual = undertest.minEatingSpeed(piles, hours);

    assertEquals(expected, actual);
  }

  @Test
  public void minEatingSpeed_happyPath2() {
    final int hours = 4;
    final int[] piles = new int[]{25,10,23,4};

    final int expected = 25;
    final int actual = undertest.minEatingSpeed(piles, hours);

    assertEquals(expected, actual);
  }
}