package geeksForGeeks.dynamicProgramming;

import java.util.Arrays;

public class LongestPathInMatrix {
	
	public static int s = 3;

	public static void main(String[] args) {
		int result = 1;
		 int  mat[][] = {   {1, 2, 9},
                 			{5, 3, 8},
                 			{4, 6, 7} };
		 int[][] mem = new int[mat.length][mat.length];
		 for(int[] ar:mem){
			 Arrays.fill(ar, -1);
		 }
		 
		 
		 for(int i=0;i<mat.length;++i){
			 for(int j=0;j<mat.length;++j){
				 if(mem[i][j]==-1)
					 finLongestOverAll(mat, mem, i,j);
					 
					 result = Math.max(result, mem[i][j]);
			 }
		 }
		
		 for(int[] x: mem){
			 System.out.println(Arrays.toString(x));
		 }
		 System.out.println("final result is:: "+result);
	}

	private static int finLongestOverAll(int[][] mat, int[][] mem, int r, int c) {
		
		if(r<0 || c<0|| r>=mat.length|| c >= mat.length){
			return 0;
		}
		
		if(mem[r][c]!=-1){
			return mem[r][c];
		}
		if(r<s-1 && mat[r][c] == mat[r+1][c]-1){
			
			return mem[r][c] = 1 + finLongestOverAll(mat, mem, r+1,c);
		}
		
		if(c< s-1 && mat[r][c] == mat[r][c+1]-1){
			
			return mem[r][c] = 1 + finLongestOverAll(mat, mem, r,c+1);
		}
		
		if(c>0 && mat[r][c] == mat[r][c-1]-1){
			
			return mem[r][c] = 1 + finLongestOverAll(mat, mem, r,c-1);
		}
		
		if(r>0 && mat[r][c] == mat[r-1][c]-1){
			
			return mem[r][c] = 1 + finLongestOverAll(mat, mem, r-1,c);
		}
		
		
		return mem[r][c] = 1;
		
	}

}
