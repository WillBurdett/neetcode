package heap_priority_queue;

import java.util.PriorityQueue;

public class A_KthLargestElementInAStream {

    private PriorityQueue<Integer> minHeap;
    private final int k;

    public A_KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();  // Min-heap (default behavior of PriorityQueue)

        for (int num : nums) {
            minHeap.offer(num);  // Add element to heap
            if (minHeap.size() > k) {
                minHeap.poll();  // Remove the smallest element if heap size exceeds k
            }
        }
    }

    public int add(int val) {
        minHeap.offer(val);  // Add the new value to the heap
        if (minHeap.size() > k) {
            minHeap.poll();  // Remove the smallest element if size exceeds k
        }
        return minHeap.peek();  // The k-th largest element (smallest in the heap)
    }
}
