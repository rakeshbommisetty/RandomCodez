package sorting;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

import com.google.common.collect.Multiset.Entry;
import com.google.common.collect.TreeMultimap;
import com.google.common.collect.TreeMultiset;

public class Sorting {

	public static void main(String[] args) {

		int n = 10;
		int[] in = new int[n];

		Random r = new Random();
		for (int i = 0; i < in.length;++i)
			in[i] = r.nextInt(5*n) + 1;
		System.out.println(Arrays.toString(in));
		long start = System.currentTimeMillis();
//		sort1(in);
//		sort2(in);
		sort3(in);
		//System.out.println(Arrays.toString(in));
		long end = System.currentTimeMillis();
		System.out.println("Time taken:" + (end - start) / 1000.0 + " seconds");
	}

	private static void sort3(int[] in) {
		int start =0;
		int end = in.length-1;
		int[] aux = new int[in.length];
		auxSort3(start, end, in, aux);
		System.out.println("final sorted array:: "+Arrays.toString(aux));
	}

	private static void auxSort3(int start, int end, int[] in, int[] aux) {
		if(start>=end){
			return;
		}
		int mid = (end+start)/2;
		auxSort3(start,mid,in,aux);
		auxSort3(mid+1, end, in, aux);
		merge(start,mid, end,in,aux);
		
		
		
	}

	private static void merge(int first, int mid, int end, int[] in, int[] aux) {
		int fp = first; int sp = mid+1;int k=0;
		
		while(fp<=mid && sp<=end){
			
			if(in[fp] > in[sp]){
				aux[k++] = in[sp++];
				
			}else if(in[fp] < in[sp]){
				aux[k++] = in[fp++];
				
			}else{
				aux[k++] = in[fp];
				fp++;
				sp++;
			}
		}
		
		while(fp<=mid){
			aux[k++] = in[fp++];
		}
		
		while(sp<=end){
			aux[k++] = in[sp++];
		}
		
		int i = 0;
		while(i < k)
			in[first++] = aux[i++];
		
		System.out.println("the aux array at every level:: "+Arrays.toString(aux));
	}

	private static void swap(int first, int second, int[] in) {
		int temp = in[first];
		in[first] = in[second];
		in[second] = temp;
	}

	private static void sort2(int[] in) {
		PriorityQueue pq = new PriorityQueue();
		
		for(int i:in){
			pq.add(i);
		}
		
		Arrays.fill(in, 0);
		int i=0;
		while(!pq.isEmpty()){
			in[i++] = (int) pq.remove();
		}
		
		System.out.println(Arrays.toString(in));
		
	}

	private static void sort1(int[] in) {
		TreeMultiset<Integer> tms = TreeMultiset.create();
		for(int i:in){
			tms.add(i);
		}
		for(int i:tms){
			System.out.println(i);
		}
		System.out.println("*&*^(*^*&j");
		for(int i:tms.elementSet()){
			System.out.println(i);
		}
		System.out.println("*&*^(*^*&#############$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for(Entry<Integer> i:tms.entrySet()){
			for(int x=i.getCount();x>0;--x){
			System.out.println(i.getElement());
			}
		}
	}

}
