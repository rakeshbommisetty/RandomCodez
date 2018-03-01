package geeksForGeeks.dynamicProgramming;

public class LongestIncresingSeq {
	
	static int max;

	public static void main(String[] args) {

        int arr[] = { 50,3,10,7,40,80 };
            int n = arr.length;
            System.out.println("Length of lis is " + lis( arr, n ) + " n" );
            lis1( arr, 0 );
            System.out.println("Length of lis is " + max + " n" );
	}

	private static int lis(int[] arr, int n) {
		int max=1, tempMax=1;
		
		for(int i=0;i<arr.length;++i){
			int k = i;
			for(int j=k+1;j<arr.length;++j){
				if(arr[j] > arr[k]){
					++tempMax;
					k=j;
				}
			}
			if(tempMax>max){
				max = tempMax;
			}
			tempMax = 1;
		
	}
		return max;
	}
	
	
	private static void lis1(int[] arr, int n) {
		int tempMax=1;
		if(n==arr.length){
			return ;
		}
		
			int k = n;
			for(int j=k+1;j<arr.length;++j){
				if(arr[j] > arr[k]){
					++tempMax;
					k=j;
				}
			}
			if(tempMax>max){
				max = tempMax;
			}
			
		
			lis1(arr, n+1);
		return;
}
}
