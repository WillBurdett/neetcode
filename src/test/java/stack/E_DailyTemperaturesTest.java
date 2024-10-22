package stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class E_DailyTemperaturesTest {

  private final E_DailyTemperatures undertest = new E_DailyTemperatures();

  @Test
  public void dailyTemperatures_happyPath1() {
    int[] input = new int[]{30,38,30,36,35,40,28};

    int[] expected = new int[]{1,4,1,2,1,0,0};
    int[] actual = undertest.dailyTemperatures(input);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void dailyTemperatures_happyPath2() {
    int[] input = new int[]{22,21,20};

    int[] expected = new int[]{0,0,0};
    int[] actual = undertest.dailyTemperatures(input);

    assertArrayEquals(expected, actual);
  }
}