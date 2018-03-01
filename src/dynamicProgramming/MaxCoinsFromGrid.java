package dynamicProgramming;

import java.util.Random;

public class MaxCoinsFromGrid {
	
	private static int max=Integer.MIN_VALUE;

	public static void main(String[] args) {
		int n=5;
		int[][] grid = new int[n][n];
		
		Random r = new Random();
		for(int i=0;i<n;++i){
			for(int j=0;j<n;++j){
				grid[i][j] = r.nextInt(10);
			}
		}
		
		display(grid);
		
		System.out.println(findMaxPath1(grid));
		System.out.println(findMaxPath2(grid));
		System.out.println(findMaxPath3(grid));
		System.out.println(findMaxPath4(grid));
	}

	private static int findMaxPath4(int[][] grid) {
		int[][] mem = new int[grid.length][grid.length];
		for(int i=0;i<grid.length;++i){
			for(int j=0;j<grid.length;++j){
				int x = (i-1<0?0:mem[i-1][j]);
				int y = (j-1<0?0:mem[i][j-1]);
				mem[i][j] = Math.max(x, y) + grid[i][j];
			}
		}
		
		return mem[grid.length-1][grid.length-1];
		
		
	}

	private static int findMaxPath3(int[][] grid) {
		int[][] mem = new int[grid.length][grid.length];
		int res = maxPath3(grid.length-1,grid.length-1,mem,grid);
		return res;
		
		
	}

	private static int maxPath3(int i, int j, int[][] mem, int[][] grid) {
		if(i<0 ||j<0) return 0;
		if(mem[i][j]!=0) return mem[i][j];
		int top = maxPath3(i-1,j,mem,grid);
		int left = maxPath3(i,j-1,mem,grid);
		
		return mem[i][j] = Math.max(top, left) + grid[i][j];
	}

	private static int findMaxPath2(int[][] grid) {
		int maxValue = maxpath2(grid.length-1,grid.length-1,grid);
		
		return maxValue;
		
		
	}

	private static int maxpath2(int i, int j, int[][] grid) {
		if(i<0 ||j<0) return 0;
		
		int top = maxpath2(i-1,j,grid);
		int left = maxpath2(i,j-1,grid);
		
		return Math.max(left, top)+grid[i][j];
	}

	private static int findMaxPath1(int[][] grid) {
		int res=0;
		maxPath1(0,0,res,grid);
		
		return max;
		
		
	}

	private static void maxPath1(int i, int j, int res, int[][] grid) {
		if(i>=grid.length || j>= grid.length) return;
		if(i==grid.length-1 && j==grid.length-1){
			max = Math.max(max, res+grid[i][j]);
			return;
		}
		
		maxPath1(i+1,j,res+grid[i][j],grid);
		maxPath1(i,j+1,res+grid[i][j],grid);
		
		
		return;
		
		
	}

	private static void display(int[][] grid) {
		for(int i=0;i<grid.length;++i){
			for(int j=0;j<grid.length;++j){
				System.out.print(" "+grid[i][j]+" ");
			}
			System.out.println();
		}
	}

}
