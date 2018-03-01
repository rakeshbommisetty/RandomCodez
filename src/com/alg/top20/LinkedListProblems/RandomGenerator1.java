package com.alg.top20.LinkedListProblems;

public class RandomGenerator1 {
	
//	private long prev;
	private long seed;
	private static int  A=5;
	private static int  B=7;
	private static int  M=1024;
	

	
	
	public RandomGenerator1(){
		this.seed = System.currentTimeMillis();
	}
	
	public RandomGenerator1(int seed){
		this.seed = seed;
	}
	
	public static long getRandom1(int n){
		return System.currentTimeMillis()%n;
	}
	
	public static long getRandom2(int n){	
	/*
	 * approach is to take the obj location as the seed value and perform modulo operator on that
	 */
		int[] obj = new int[1];
		System.out.println(obj);
		return 0;
	}
	
	public long getRandom3(int n){
		long tmp = (A*seed+B)%M;
		seed = tmp;
		return tmp % n;
	}

	public static void main(String[] args) {
		RandomGenerator1 rg = new RandomGenerator1(10);
		
		for(int i=1;i<=20;i++){
			System.out.println(rg.getRandom3(10));
		}

	}

}
