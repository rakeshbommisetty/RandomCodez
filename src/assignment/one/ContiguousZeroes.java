package assignment.one;

public class ContiguousZeroes {
	
	public static void main(String[] args){
		int[] a = {0,0,0,0,1,2,3};
		
		for(int i=0;i<a.length;++i){
			if(a[i] != 0){
				System.out.println("Number of zeroes:: "+i+1);
				break;
			}
		}
	}

}
