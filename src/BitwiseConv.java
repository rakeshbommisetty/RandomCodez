import java.math.BigInteger;
import java.util.Arrays;


public class BitwiseConv {

	

	public static void main(String[] args) {
		int a = 25;
		String s = Integer.toBinaryString(25);
		long l = Long.parseLong(s);
		System.out.println("long value is:: "+l);
		System.out.println(~a);
		System.out.println("inverted bits::"+Integer.toBinaryString(~a));
		
		int[] abb = { 1,5, 8, 3, 99, 10, 4321, 9989, 0};
		mergesort(abb,0, abb.length-1);
		System.out.println(Arrays.toString(abb));
		
	}

	private static void mergesort(int[] a, int start, int end) {
		
		if(start >= end){
			return;
		}
		int mid = (start + end)/2;
		
		mergesort(a, start, mid);
		mergesort(a, mid+1,end);
		merge(a, start,mid,  end);
	}

	private static void merge(int[] a, int start, int mid, int end) {
		int n1 = mid-start+1;
		int n2 = end - mid;
		int[] left = new int[n1];
		int[] right = new int[n2];                
		           
		for(int i=start,k=0;i<=mid;++i,++k){
			left[k] = a[i];
		}
		
		for(int j=mid+1,k=0; j<=end;++j,++k){
			right[k] = a[j];
		}
		
		int x=0,y=0, k = start;
		while(x < n1 && y < n2){
			if(left[x] <right[y]){
				a[k] = left[x];
				k++;
				x++;
			}else{
				a[k] =right[y];
				k++;
				y++;
			}
		}
		
		while(x<n1){
			a[k] = left[x];
			k++;
			x++;
		}
		
		while(y<n2){
			a[k] = right[y];
			k++;
			y++;
		}
		
		
		
	}
}
