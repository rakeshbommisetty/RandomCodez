package geeksForGeeks.sortAlgos;

import java.util.Arrays;

public class BubbleSort_recur {

	public static void main(String[] args) {
		int arr[] = {64, 25, 12, 22, 11};
		bubbleSort(arr, 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] a, int i) {
		
		if(i>a.length-1){
			return;
		}
			
	for(int j=0;j<a.length-(i);++j){
				
				if(j+1<a.length && a[j] > a[j+1]){
					swap(a,j,j+1);
				}
			}
	bubbleSort(a,i+1);
	}
	
	private static void swap(int[] a, int j, int i) {
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

}
