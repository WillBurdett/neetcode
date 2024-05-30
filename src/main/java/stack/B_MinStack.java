package stack;

import java.util.ArrayList;
import java.util.List;

public class B_MinStack {

  private List<Integer> list;
  private List<Integer> minList;

  public B_MinStack() {
    this.list = new ArrayList<>();
    this.minList = new ArrayList<>();
  }

  public void push(int val) {
    list.add(val);
    if (minList.size() > 0){
      minList.add(Math.min(val, minList.get(minList.size()-1)));
    } else {
      minList.add(val);
    }
  }

  public void pop() {
    list.remove(list.size() - 1);
    minList.remove(minList.size() - 1);
  }

  public int top() {
    return list.get(list.size() - 1);
  }

  public int getMin() {
   return minList.get(minList.size() - 1);
  }

  public List<Integer> getStack(){
    return this.list;
  }

}
