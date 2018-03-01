package java2novice;

import java.util.Arrays;

public class MergeSort {

public static void main(String[] args){
	int[] a = {45,3,13,7,11,9,12,2,1};
	
	mergeSort(a,0,a.length-1);
	System.out.println(Arrays.toString(a));
}

// Below method is required to break down the array into small chunks of one element each for easy comparison

private static void mergeSort(int[] a, int start, int end) {
	if(start>=end){
		return;
	}
	
	int mid = (start+end)/2;
	mergeSort(a,start,mid);
	mergeSort(a,mid+1,end);
//as I already have a mid element and as it is required to split this part of array(from start till end) into two parts, I'm passing mid element as well.
	//Otherwise I need not pass that.
	
	merge(a,start,mid,end);
	
}

private static void merge(int[] a, int start, int mid, int end) {
	//finding size of left and right array sizes
	int lArraySize = mid-start + 1;
	int rArraySize = end-mid;
	
	//creating arrays with the above sizes
	int[] leftArray = new int[lArraySize];
	int[] rightArray = new int[rArraySize];
	
	//populating data from main input array a, to left and right arrays
	
	int k = start;
	
	for(int i=0;i<lArraySize;++i){
		leftArray[i] = a[k];
		k++;
	}
	
	for(int j=0; j<rArraySize;++j){
		rightArray[j] = a[k];
		k++;
	}
	
	 /* Merge the temp arrays */
	 
    // Initial indexes of first and second subarrays
    int i = 0, j = 0;

    // Initial index of merged subarry array
    k = start;
    while (i < lArraySize && j < rArraySize)
    {
        if (leftArray[i] <= rightArray[j])
        {
            a[k] = leftArray[i];
            i++;
        }
        else
        {
            a[k] = rightArray[j];
            j++;
        }
        k++;
    }

    /* Copy remaining elements of L[] if any */
    while (i < lArraySize)
    {
        a[k] = leftArray[i];
        i++;
        k++;
    }

    /* Copy remaining elements of R[] if any */
    while (j < rArraySize)
    {
        a[k] = rightArray[j];
        j++;
        k++;
 
}
	
	
}
}
