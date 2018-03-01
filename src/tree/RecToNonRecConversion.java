package tree;

import java.util.Stack;




public class RecToNonRecConversion {

	public static void main(String[] args) {
		int n=10;
		RandomBT rbt = new RandomBT();
		BTreeNode root= rbt.createBinaryTree(n);
		rbt.display();
		System.out.println("display done");
		BTreeNode current = root;
		rec1(current);
		System.out.println("-----level----");
		nonrec1(current);
		System.out.println("-----level----");
		rec2(current);
		System.out.println("-----level----");
		nonrec2(current);
		System.out.println("-----level----");
		rec3(current);
		System.out.println("-----level----");
		nonrec3(current);
		System.out.println("-----level----");
		//rec4(current);
	}

	static class StackInfo {
		BTreeNode node;
		boolean flag;
		public StackInfo(BTreeNode node, boolean flag) {
			super();
			this.node = node;
			this.flag = flag;
		}
		
	}
	//TC:O(n) SC:O(h)  stack from heap segment
	public static void nonrec3(BTreeNode current) {
		Stack<StackInfo> stack = new Stack<StackInfo>();
		while (true) {
			while (current != null) {		
				stack.push(new StackInfo(current, false));
				current = current.left;
			}
			if(stack.isEmpty()) break;
			StackInfo tmp = stack.pop();
			
			if(tmp.flag == false) {
				tmp.flag = true;
				stack.push(tmp);
				current = tmp.node.right;
			} else {
				System.out.print(tmp.node.data+" ");
				//just to continue with pop statement
				current = null;
			}
		}
	}
	
	//TC:O(n) sc:O(h) process stack
	public static void rec4(BTreeNode current) {
		if (current == null) return;
		System.out.print(current.data+ " ");
		rec3(current.right);
		System.out.print(current.data+ " ");
		rec3(current.left);		
	}

	private static void rec3(BTreeNode current) {
		if(current==null) return;
			
		rec3(current.left);
		rec3(current.right);
		System.out.println(current.data+" ");
	}

	private static void nonrec2(BTreeNode current) {
		Stack<BTreeNode> stk = new Stack<BTreeNode>();
		while(true){
			while(current!=null){
				stk.push(current);
				current = current.left;
			}
			
			if(!stk.isEmpty()){
				current = stk.pop();
				System.out.println(current.data);
				current = current.right;
			}else break;
		}
	}

	private static void rec1(BTreeNode current) {
		if(current==null) return;
		System.out.println(current.data+" ");
		
		rec1(current.left);
		rec1(current.right);
	}
	
	private static void nonrec1(BTreeNode current){
		Stack<BTreeNode> stk = new Stack<BTreeNode>();
		while(true){
			while(current!=null){
				System.out.println(current.data+" ");
				stk.push(current);
				current = current.left;
			}
			
			if(!stk.isEmpty()){
				current = stk.pop();
				current = current.right;
			}else{
				break;
			}
		}
	}
	
	private static void rec2(BTreeNode current){
		if(current==null) return;
		
		rec2(current.left);
		System.out.println(current.data+" ");
		rec2(current.right);
	}

}
