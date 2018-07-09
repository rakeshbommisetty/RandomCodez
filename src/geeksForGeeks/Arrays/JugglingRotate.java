package geeksForGeeks.Arrays;

import java.util.Arrays;

public class JugglingRotate {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int size = a.length;
		int rotateBy = 3;
		rotate(a,rotateBy,size);
	}

	private static void rotate(int[] a, int rotateBy, int size) {
		int gcd = findGCD(rotateBy,size);
		for(int i=0;i<gcd;++i){
			int temp = a[i];
			int j=i;
			for(;j<a.length-gcd;j+=3){
				a[j]= a[j+3];
			}
			a[j] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
	
	private static int findGCD(int n1,int n2){
	    if(n2<n1){
	       swap(n1,n2);
	    }
	    
	    while(n2%n1>0){
	        int x = n2%n1;
	        n2 = n1;
	        n1 = x;
	    }
	    
	    return n1;
	}

	private static void swap(int n1, int n2) {
		 int temp = n2;
	        n2 = n1;
	        n1 = temp;
	}

}
