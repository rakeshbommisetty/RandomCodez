package geeksForGeeks.sortAlgos;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class BucketSort_11 {

	public static void main(String[] args) {
		double arr[] = {0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434};
	    bucketSort(arr, arr.length);
	    System.out.println("the un sorted list is: "+Arrays.toString(arr));
	}

	private static void bucketSort(double[] a, int n) {

		LinkedList[] bucket = new LinkedList[10];
		Arrays.fill(bucket, null);
		
		for(int i=0;i<a.length;++i){
			int index = (int)(a[i]*10);
			if(bucket[index]==null){
				LinkedList ll = new LinkedList();
				ll.add(a[i]);
				bucket[index] = ll;
			}else
				bucket[index].add(a[i]);
		}
		
		for(int i=0;i<bucket.length;++i){
			LinkedList ll = bucket[i];
			if(ll!=null)
			Collections.sort(ll);
		}
		
		System.out.println("sorted list is \n");
		for(int i=0;i<bucket.length;++i){
			LinkedList ll = bucket[i];
			if(ll!=null)
			System.out.print(" "+ll.toString()+" ");
		}
	}

}
