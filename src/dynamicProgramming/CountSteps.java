package dynamicProgramming;

public class CountSteps {
	public static void main(String[] args){
		int n = 6;
		int x = countSteps1(n);
		System.out.println("no of steps:: "+x);
		
		x = countSteps2(n);
		System.out.println("no of steps:: "+x);
		
		x = countSteps3(n);
		System.out.println("no of steps:: "+x);
	}
private static int countSteps3(int n) {
		int[] mem = new int[n+1];
		
		mem[0] =0;
		mem[1] =1;
		mem[2] =2;
		mem[3] =4;
		for(int i=4;i<=n;++i){
			mem[i]= mem[i-1]+mem[i-2]+mem[i-3];
		}
		
		return mem[n];
		
		
	}
	// maximum of 2 steps at a time
	private static int countSteps1(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(n==3) return 3;
		
		int prev1 = countSteps1(n-1);
		int prev2 = countSteps1(n-2);
		int prev3 = countSteps1(n-3);
		return prev1 + prev2 + prev3;
	}
	
	//max 3 steps at a time
	private static int countSteps2(int n){
		int[] mem = new int[n+1];
		int count = auxCountSteps2(n, mem);
		return count;
	}
	private static int auxCountSteps2(int n, int[] mem) {
		if(n==1) return 1;
		if(n==2) return 2;
		if (n==3) return 4;
		if(mem[n]!=0) return mem[n];
		int prev1 = auxCountSteps2(n-1,mem);
		int prev2 = auxCountSteps2(n-2,mem);
		int prev3 = auxCountSteps2(n-3,mem);
		return mem[n] = prev1+prev2+prev3;
	}

}
