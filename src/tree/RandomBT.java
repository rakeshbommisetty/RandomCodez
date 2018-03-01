package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RandomBT {
	
	static BTreeNode root;

	public static void main(String[] args) {
		int n=10;
		
		createBinaryTree(n);
		display();
	}

	public static BTreeNode createBinaryTree(int n) {
		
		Random r =new Random();
		for(int i=0;i<n;++i){
			int data = r.nextInt(n)+1;
		if(root==null){
			root = new BTreeNode(data);
		}else{
		addNode(data);
		}
		
	}
		
		return root;

}

	private static void addNode(int data) {
		BTreeNode current = root;
		
		while(true){
		if(Math.random() < 0.5){
			if(current.left==null){
				current.left = new BTreeNode(data);
				return;
			}
			current = current.left;
		}else{
			if(current.right==null){
				current.right = new BTreeNode(data);
				return;
			}
			current = current.right;
		}
		}
	}
	
	public static void display(){
		BTreeNode current = root;
		Queue<BTreeNode> queue = new LinkedList<BTreeNode>();
		queue.add(current);
		queue.add(null);
		
		while(!queue.isEmpty()){
			BTreeNode node = queue.remove();
			
			if(node==null){
				if(!queue.isEmpty()){
					queue.add(null);
				}
				System.out.println();
				
				
			}else{
			System.out.print(node.data+" ");
			
			if(node.left!=null){
				queue.add(node.left);
			}
			
			if(node.right!=null){
				queue.add(node.right);
			}
			
			
			
		}
		}
	}
}
