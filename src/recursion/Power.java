package recursion;

public class Power {
	
	private static int value;

	public static void main(String[] args) {
		int x=3;
		int n = 4;
		 System.out.println(power(x,n));

	}

	private static int power(int x, int n) {
		if(n==0){
			return 1;
		}else if(n==1){
			return x;
		}
		
		value = x * power(x,n-1);
		
		return value;
		
		
	}

}
