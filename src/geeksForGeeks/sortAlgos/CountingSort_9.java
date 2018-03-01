package geeksForGeeks.sortAlgos;

import java.util.Arrays;

public class CountingSort_9 {

	public static void main(String[] args) {
		int arr[] = {1,4,1,2,7,5,2};
		int max = arr[0];
		for(int i=1;i<arr.length;++i){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		
		countingSort(arr, max );
		System.out.println(Arrays.toString(arr));
	}

	private static void countingSort(int[] a, int maxval) {
		int[] count = new int[maxval+1];
		for(int i=0;i<a.length;++i){
			++count[a[i]];}
		
		for(int j=1;j<count.length;++j){
			count[j] = count[j]+count[j-1];
		}
		
		int[] result = new int[a.length+1];
		
		for(int k=0;k<a.length;++k){
			int temp= count[a[k]];
			count[a[k]] = temp-1;
			result[temp] = a[k];
		}
		
		System.out.println("final output is::");
		
		for(int i=1;i<result.length;++i){
			System.out.print(" "+result[i]+" ");
		}
	}

}
