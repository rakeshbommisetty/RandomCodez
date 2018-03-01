package geeksForGeeks.sortAlgos;

import java.util.Arrays;

public class BubbleSort_2 {
//Bubble sort keeps on sorting adjacent elements to maintain order. after first loop only largest element will be at the 
	//last index (in case of ascending order.
	// so we need to continue the process till all the elements are sorted, so time complexity = O(n^2), space complexity = 0	
	public static void main(String[] args) {
		int arr[] = {64, 25, 12, 22, 11};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] a) {
		
		for(int i=0;i<a.length;++i){
			for(int j=0;j<a.length-(i+1);++j){
				
				if(j+1<a.length && a[j] > a[j+1]){
					swap(a,j,j+1);
				}
			}
		}
	}

	private static void swap(int[] a, int j, int i) {
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

}
