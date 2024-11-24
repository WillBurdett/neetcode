package linked_list;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_ReverseLinkedListTest {

  private final A_ReverseLinkedList undertest = new A_ReverseLinkedList();

  @Test
  public void reverseList_populatedHeadReturnsReversedListNode() {
    // given
    ListNode input = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));

    // when
    ListNode actual = undertest.reverseList(input);

    // then
    ListNode expected = new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(0))));
    assertEquals(expected, actual);
  }

  @Test
  public void reverseList_emptyHeadReturnsReversedListNode() {
    // given
    ListNode input = new ListNode();

    // when
    ListNode actual = undertest.reverseList(input);

    // then
    ListNode expected = new ListNode();
    assertEquals(expected, actual);
  }
}