package assignment.two;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String st1 = "rakesh";
		String st2 = "eshkar";
System.out.println(isAnagram(st1,st2));
	}

	private static boolean isAnagram(String s, String t) {
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		
		Arrays.sort(a);
		
		s=	Arrays.toString(a);
		Arrays.sort(b);
		t=Arrays.toString(b);
		
		if(s.equals(t))
			return true;
		else 
			return false;
		
		
	}

}
