class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add((long)num);
        }
        int operations = 0;
        while (minHeap.size() > 1 && minHeap.peek() < k) {
            long x = minHeap.poll(); 
            long y = minHeap.poll(); 
            long newElement = Math.min(x, y) * 2 + Math.max(x, y);
            minHeap.add(newElement); 
            operations++;
        }
        return minHeap.peek() >= k ? operations : -1;
    }
    }
