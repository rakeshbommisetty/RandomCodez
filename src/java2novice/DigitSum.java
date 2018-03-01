package java2novice;

public class DigitSum {

	private static int sum=0;
	public static void main(String[] args) {
		int a = 99999;
		System.out.println("Digit sum is:: "+getDigitSum(a));
	}

	private static int getDigitSum(int a) {
		if(a%10==a){
			return a;
		}
		sum = sum + a%10 + getDigitSum(a/10);
		return sum;
	}
}
