package map;

public class TestMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap(2);
		hm.put("rakesh", 100);
		hm.put("divya eddy", 0);
		
		hm.display();
		System.out.println("size is:: "+hm.size());
		System.out.println("get method:: "+hm.get("rakesh"));
		hm.remove("divya eddy");
		hm.display();
		System.out.println("size is:: "+hm.size());
		System.out.println("get method:: "+hm.get("rakesh"));
		
		
		
		

	}

}
