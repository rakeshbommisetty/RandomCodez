package geeksForGeeks.sortAlgos;

import java.util.Arrays;

// Selection sort selects the smallest/largest element in the given array and
// swaps with the first location. It continuous the process for all the consecutive locations. 
// time complexity = O(n^2), space complexity = O(n)
public class SelectionSort_1 {

	public static void main(String[] args) {
		int arr[] = {64, 25, 12, 22, 11};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSort(int[] a) {
		
		for(int i=0;i<a.length;++i){
			int min=a[i];
			int minIndex=i;
			for(int j=i+1;j<a.length;++j){
				if(a[j]<min){
					min = a[j];
					minIndex = j;
				}
			}
			swap(a,i,minIndex);
		}
	}

	private static void swap(int[] a,int i, int minIndex) {
		int temp = a[i];
		a[i] = a[minIndex];
		a[minIndex] = temp;
	}

}
