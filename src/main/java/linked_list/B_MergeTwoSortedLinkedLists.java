package linked_list;

public class B_MergeTwoSortedLinkedLists {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    // head tracker of new linked list
    ListNode head = new ListNode(0);

    // current node tracker
    ListNode curr = head;

    // our lists to iterate over
    ListNode l1 = list1;
    ListNode l2 = list2;

    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        curr.next = new ListNode(l1.val);
        l1 = l1.next;
      } else {
        curr.next = new ListNode(l2.val);
        l2 = l2.next;
      }
      curr = curr.next;
    }

    // Attach the remaining nodes from either l1 or l2
    if (l1 != null) {
      curr.next = l1;
    } else if (l2 != null) {
      curr.next = l2;
    }

    return head.next;
  }
}
