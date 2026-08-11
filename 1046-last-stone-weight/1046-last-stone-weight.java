class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            maxHeap.add(stone);
        }
        while (maxHeap.size() >= 2) {
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if (x != y) {
                int diff = y - x;
                maxHeap.add(diff);
            }
        }
        return maxHeap.isEmpty() ? 0 :maxHeap.peek();
    }
}