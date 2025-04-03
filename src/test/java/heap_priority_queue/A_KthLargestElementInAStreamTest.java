package heap_priority_queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class A_KthLargestElementInAStreamTest {

    @Test
    public void kthLargest_Scenario1() {
        A_KthLargestElementInAStream kthLargest = new A_KthLargestElementInAStream(3, new int []{1,2,3,3});

        int actual = kthLargest.add(3);
        int expected = 3;
        assertEquals(expected, actual);

        actual = kthLargest.add(5);
        assertEquals(expected, actual);

        actual = kthLargest.add(6);
        assertEquals(expected, actual);

        actual = kthLargest.add(7);
        expected = 5;
        assertEquals(expected, actual);

        actual = kthLargest.add(8);
        expected = 6;
        assertEquals(expected, actual);
    }

}