package com.alg.top20.random;

import java.util.Arrays;
import java.util.Random;

public class RandomGenerator {

	private static int tmp;


	public static long getRandom2(int n){
		return System.nanoTime()%n;
		//Thread t = new Thread();
	}
	
	public static long getRandom1(int n){
		return System.currentTimeMillis()%n;
	}

	public static void main(String[] args) {
	/*	int[] counts = new int[10];
		for(int i=1;i<=20;++i){
			System.out.println(getRandom2(10));
			counts[(int)tmp]++;
			System.out.println(tmp);
			
		}
		System.out.println(Arrays.toString(counts));*/
		
		Random r = new Random();
		for(int i=1;i<=20;++i){
			System.out.println(r.nextInt(100));
		}
	}

}
