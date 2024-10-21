package stack;

import java.util.Arrays;

public class F_CarFleet {

  public int carFleet(int target, int[] position, int[] speed) {
    int n = position.length;
    double[][] pairs = new double[n][2];

    // store position and speed as pairs
    for (int i = 0; i < n; i++) {
      pairs[i][0] = position[i];
      pairs[i][1] = speed[i];
    }

    // reverse sort cars by position
    Arrays.sort(pairs, (a, b) -> Double.compare(b[0], a[0]));

    // increment size of fleet
    int fleetCount = 0;

    // placeholder for times to reach the target (how many hours it'll take)
    double[] timeToReach = new double[n];

    for (int i = 0; i < n; i++) {
      // calculate hours to reach target and add to array
      timeToReach[i] = (target - pairs[i][0]) / pairs[i][1];

      // if there is at least one car in the fleet to compare to, and the current car will catch up...
      if (i >= 1 && timeToReach[i] <= timeToReach[i - 1]) {
        // ...then replace the current cars time to reach with the front of it's fleet
        timeToReach[i] = timeToReach[i - 1];
      } else {
        // the current car will not catch up, and therefore a new fleet must be accounted for
        fleetCount++;
      }
    }
    return fleetCount;
  }

}
