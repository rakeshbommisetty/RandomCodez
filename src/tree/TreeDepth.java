package tree;

import java.util.LinkedList;
import java.util.Queue;



public class TreeDepth {

	public static void main(String[] args) {
		int n=10;
		RandomBT rbt = new RandomBT();
		BTreeNode root= rbt.createBinaryTree(n);
		rbt.display();
		System.out.println("display done");
		int res = depth1(root);
		System.out.println(res);
		
		res = depth2(root);
		System.out.println(res);
	}

	private static int depth2(BTreeNode root) {
		

		Queue<BTreeNode> queue = new LinkedList<BTreeNode>();
		queue.add(root);
		queue.add(null);
		int depth = 0;
		while (!queue.isEmpty()) {
			BTreeNode current = queue.remove();
			if (current == null) {
				++depth;
				if (!queue.isEmpty())
					queue.add(null);
			} else {
				//System.out.print(current.data + " ");
				if (current.left != null)
					queue.add(current.left);
				if (current.right != null)
					queue.add(current.right);
			}
		}
		return depth;
	
		
		
	}

	private static int depth1(BTreeNode current) {
		if(current==null) return 0;
		if(current.left==null && current.right == null) return 1;
		 int left = depth1(current.left);
		 int right = depth1(current.right);
		return Math.max(left, right) + 1;
	}

}
