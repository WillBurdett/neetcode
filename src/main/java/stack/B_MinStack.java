package stack;

import java.util.ArrayList;
import java.util.List;

public class B_MinStack {

  private List<Integer> list;

  public B_MinStack() {
    this.list = new ArrayList<>();
  }

  public void push(int val) {
    list.add(val);
  }

  public void pop() {
    list.remove(list.size() - 1);
  }

  public int top() {
    return list.get(list.size() - 1);
  }

  public int getMin() {
    int min = 0;
    for (int i = 0; i < list.size(); i++) {
      if (i == 0){
        min = list.get(i);
        continue;
      }
      if (list.get(i) < min){
        min = list.get(i);
      }
    }
   return min;
  }

  public List<Integer> getStack(){
    return this.list;
  }

}
