package crackcode.ArraysStrings;

import java.util.Arrays;

public class IsPalindrome {

	public static void main(String[] args) {
		String s = "rakesh";
		System.out.println(isPalindrome(s.toCharArray()));
		System.out.println(isPermutationOfPalindrome(s));
		System.out.println(isPermutationOfPalindrome1(s));
	}
	
	private static boolean isPermutationOfPalindrome1(String s) {
		int checker =0;
		for(int i=0;i<s.length();++i){
			int diff = s.charAt(i) - 'a';
			int mask = 1 << diff;
			if((checker & mask) > 0){
				checker &= ~mask;
			}else{
				checker |= 1<<diff;
			}
		}
		return (((checker -1) & (checker)) <= 0);
	}

	static boolean isPermutationOfPalindrome(String phrase) {
		int countOdd = 0;
		int[] table = new int[128];
		for (char c: phrase.toCharArray()) {
		int x = Character.getNumericValue(c);
		if (x != -1) {
		table[x]++;
		if (table[x] % 2== 1) {
		 countOdd++;
		 } else {
		 countOdd--;
		 }
		 }
		 }
		 return countOdd <= 1;
		 }

	private static boolean isPalindrome(char[] in) {
		
		Arrays.sort(in);
		
		if(in.length%2==0){
			int count=0;
		for(int i=0; i<in.length;++i){
			
			if(i+1 <in.length && in[i]==in[i+1]){
				count++;
			}else if(i+1<in.length && in[i] != in[i+1]){
				if(count%2==0){
					return false;
				}
				count=0;
			}else{
				continue;
			}
		}
		
		}else{
			
			boolean foundOdd =false;
			int count=0;
			for(int i=0;i<in.length;++i){
				if(i+1 < in.length && in[i]==in[i+1]){
					count++;
				}else if(i+1<in.length && in[i]!=in[i+1]){
					if(count%2==0 && foundOdd==true){
						return false;
						
					}else if(count%2==0 && foundOdd==false){
						foundOdd=true;
					}
					count=0;
				}
			}
		}
		return true;
		
		
	}

}
