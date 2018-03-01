package com.alg.top20.trees;

public class TreeDepth {
	
	// TC n*c = O(n) n nodes, each call c time. This is same for most of the recursion problems
	//SC O(n)
	public static int treeDepth1(BTreeNode root){
		if(root == null) return 0;
		if(root.left == null && root.right == null) return 1;
		
		int lh = treeDepth1(root.left);
		int rh = treeDepth1(root.right);
		return Math.max(lh, rh) + 1;
	}

	public static void main(String[] args) {

	}

}
