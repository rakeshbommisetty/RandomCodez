package geeksForGeeks.dynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 7;
		System.out.println(fib1(n-1));
		int[] mem = new int[n];
		System.out.println(fib2(n-1, mem));
		System.out.println(fib3(n-1, mem));
	}

	private static int fib3(int n, int[] mem) {
		mem[0]=0;
		mem[1] =1;
		if(n<=1){
			return 1;
		}
		for(int i=2;i<=n;++i){
			mem[i] = mem[i-1]+mem[i-2];
		}
		return mem[n];
		
		
	}

	private static int fib2(int n, int[] mem) {
		if(n<=1){
			return mem[n] =n;
		}
		if(mem[n]!=0){
			return mem[n];
		}
		
		return mem[n] = fib2(n-1, mem)+ fib2(n-2, mem);
		
		
	}

	private static int fib1(int n) {
		if(n<=1){
			return n;
		}
		
		return fib1(n-1) + fib1(n-2); 
	}

}
