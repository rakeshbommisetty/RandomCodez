package geeksForGeeks.dynamicProgramming;

import java.util.Arrays;

public class EditDistance {

	public static void main(String[] args) {
		String str1 = "sunday";
        String str2 = "saturday";
        
        long start = System.nanoTime();
        System.out.println( editDistDP( str1 , str2 , str1.length(), str2.length()) );
        long end = System.nanoTime();
        System.out.println("first:: "+(end-start));
        
        start = System.nanoTime();
        System.out.println( editDistDP1( str1 , str2 , str1.length()-1, str2.length()-1) );
        end = System.nanoTime();
        System.out.println("second:: "+(end-start));
        
        int[][] mem = new int[str1.length()][str2.length()];
        
        for(int[] x:mem){
        	Arrays.fill(x, Integer.MAX_VALUE);
        }
        
        for(int[] x:mem){
        	System.out.println(Arrays.toString(x));
        }
        
        
        start = System.nanoTime();
        System.out.println( editDistDP2( str1 , str2 , str1.length()-1, str2.length()-1, mem) );
        end = System.nanoTime();
        System.out.println("third:: "+(end-start));
        
        for(int[] x:mem){
        	System.out.println(Arrays.toString(x));
        }
	}

	private static int editDistDP2(String str1, String str2, int m, int n, int[][] mem) {
		
		if(n==0)
			return mem[m][n]=m;
		
		if(m==0)
			return mem[m][n]=n;
		
		if(mem[m][n]!=Integer.MAX_VALUE){
			return mem[m][n];
		}
		
		if(str1.charAt(m) == str2.charAt(n)){
			return mem[m][n]= editDistDP2(str1,str2, m-1, n-1,mem);
		}
		else{
			int a = editDistDP2(str1, str2,m-1,n,mem);
			int b = editDistDP2(str1, str2,m,n-1,mem);
			int c = editDistDP2(str1, str2,m-1,n-1,mem);
			return mem[m][n]= 1 + Math.min(Math.min(a, b), c);
		}
		
		
		
	}

	private static int editDistDP1(String str1, String str2, int m,int n) {
		
		if(n==0)
			return m;
		
		if(m==0)
			return n;
		
		if(str1.charAt(m) == str2.charAt(n)){
			return editDistDP1(str1,str2, m-1, n-1);
		}
		else{
			int a = editDistDP1(str1, str2,m-1,n);
			int b = editDistDP1(str1, str2,m,n-1);
			int c = editDistDP1(str1, str2,m-1,n-1);
			return 1 + Math.min(Math.min(a, b), c);
		}
		
		
		
	}

	private static int editDistDP(String str1, String str2, int m,int n) {
		
		if(m==0){
			return n;
		}
		
		if(n==0){
			return m;
		}
		
		int[][] mem = new int[m][n];
		
		for(int i=0;i<str1.length();++i){
			for(int j=0;j<str2.length();++j){
				
				if(i==0){
					mem[i][j] = j;
				}else if(j==0){
					mem[i][j] = i;
				}
				else if(str1.charAt(i)==str2.charAt(j)){
					mem[i][j] = (i==0||j==0)?0 :mem[i-1][j-1];
				}
				
				else{
					int a = mem[i-1][j];
					int b = mem[i][j-1];
					int c = mem[i-1][j-1];
					mem[i][j] = 1 + Math.min(Math.min(a,b), c);
				}
			}
		}
		
		/*for(int[] x: mem){
			System.out.println(Arrays.toString(x));
		}*/
		return mem[str1.length()-1][str2.length()-1];
	}

}
