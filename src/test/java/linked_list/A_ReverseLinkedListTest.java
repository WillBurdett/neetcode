package linked_list;

import static org.junit.Assert.*;

import org.junit.Test;
import utils.Utils;

public class A_ReverseLinkedListTest {

  private final A_ReverseLinkedList undertest = new A_ReverseLinkedList();

  @Test
  public void reverseList_populatedHeadReturnsReversedListNode() {
    // given
    ListNode input = Utils.createListNodeHead(new int[]{0,1,2,3});
    // when
    ListNode actual = undertest.reverseList(input);

    // then
    ListNode expected = Utils.createListNodeHead(new int[]{3,2,1,0});
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

  @Test
  public void recursivelyReverseList_populatedHeadReturnsReversedListNode() {
    // given
    ListNode input = Utils.createListNodeHead(new int[]{0,1,2,3});
    // when
    ListNode actual = undertest.recursivelyReverseList(input);

    // then
    ListNode expected = Utils.createListNodeHead(new int[]{3,2,1,0});
    assertEquals(expected, actual);
  }
}