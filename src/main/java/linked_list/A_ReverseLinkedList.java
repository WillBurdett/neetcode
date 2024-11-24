package linked_list;

public class A_ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
      // storing the next node from the current one we're looking at
      ListNode temp = curr.next;

      // set the current nodes previous field to the 'prev' node we saved above
      curr.next = prev;

      // now we update the 'prev' variable equal to our updated current node
      prev = curr;

      // we set the current node to the next one we stored earlier
      curr = temp;
    }
    return prev;
  }

}

