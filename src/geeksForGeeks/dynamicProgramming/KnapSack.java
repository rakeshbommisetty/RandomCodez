package geeksForGeeks.dynamicProgramming;

import java.util.Arrays;

public class KnapSack {

	public static void main(String[] args) {
		int[] wt = {1,2,3,4,5};
		int[] val = {60,75,120,140,180};
		int w = 5;
		int n = val.length;
		
		System.out.println(knapSack(w,wt, val,n));
		int[][] mem = new int[n+1][w+1];
		for(int[] m:mem)
		Arrays.fill(m, 0);
		//System.out.println(knapSack1(w,wt, val,0,n+1, mem));
		
		System.out.println(knapSack11(w,wt, val,n));
	}

	private static int knapSack11(int w, int[] wt, int[] val, int n) {
		if(w==0 || n==0){
			return 0;
		}
		
		int[][] mem = new int[n+1][w+1];
		
		for(int i =0;i<=n;++i){
			for(int j=0;j<=w;++j){
				
				if(i==0||j==0){
					mem[i][j] = 0;
					
				}
				/*here we are iterating on mem, i and j are mapped with mem. mem ranges from
				0 to 5 where as wt and val ranges from 0 to 4. so when we are calculating for
				 i=1, we have to check for i=0 in wt or val.*/
				
				/*The main reason to append 0th row and column is just to avoid checks when we
				do i-1 or j-1. */
				else if(j>=wt[i-1]){
					mem[i][j] = Math.max(val[i-1] + mem[i-1][j-wt[i-1]], mem[i-1][j]);
					
				}else{
					mem[i][j] = mem[i-1][j];
				}
				
			}
		}
		
		return mem[n][w];
		
		
	}

	private static int knapSack(int w, int[] wt, int[] val, int n) {
		if(w==0 || n==0){
			return 0;
		}
		
		if(wt[n-1] > w){
			return knapSack(w, wt, val, n-1);
		}
		
		else{
			return Math.max(val[n-1] + knapSack(w-wt[n-1], wt, val, n-1), 
							knapSack(w, wt,val, n-1));
		}
	}
	
/*	private static int knapSack1(int w, int[] wt, int[] val, int s,int n,int[][] mem) {
		if(w==0 || n==0 || s==0){
			return 0;
		}
		
		if(mem[s][n]!=0){
			return mem[s][n];
		}
		if(wt[n-1] > w){
			return mem[s][n] = knapSack1(w, wt, val,0, n-1, mem);
		}
		
		else{
			return mem[s][n] = Math.max(val[n-1] + knapSack1(w-wt[n-1], wt, val, n-1), 
							knapSack1(w, wt,val, n-1));
		}
	}*/

}
