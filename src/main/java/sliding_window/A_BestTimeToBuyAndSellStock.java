package sliding_window;

public class A_BestTimeToBuyAndSellStock {

  // OFFICIAL SOLUTION
  public int maxProfitOfficial(int[] prices) {
    int l = 0;
    int r = 1;
    int maxProfit = 0;

    while (r < prices.length){
      if (prices[l] < prices[r]) {
        int profit = prices[r] - prices[l];
        maxProfit = profit > maxProfit ? profit : maxProfit;
      } else {
        l = r;
      }
      r++;
    }

    return maxProfit;
  }

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
