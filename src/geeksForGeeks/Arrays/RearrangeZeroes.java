package geeksForGeeks.Arrays;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class RearrangeZeroes {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for(int i=0;i<tests;++i){
		    int size = sc.nextInt();
		    int[] a = new int[size];
		    for(int j=0;j<size;++j){
		        a[j] = sc.nextInt();
		    }
		    reArrange(a);
		}
	}
	
	private static void reArrange(int[] a){
	    
	    int count=-1;
	  //  System.out.println(java.util.Arrays.toString(a));
	    for(int i=0;i<a.length;++i){
	        if(a[i]>0){
	            a[++count] = a[i];
	          //  System.out.println(java.util.Arrays.toString(a));
	       }
	    }
	    
	    
	    
	    for(int i=count+1;i<a.length;++i){
	      //  System.out.println(java.util.Arrays.toString(a));
	      //  System.out.println(i);
	        a[i]=0;
	    }
	    
	   // System.out.println(java.util.Arrays.toString(a));
	    for(int i=0;i<a.length;++i){
	        System.out.print(a[i]);
	        System.out.print(" ");
	    }
	}
}
