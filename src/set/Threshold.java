package set;

public class Threshold {

	public static void main(String[] args) {
		int threshold = Threshold.tableSizeFor(16);
		System.out.println("threshold is::"+threshold);
		
	}
	
	 static final int tableSizeFor(int cap) {
	        int n = cap - 1;
	        n |= n >>> 1;
	        n |= n >>> 2;
	        n |= n >>> 4;
	        n |= n >>> 8;
	        n |= n >>> 16;
	        return n + 1;
	    }

}
