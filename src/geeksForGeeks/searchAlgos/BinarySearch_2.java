package geeksForGeeks.searchAlgos;

import java.util.Arrays;

public class BinarySearch_2 {

	public static void main(String[] args) {
		int[] a={3,4,2,543,22,56,23,746,245,767,5223,43,7};
		int elementToSearch =767;
		Arrays.sort(a);
		int index = binarySearch(a,elementToSearch);
		if(index>-1)
			System.out.println("The element to search is found in the index: "+index);
		else
			System.out.println("the element not found");
		
		index = recBinarySearch(a,elementToSearch, 0, a.length-1);
		if(index>-1)
			System.out.println("The element to search is found in the index: "+index);
		else
			System.out.println("the element not found");
	}

	private static int recBinarySearch(int[] a, int elementToSearch, int l ,int r) {
		
		if(r>=1){
		int m = l+(r-l)/2;
		if(elementToSearch == a[m]){
			return m;
		}else if(elementToSearch > a[m]){
			l = m+1;
			return recBinarySearch(a,elementToSearch, l,r);
		}else{
			r = m-1;
			return recBinarySearch(a,elementToSearch, l,r);
		}
		}
		else
		{
			return -1;
		}
		
		
		
	}

	private static int binarySearch(int[] a, int elementToSearch) {
		
		int l =0;
		int r =a.length-1;
		
		
		while(l<=r){
			int m = l+(r-l)/2;
			if(elementToSearch == a[m]){
				return m;
			}else if(elementToSearch > a[m]){
				l = m+1;
			}else{
				r = m-1;
			}
			
		}
		
		return -1;
		
		
	}

}
