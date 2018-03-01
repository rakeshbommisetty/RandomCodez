package PriorityQueue;

import java.util.Random;

public class TestPQ {

	public static void testPQ(IPQueue pq, int n) {
		Random r = new Random(100);
		for(int i = 0; i < n; ++i) {
			pq.add(r.nextInt(n) + 1);
			pq.display();
		}
		System.out.println(pq.size());
		System.out.println(pq.findMin());
		for(int i = 0; i < Math.sqrt(pq.size()); ++i) {
			pq.removeMin();
			pq.display();
		}
	}

	public static void main(String[] args) {
//		int n = Integer.parseInt(args[0]);
		int n = 8;
		testPQ(new HeapTreePQ(), n);
	}

}
