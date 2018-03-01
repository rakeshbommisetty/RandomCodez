package simulation;

public class RandomGenerator {
	
	private static final int A = 5;
	private static final int B =7;
	private static final int M = 1024;
	long seed;
	
	public RandomGenerator(){
		seed = System.nanoTime();
	}
	
	public RandomGenerator(long seed){
		this.seed = seed;
	}

	public static void main(String[] args) {
		RandomGenerator r = new RandomGenerator(10);
		
		for(int i=0;i<10;++i){
			System.out.println("random values are:: "+r.getRandom(10));
		}
	}

	private int getRandom(int i) {
		
		long temp = (((seed*A)+B) % M);
		seed = temp;
		return (int) (temp%i);
		
		
		
		
	}

}
