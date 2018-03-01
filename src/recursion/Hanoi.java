package recursion;

public class Hanoi {
static int counter=0;
	public static void main(String[] args) {
		int count = towerOfHanoi(3,'A','B','C');
		System.out.println("count is::"+count);
		
	}

	private static int towerOfHanoi(int n, char src, char aux, char target) {
		if(n==0) return 0;
		towerOfHanoi(n-1, src, target, aux);
		++counter;
		System.out.println(src +"->"+ target);
		towerOfHanoi(n-1, aux, src, target);
		return counter;
		
		
	}

}
