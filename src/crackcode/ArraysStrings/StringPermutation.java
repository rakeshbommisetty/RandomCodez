package crackcode.ArraysStrings;

import java.util.Arrays;

public class StringPermutation {

	public static void main(String[] args) {
		String str = "rrrhh";
		String rts = "rrhhh";
		
		System.out.println(findIsPermutation(str,rts));
		System.out.println(permutation(str,rts));

	}
	
	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
		return false;
		}
		
		int[] letters = new int[128]; 
		char[] s_array = s.toCharArray();
		for (char c : s_array) { 
		letters[c]++;
		}
		for (int i= 0; i < t.length(); i++) {
		int c = (int) t.charAt(i);
		letters[c]--;
		if (letters[c] < 0) {
		return false;
		}
		}
		return true;
}

	private static boolean findIsPermutation(String str, String rts) {
		
		if(str=="" || rts=="" || str.length()==0 || rts.length()==0){
			return false;
		}
		
		if(str.length()!=rts.length()){
			return false;
		}
		
		char[] a = str.toCharArray();
		Arrays.sort(a);
		
		char[] b = rts.toCharArray();
		Arrays.sort(b);
		
		for(int i=0;i<str.length();++i){
			if(a[i]!=b[i])
				return false;
		}
		
		
		
		return true;
		
		
	}

}
