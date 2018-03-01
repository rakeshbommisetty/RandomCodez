package geeksForGeeks.searchAlgos;

import java.util.Arrays;

public class InterpolationSearch_4 {

	public static void main(String[] args) {
		int[] a={56,44,22,788,121,9,332,12,3211,0,1};
		int elementToSearch = 332;
		Arrays.sort(a);
		int index = interpolationSearchElement(a,elementToSearch);
		if(index>-1)
			System.out.println("The element to search is found in the index: "+index);
		else{
			System.out.println("the element not found");
		}
		
		
	}

	private static int interpolationSearchElement(int[] a, int elementToSearch) {
		int lo =0, hi = a.length-1;
		
		while( lo <= hi && a[lo]<=elementToSearch && a[hi]>=elementToSearch){
			int pos = lo +  ((elementToSearch - a[lo]) * (hi-lo)/(a[hi]-a[lo]));
			
			if(a[pos]==elementToSearch){
				return pos;
			}else if(a[pos]<elementToSearch){
				lo = pos+1;
			}else
				hi = pos-1;
		}
		return -1;
		
		
	}

}
