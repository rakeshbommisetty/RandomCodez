package geeksForGeeks.sortAlgos;

import java.util.Arrays;

public class ShellSort_12 {

	public static void main(String[] args) {
		int[] a = {12, 34, 54, 2, 3,44,11,88,66,22,55,11,44,22,99,0};
		System.out.println("before sorting:: "+Arrays.toString(a));
		shellSort(a);
		System.out.println("rakesh after sorting:: "+Arrays.toString(a));
		
	}

	private static void shellSort(int[] a) {
		int n = a.length;
		
		
		for(int gap=n/2; gap>0;gap /= 2){
			
			for(int i=gap;i<n;++i){
				
				for(int j=i; j >=gap; j = j-gap){
					if(a[j] < a[j-gap]){
						swap(a,j, j-gap);
					}
				}
			}
		}
	}

	private static void swap(int[] a, int j, int i) {
		int temp = a[j];
		a[j] =a[i];
		a[i] = temp;
	}

}
