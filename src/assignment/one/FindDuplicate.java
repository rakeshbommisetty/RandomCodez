package assignment.one;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] a = {2,7,6,1,2,3,5,4,8,9,2};
		Arrays.sort(a);
		
		for(int i=0;i<a.length;++i){
			
			while(i<a.length-1 && a[i]==a[i+1]){
				System.out.println("Duplicate numbers:: "+a[i]);
				a[i] = 0;
				++i;
			}
		}
		
		System.out.println(Arrays.toString(a));
		

	}

}
