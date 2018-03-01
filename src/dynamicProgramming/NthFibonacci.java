package dynamicProgramming;

public class NthFibonacci {

	public static void main(String[] args) {
		int n = 10;
		int res = findFib(n);
		System.out.println("nth fibonacci is1:: "+res);
		
		res = findFib1(n);
		System.out.println("nth fibonacci is2:: "+res);
		
		res = findFib2(n);
		System.out.println("nth fibonacci is3:: "+res);
	}

	private static int findFib2(int n) {
		int[] mem = new int[n+1];
		mem[0] = 0;
		mem[1] = 0;
		mem[2] = 1;
		mem[3] = 1;
		if(n<=3) return mem[n];
		
		for(int i=4;i<=n;++i){
			mem[i] = mem[i-1] +mem[i-2];			
		}
		
		return mem[n];
		
		
	}

	private static int findFib1(int n) {
		int[] mem = new int[n+1];
		int res = auxFindFib1(n,mem);
		return res;
		
		
	}

	private static int auxFindFib1(int n, int[] mem) {
		
		if(n<=1) return 0;
		if(n<=3) return 1;
		if(mem[n]!=0) return mem[n];
		int prev1 = findFib(n-1);
		int prev2 = findFib(n-2);
		
		return mem[n] = prev1 + prev2;
		
		
	}

	private static int findFib(int n) {
		if(n<=1) return 0;
		if(n<=3) return 1;
		
		int prev1 = findFib(n-1);
		int prev2 = findFib(n-2);
		
		return prev1 + prev2;
		
	}

}
