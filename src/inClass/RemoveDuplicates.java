package inClass;

import java.util.Arrays;
import java.util.Random;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = new int[10];
		Random r = new Random();
		
		for(int i=0;i<a.length;++i){
			a[i] = r.nextInt(a.length/2)+1;
		}
		
		System.out.println("my input array is:: "+Arrays.toString(a));
		int[] output = 	removeDuplicates(a);
		System.out.println("my output array is:: "+Arrays.toString(output));
	}

	private static int[] removeDuplicates(int[] a) {
		Arrays.sort(a);
		System.out.println("my input array after sorting:: "+Arrays.toString(a));
		int[] output = new int[a.length];
		int i=0,j=0;
		while(i<a.length){
			if(i+1 < a.length && a[i]==a[i+1] ){
				++i;
				continue;
			}else{
				output[j++] =  a[i];
				++i;
			}
		}
		return output;
		
	}

}
