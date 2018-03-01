package java2novice;

public class FibonacciSer {

	public static void main(String[] args) {
		int a=0, b=1, i=0;
		int series = 10;
		
		while(i<series){
			System.out.print(a+","+b+"");
			a = a+b;
			b=a+b;
			i++;
		}
	}

}
