package geeksForGeeks.Arrays;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Rearrange {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for(int t=0;t<tests;++t){
		    int size = sc.nextInt();
		    int[] a = new int[size];
		    for(int i=0;i<size;++i){
		        a[i] = sc.nextInt();
		    }
		    
		    rearrange(a);
		}
	}
	
	private static void rearrange(int[] a){
		int i=0;
		try{
	    for(;i<a.length;++i){
	        if(a[i]==-1 || a[i]==i){
	            continue;
	        }else{
	            System.out.println(Arrays.toString(a));
	            System.out.println(i);
	            int temp = a[a[i]];
	            a[a[i]] = a[i];
	            a[i]=temp;
	            i--;
	        }
	    }
		}catch(Exception e){
			    System.out.println(Arrays.toString(a));
	            System.out.println(i);
		}
	    System.out.println(Arrays.toString(a));
	}
}
