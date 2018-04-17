package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MergeSort {
    private static long swapCount =0;
    static long countInversions(int[] arr) {
        // Complete this function
        
        mergeSort(arr,0, arr.length-1);
        return swapCount;
    }
    
    static void mergeSort(int[] arr,int start,int end){
        
        if(start>=end){
            return;
        }
        int mid = (start+ end)/2;
        
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        mergeHalves(arr, start, end, mid);
        
    }

    static void mergeHalves(int[] arr, int start,int end,int mid){
        
        int[] a = new int[end-start+1];
       // int[] b = new int[end-(mid+1)+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        
        while(i < j && j <= end){
           if(arr[i] <= arr[j]) {
               a[k] = arr[i];
               i++;
               
           }else{
               a[k] = arr[j];
               swapCount += mid+1-i;
               j++;
               
           }
            k++;
        }
        
        while(i<=mid){
            a[k]= arr[i];
            ++i;
            ++k;
            
        }
        
         while(j<=end){
            a[k]= arr[j];
            ++j;
            ++k;
             
        }
        
        k=0;
        while(start <= end && k<a.length){
          arr[start++] = a[k++]  ;
            
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            long result = countInversions(arr);
            System.out.println(result);
           // System.out.println(Arrays.toString(arr));
        }
        in.close();
    }
}

