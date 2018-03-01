package java2novice;

public class IsPrime {

	public static void main(String[] args) {
		int a = 998, flag=0;
		
		for(int i=2;i<a/2;i++){
			if(a%i==0){
				System.out.println("false");
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("true");
		
	}

}
