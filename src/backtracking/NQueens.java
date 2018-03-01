package backtracking;

import java.util.Arrays;

public class NQueens {

	public static void main(String[] args) {
		int n =4;
		//findSeq1(n);
		findSeq2(n);
	}

	private static void findSeq2(int in) {
		int[] out = new int[in];
		auxFindSeq2(0,in,out);
	}

	private static void auxFindSeq2(int d, int in, int[] out) {

		
		if(d>=in){
			System.out.println(Arrays.toString(out));
			return;
		}
		
		for(int i=0;i<out.length;++i){
			if(isValid(d,i,out)){
			out[d] = i;
			auxFindSeq1(d+1,in,out);
			}
		}
	
	}

	private static boolean isValid(int d, int i, int[] out) {
		
		
			for(int y=0;y<d;++y){
				if(i==out[y] || Math.abs(i-y) == Math.abs(out[i] - out[y])){
					return false;
				}
			}
			
		
		
		return true;
		
		
	}

	private static void findSeq1(int in) {
		int[] out = new int[in];
		auxFindSeq1(0,in,out);
	}

	private static void auxFindSeq1(int d, int in, int[] out) {
		
		if(d>=in){
		
		if( validPosition(out)){
			System.out.println(Arrays.toString(out));
			return;
		}
		return;
		}
		
		for(int i=0;i<out.length;++i){
			out[d] = i;
			auxFindSeq1(d+1,in,out);
		}
	}

	private static boolean validPosition(int[] out) {
		
		
		
		for(int i=0;i<out.length;++i){
			for(int j=i+1;j<out.length;++j){
							
				if(out[i] == out[j] || Math.abs(out[i]-out[j])==Math.abs(i-j)){
					return false;
				}
			}
		}
		return true;
		
		
	}

}
