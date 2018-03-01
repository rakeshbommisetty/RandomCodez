package linkedList;

import java.util.Random;

import list.LinkedList;
import list.*;

public class RandomNode {
public static void main(String[] args){
	LinkedList ll = new LinkedList();
	Random m = new Random();
	for(int i=0;i<10;++i){
		ll.add(m.nextInt(10) + 1);
	}
	
	ll.display();
	
	Node random = getRandom(ll);
	System.out.println("random node data is:: "+random.data);
}

private static Node getRandom(LinkedList ll) {
	Random r = new Random();
	
	int index = r.nextInt(ll.size())+1;
	System.out.println("random index is:: "+index);
	
	Node current = ll.getHead().next;
	for(int i=1;i<index;++i){
		current = current.next;
	}
	
	return current;
	
	
}


}
