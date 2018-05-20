package com.alg.top20.basic;

public class DistanceBWStrings {

	public static void main(String[] args) {
		String str = "The picture quality is great of this camera";
		String s = "picture";
		String ss = "this";
		
		int first = str.indexOf(s);
		int last = str.indexOf(ss);
		first += s.length();
		System.out.println(last-first);
		
	}

}
