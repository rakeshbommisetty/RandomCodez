package crackcode.bitManipulation;

public class Insert {

	public static void main(String[] args) {
		int i =~0;
		System.out.println(Integer.toBinaryString(i));
		int j = i << 7;
		System.out.println(Integer.toBinaryString(j));
		
		int N = 1024;
		int m = 19;
		i=2;
		j=6;
		
		insert(N,m,i,j);
	}

	private static void insert(int n, int m, int i, int j) {
		System.out.println("input n:: "+Integer.toBinaryString(n));
		System.out.println("input m:: "+Integer.toBinaryString(m));
		m = m<<i;
		
		System.out.println("input m:: "+Integer.toBinaryString(m));
		
		int mask1 = ~0;
		mask1 = mask1 << (j+1);
		System.out.println("mask1:: "+Integer.toBinaryString(mask1));
		int mask2 = (1 << i)-1;
		System.out.println("mask2:: "+Integer.toBinaryString(mask2));
		int mask = mask1|mask2;
		System.out.println("mask:: "+Integer.toBinaryString(mask));
		n = n&mask;
		
		System.out.println("n with 0's in mask area::"+Integer.toBinaryString(n));
		n = n | m;
		System.out.println("output::"+Integer.toBinaryString(n));
	}

}
