package geeksForGeeks.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		String s1 = "RAKESH";
		String s2 = "DIVYABHARATHI";

		char[] X=s1.toCharArray();
		char[] Y=s2.toCharArray();
		int m = X.length-1;
		int n = Y.length-1;

		long start = System.nanoTime();
		System.out.println("Length of LCS is" + " " +lcs.lcs( X, Y, m, n ));
		long end = System.nanoTime();
		System.out.println("time taking in sol1:: "+(end-start));
		int[][] mem = new int[X.length][Y.length];

		for(int i=0;i<X.length;++i){
			for(int j=0;j<Y.length;++j){
				mem[i][j] = Integer.MAX_VALUE;
			}
		}
		start = System.nanoTime();
		System.out.println("Length of LCS is" + " " +lcs.lcs1( X, Y, 0, 0, mem ));
		end = System.nanoTime();
		System.out.println("time taking in sol2:: "+(end-start));

		
		for(int i=0;i<X.length;++i){
			for(int j=0;j<Y.length;++j){
				mem[i][j] = Integer.MAX_VALUE;
			}
		}
		start = System.nanoTime();
		System.out.println("Length of LCS is" + " " +lcs.lcs2( X, Y, 0, 0, mem ));
		end = System.nanoTime();
		System.out.println("time taking in sol3:: "+(end-start));
	}

	private int lcs2(char[] x, char[] y, int m, int n, int[][] mem) {
		
		for(int i=0;i<x.length;++i){
			for(int j=0;j<y.length;++j){
				if(x[i]==y[j]){
					
					mem[i][j] = (i-1<0||j-1<0)? 1: 1 + mem[i-1][j-1];
					
				}
				else {
					int a = (i-1<0)? 0 : mem[i-1][j];
					int b = (j-1)<0 ? 0 :mem[i][j-1];
					mem[i][j] = Math.max(a, b);
				}
				
			}
		}
		return mem[x.length-1][y.length-1];
		
		
	}

	private int lcs(char[] x, char[] y, int m, int n) {
		if(m<0||n<0)
			return 0;

		if(x[m]==y[n]){

			return 1+lcs(x, y, m-1,n-1);
		}
		else
			return Math.max(lcs(x, y, m,n-1) ,lcs(x, y, m-1,n));
	}

	private int lcs1(char[] x, char[] y, int m, int n, int[][] mem) {
		if(m>=x.length||n>=y.length)
			return 0;

		if(mem[m][n]!=Integer.MAX_VALUE)
			return mem[m][n];

		if(x[m]==y[n]){

			return mem[m][n] = 1+lcs1(x, y, m+1,n+1, mem);
		}
		else
			return mem[m][n] = Math.max(lcs1(x, y, m,n+1, mem) ,lcs1(x, y, m+1,n, mem));
	}

}
