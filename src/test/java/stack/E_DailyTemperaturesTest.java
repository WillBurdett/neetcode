package stack;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;
import practise.PractisePad;

public class E_DailyTemperaturesTest {

  PractisePad undertest = new PractisePad();

  @Test
  public void dailyTemperatures_happyPath() {
    int[] input = new int[]{30,38,30,36,35,40,28};

    int[] expected = new int[]{1,4,1,2,1,0,0};
    int[] actual = undertest.dailyTemperatures(input);

    assertArrayEquals(expected, actual);
  }
}