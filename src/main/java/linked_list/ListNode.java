package linked_list;

import java.util.Objects;

public class ListNode {

  public int val;
  public linked_list.ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, linked_list.ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListNode listNode = (ListNode) o;
    return val == listNode.val && Objects.equals(next, listNode.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, next);
  }

  @Override
  public String toString() {
    return "ListNode{" +
        "val=" + val +
        ", next=" + next +
        '}';
  }
}
