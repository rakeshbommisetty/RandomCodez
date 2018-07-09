package geeksForGeeks.Arrays;


import java.util.*;
import java.lang.*;
import java.io.*;

class RotateAndDelete {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for(int i=0;i<tests;++i){
		    int ipSize = sc.nextInt();
		    int[] ipArr = new int[ipSize];
		    for(int j=0;j<ipSize;++j){
		        ipArr[j] = sc.nextInt();
		    }
		    rotateAndDelete(ipArr);
		}
	}
	
	private static void rotateAndDelete(int[] in){
	    int loop = in.length;
	   for(int i=1;i<loop;++i){
	        int temp = in[in.length-1];
	        for(int j=in.length-1;j>0;--j){
	            in[j] = in[j-1];
	        }
	        in[0] = temp;
	        in = remove(in,i);
	    }
	    
	    System.out.println(in[0]);
	   
	}
	
	private static int[] remove(int[] in, int index){
	    int[] out = new int[in.length-1];
	    index = in.length-index;
	    if(index<0 || index>in.length-1){
	        index=0;
	    }
	    for(int i=0,j=0;i<in.length;++i){
	        if(i==index)
	        continue;
	        out[j++] = in[i];
	    }
	    
	    return out;
	}
}
