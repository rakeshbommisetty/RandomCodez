package hackerRank;

//Java program to detect loop in a linked list
class IsLoopInLL
{
	Node head; // head of list

	/* Linked list Node*/
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	int detectLoop()
	{
		Node slow = head, fast = head;
	    while(slow!=null && slow.next!=null && fast!=null && fast.next!=null && fast.next.next!=null){
	        if(slow!=fast){
	            slow = slow.next;
	            fast = fast.next.next;
	        }else{
	            return 1;
	        }
	    }
	    
	    return 0;
	}

	/* Drier program to test above functions */
	public static void main(String args[])
	{
		IsLoopInLL llist = new IsLoopInLL();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);
		
		/*Create loop for testing */
		llist.head.next.next.next.next = llist.head;

		llist.detectLoop();
	}
} 
/* This code is contributed by Rajat Mishra. */

