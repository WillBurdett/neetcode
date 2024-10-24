package stack;

import java.util.Stack;

public class C_EvaluateReversePolishNotation {

  // OFFICIAL SOLUTION
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    for (String t:
    tokens) {
        switch (t) {
          case "+":
            stack.push(stack.pop() + stack.pop());
            break;
          case "*":
            stack.push(stack.pop() * stack.pop());
            break;
          case "-":
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b - a);
            break;
          case "/":
            a = stack.pop();
            b = stack.pop();
            stack.push(b / a);
            break;
          default:
            stack.push(Integer.parseInt(t));
        }
      }

    return stack.peek();
  }

}
