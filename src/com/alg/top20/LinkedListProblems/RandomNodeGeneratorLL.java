package com.alg.top20.LinkedListProblems;

import java.util.Random;

public class RandomNodeGeneratorLL {
	
	public static ListNode getRandom1(ListNode head){
		int size=0;
		for(ListNode current = head.next; current !=null;current = current.next){
			++size;
		}
		
		Random r = new Random();
		int rnumber = r.nextInt(size);
		
		ListNode current = head.next;
		while(rnumber > 0){					//iterating without an extra variable
			current = current.next;
			--rnumber;
		}
		return current;
	}

	/* When there is streaming data in LL old nodes will go off and only the new nodes will be
	 * stored keep coming, so 
	 * we can't go with the size of the LL.  So relay on coin toss experiment .
	 * head is 0, tail is 1
	 * If head comes keep current node, otherwise keep old node
	 */
	
	public static ListNode getRandom2(ListNode head){
		
		Random r = new Random();
		ListNode rnode = head.next;
		for(ListNode current = rnode.next; current!=null; current = current.next){
			int outcome = r.nextInt(2);
			if(outcome ==0)
				rnode = current;
		}
		return rnode;
	}

	/*
	 * to reduce the probability of current node. we are going with below approach. other wise 
	 * in above approach code is biased. Reason being, every time last time is getting 1/2 probability
	 * Already last node got 1/2. So above code is biased
	 * 
	 * for second node probability is 1/2 and for first node is 1/2. then when 3rd node comes, then probability
	 * is for 3rd is 1/2 and for second is 1/2. Already second got 1/2. to avoid it, if I go with size.
	 * assume for 100th node. that node gets only 1/100. Node other than the current node gets 99/100.
	 * Already that node got 1/99. 99/100*1/99 = 1/100. Like that all nodes gets same weightage.
	 */
	public static ListNode getRandom3(ListNode head){
		int size =1;
		Random r = new Random();
		ListNode rnode = head.next;			// keeping old node
		for(ListNode current = rnode.next; current!=null; current = current.next){
			size++;
			int outcome = r.nextInt(size);
			if(outcome ==(size-1))
				rnode = current;
		}
		return rnode;
	}
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		ListNode head = new ListNode();
		
		for (int i=1; i<n; i++){
			TestLinkedList.addFirst(head,i);
		}
		
		//TestLinkedList.getLastNode(head).next()
		
		TestLinkedList.display(head);;
		System.out.println(getRandom3(head));
/*		
		Random r = new Random();
		for(int i =0;i<n;i++){
			System.out.println(r.nextInt(2));
		}*/

	}
	


}
