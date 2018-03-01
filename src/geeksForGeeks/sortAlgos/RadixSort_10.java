package geeksForGeeks.sortAlgos;

import java.util.Arrays;

public class RadixSort_10 {
	    // A utility function to get maximum value in arr[]
	    static int getMax(int arr[], int n)
	    {
	        int mx = arr[0];
	        for (int i = 1; i < n; i++)
	            if (arr[i] > mx)
	                mx = arr[i];
	        return mx;
	    }
	 
	    // A function to do counting sort of arr[] according to
	    // the digit represented by exp.
	    /**
	     * @param arr
	     * @param n
	     * @param exp
	     */
	    static void countSort(int arr[], int n, int exp)
	    {
	        int output[] = new int[n]; // output array
	    	int output1[] = new int[n+1];
	    	int arr1[] = new int[n];
	    	
	    	for(int x=0; x<arr.length; ++x){
	    		arr1[x] = arr[x];
	    	}
	        int i;
	        int count[] = new int[10];
	        int count1[] = new int[10];
	        Arrays.fill(count,0);
	        Arrays.fill(count1,0);
	 
	        // Store count of occurrences in count[]
	        for (i = 0; i < n; i++){
	            count[ (arr[i]/exp)%10 ]++;
	            count1[ (arr[i]/exp)%10 ]++;
	        }
	 
	        // Change count[i] so that count[i] now contains
	        // actual position of this digit in output[]
	        for (i = 1; i < 10; i++){
	            count[i] += count[i - 1];
	            count1[i] += count[i - 1];
	        }
	 
	       // Build the output array
	        for (i = n - 1; i >= 0; i--)
	        {
	            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
	            count[ (arr[i]/exp)%10 ]--;
	        }
	        
	        for(int k=arr.length-1;k>=0;--k){
				int temp= count1[(arr[k]/exp)%10];
				count1[(arr[k]/exp)%10] = temp-1;
				output1[temp] = arr[k];
			}
	        
	        System.out.println("the arry OP before copy OP:: "+Arrays.toString(output));
	        
	        System.out.println("the arry OP before copy OP1:: "+Arrays.toString(output1));
	 
	        // Copy the output array to arr[], so that arr[] now
	        // contains sorted numbers according to curent digit
	        for (i=0; i < n; i++)
	            arr[i] = output[i];
	        
	        for (int j=0,l=1; j < n; ++j,++l){
	            arr1[j] = output1[l];
	        }
	        
	        System.out.println("the array OP after each iteration arr:: "+Arrays.toString(arr));
	        
	        System.out.println("the array OP after each iteration arr1:: "+Arrays.toString(arr1));
	    }
	    
	 
	    // The main function to that sorts arr[] of size n using
	    // Radix Sort
	    static void radixsort(int arr[], int n)
	    {
	        // Find the maximum number to know number of digits
	        int m = getMax(arr, n);
	 
	        // Do counting sort for every digit. Note that instead
	        // of passing digit number, exp is passed. exp is 10^i
	        // where i is current digit number
	        for (int exp = 1; m/exp > 0; exp *= 10)
	            countSort(arr, n, exp);
	    }
	 
	    // A utility function to print an array
	    static void print(int arr[], int n)
	    {
	        for (int i=0; i<n; i++)
	            System.out.print(arr[i]+" ");
	    }
	 
	 
	    /*Driver function to check for above function*/
	    public static void main (String[] args)
	    {
	        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
	        int n = arr.length;
	        radixsort(arr, n);
	        print(arr, n);
	    }
	}


