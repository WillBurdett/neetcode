package linked_list;

import static org.junit.Assert.*;

import org.junit.Test;
import utils.Utils;

public class C_ReorderLinkedListTest {

  private final C_ReorderLinkedList undertest = new C_ReorderLinkedList();

  @Test
  public void reorderListBruteForce_reordersLinkedListOfLength4() {
    // given
    ListNode input = Utils.createListNodeHead(new int[]{2,4,6,8});
    // when
    ListNode actual = undertest.reorderListBruteForce(input);
    // then
    ListNode expected = Utils.createListNodeHead(new int[]{2,8,4,6});
    assertEquals(expected, actual);
  }

  @Test
  public void reorderListBruteForce_reordersLinkedListOfLength6() {
    // given
    ListNode input = Utils.createListNodeHead(new int[]{2,4,6,8,10});
    // when
    ListNode actual = undertest.reorderListBruteForce(input);
    // then
    ListNode expected = Utils.createListNodeHead(new int[]{2,10,4,8,6});
    assertEquals(expected, actual);
  }

  @Test
  public void reorderList_reordersLinkedListOfLength4() {
    // given
    ListNode input = Utils.createListNodeHead(new int[]{2,4,6,8});
    // when
    ListNode actual = undertest.reorderList(input);
    // then
    ListNode expected = Utils.createListNodeHead(new int[]{2,8,4,6});
    assertEquals(expected, actual);
  }

  @Test
  public void reorderList_reordersLinkedListOfLength6() {
    // given
    ListNode input = Utils.createListNodeHead(new int[]{2,4,6,8,10});
    // when
    ListNode actual = undertest.reorderList(input);
    // then
    ListNode expected = Utils.createListNodeHead(new int[]{2,10,4,8,6});
    assertEquals(expected, actual);
  }
}