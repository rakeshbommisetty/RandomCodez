package geeksForGeeks.sortAlgos;

import java.util.Arrays;
/* Insertion sort is same as arranging cards in poker game.
 * First identify the smallest element and insert it at right position.
 * For identifying right position, check OMLY the elements those are already arranged
 */
public class InsertionSort_4 {

	public static void main(String[] args) {
		int arr[] = {64, 25, 12, 22, 11};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSort(int[] a) {
		
		for(int i=1; i<a.length; ++i){
			int key = a[i];
			int j = i-1;
			
			while(j >= 0 && key<a[j] ){
				a[j+1] =a[j];
				--j;
			}
	
					a[j+1] = key;
					
		
		}
	}

}
