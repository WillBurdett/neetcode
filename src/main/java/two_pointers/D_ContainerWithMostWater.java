package two_pointers;

public class D_ContainerWithMostWater {

  // OFFICIAL SOLUTION
  public int maxAreaOfficial(int[] height) {
    int result = 0;
    int l = 0;
    int r = height.length - 1;
    while (l < r) {
      int area = (r - l) * Math.min(height[l], height[r]);
      result = Math.max(result, area);
      if (height[l] < height[r]){
        l++;
      } else {
        r--;
      }
    }
    return result;
  }

  // MY SOLUTION
  public int maxArea(int[] height) {
    int l = 0;
    int r = height.length - 1;
    int maxLeft = height[l];
    int maxRight = height[r];
    int commonHeight = maxLeft < maxRight ? maxLeft : maxRight;
    int total = commonHeight * (r - l);

    if (height[l] > height[r]){
      r--;
    } else {
      l++;
    }

    int currentScore;
    while (l < r){
      if (height[l] > maxLeft){
        maxLeft = height[l];
      } else if (height[r] > maxRight){
        maxRight = height[r];
      }
      commonHeight = maxLeft < maxRight ? maxLeft : maxRight;
      currentScore = commonHeight * (r - l);
      total = currentScore > total ? currentScore : total;

      if (height[l] > height[r]){
        r--;
      } else {
        l++;
      }
    }

    return total;
  }

}
