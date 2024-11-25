package UtilsTest;

import linked_list.ListNode;
import org.junit.Test;
import utils.Utils;

import static org.junit.Assert.*;

public class UtilsTest {

  @Test
  public void createListNodeHead_createsListNodeHeadWithPopulatedArray(){
    // given
    int[] input = new int[]{0,1,2,3};

    // when
    ListNode actual = Utils.createListNodeHead(input);

    // then
    ListNode expected = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));
    assertEquals(expected, actual);
  }

}
