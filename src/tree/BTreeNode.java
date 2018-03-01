package tree;

public class BTreeNode {
BTreeNode left;
BTreeNode right;
Integer data;

public BTreeNode(){
	
}

public BTreeNode(Integer data){
	this.data = data;
}

public BTreeNode(Integer data, BTreeNode left, BTreeNode right){
	super();
	this.data = data;
	this.left = left;
	this.right = right;
}
}
