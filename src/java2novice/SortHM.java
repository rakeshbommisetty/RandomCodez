package java2novice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHM {

	public static void main(String[] args) {

		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("king", 13);
		hm.put("jackey", 11);
		hm.put("queen", 12);
		hm.put("a",14);
		
		List<Map.Entry<String, Integer>> l = sortHmByValues(hm);
		
		for(Map.Entry<String, Integer> e: l){
			System.out.println(e.getKey()+"::"+e.getValue());
		}
		
		System.out.println();
		l = sortHmByKeys(hm);
		
		for(Map.Entry<String, Integer> e: l){
			System.out.println(e.getKey()+"::"+e.getValue());
		}
	}
	
	private static List<Entry<String, Integer>> sortHmByKeys(
			Map<String, Integer> hm) {
		
		Set<Map.Entry<String, Integer>> set = hm.entrySet();
		List<Map.Entry<String, Integer>> li = new ArrayList<Map.Entry<String, Integer>>(set);
		
		Collections.sort(li, new Comparator<Map.Entry<String, Integer>>(){

			public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
				
				String s1 = e1.getKey();
				String s2 = e2.getKey();
				int s1l = s1.length();
				int s2l = s2.length();
				int sMin = Math.min(s1l, s2l);
				
				int i=0;
				while(i<sMin){
					if(s1.charAt(i) != s2.charAt(i)){
						return s1.charAt(i) - s2.charAt(i);
					}
					i++;
				}
				
				return s1l - s2l;
				
				
			}
			
		});
		
		return li;
		
		
	}

	private static List sortHmByValues(Map hm) {
		Set<Map.Entry<String,Integer>> mapSet = hm.entrySet();
		List<Map.Entry<String, Integer>>	mapList = new ArrayList<Map.Entry<String,Integer>>(mapSet);
		Collections.sort(mapList, new Comparator<Map.Entry<String,Integer>>(){
			public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2){
				//return e2.getValue().compareTo(e1.getValue());
				Integer i1 = e1.getValue();
				Integer i2 = e2.getValue();
				
				return (i1<i2)? 1 : ((i1>i2) ? -1 : 0);
				
			}
		});
		return mapList;
	}

}
