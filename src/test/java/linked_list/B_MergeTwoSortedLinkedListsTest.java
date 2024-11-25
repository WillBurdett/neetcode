package linked_list;

import static org.junit.Assert.*;

import org.junit.Test;
import utils.Utils;

public class B_MergeTwoSortedLinkedListsTest {

  private final B_MergeTwoSortedLinkedLists undertest = new B_MergeTwoSortedLinkedLists();

  @Test
  public void mergeTwoLists_mergesTwoSortedLinkedLists() {
    // given
    ListNode list1 = Utils.createListNodeHead(new int[]{1,2,4});
    ListNode list2 = Utils.createListNodeHead(new int[]{1,3,5});

    // when
    ListNode actual = undertest.mergeTwoLists(list1, list2);

    // then
    ListNode expected = Utils.createListNodeHead(new int[]{1,1,2,3,4,5});
    assertEquals(expected, actual);
  }

  @Test
  public void mergeTwoLists_mergesTwoSortedLinkedListsWhenOneIsEmpty() {
    // given
    ListNode list1 = Utils.createListNodeHead(new int[]{});
    ListNode list2 = Utils.createListNodeHead(new int[]{1,2});

    // when
    ListNode actual = undertest.mergeTwoLists(list1, list2);

    // then
    ListNode expected = Utils.createListNodeHead(new int[]{1,2});
    assertEquals(expected, actual);
  }

  @Test
  public void mergeTwoLists_mergesTwoSortedLinkedListsWhenBothAreEmpty() {
    // given
    ListNode list1 = Utils.createListNodeHead(new int[]{});
    ListNode list2 = Utils.createListNodeHead(new int[]{});

    // when
    ListNode actual = undertest.mergeTwoLists(list1, list2);

    // then
    ListNode expected = Utils.createListNodeHead(new int[]{});
    assertEquals(expected, actual);
  }
}