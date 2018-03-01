package backtracking;

import java.util.Arrays;

public class SudokuSolver {

	public static void main(String[] args) {

		int[][] in = 
		{
				{0,0,9,0,0,0,0,0,6},
				{0,0,0,0,3,7,0,0,4},
				{4,7,0,9,0,0,2,0,0},
				{0,0,0,5,0,6,0,7,0},
				{1,0,0,0,8,0,0,0,3},
				{0,4,0,2,0,3,0,0,0},
				{0,0,8,0,0,9,0,1,5},
				{5,0,0,6,2,0,0,0,0},
				{6,0,0,0,0,0,8,0,0}
		};
/*				{8,1,2,7,5,3,6,4,9},
				{9,4,3,6,8,2,1,7,5},
				{6,7,5,4,9,1,2,8,3},
				{1,5,4,2,3,7,8,9,6},
				{3,6,9,8,4,5,7,2,1},
				{0,8,7,1,6,9,5,3,4},
				{5,2,1,9,7,4,3,6,8},
				{4,3,8,5,2,6,9,1,7},
				{7,9,6,3,0,8,4,5,2}
		};*/
		//int[][] in = new int[9][9];
		System.out.println("sudoku input is::");
		for(int i=0;i<in.length;++i){
			System.out.println(Arrays.toString(in[i]));
		}
		System.out.println("sudoku output is::");
//		sudokuSolver1(in);
		sudokuSolver2(in);

	
	}

	private static void sudokuSolver2(int[][] in) {
		auxSolver2(0,0,in);
	}

	private static void auxSolver2(int r, int c, int[][] in) {

		
		if(r==9){
				display(in);
				return;
		}
		
		if(in[r][c]!=0){
			auxSolver2(c==8?(r+1):r,(c+1)%9, in);
		}else{
		for(int x=1;x<=9;++x){
			if(isValid2(r,c,x,in)){
			in[r][c] = x;
			auxSolver2(c==8?(r+1):r,(c+1)%9, in);
			}
		}
		in[r][c] = 0;
		}
		
	
	}

	private static boolean isValid2(int r,int c,int x, int[][] in) {
		
		for(int i=0;i<9;++i){
			if(in[r][i]==x) return false;
		}
		
		for(int i=0;i<9;++i){
			if(in[i][c]==x) return false;
		}
		
		int sr = r/3 * 3;
		int sc = c/3 *3;
		
		for(int i=0;i<3;++i){
			for(int j=0;j<3;++j){
				if(in[sr+i][sc+j] == x) return false;
			}
		}
		return true;
		
		
	}

	private static void sudokuSolver1(int[][] in) {
		auxSolver1(0,0,in);
	}

	private static void auxSolver1(int r, int c, int[][] in) {
		
		if(r>=9){
			if(isValid(in)){
				display(in);
				return;
			}
		}
		
		if(in[r][c]!=0){
			auxSolver1(c==8?(r+1):r,(c+1)%9, in);
		}else{
		for(int x=1;x<10;++x){
			in[r][c] = x;
			auxSolver1(c==8?(r+1):r,(c+1)%9, in);
		}
		in[r][c] = 0;
		}
		
	}

	private static void display(int[][] in) {
		for(int i=0;i<in.length;++i){
			System.out.println(Arrays.toString(in[i]));
		}
		
	}

	private static boolean isValid(int[][] in) {
		
		for(int i=0;i<in.length;++i){
			return !isRowDuplicate(in[i]);
		}
		
		for(int i=0;i<in.length;++i){
			return !isColumnDuplicate(i, in);
		}
		
		
		for(int i=0;i<in.length;i+=3){
			for(int j=0;j<in.length;j+=3){
				return !isGridDuplicate(i, j,in);
			}
			
		}
		
		return false;
		
		
	}

	private static boolean isGridDuplicate(int i, int j, int[][] in) {
		int[] temp = new int[in.length+1];
		for(;i<3;++i){
			for(;j<3;++j){
				int k = in[i][j];
				if(temp[k]!=0) return true;
				else temp[k] = 1;
			}
		}
		
		return false;
		
		
	}

	private static boolean isColumnDuplicate(int c,int[][] in) {
		
		int[] temp = new int[in.length+1];
		for(int i=0;i<in.length;++i){
			int k = in[i][c];
			if(temp[k]!=0) return true;
			else temp[k] = 1;
		}
		return false;
	}

	private static boolean isRowDuplicate(int[] r) {
		int[] temp = new int[r.length+1];
		for(int i=0;i<r.length;++i){
			int k = r[i];
			if(temp[k]!=0) return true;
			else temp[k] = 1;
		}
		return false;
	}

}
