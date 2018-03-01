package linkedList;
import java.util.Random;



import list.*;

public class KthElementFromEnd {

	public static void testLinkedList(ILinkedList list, int n) {
		//get method call will be attached to either ArrayList's get or LinkedList's get at runtime
		Random r = new Random(100);
		long start = System.currentTimeMillis();
		for(int i = 0; i < n; ++i){
			int temp =r.nextInt(n) + 1;
			System.out.println(temp);
			list.add(temp);
		}
			
		long end = System.currentTimeMillis();
		System.out.println("Time taken:" + (end-start)/1000.0 + " seconds");
		list.display();
		System.out.println("  "+list.size());
		
		Node kth= findKthElement((LinkedList) list, 3);
		System.out.println("kth is:: "+kth.data);
	
	}

	private static Node findKthElement(LinkedList list, int i) {
		Node first= list.getHead().next, second= list.getHead().next;
		
		for(int k=0;k<i;++k){
			first = first.next;
		}
		
		while(first!=null){
			first = first.next;
			second = second.next;
		}
		
		return second;
		
	}

	public static void main(String[] args) {
		int n = 10;
		testLinkedList(new LinkedList(), n);
		//testList(new LinkedList(), n);
	}

}
