package java2novice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {5,7,2,6,3,1,5,9,11,22,44,67,9};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int i =searchWithSort(a,222,0,a.length);
		System.out.println(i);
		i =searchWithOutRecursion(a,222);
		System.out.println("found on iteration index @: "+i);
	}

	private static int searchWithOutRecursion(int[] a, int x) {
		
		int start = 0;
		int end = a.length-1;
		
		
		while(start<=end){
			int mid = (start+end)/2;
			
			if(a[mid]==x){
				
				return mid;
			}else if(a[mid] > x){
				end =mid-1;
			}else{
				start = mid+1;
			}
			
		}
		return -1;
		
		
	}

	private static int searchWithSort(int[] a, int x, int i,int j) {
		if(i>=j){
			return -1;
		}
		
		int mid = (i+j)/2;
		
		if(a[mid]==x){
			System.out.println("value found at index:: "+mid);
			return mid;
		}else if(a[mid] > x){
			return searchWithSort(a,x,i,mid-1);
		}else{
			return searchWithSort(a,x,mid+1,j);
		}
	}

}
