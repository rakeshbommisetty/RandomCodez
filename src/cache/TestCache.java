package cache;

public class TestCache {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(5);
		cache.put("the ed", 1);
		cache.put("the eden", 2);
		cache.put("the eddy", 3);
		cache.put("cartoon", 4);
		cache.put("network", 5);
		
		cache.display();
		
		cache.put("the change", 6);
		cache.put("is here", 7);
		
		cache.display();
		
		cache.get("the eddy");
		
		cache.display();
		
		
	}

}
