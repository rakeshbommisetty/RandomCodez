package java2novice;

public class IsBinary {

	public static void main(String[] args) {
		int a = 120101;
		int temp, flag=0;
		
		while(a!=0){
			temp = a%10;
			if(temp>1){
				System.out.println("false");
				flag=1;
				break;
			}
			a=a/10;
		}
		
		if(flag==0)
			System.out.println("true");
	}

}
