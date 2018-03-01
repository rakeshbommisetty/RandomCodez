package geeksForGeeks.dynamicProgramming;

public class OptimalStrategyForGame {

	public static void main(String[] args) {
		int arr1[] = {8, 15, 3, 7};
	    int n = arr1.length-1;
	    
	    System.out.println(optimalStrategyOfGame(arr1,0, n));
	    
	    System.out.println(optimalStrategyOfGame1(arr1, arr1.length));
	    
	}

	private static int optimalStrategyOfGame1(int[] in, int n) {
		int[][] mem = new int[in.length][in.length];
		int x,y,z;
		
		for(int a=0;a<n;++a){
			for(int b=0,c=a; c<n;++b,++c){
				
				x = b+2 <= c? mem[b+2][c]:0;
				y = b+1<= c-1? mem[b+1][c-1]:0;
				z = b <= c-2? mem[b][c-2]:0;
				
				mem[b][c] = Math.max(in[b]+Math.min(x, y), 	in[c]+Math.min(y, z));
			}
		}
		return mem[0][n-1];
		
		
	}

	private static int optimalStrategyOfGame(int[] in,int i, int j) {
		if(i>=in.length|| j<0){
			return 0;
		}
		if(i>=j)
			return in[i];
		if(i==j-1)
			return Math.max(in[i], in[j]);
		
		
		return Math.max(in[i] + Math.min(optimalStrategyOfGame(in, i+1,j-1), optimalStrategyOfGame(in,i+2,j)),
						in[j] + Math.min(optimalStrategyOfGame(in,i,j-2), optimalStrategyOfGame(in,i+1,j-1)));
		
		
	}

}
