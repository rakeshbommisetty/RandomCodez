package java2novice;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {8,5,2,9,1,3,10};
		int minIndex = 0;
		
		for(int i=0;i<a.length-1;++i){
			minIndex = i;
			for(int j=i+1;j<a.length;++j){
				if(a[minIndex]>a[j]){
					minIndex = j;
				}
			}
			
			if(minIndex!=i){
				int temp = a[minIndex];
				a[minIndex] = a[i];
				a[i] = temp;
			}
		}
		
		System.out.println(Arrays.toString(a));
		

	}

}
