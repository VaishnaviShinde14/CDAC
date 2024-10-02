public class KthLargestElement {
    public static int findKthLargest(int[] stream, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : stream) {
            if (minHeap.size() < k) {
                minHeap.add(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(num);
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] stream1 = {3, 10, 5, 20, 15};
        int k1 = 3;
        System.out.println("Kth Largest Element (" + k1 + "): " + findKthLargest(stream1, k1));

        // Test Case 2
        int[] stream2 = {7, 4, 8, 2, 9};
        int k2 = 2;
        System.out.println("Kth Largest Element (" + k2 + "): " + findKthLargest(stream2, k2));
    }
}


