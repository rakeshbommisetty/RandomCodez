package com.alg.top20.LinkedListProblems;

public class FindLoopInLL {
	
	//1) Data structure technique is to store all the next pointers in a data structure like list or set and
	//check for repetition. Time complexity for this is 
	// n * 2 * O(1) -- 2 checks, one for add and one for contains inside hashset or any other data structure. n nodes
	//Space complexity -- O(n)
	// It is not good to choose list, because contains check in list takes O(n). So we should use Set DS.
	
	//2) Having a flag in each node. So we would end with null in no loop case or we can identify with flag. But LL by 
	// default doesn't have a flag. So use address location or next element itself. Just negate next value and keep if 
	// visited
	
/*	for(current = head; current !=null; current = temp){
		if(current.next > 0){
			temp = current.next;
			current.next = current.next * -1;
		}else if(current.next < 0){
			System.out.println("loop exists");
		}
	}*/

	// complexity is O(n) - 2 times to loop, once to check and the other loop is change negated next address locations to 
	// positives.

	//3) two pointer approach: one pointer goes double the speed of other pointer.
	//  Time Complexity: Max 3n, assume circular track, 2 ppl with one person speed double than other person. 2 ppl together
	// will make 3 rotations. Space complexity: O(1) - no extra space required.
	
	// total links =n, if k is no.of links inside loop, then remaining links before loop begins are n-k
	//max is <= (n-k) (1+2) + k (1+2) 
	// <= 3n -3k + 3k   = Max of 3n
	
	//4) two pointers, one pointer goes with triple speed than other. There are chances that 3x guy may jump to x guy.
	// Use LCM of speeds for better approach.
	
	// Google pagerank uses eygen vector. 
	
	
	
	
	
}
