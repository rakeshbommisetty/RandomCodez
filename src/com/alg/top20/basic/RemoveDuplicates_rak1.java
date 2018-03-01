package com.alg.top20.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class RemoveDuplicates_rak1 {

	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		int[] in1 = new int[size];
		
		Random r = new Random();
		
		for(int i=0;i<size;i++){
			in1[i] = r.nextInt(2*size) + 1;
		}
	//	System.out.println(Arrays.toString(in1));
		long start = System.currentTimeMillis();
	//	int[] out = removeDuplicates1(in1);
	//	int[] out = removeDuplicates2(in1);				// BEST OF ALL 3 approaches is sorting i.e, approach 2, HashSet is more time consuming
		int[] out = removeDuplicates3(in1);
		long end = System.currentTimeMillis();
		System.out.println("total time:: "+(end-start)+" milliseconds");
		
	//	System.out.println(Arrays.toString(out));
	}

	private static int[] removeDuplicates3(int[] in) {
		
		int nDistinct=0;
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i< in.length; ++i){
			if(!hs.contains(in[i]))			// In java automatic check for duplicates is available, 
											//	but the same may not be in other languages
				hs.add(in[i]);
		}
		
		/*Object[] out = hs.toArray();
		System.out.println(Arrays.toString(out));*/
		
		int[] out = new int[hs.size()];
		int k=0;
		
		for(int x: hs){
			out[k++] = x;
		}
		return out;
		
		
	}

	private static int[] removeDuplicates2(int[] in) {
		Arrays.sort(in);
		System.out.println(Arrays.toString(in));
		int nDistinct=0, j;
		
		for(int i=0; i< in.length-1 ; i=j){  	//REFER1
			j=i+1;
			++nDistinct;
			while(j<in.length && in[i] == in[j]){   // loop for incrementing j to non-duplicate value
				in[j] = Integer.MIN_VALUE;   // initializing with Min value for creating output array
				++j;
			}
		}

		int[] out = new int[nDistinct+1];	// as we are not comparing last element in the sorted list there is difference.
											// if last element is distinct/new element in sorted list we get indexOObound exception. Other wise it goes well
		System.out.println("distinct size:: "+out.length);
		int k=0;

		for(int i=0;i<in.length;++i){
			if(in[i] != Integer.MIN_VALUE){
				out[k] = in[i];
				++k;
			}
		}

		return out;


	}

	private static int[] removeDuplicates1(int[] in1) {
		
		// in an array of n elements, each element should be compared with all the next elements. So first element
		// will be compared with next n-1 elements and second element is compared with next n-2 and so on, last but one
		// element will be compared with last element.
		
		// n-1 * n-2 * n-3 .... 1 = (n-1)n/2 = (n^2 - n) / 2
		
		
		int nDistinct=0;
		
		for(int i=0; i<in1.length; ++i){
			if(in1[i]!=Integer.MIN_VALUE){
				++nDistinct;
				for(int j=i+1; j<in1.length; ++j){
					if(in1[i] == in1[j]){
						in1[j] = Integer.MIN_VALUE;                   // or replace with -1
					}
				}
			}
		
		}
		
		int[] out = new int[nDistinct];			// we can directly copy in above loop itself (at nDistinct inc step) but
												// as we don't know the output array size, we need to do later
		int k=0;
		
		for(int i=0;i<in1.length;++i){
			if(in1[i] != Integer.MIN_VALUE){
				out[k++] = in1[i];
			}
		}
	
		return out;
	}

}
