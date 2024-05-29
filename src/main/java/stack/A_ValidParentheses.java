package stack;

import java.util.Stack;

public class A_ValidParentheses {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      Character c = s.charAt(i);
      if (c == '(' || c == '{'|| c == '['){
        stack.push(c);
        continue;
      }
      if (c == ')' && (stack.isEmpty() || stack.peek() != '(')){
        return false;
      }
      if (c == ']' && (stack.isEmpty() || stack.peek() != '[')){
        return false;
      }
      if (c == '}' && (stack.isEmpty() || stack.peek() != '{')){
        return false;
      }
      if (!stack.isEmpty()){
        stack.pop();
      }
    }
    return stack.isEmpty();
  }

}
