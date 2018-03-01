package greedyThinking;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

import com.google.common.collect.TreeMultiset;

public class MinCostMerging {

	public static void main(String[] args) {
		int n=5;
		int[] a = new int[n];
		Random r = new Random();
		
		for(int i=0;i<n;++i){
			a[i] = r.nextInt(n)+1;
		}
		System.out.println("the input array is:: "+Arrays.toString(a));
		int res = findMinMergeCost1(a);
		System.out.println("min merge cost is:: "+res);
		
		res = findMinMergeCost2(a);
		System.out.println("min merge cost is:: "+res);
		
		res = findMinMergeCost3(a);
		System.out.println("min merge cost is:: "+res);
		
		res = findMinMergeCost4(a);
		System.out.println("min merge cost is:: "+res);
	}

	private static int findMinMergeCost4(int[] a) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(Integer i:a){
			pq.add(i);
		}
		int cost =0;
		while(pq.size()>1){
			int x = pq.remove();
			int y = pq.remove();
			int z = x+y;
			cost += z;
			pq.add(z);
		}
		return cost;
		
		
	}

	private static int findMinMergeCost3(int[] a) {
		TreeMultiset<Integer> tms = TreeMultiset.create();
		for(Integer i:a){
			tms.add(i);
		}
		int cost =0;
		
		while(tms.size()>1){
			
		int x = tms.firstEntry().getElement();
		tms.remove(x, 1);
		int y = tms.firstEntry().getElement();
		tms.remove(y, 1);
			
			
		int z = x+y;
		tms.add(z);
		cost += z;
		}
		
		
		return cost;
		
		
	}

	private static int findMinMergeCost2(int[] a) {
		int cost=0;
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(Integer i:a){
			ll.add(i);
		}
		
		while(ll.size()>1){
			int z = minMerge(ll);
			cost += z;
			ll.add(z);
		}
		return cost;
		
		
	}

	private static int minMerge(LinkedList<Integer> ll) {
		
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		
		for(Integer i:ll){
			if(i<min1){
				min2=min1;
				min1 =i;
			}else if(i<min2){
				min2=i;
			}
		}
		
		ll.removeFirstOccurrence(min1);
		ll.removeFirstOccurrence(min2);
		return min1+min2;
		
		
	}

	private static int findMinMergeCost1(int[] a) {
		int cost=0;
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(Integer i:a){
			ll.add(i);
		}
		
		while(ll.size()>1){
			Collections.sort(ll);
			int x = ll.removeFirst();
			int y = ll.removeFirst();
			cost = cost+x+y;
			ll.add(x+y);
		}
		return cost;
		
		
	}

}
