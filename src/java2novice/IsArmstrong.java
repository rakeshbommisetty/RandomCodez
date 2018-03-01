package java2novice;

public class IsArmstrong {

	public static void main(String[] args) {
		int a = 371,b=371;
		int noOfDigits = String.valueOf(a).length();
		double sum=0;
		
		while(a!=0){
			sum = sum + Math.pow(a%10, noOfDigits);
			a = a/10;
		}
		
		System.out.println(sum);
		System.out.println((sum-b)==0.0);
		
	}

}
