package geeksForGeeks.sortAlgos;

import java.util.Arrays;

public class InsertionSort_recur {

	public static void main(String[] args) {
		
			int arr[] = {64, 25, 12, 22, 11};
			insertionSort(arr, 1);
			System.out.println(Arrays.toString(arr));
		
	}

	private static void insertionSort(int[] a,int i) {
		
		if(i>a.length-1){
			return;
		}
		
		int key = a[i];
		int j=i-1;
		
		while(j>=0 && a[j]>key){
			a[j+1] = a[j];
			--j;
		}
		
		a[j+1] = key;
		insertionSort(a,i+1);
	}

}
