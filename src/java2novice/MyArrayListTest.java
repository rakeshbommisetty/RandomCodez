package java2novice;

public class MyArrayListTest {

	public static void main(String[] args) {
		MyArrayList al = new MyArrayList();
		al.add("rakesh");
		al.add("Neha");
		al.add("friends");
		
		System.out.println(al.get(0).toString()+al.get(1).toString()+al.get(2).toString());
		
		al.removeAll();
		System.out.println(al.get(0).toString()+al.get(1).toString());
	}

}
