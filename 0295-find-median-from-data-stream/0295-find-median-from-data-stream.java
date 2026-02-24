class MedianFinder {
PriorityQueue<Integer>minh=new PriorityQueue<>();
PriorityQueue<Integer>maxh=new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
    maxh.offer(num);
    if(maxh.size() > minh.size()+1){
            minh.offer(maxh.poll());
        }
        if(!minh.isEmpty() && maxh.peek() > minh.peek()){
            int x = maxh.poll();
            int y = minh.poll();
            maxh.offer(y);
            minh.offer(x);
        }
    }
    
    public double findMedian() {
        if(maxh.size()-1==minh.size())return maxh.peek();
        return (maxh.peek()+minh.peek())/2.0d;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */