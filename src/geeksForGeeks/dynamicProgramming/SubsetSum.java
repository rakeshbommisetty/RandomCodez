package geeksForGeeks.dynamicProgramming;

import java.util.Arrays;

public class SubsetSum {

	public static void main(String[] args) {
		int set[] = {3, 4,3,5};
        int sum = 6;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
           System.out.println("Found a subset with given sum");
        else
           System.out.println("No subset with given sum");
	}

	private static boolean isSubsetSum(int[] set, int n, int sum) {
		//Sort input array and follow sets given by Tushar Roy in youtube
		Arrays.sort(set);
		boolean[][] mem = new boolean[n][sum+1];
		
		for(int i=0;i<n;++i){
			for(int j=0;j<sum+1;++j){
				if(j==0){
					mem[i][j] = true;
				}else{
				
				if(j<set[i]){
					mem[i][j] = (i<=0)? false: mem[i-1][j];
				}else if(j==set[i]){
					mem[i][j] = true;	
				}else{
					mem[i][j] = (i<=0)?false:(mem[i-1][j] == true)? true: mem[i-1][j-set[i]]	;
				}
				}
			}
		}
		
		for(boolean[] i:mem){
			System.out.println(Arrays.toString(i));
		}
		return mem[n-1][sum];
		
		
	}

}
