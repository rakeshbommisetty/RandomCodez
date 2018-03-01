package geeksForGeeks.searchAlgos;

public class FibSearch_5 {

	public static void main(String[] args) {
		//int arr[] = {10, 22, 35, 40, 45, 50, 80, 82,85, 90, 100};
		int arr[] = {45};
		int n = arr.length;
		int x = 4;
		System.out.println("Found at index:"+fibMonaccianSearch(arr, x, n));
	}

	private static int fibMonaccianSearch(int[] a, int x, int n) {
		
		if(n==0){
			return -1;
		}else if(n==1){
			if(a[0]==x){
				return 0;
			} return -1;
		}
		int fibn2 = 0;
		int fibn1 = 1;
		int fibn = 1;
		int offset = -1;
		
		while(n > fibn){
			fibn2 =fibn1;
			fibn1 = fibn;
			fibn = fibn1 + fibn2;
		}
		
		
		while(fibn > 1){
			int i = Math.min(offset+fibn2, n-1);
			
			if(a[i]>x){
				fibn = fibn2;
				fibn1 =fibn1-fibn2;
				fibn2= fibn - fibn1;
				
			}else if(a[i]<x){
				offset = i;
				fibn = fibn1;
				fibn1 = fibn2;
				fibn2 = fibn - fibn1;
			}else{
				return i;
			}
			
			
		}
		
		
		
		
		
		return -1;
		
		
	}

}
