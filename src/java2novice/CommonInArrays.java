package java2novice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonInArrays {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,4,3,2,3};
		int[] b = {5,6,7,8,9,4,3,2,2,3,5,6,7};
		Set<Integer> set = new HashSet<Integer>();
		
		Arrays.sort(a);
		Arrays.sort(b);

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int min = Math.min(a.length,b.length);
		int i=0, j=0;
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				i++;
			}else if(a[i]>b[j]){
				j++;
			}else{
				set.add(a[i]);
				if(i<a.length-1 && a[i+1]==b[j])
					i++;
				else if(j<b.length-1 && a[i]==b[j+1])
					j++;
				else
					i++;j++;
				
					
			}
		}
		
		System.out.println(set.toString());
	}

}
