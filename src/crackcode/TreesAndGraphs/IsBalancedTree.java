package crackcode.TreesAndGraphs;

public class IsBalancedTree {

	public static void main(String[] args) {
			int[] in = {1,2,3,4,5,6,7,8,9};
			BTNode root = CreateMinHtBST.createBST(in, 0, in.length-1);
			BTNode current = root;
			while(current.left!=null){
				current = current.left;
			}
			int i=1;
			while(i<5){
			current.left = new BTNode(10);
			current = current.left;
			
			i++;
			}
			
			
			
			int size = isBalancedTree(root);
			System.out.println(size);
	}

	private static int isBalancedTree(BTNode root) {
		if(root==null){
			return -1;
		}
		int leftSize = isBalancedTree(root.left);
		if(leftSize == Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		int rightSize = isBalancedTree(root.right);
		if(rightSize == Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		if(Math.abs(leftSize-rightSize) >1 ){
			System.out.println("not a balanced tree");
			return Integer.MIN_VALUE;
		}else
		return Math.max(leftSize, rightSize)+1;
	}
	

}
