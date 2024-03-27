package sliding_window;

public class A_BestTimeToBuyAndSellStock {

  // ORIGINAL SOLUTION
  public int maxProfit(int[] prices) {
    if (prices.length <= 1 ){
      return 0;
    }
    int maxProfit = 0;
    int minPrice = prices[0];
    int maxPrice = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < minPrice){
        maxProfit = Math.max(maxProfit, maxPrice - minPrice);
        maxPrice = 0;
        minPrice = prices[i];
      }
      if (prices[i] > maxPrice){
        maxPrice = prices[i];
      }
    }

    return Math.max(maxProfit, maxPrice - minPrice);
  }

}
