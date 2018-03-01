package crackingcode.Stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(5);
		s1.push(10);
		s1.push(1);
		s1.push(9);
		s1.push(19);
		s1.push(90);
		Queue uu = new LinkedList();
		uu.poll();
		
		
		sortStack(s1);
		
		System.out.println(s1.toString());

	}

	private static void sortStack(Stack<Integer> s1) {
		Stack<Integer> s2 = new Stack<Integer>();
		
		while(!s1.isEmpty()){
			
			int temp = s1.pop();
			
			while(!s2.isEmpty() && s2.peek() > temp){
				s1.push(s2.pop());
			}
			
			s2.push(temp);
			
		}
		
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
	}

}
