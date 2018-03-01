package set;

public class TestMap {

	public static void main(String[] args) {
		HashSet hm = new HashSet(2);
		hm.add(100);
		hm.add(0);
		hm.add(-1);
		
		hm.display();
		System.out.println("size is:: "+hm.size());
		System.out.println("contains ?:: "+hm.contains(0));
		System.out.println("contains ?:: "+hm.contains(-2222));
		hm.remove(0);
		System.out.println("re addding 100:: "+hm.add(100));
		System.out.println("new element null:: "+hm.add(null));
		
		hm.display();
		System.out.println("size is:: "+hm.size());
		System.out.println("contains ?:: "+hm.contains(100));
		System.out.println("contains ?:: "+hm.contains(0));
		
		
		
		

	}

}
