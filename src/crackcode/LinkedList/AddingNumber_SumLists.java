package crackcode.LinkedList;

import java.util.LinkedList;

class Node{
	int data;
	Node next;

	Node(){

	}

	Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class AddingNumber_SumLists {

	private static LinkedList<Integer> total = new LinkedList<Integer>();
	

	public static void main(String[] args) {
		Node a = new Node(7);
		Node b = new Node(1);
		Node c = new Node(9);
		a.next = b;
		b.next = c;
		Node head1 =a;

		Node d = new Node(5);
		Node e = new Node(9);
				Node f = new Node(9);
		d.next = e;
				e.next = f;
		Node head2 = d;

		doSum(head1,head2);

		doSumRecursive(head1,head2);

		a = new Node(9);
		b = new Node(1);
		c = new Node(7);
		a.next = b;
		b.next = c;
		head1 =a;

		d = new Node(9);
		e = new Node(9);
		f = new Node(5);
		d.next = e;
		e.next = f;
		head2 = d;

		total.removeAll(total);
		int carry = doSumRecursiveForward(head1, head2);
		total.addFirst(carry);
		System.out.println(total.toString());
		
		head1 = reverseLL(head1);
		head2 = reverseLL(head2);
		System.out.println("printing second number");
		doSum(head1,head2);

		





	}

	private static int doSumRecursiveForward(Node head1, Node head2) {
		if(head1 == null && head2 ==null){
			return 0;
		}
		
		int carry = doSumRecursiveForward((head1==null)?null:head1.next, (head2==null)?null:head2.next);
		int sum = ( (head1!=null)? head1.data:0) +( (head2!=null)? head2.data:0 )+ carry;
		
		total.addFirst(sum%10);
		return sum/10;
		

	}

	private static void doSumRecursive(Node head1, Node head2) {
		doSumRecAux(head1, head2, 0);
		System.out.println("sum in recursive call:: "+total.toString());
	}

	private static void doSumRecAux(Node head1, Node head2, int carry) {
		if(head1 == null && head2 ==null && carry==0){
			return;
		}

		if(head1 == null && head2 == null && carry != 0){
			while((carry)!=0){
				total.add(carry%10);
				carry = carry/10;

			}
		}else if(head1 == null || head2==null){

			int sum = (head1==null)? head2.data + carry : head1.data+carry;
			total.add((sum%10));
			doSumRecAux((head1 == null) ? null :head1.next, (head2 == null) ? null :head2.next, sum/10);

		}else{
			int sum = head1.data + head2.data + carry;
			total.add(sum%10);
			doSumRecAux(head1.next, head2.next, sum/10);
		}

	}

	private static Node reverseLL(Node head1) {
		Node current = head1;
		Node head = null;

		while(current!=null){
			Node n = new Node(current.data);
			n.next = head;
			head = n;
			current = current.next;
		}

		return head;


	}



	private static void doSum(Node a, Node d) {
		Node head = new Node();
		Node val = head;
		int x,y,sum, rem=0;


		while(a!=null || d!=null){
			x = (a!=null)?a.data:0;
			y = (d!=null)?d.data:0;
			sum = x+y;
			sum += rem;
			Node cur = new Node(sum%10);
			val.next = cur;
			val = cur;
			rem = sum/10;
			a = (a!=null)?a.next:null;
			d = (d!=null)?d.next:null;
		}

		if(rem!=0){
			Node ss = new Node(rem);
			val.next = ss;
		}

		while(head.next!=null){
			System.out.println(head.next.data);
			head = head.next;
		}

	}

}
