package com.alg.top20.oop.extensibility;

import java.util.Random;

public class TestList {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		testList(new LinkedList(), n );
		//testList(new ArrayList(), n );
	}
	
	public static void testList(IList list, int n){
		
		Random r = new Random(100);
		for (int i=0;i<n;i++){
			list.add(r.nextInt(n)+1);
			
			list.display();
		}
	}

}
