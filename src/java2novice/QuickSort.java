package java2novice;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		//int[] a = {12,8,34,4,90,6,8,1,9,11,13};
		int[] a = {10, 7, 8, 9, 1, 5};
		long start= System.nanoTime();
		quickSort(a,0,a.length-1);
		
		System.out.println(Arrays.toString(a));
		long end= System.nanoTime();
		System.out.println("time taken::"+(end-start));
		

	}

	/**
	 * @param a
	 * @param start
	 * @param end
	 */
	private static void quickSort(int[] a,int start, int end) {
		if(start >= end){
			return;
		}
		int pivotIndex=end;
		int pivot = a[pivotIndex];
		int i=start,j=end-1;
		int partitionInd = -1;
		
		while(i!=j && i<j){
			if(a[i]>=pivot && a[j]<=pivot){
				swap(a,i,j);
				++i;
				--j;
			}
			else if(a[i]>=pivot && a[j]>=pivot){
				--j;
			}else if(a[i]<=pivot && a[j]<=pivot){
				++i;
			}else if(a[i]==pivot){
				++i;
			}else if(a[j]==pivot){
				--j;
			}
		}
		
		if(a[i] < pivot){
			partitionInd = i+1;
			swap(a,partitionInd,pivotIndex);
		}else{
			partitionInd = i;
			swap(a,i,pivotIndex);
		}
				
		quickSort(a,start,partitionInd-1);
		quickSort(a,partitionInd+1,end);
		
		
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j] = temp;
	}

}
