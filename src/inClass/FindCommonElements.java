package inClass;

import java.util.Arrays;
import java.util.Random;

public class FindCommonElements {

	public static void main(String[] args) {
		int n =10;
		int[] n1 = new int[n];
		int[] n2 = new int[n];
		
		Random r = new Random();
		
		for(int i=0;i<n;++i){
			n1[i] = r.nextInt(n) + 1 ;
			n2[i] = r.nextInt(n) + 1;
		}
		
		System.out.println("numbers in n1:: "+Arrays.toString(n1));
		System.out.println("numbers in n2:: "+Arrays.toString(n2));
		
		findCommonElements(n1,n2);
		
		
	}

	private static void findCommonElements(int[] n1, int[] n2) {
		Arrays.sort(n1);
		Arrays.sort(n2);
		
		System.out.println("numbers in sorted n1:: "+Arrays.toString(n1));
		System.out.println("numbers in sorted n2:: "+Arrays.toString(n2));
		
		int i=0, j=0;
		
		while(i<n1.length && j<n2.length){
			if(n1[i]==n2[j]){
				System.out.println(n1[i]);
				i++;j++;
			}else if(n1[i]>n2[j]){
				j++;
			}else{
				i++;
			}
		}
		
	
	}

}
