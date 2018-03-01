package java2novice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {2,5,7,9,1,1,8,1,1,1,100,1,4,2,199};
		
		for(int i=0; i<a.length;++i){
			for(int j=0; j<a.length-i; ++j){
				if(j<a.length-1 && a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("array sorted::"+Arrays.toString(a));
	}

}
