package geeksForGeeks.sortAlgos;

import java.util.Arrays;

public class HeapSort_8 {

	public static void main(String[] args) {
		int arr[] = {64, 25, 12, 22, 11};
		
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void heapSort(int[] a) {
		int size = a.length;
		
		for(int i=size/2-1;i>=0;--i){
			heapify(a,size,i);
		}
		
		for(int j=size-1; j>=0;--j){
			swap(a,0,j);
			heapify(a,j,0);
			
		}
	}

	private static void heapify(int[] a, int size, int i) {
		int large = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left<size && a[i]<a[left]){
			large = left;
		}
		
		if(right<size && a[large]< a[right]){
			large = right;
		}
		
		if(large!=i){
			swap(a,large,i);
			heapify(a,size,large);
		}
		
		
		
	}

	private static void swap(int[] a, int large, int i) {
		int temp = a[large];
		a[large] = a[i];
		a[i] = temp;
	}

}
