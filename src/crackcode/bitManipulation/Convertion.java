package crackcode.bitManipulation;

public class Convertion {

	public static void main(String[] args) {
		int a =29, b=15;
		System.out.println("a::"+Integer.toBinaryString(a));
		System.out.println("b::"+Integer.toBinaryString(b));
			int count = 0;
			for (int c = a ^ b; c != 0; c = c >> 1) {
				System.out.println("c::"+Integer.toBinaryString(c));
			count+= c & 1;
			}
			System.out.println(count);	
	}

}
