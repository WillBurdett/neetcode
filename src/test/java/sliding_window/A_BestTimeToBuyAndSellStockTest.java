package sliding_window;

import static org.junit.Assert.*;

import org.junit.Test;
import practise.PractisePad;

public class A_BestTimeToBuyAndSellStockTest {

  private final PractisePad undertest = new PractisePad();

  @Test
  public void maxProfit_ReturnsMaximumProfit() {
    int[] input = {7,1,5,3,6,4};
    int actual = undertest.maxProfit(input);
    int expected = 5;
    assertEquals(expected, actual);
  }

  @Test
  public void maxProfit_ReturnsZeroIfNoProfitPossible() {
    int[] input = {7,6,4,3,1};
    int actual = undertest.maxProfit(input);
    int expected = 0;
    assertEquals(expected, actual);
  }


}