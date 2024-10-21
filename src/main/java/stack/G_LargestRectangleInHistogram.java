package stack;

import java.util.Stack;

public class G_LargestRectangleInHistogram {

  public int largestRectangleArea(int[] heights) {
    // Stack to store the indexes of the histogram bars
    Stack<Integer> stack = new Stack<>();
    int maxArea = 0;  // Variable to store the maximum area found
    int n = heights.length;

    // Traverse through all bars of the histogram
    for (int i = 0; i <= n; i++) {
      // We're using a sentinel (heights[i] == 0 when i == n) to ensure we process all bars in the stack at the end
      int currentHeight = (i == n) ? 0 : heights[i];

      // Maintain increasing order in the stack; if we encounter a smaller bar, calculate areas
      while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
        // Pop the index of the top of the stack (current bar)
        int height = heights[stack.pop()];

        // If the stack is empty, it means the popped bar is the smallest seen so far,
        // so its width extends across all processed bars
        int width = stack.isEmpty() ? i : i - stack.peek() - 1;

        // Calculate the area with the popped bar as the smallest bar and update maxArea
        maxArea = Math.max(maxArea, height * width);
      }

      // Push current bar's index onto the stack
      stack.push(i);
    }

    // Return the maximum area found
    return maxArea;
  }

}
