package com.alg.top20.cache;

import java.util.Random;
import java.util.UUID;

public class TestCache {

	public static void testCache(ICache cache, int n){
		
		Random r = new Random();
		String temp = null;
		for(int i=1;i<=n;++i){
			//UUID generate some random numbers which can be converted to strings. 
			String key = UUID.randomUUID().toString();
			
			int value = r.nextInt(1000);
			cache.add(key, value);
			if(i==3) temp = key; // just for breakpoint
			cache.display();
		}
		
		
		System.out.println(cache.get(temp));
		cache.display();
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		testCache(new LinkedHashMapCache(10), n);
		
	}

}
