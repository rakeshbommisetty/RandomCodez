package assignment.one;

import java.util.Arrays;

public class Merge2Arrays {

	public static void main(String[] args) {
		int[] a = {0,0};
		int[] b = {90,95,96};
		int i=0,j=0;
		
		while(i<a.length && j<b.length){
			if(a[i] > b[j]){
				int x =i, temp, temp1;
				temp = b[j];
				while(x<a.length){
					temp1 = a[x];
					a[x] = temp;
					temp = temp1;
					++x;
				}
				
				++i; ++j;
				
			}else if(a[i]==0){
				break;
			}else{
				++i;
			}
		}
		
		while(i<a.length && j<b.length){
			a[i] = b[j];
			++i;
			++j;
		}
		
		System.out.println(Arrays.toString(a));

	}

}
