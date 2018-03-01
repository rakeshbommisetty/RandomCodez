package crackcode.ArraysStrings;

import java.util.Arrays;

public class MatrixRotation {

	public static void main(String[] args) {
		int[][] in = {{1,2,3,4},
					  {5,6,7,8},
					  {9,10,11,12},
					  {13,14,15,16}};
		
		outOfPlaceRotateMatrix(in);
		inPlaceRotateMartix(in);
	//	inPlaceRotateMatrixWrong(in);
		
		}

	private static void inPlaceRotateMartix(int[][] matrix) {

if (matrix.length== 0 || matrix.length != matrix[0].length) 
	return;
int n = matrix.length;
for (int layer = 0; layer < n / 2; layer++) {

int last= n - 1 - layer;
for(int i = layer; i < last; i++) {
int offset = i - layer;

int top= matrix[layer][i]; // save top
// left -> top
matrix[layer][i]= matrix[last-offset][layer];
// bottom -> left
matrix[last-offset][layer] =matrix[last][last -offset];
// right -> bottom

// top -> right
matrix[last][last - offset]=matrix[i][last];

matrix[i][last]= top; // right<- saved top

	}
}
System.out.println();
for(int[] a:matrix){
	System.out.println(Arrays.toString(a));
}
return;
	}

	private static void inPlaceRotateMatrixWrong(int[][] in) {
		int size = in.length-1;
		int count = 0;
		
		for(int layer = 0;layer < in.length/2;++layer ){
			
			for(int i=layer;i<size-layer;++i){
				
				int temp = in[layer][i];
				System.out.println(":"+(count++));
				for(int[] a:in){
					System.out.println(Arrays.toString(a));
				}
				in[layer][i] = in[size-i][layer];
				System.out.println(":"+(count++));
				for(int[] a:in){
					System.out.println(Arrays.toString(a));
				}
				in[size-i][layer] = in[size][size-i];
				System.out.println(":"+(count++));
				for(int[] a:in){
					System.out.println(Arrays.toString(a));
				}
				in[size][size-i] = in[i][size];
				System.out.println(":"+(count++));
				for(int[] a:in){
					System.out.println(Arrays.toString(a));
				}
				in[i][size] = temp;
				System.out.println(":"+(count++));
				for(int[] a:in){
					System.out.println(Arrays.toString(a));
				}
			/*	temp = in[layer][i];
				in[layer][i] = in[in.length-1-i][i];
				in[in.length-1-i][i] = in[in.length-1][in.length-1-i];
				
				in[in.length-1][in.length-1-i] = in[i][in.length-1];
				in[i][in.length-1] = temp;*/
			}
		}
		System.out.println();
		for(int[] a:in){
			System.out.println(Arrays.toString(a));
		}
		
		
	}

	private static void outOfPlaceRotateMatrix(int[][] in) {
		int[][] out = new int[in.length][in.length];
		
		for(int i=0;i<in.length;++i){
			for(int j=0;j<in.length;++j){
				out[j][in.length-1-i] = in[i][j];
			}
		}
		
		for(int[] a:out){
			System.out.println(Arrays.toString(a));
		}
	}

}


																																	