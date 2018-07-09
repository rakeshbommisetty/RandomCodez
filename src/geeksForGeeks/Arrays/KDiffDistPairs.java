package geeksForGeeks.Arrays;


import java.util.*;
import java.lang.*;
import java.io.*;

class KDiffDistPairs {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcount = sc.nextInt();
		for(int i=0;i<testcount;++i){
		    int arraySize = sc.nextInt();
		    int[] a = new int[arraySize];
		    for(int j=0;j<arraySize;++j){
		        a[j] = sc.nextInt();
		    }
		    int k = sc.nextInt();
		    System.out.println(findKdiffCount(a,k));
		}
	}
	
	private static int findKdiffCount(int[] a,int k){
	    int count =0, temp=-1;
	    Arrays.sort(a);
	    
	    for(int i=1;i<a.length;++i){
	        if(temp!=a[i]){
	            temp=a[i];
	        if(a[i]>k){
	            
	            int searchFor = a[i]-k;
	            int res = Arrays.binarySearch(a,0,i,searchFor);
	            if(res>=0)
	            count++;
	        }
	        }
	    }
	    
	    return count;
	}
}
