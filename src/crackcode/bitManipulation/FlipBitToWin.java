package crackcode.bitManipulation;

public class FlipBitToWin {

	public static void main(String[] args) {
		int i = 1775;
		//int index = FlipBit(Integer.toBinaryString(i));
		//System.out.println(Integer.toBinaryString(i));
		//System.out.println("index to replace for getting longest seq of 1's::"+index);
		
		//System.out.println(solutionGiven(Integer.parseInt("1101111011110111",2)));
		System.out.println(solutionGiven(Integer.parseInt("1",2)));
	}

	private static int solutionGiven(int a) {
		
		
			/* If all ls, this is already the longest sequence. */
		int b = ~a;
		
			if (~a== 0) return Integer.BYTES * 8;

			int currentlength = 0;
			int previouslength = 0;
			int maxlength = 1; // We can always have a s equence of at least one 1
			while (a!= 0) {
			if ((a & 1) == 1) { // Current bit is a 1
			 currentlength++;
			 } else if ((a & 1) == 0) { // Current bit is a 0
			 /* Update to 0 (if next bit is 0) or currentlength (if next bit is 1). */
			 previouslength = (a & 2) == 0? 0 : currentlength;
			 currentlength = 0;
			 }
			 maxlength = Math.max(previouslength + currentlength + 1, maxlength);
			 a>>>= 1;
			 }
			 return maxlength;

		
		
	}

	private static int FlipBit(String binaryString) {
		
		binaryString = "1101110011101111";
		 int primary = 0, secondary=0,total=0,tindex, count=0,pindex=-1,sindex=-1;
		 
		 for(int i=0;i<binaryString.length();++i){
			 if(binaryString.charAt(i)=='1'){
				 count++;
			 }else{
				 if(binaryString.charAt(i+1)=='1'){
					 if(primary ==0){
						 primary = count;
						 pindex=i;
						 count=0;
						 
					 }else if(primary!=0 && secondary==0){
						 secondary = count;
						 sindex=i;
						 count=0;
					 }
					 else if(count > primary && secondary!=0){
						 primary = secondary;
						 secondary = count;
						 pindex=sindex;
						 count=0;
					 }
				 }else{
					 if(total < primary + secondary && secondary!=0){
						 total = primary + secondary;
						 tindex = pindex;
						 primary = secondary =count=0;
					 }else{
						 primary = secondary =count=0;
					 }
				 }
				
			 }
		 }
		 
		 if(count > primary){
			 primary = secondary;
			 secondary = count;
			 pindex=sindex;
			 count=0;
		 }
		
		 return pindex;
		
		
	}

}
