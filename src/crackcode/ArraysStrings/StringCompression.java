package crackcode.ArraysStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCompression {

	public static void main(String[] args) {
		String str = "-1fvd";
		System.out.println(compress1(str));
		compress2(str);
		
	}

	private static void compress2(String str) {
		
		if(str.length()==0 || str ==""){
			return;
		}
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();++i){
			int x = str.charAt(i);
			if(x < 65 || x > 123){
				continue;
			}
			if(m.containsKey(str.charAt(i))){
				m.put(str.charAt(i), m.get(str.charAt(i))+1);
				continue;
			}
			m.put(str.charAt(i), 1);
		}
		
		System.out.println(m);
		
	}

	private static String compress1(String str) {
		
		if(str.length()==0 || str ==""){
			return null;
		}
		
		char[] a = str.toCharArray();		
		Arrays.sort(a);
		int count=1;
		StringBuilder s = new StringBuilder();
		
		for(int i=0;i<a.length;++i){
			int x = str.charAt(i);
			if(x < 65 || x > 123){
				continue;
			}
			
			if(i+1 <a.length && a[i]==a[i+1]){
				count++;
			}else if(i+1<a.length && a[i]!=a[i+1]){
				s.append(a[i]);
				s.append(count);
				count=1;
			}else if(i==a.length-1){
				s.append(a[i]);
				s.append(count);
			}
		}
		
		return s.toString();
		
		
	}

}
