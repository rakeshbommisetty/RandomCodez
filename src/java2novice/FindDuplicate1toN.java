package java2novice;

import java.util.Arrays;

public class FindDuplicate1toN {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7,8,8,8,8,9,9,10};
		Arrays.sort(ar);
		
		for(int i=0; i<ar.length-1; ++i){
			if(ar[i] == ar[i+1]){
				int temp = ar[i];
				
				while(i<ar.length-1 && temp == ar[i+1]){
					ar[i+1] = -1;
					i++;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(ar));
	}

}
