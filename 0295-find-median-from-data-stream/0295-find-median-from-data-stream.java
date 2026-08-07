class MedianFinder {
      PriorityQueue<Integer>minHeap;
       PriorityQueue<Integer>maxHeap;
    public MedianFinder() {
        minHeap =new PriorityQueue<>((a,b)->a-b);
        maxHeap =new PriorityQueue<>((a,b)->b-a);
    }
    
    public void addNum(int num) {
         maxHeap.add(num);
        if(maxHeap.size()-minHeap.size()>1){
            minHeap.add(maxHeap.poll());
        }
        else if(!minHeap.isEmpty() && maxHeap.peek()>minHeap.peek()){
            int max=maxHeap.poll();
            int min=minHeap.poll();
             minHeap.add(max);
             maxHeap.add(min);
         }
    }
    
    public double findMedian() {
        double median = 0;
        if(maxHeap.size() == minHeap.size()){
            return (minHeap.peek()+maxHeap.peek())/2.0;
            }
            else
            return maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */