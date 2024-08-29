package bonus;

import java.util.ArrayList;
import java.util.List;

public class AscendingNumbers {

  public static String generateAscendingNumbers(int n) {
    List<String> result = new ArrayList<>();
    generateNumbers("", n, '1', result);
    return String.join(",", result);
  }

  private static void generateNumbers(String current, int length, char lastDigit, List<String> result) {
    // Base case: If the current number's length matches the desired length, add it to the result
    if (current.length() == length) {
      result.add(current);
      return;
    }

    // Generate numbers by adding digits >= lastDigit
    for (char digit = lastDigit; digit <= '9'; digit++) {
      generateNumbers(current + digit, length, digit, result);
    }
  }

  public static void main(String[] args) {
    int n = 3; // Example input
    String result = generateAscendingNumbers(n);
    System.out.println(result); // Output: "111,112,113,..."
  }
}

