package com.alg.top20.basic;

import java.util.Arrays;
import java.util.Random;

public class CommonElementsInArrays {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		
		
		
		int[] in1 = new int[n];
		int[] in2 = new int[m];
		
		for ( int i =0; i<in1.length; ++i){
			in1[i] = i+1;
		//	in2[i] = i+10;
		}
		
		for(int i=0;i<in2.length;++i){
			in2[i] = i+1;
		}
		
		System.out.println(Arrays.toString(in1));
		System.out.println(Arrays.toString(in2));
		
	//	int count = findCommonElements
//findCommonElements(in1, in2);	// sort both arrays and search
//findCommon();		//sort both arrays and search

		long start = System.currentTimeMillis();
		findCommonElements1(in1, in2);	//sort one array and use binary search on the sorted array
		long end = System.currentTimeMillis();
		System.out.println("Time taken:: "+(end-start));
	}

	private static void findCommonElements1(int[] in1, int[] in2) {
		int count=0;
		Arrays.sort(in1);
		
		for(int i=0; i<in2.length;i++){
			if(Arrays.binarySearch(in1, in2[i]) >= 0){
				++count;
			}
		}
		
		System.out.println(count);
	}

	private static void findCommonElements(int[] in1, int[] in2) {
		int count=0;
		Arrays.sort(in1);
		Arrays.sort(in2);
		
		System.out.println("in1 "+Arrays.toString(in1));
		System.out.println("in2 "+Arrays.toString(in2));
		int i=0,j=0;
		
		while(i<in1.length && j<in2.length){
		if(in1[i] < in2[j]){
			++i;
		}
		else if(in1[i] > in2[j]){
			++j;
		}
		else {
			++i; ++j;
			++count;
		}
		}
		
		System.out.println("common elements:: "+count);
		
	}

	private static void findCommon() {
		int[] x = new int[]{10,20,5,8,4};
		int[] y = new int[]{5,25,11,10,8};
		Arrays.sort(x);
		Arrays.sort(y);
		
		for(int i=0; i<x.length ;++i){
			System.out.println("sorted array x:: "+x[i]);
		}
		
			
	int count=0;
		
		for(int i=0, j=0; i<x.length ;++i){
		/*	for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println(a[i]);
				}
			}*/
			
			if(x[i] == y[j]) {
				j++;
				count ++;
				System.out.println("common element:: "+x[i]);
			}
			
			if(x[i] < y[j]){
				continue;
			}
			
			if(x[i] > y[j]){
				i--;
				j++;
			}
			
			
			
		}
		
		System.out.println("count ::"+count);
	}

}
