package com.alg.top20.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Finduplicate_rak {
	
	public static void main(String[] args){
		int size = Integer.parseInt(args[0]);
		int[] in1 = new int[size];
		int[] in2 = new int[size];
		
		
//		Random r = new Random(size);	// size is seed value, if seed value is mentioned same random values will come
		
		Random r = new Random();		//removed seed value for randomness
		
		for(int i=0; i<size; ++i){
			in1[i] = r.nextInt(size) + 1;
			in2[i] = r.nextInt(size) + 1;
		}
		
	//	removeDuplicates(in1);
	//	removeDuplicates(in2);
		
		System.out.println(Arrays.toString(in1));
		System.out.println(Arrays.toString(in2));
		
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		findDuplicates1(in1, in2);
	//	findDuplicates2(in1, in2);
	//	findDuplicates3(in1, in2);
	//	findDuplicates4(in1, in2);
		
		// OUT OF ALL approaches, approach2 sorting both arrays and finding is the best, followed by binary Search, Naive approach and then the HashSet approach.
		//This proves going in the way of HashSet or OOTB APIs is not always best approach. Sorting nlogn, is much better
		
		long end = System.currentTimeMillis();
		System.out.println(end);
		
		System.out.println("total time in seconds:: "+(end-start)/1000+" seconds");
		System.out.println("total time in milli seconds:: "+(end-start)+" milli seconds");
	}

	private static void removeDuplicates(int[] in) {
		
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int i=0; i < in.length; ++i){
			hset.add(in[i]);
		}
		
		int[] out = new int[hset.size()];
		
		
	}

	private static void findDuplicates4(int[] in1, int[] in2) {
		int count=0;
		HashSet<Integer> ihs = new HashSet<Integer>();
		
		for(int i =0; i<in2.length; ++i){
			ihs.add(in2[i]);
		}
		
		for(int i=0; i<in1.length;i++){
			if(ihs.contains(in1[i])){
				System.out.println("duplicates using hashset:: "+in1[i]);
				++count;
			}
			
		}
		
		System.out.println("count of duplicates using hashset:: "+count);
	}

	/**
	 * @param in1
	 * @param in2
	 */
	private static void findDuplicates3(int[] in1, int[] in2) {
		int count=0;
		Arrays.sort(in1);
		
		for(int i=0; i<in2.length; i++){
			if(Arrays.binarySearch(in1, in2[i]) >= 0){
				System.out.println("Duplicate using BinarySearch:: "+in2[i]);
				++count;
			}
		}
		
		System.out.println("count using Binary Search:: "+count);
	}

	private static void findDuplicates2(int[] in1, int[] in2) {
		Arrays.sort(in1);
		Arrays.sort(in2);
		System.out.println(Arrays.toString(in1));
		System.out.println(Arrays.toString(in2));
		int i=0, j=0, count=0;
		
		while(i< in1.length && j<in2.length){
			if(in1[i] < in2[j]){
				++i;
			}else if(in1[i] > in2[j]){
				++j;
			}else{
				System.out.println("common elements by sorting both arrays:: "+in1[i]);
				++count;
				++i; ++j;
				
			}
		}
		
		System.out.println("count by sorting both arrays:: "+count);
		
	}

	private static void findDuplicates1(int[] in1, int[] in2) {
		int count=0;
		for(int i =0; i<in1.length; ++i){
			for(int j=0; j< in2.length; ++j){
				if(in1[i] == in2[j]){
					System.out.println("duplicates using Naive approach:: "+in1[i]);
					++count;
					break;
				}
			}
		}
		
		System.out.println("count Duplicates Naive approach:: "+count);
	}

}
