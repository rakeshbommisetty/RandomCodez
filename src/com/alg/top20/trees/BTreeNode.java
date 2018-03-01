package com.alg.top20.trees;

public class BTreeNode {
	Integer data;
	BTreeNode left;
	BTreeNode right;
	
	public BTreeNode(Integer data, BTreeNode left, BTreeNode right) {
		super();
		this.data = data;
		this.left = left;
	
		this.right = right;
	}
	
	public BTreeNode(int data){
		this.data = data;
	}
	
	
}
