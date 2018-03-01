package java2novice;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int a = 11101;
		double decimal = 0;
		int i =0;
		
		while(a!=0){
			decimal = decimal + (a%10)*Math.pow(2,i);
			i++;
			a = a/10;
		}
		
		System.out.println(decimal);
		
	}

}
