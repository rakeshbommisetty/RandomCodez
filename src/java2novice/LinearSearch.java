package java2novice;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = {5,7,2,6,3,1,5,9,11,22,44,67,9};
		SearchWithOutSort(a,1);
		searchWithSort(a,1);
		

	}

	private static void searchWithSort(int[] a, int x) {
		Arrays.sort(a);
		
		int flag=0;
		for(int i=0;i<a.length;++i){
			if(a[i]==x){
				System.out.println("found at the index::"+i);
				flag=1;
				break;
			}
		}
		
		if(flag==0){
			System.out.println("value not found");
		}
		
	}

	private static void SearchWithOutSort(int[] a, int x) {
		int flag=0;
		for(int i=0;i<a.length;++i){
			if(a[i]==x){
				System.out.println("found at the index::"+i);
				flag=1;
				break;
			}
		}
		
		if(flag==0){
			System.out.println("value not found");
		}
	}

}
