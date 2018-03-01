package java2novice;

public class NumberReversal {

	public static void main(String[] args) {
		
		int a = 1938645451;
		int b =0;
		
		while(a%10!=0){
			b=(b*10)+(a%10);
			a=a/10;
			
		}
		
		System.out.println(b);

	}

}
