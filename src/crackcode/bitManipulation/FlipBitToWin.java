package crackcode.bitManipulation;

public class FlipBitToWin {

	public static void main(String[] args) {
		int i = 1775;
		//int index = FlipBit(Integer.toBinaryString(i));
		//System.out.println(Integer.toBinaryString(i));
		//System.out.println("index to replace for getting longest seq of 1's::"+index);
		
		//System.out.println(solutionGiven(Integer.parseInt("1101111011110111",2)));
		/*System.out.println(~0);
		i =Integer.parseInt("1111111111111111111111111111111",2);
		System.out.println(i);
		System.out.println(solutionGiven(-1));*/
		System.out.println("11011001110111100110111");
	//	System.out.println(solutionGiven(Integer.parseInt("11011001110111100110111",2)));
		System.out.println(FlipBit("11011001110111100110111"));

	
	}

	private static int solutionGiven(int a) {
		
		
			/* If all ls, this is already the longest sequence. */
		int b = ~a;
	//	System.out.println(Integer.toBinaryString(b));
		
			if (~a== 0) return Integer.BYTES * 8;

			int currentlength = 0;
			int previouslength = 0;
			int maxlength = 0; // We can always have a s equence of at least one 1
			while (a!= 0) {
			//	System.out.println(Integer.toBinaryString(a&1));
			if ((a & 1) == 1) { // Current bit is a 1
				
			 currentlength++;
			 } else if ((a & 1) == 0) { // Current bit is a 0
			 /* Update to 0 (if next bit is 0) or currentlength (if next bit is 1). */
				// System.out.println(Integer.toBinaryString(a&2));
			 previouslength = (a & 2) == 0? 0 : currentlength;
			 currentlength = 0;
			 }
			 maxlength = Math.max(previouslength + currentlength + 1, maxlength);
			 a>>>= 1;
			 }
			 return maxlength;

		
		
	}

	private static int FlipBit(String binaryString) {
		
		//binaryString = "1101110011101111";
		 int primary = 0, secondary=0,total=0;
		 
		 for(int i=0;i<binaryString.length();++i){
			 if(binaryString.charAt(i)=='1'){
				 primary++;
			 }else{
				 if(i+1 < binaryString.length() && binaryString.charAt(i+1)=='1')
					 secondary =primary;
					 primary =0;
			 }
			 
			 total = Math.max(primary + secondary + 1, total);
			 
		 }
		 
		
		
		 return total;
		
		
	}

}
