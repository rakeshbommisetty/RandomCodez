package com.alg.top20.trees;

import java.util.Random;

public class RBinaryTree {
	
	
	public static BTreeNode randomTree(int n){
		BTreeNode root = null;
		Random r = new Random();
		for(int i=0;i<n;i++){
			int tmp = r.nextInt(n) + 1;
			addElement(root, tmp);
		}
		return root;
	}

	private static void addElement(BTreeNode root, int data) {
		
		while(true){
			
		if(Math.random() < 0.5){
			//if left sub tree doesn't exits then add to left, otherwise move to left
			if(root.left == null){
				root.left = new BTreeNode(data);
				break;
			}
			else
			    root = root.left;
		}
		else{
			if(root.right == null){
				root.right = new BTreeNode(data);
				break;
			}
			else
			    root = root.right;
		}
			
		}
		
		
	}

}
