package crackingcode.Stacks;

import java.util.Stack;

public class MinStack {
	
	int initialCapacity;
	int size;
	int[] stack = new int[initialCapacity];
	
	public MinStack(){
		
	}

	public static void main(String[] args) {
		Stack myst = new Stack();
		myst.push(1);
		myst.push(2);
		myst.push(3);
		System.out.println(myst.remove(0));
		System.out.println(myst.remove(1));
		System.out.println(myst.remove(2));
		System.out.println(myst.remove(0));
	}

}
