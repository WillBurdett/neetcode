package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class D_GenerateParentheses {
  // only add open parenthesis if open < n
  // only add closing parenthesis if closed < open
  // valid IF open == closed == n
  public List<String> generateParenthesis(int n) {
    backtrack(0, 0, n);
    return res;
  }

  List<String> res = new ArrayList<>();
  Stack<Character> stack = new Stack<>();


  public void backtrack(int openN, int closedN, int n) {
    if (openN == n && closedN == n){
      res.add(stack.stream().map(s -> s.toString()).collect(Collectors.joining("")));
      return;
    }
    if (openN < n){
      stack.push('(');
      backtrack(openN + 1, closedN, n);
      stack.pop();
    }

    if (closedN < openN) {
      stack.push(')');
      backtrack(openN, closedN + 1, n);
      stack.pop();
    }
  }
}
