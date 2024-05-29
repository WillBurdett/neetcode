package stack;

import java.util.HashMap;
import java.util.Stack;

public class A_ValidParentheses {

  // ORIGINAL SOLUTION
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

  // OFFICIAL SOLUTION
  public boolean isValidUsingHashMap(String s) {
    Stack<Character> stack = new Stack<>();

    HashMap<Character, Character> closedToOpen = new HashMap<>();
    closedToOpen.put(')', '(');
    closedToOpen.put(']', '[');
    closedToOpen.put('}', '{');

    for (int i = 0; i < s.length(); i++) {
      Character c = s.charAt(i);
      if (closedToOpen.containsKey(c)){
        if (!stack.isEmpty() && stack.peek() == closedToOpen.get(c)){
          stack.pop();
        } else {
          return false;
        }
      } else {
        stack.push(c);
      }
    }
    return stack.isEmpty();
  }

}
