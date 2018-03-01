package java2novice;

import java.util.Arrays;

public class MergeSortJoeJames{
	public static void main(String[] args) {
		int[] a = {45,3,13,7,11,9,12,2,1};
		int first = 0;
		int last = a.length-1;
		
		mergeSort(a,first,last);
		
		System.out.println(Arrays.toString(a));
	}

	private static void mergeSort(int[] a, int first, int last) {
		if(first == last || first > last){
			return;
		}
		
		int mid = (first + last)/2;
		mergeSort(a,first,mid);
		mergeSort(a,mid+1,last);
		
		merge(a,first,mid,last);
	}

	private static void merge(int[] arr, int l, int m, int r) {
		   // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
     
	}
	}
	
}
	
	
/*public void mergeSort (int[] list, int lowIndex, int highIndex) {
    if (lowIndex == highIndex)
            return;
    else {
            int midIndex = (lowIndex + highIndex) / 2;
            mergeSort(list, lowIndex, midIndex);
            mergeSort(list, midIndex + 1, highIndex);
            merge(list, lowIndex, midIndex, highIndex);
            System.out.println();
    }
}
    
public void merge(int[] list, int lowIndex, int midIndex, int highIndex) {
    int[] L = new int[midIndex - lowIndex + 2];
        for (int i = lowIndex; i <= midIndex; i++) {
            L[i - lowIndex] = list[i];
        }
    L[midIndex - lowIndex + 1] = Integer.MAX_VALUE;
    
    int[] R = new int[highIndex - midIndex + 1];
        for (int i = midIndex + 1; i <= highIndex; i++) {
            R[i - midIndex - 1] = list[i];
        }
    R[highIndex - midIndex] = Integer.MAX_VALUE;
        
    int i = 0, j = 0;
    for (int k = lowIndex; k <= highIndex; k++) {
        if (L[i] <= R[j]) {
                list[k] = L[i];
                i++;
        }
        else {
                list[k] = R[j];
                j++;
        }
    }
}*/
