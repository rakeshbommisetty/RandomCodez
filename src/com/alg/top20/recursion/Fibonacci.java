package com.alg.top20.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		long fibNumber;
	//	fibNumber = fibonacci1(i);
	//	System.out.println(fibNumber);
	//	fibNumber = fibonacci2(i);
	//	System.out.println(fibNumber);
		fibNumber = fibonacci3(i);
		System.out.println(fibNumber);
	}
	
	private static long fibonacci3(int n){
		long[] mem = new long[n+1];
		mem[1] = mem[2] = 1;
		
		for(int i=3; i<=n ; ++i){ 
			mem[i] = mem[i-1] + mem[i-2];
		}
		return mem[n];
	}

	// recursion with memory lookup for holding solutions of each sub problem
	// TC = (n-1)*2 [n-1 nodes/frames in recursion tree and each node has 2 sub nodes] = O(n)
	// SC = n + n = O(n)
	// BUT this has an issue with stack memory, when value is 10000, we are getting StackOverFlow error
	// To avoid this problem, we shld reduce number of stack frames or size of each frame, which we 
	// can't control. So we will go with non recursive approach.
	private static long fibonacci2(int i) {
		long[] mem = new long[i+1];
		return auxfib2(i, mem);
		
		
		
		
	}

	private static long auxfib2(int n, long[] mem) {
		if(n <= 2) return 1;
		if(mem[n] != 0) return mem[n];
		long prev1 = auxfib2(n-1, mem);
		long prev2 = auxfib2(n-2, mem);
		
		return mem[n] = prev1 + prev2;
		
		
	}

	// 2^n is TC and O(n) is SC - refer to onenote
	private static int fibonacci1(int i) {
		if(i==0 || i<0){
			return 0;
		}else if(i<=2){
			return 1;
		}else
			return fibonacci1(i-1)+fibonacci1(i-2);
	}

}
