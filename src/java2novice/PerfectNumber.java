package java2novice;

public class PerfectNumber {

	public static void main(String[] args) {
		int a = 30;
		int sum=0;
		
		for(int i=1;i<=a/2;++i){
			if(a%i == 0){
				sum = sum+i;
			}
		}
		
		if(sum==a){
			System.out.println("it's perfect");
		}
		else{
			System.out.println("Not a perfect"+sum);
		}
		
	}

}
