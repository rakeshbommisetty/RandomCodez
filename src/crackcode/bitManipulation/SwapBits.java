package crackcode.bitManipulation;

public class SwapBits {

	public static void main(String[] args) {
		int x = 33;
		System.out.println(Integer.toBinaryString(x));
		
		/*HexaDecimal is hexa + decimal = 6 + 10 = 16 characters 
		hexa to binary is by converting each digit in hexa to binary like a = 10 -> 1010. In below eg. we have 8 a's so 
		we get 8 nibbles of 1010. Similarly 5 = 0101.
		
		Now coming to below logic, first we are identifying all even position values using 1010 mask and moving those to right 
		by one logically >>>.
		Then we do the same for odd position numbers and those to even places by left shifting all in a single shot.
		Merge them all by using OR operator*/
		
		int out = ((x & 0xaaaaaaaa) >>> 1) | ((x & 0x55555555) << 1) ;
		System.out.println(out);
		System.out.println(Integer.toBinaryString(out));
	}
	
	

}
