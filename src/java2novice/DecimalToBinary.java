package java2novice;

class DecimalToBinary{
	public static void main(String[] args){
		int a = 241;
		long b =0;
		
		for(int i=0; a!=0; ++i){
			b = (long) (b + (a%2)*Math.pow(10,i));
			a = a/2;
		}
		
		System.out.println(b);
	}
}