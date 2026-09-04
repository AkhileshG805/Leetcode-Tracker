// Last updated: 9/4/2026, 2:38:31 PM
1import java.util.*;
2
3class MedianFinder {
4    private PriorityQueue<Integer> lowerHalf; // max-heap
5    private PriorityQueue<Integer> upperHalf; // min-heap
6
7    public MedianFinder() {
8        lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
9        upperHalf = new PriorityQueue<>();
10    }
11
12    public void addNum(int num) {
13        if (lowerHalf.isEmpty() || num <= lowerHalf.peek()) {
14            lowerHalf.offer(num);
15        } else {
16            upperHalf.offer(num);
17        }
18
19        // Balance the heaps
20        if (lowerHalf.size() > upperHalf.size() + 1) {
21            upperHalf.offer(lowerHalf.poll());
22        } else if (upperHalf.size() > lowerHalf.size()) {
23            lowerHalf.offer(upperHalf.poll());
24        }
25    }
26
27    public double findMedian() {
28        if (lowerHalf.size() > upperHalf.size()) {
29            return lowerHalf.peek();
30        }
31        return (lowerHalf.peek() + upperHalf.peek()) / 2.0;
32    }
33}