package geeksForGeeks.searchAlgos;

import java.util.Arrays;

public class JumpSearch_3 {

	public static void main(String[] args) {
		int[] a={56,44,22,788,121,9,332,12,3211,0,1};
		int elementToSearch = 1;
		Arrays.sort(a);
		int index = jumpElement(a,elementToSearch);
		if(index>-1)
			System.out.println("The element to search is found in the index: "+index);
		else{
			System.out.println("the element not found");
		}
	}

	private static int jumpElement(int[] a, int elementToSearch) {
		int jump = (int) Math.floor(Math.sqrt(a.length));
		System.out.println("jump by::"+jump);
		
		for(int i=0;i<a.length;i=i+jump){
			if(a[i]==elementToSearch){
				return i;
			}else if(a[i] < elementToSearch){
				continue;
			}else{
				for(int j=(i-jump+1);j<i;++j){
					if(a[j]==elementToSearch){
						return j;
					}
				}
				return -1;
			}
		}
		return -1;
		
		
	}

}
