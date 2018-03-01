package java2novice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DupCharsInString {

	public static void main(String[] args) {
		String str = "rakeshbommisetty";
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		Set<Character> set = new HashSet<Character>();
		for(int i=0; i<str.length(); ++i){
			if(hm.containsKey(str.charAt(i))){
				set.add(str.charAt(i));
			}else
				hm.put(str.charAt(i), 1);
			
		}
		
		System.out.println(set);
	}

}

