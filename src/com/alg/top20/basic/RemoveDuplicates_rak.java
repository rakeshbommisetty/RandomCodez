package com.alg.top20.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class RemoveDuplicates_rak {

	public static void main(String[] args) {
		ArrayList<Integer>	al = new ArrayList<Integer>(40);
		
		for(int i=0; i<Integer.parseInt(args[0]); i++){
			al.add(i);
//	can't do like that bcoz of IndexOOBound Exception al.add(i+Integer.parseInt(args[0]), i);
			al.add(i+2);
			al.add(i+1);
			al.add(i+1);
			al.add(i+3);
			
		}
		
		System.out.println(al.toString());
		
		Collections.sort(al);
		System.out.println(al.toString());
		for(int i=0;i<al.size();i++){
			if((i+1<al.size()) && al.get(i) == al.get(i+1)){
				al.remove(i);
				i--;
			}
			
		}
		
		System.out.println(al.toString());
	}

}
