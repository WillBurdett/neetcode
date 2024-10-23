package binary_search;

public class B_SearchA2DMatrix {
  public boolean searchMatrix(int[][] matrix, int target) {
    // Get the number of rows and columns in the matrix
    int ROWS = matrix.length;          // Number of rows
    int COLS = matrix[0].length;       // Number of columns

    // Initialize variables to track the top and bottom row indices
    int top = 0, bot = ROWS - 1;

    // Perform binary search on rows to find the row that may contain the target
    while (top <= bot) {
      // Calculate the middle row
      int row = (top + bot) / 2;

      // If target is greater than the largest element in the current row, search below
      if (target > matrix[row][COLS - 1]) {
        top = row + 1;  // Move top boundary down
      }
      // If target is smaller than the smallest element in the current row, search above
      else if (target < matrix[row][0]) {
        bot = row - 1;  // Move bottom boundary up
      }
      // If the target could be in the current row, break out of the loop
      else {
        break;
      }
    }

    // If no valid row is found, return false
    if (!(top <= bot)) {
      return false;
    }

    // Get the middle row after the binary search on rows
    int row = (top + bot) / 2;

    // Initialize variables to track the left and right column indices
    int l = 0, r = COLS - 1;

    // Perform binary search within the selected row to find the target
    while (l <= r) {
      // Calculate the middle column
      int m = (l + r) / 2;

      // If target is greater than the current middle element, search the right half
      if (target > matrix[row][m]) {
        l = m + 1;  // Move left boundary right
      }
      // If target is smaller than the current middle element, search the left half
      else if (target < matrix[row][m]) {
        r = m - 1;  // Move right boundary left
      }
      // If the target is found, return true
      else {
        return true;
      }
    }

    // If target is not found, return false
    return false;
  }
}
