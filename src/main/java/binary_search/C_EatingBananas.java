package binary_search;

import java.util.Arrays;

public class C_EatingBananas {

  public int minEatingSpeed(int[] piles, int h) {
    // l represents the minimum possible eating speed (1 banana per hour)
    int l = 1;

    // r represents the maximum possible eating speed, which is the largest pile of bananas
    // Find the maximum number in piles array (the largest pile size)
    int r = Arrays.stream(piles).max().getAsInt();

    // Initialize res to the maximum possible eating speed
    // res will store the minimum eating speed found
    int res = r;

    // Binary search to find the minimum speed
    while (l <= r) {
      // Calculate the middle point (average speed) of the current speed range [l, r]
      int k = (l + r) / 2;

      // Calculate the total time taken to eat all piles at speed k
      int totalTime = 0;
      for (int p : piles) {
        // Each pile p takes Math.ceil(p / k) hours to finish at speed k
        // (i.e., divide pile size by speed and round up to the nearest hour)
        totalTime += Math.ceil((double) p / k);
      }

      // If the total time is within or equal to the given number of hours h
      if (totalTime <= h) {
        // This speed is a candidate for the minimum, so update res
        res = k;
        // Try to find a smaller eating speed by searching in the left half
        r = k - 1;
      } else {
        // If total time exceeds h, speed k is too slow, so search the right half
        l = k + 1;
      }
    }

    // Return the minimum eating speed that allows finishing within h hours
    return res;
  }

}
