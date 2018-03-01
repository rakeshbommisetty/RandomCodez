package com.alg.top20.recursion;

public class Power {

	public static long pow(int x, int n) {
		if(0 == n) return 1;
		if(1 == n) return x;
		long tmp = pow(x,n/2);
		/*
		 * x = 2, n = 3, x= 2, temp = 2
		 * p of n, p of n/2, p of n/4.....1/0 then come back computing problem  
		 *to p of n/4 till p of n
		 * space complexity : no of stack frames created are based on the number of calls. and no of calls depends
		 * on our logic, like here pow(x,n/2) that means for every n/2 make a call. So in this case space
		 * complexity is log n * c bytes for local variables
		 * 
		 * time complexity: log n * c , so O(log n)
		 * 
		 * For every process a new stack is created. It is same as the new stack for a Thread. Similar to Servlets.
		 * Each servlet call will be a new thread.
		 */
		if(n%2 == 0)
			return tmp * tmp;
		else 	
		    return tmp * tmp * x;
	}
	public static void main(String[] args) {
		System.out.println(pow(2,16));
	}

}
