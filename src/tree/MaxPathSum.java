package tree;

public class MaxPathSum {
	
	private static int maxSum=Integer.MIN_VALUE;

	public static void main(String[] args){
		int n=10;
		RandomBT rbt = new RandomBT();
		BTreeNode root = rbt.createBinaryTree(n);
		rbt.display();
		int res = findMaxPath1(root);
		System.out.println("result is :: "+res);
		
		res = findMaxPath2(root);
		System.out.println("result is::"+res);
	}

	private static int findMaxPath2(BTreeNode root) {
		BTreeNode current = root;
		int res = auxMaxPath2(current);
		return res;
		
		
	}

	private static int auxMaxPath2(BTreeNode current) {
		if(current==null) return 0;
		int left = auxMaxPath2(current.left);
		int right = auxMaxPath2(current.right);
		
		return Math.max(left, right) + current.data;
		
		
	}

	private static int findMaxPath1(BTreeNode root) {
		BTreeNode current = root;
		int sum=0;
		auxFindMaxPath1(current,sum);
		
		
		return maxSum;
		
		
	}

	private static void auxFindMaxPath1(BTreeNode current, int sum) {
		if(current==null) return;
		if(current.left==null && current.right==null){
			maxSum = Math.max(maxSum, current.data+sum);
			return;
		}
		
		auxFindMaxPath1(current.left, sum+current.data);
		auxFindMaxPath1(current.right, sum+current.data);
		
		
	}
	
	
}
