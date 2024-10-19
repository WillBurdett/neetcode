package stack;

import java.util.Stack;

public class E_DailyTemperatures {

  public int[] dailyTemperatures(int[] temperatures) {
    // store temperature and index
    Stack <int[]> stack = new Stack<>();

    // placeholder for days
    int[] res = new int[temperatures.length];

    for (int i = 0; i < temperatures.length; i++) {
      // current temperature placeholder - this is for ease of reading instead of temperature[i]
      int t = temperatures[i];

      // if stack is not empty AND the current temperature is more than the top of the stack
      while (!stack.isEmpty() && t > stack.peek()[0]) {
        // pop the top temperature off the stack
        int[] popped = stack.pop();
        int stackIndex = popped[1];

        // calculate the number of days passed and add value to the popped temperatures index in the result
        res[stackIndex] = (i - stackIndex);
      }
      stack.push(new int[]{t, i});
    }
    return res;
  }

}
