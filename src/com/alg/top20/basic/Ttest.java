package com.alg.top20.basic;

import java.util.ArrayList;

public class Ttest {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("aa");
		s.add("ads");
		s.add("fdsa");
		
		s.add(1, "ralesj");
		System.out.println(s.toString());
		s.set(1, "rakesh");
		ArrayList a = (ArrayList) s.clone();
		System.out.println(a.toString());
		s.clear();
		
		
		System.out.println(s.toString());
		System.out.println(a.toString());

	}

}
