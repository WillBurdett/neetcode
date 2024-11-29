package linked_list;

import java.util.ArrayList;
import java.util.List;

public class C_ReorderLinkedList {

  // Brute Force Solution
  public ListNode reorderListBruteForce(ListNode head) {
    ListNode currentNode = head;
    List<ListNode> list = new ArrayList<>();
    while (currentNode != null) {
      list.add(currentNode);
      currentNode = currentNode.next;
    }

    ListNode[] arr = new ListNode[list.size()];

    int index = 0;

    for (int i = 0, j = list.size() - 1; i <= j; i++, j--) {
      arr[index] = list.get(i);
      index++;
      if (i != j){
        arr[index] = list.get(j);
      }
      index++;
    }

    ListNode res = new ListNode(0);
    ListNode curr = res;
    for (ListNode l:
    arr) {
      curr.next = new ListNode(l.val);
      curr = curr.next;
    }

    return res.next;
  }

  // Slow-fast pointer solution (optimal solution)
  public ListNode reorderList(ListNode head) {
    ListNode slow = head;
    ListNode fast = head.next;

    // while fast is not null and has not reached the ned of the list
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // we have now found the second half of the list i.e. slow.next
    ListNode second = slow.next;
    // we want to split these into 2 different lists
    slow.next = null;
    ListNode prev = slow.next;

    // we want to reverse the second half of the list
    while(second != null) {
      ListNode temp = second.next;
      second.next = prev;
      prev = second;
      second = temp;
    }

    // now the second half is reversed, we want to merge the two halves
    // first is head of the revered second half
    ListNode first = head;
    second = prev;
    while (second != null) {
      // save these nodes in temporary variables as we're going to modify the link
      ListNode temp1 = first.next;
      ListNode temp2 = second.next;

      // we assign first.next to the first node of the second half
      first.next = second;
      // we assign second.next to 2nd node of the first half
      second.next = temp1;

      // both first and second are moved to their respective original next nodes
      first = temp1;
      second = temp2;
    }
    return head;
  }

}
