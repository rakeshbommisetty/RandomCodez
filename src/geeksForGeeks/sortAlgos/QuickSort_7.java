package geeksForGeeks.sortAlgos;

import java.util.Arrays;

public class QuickSort_7 {

	public static void main(String[] args) {
	int arr[] = {64, 25, 12, 22, 11};
		
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] a, int start, int end) {
		if(start>=end){
			return;
		}
		
		int i=start-1;
		int pivot = a[end];
		for(int j=start;j<end;++j){
			if(a[j]>pivot){
				continue;
			}else if(a[j]<pivot){
				swap(a,++i,j);
			}
		}
		
		int newPivot = ++i;
		swap(a,newPivot,end);
		
		quickSort(a,start,newPivot-1);
		quickSort(a,newPivot+1,end);
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] =a[j];
		a[j] = temp;
	}

}
