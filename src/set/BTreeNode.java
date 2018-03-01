package set;

public class BTreeNode {
BTreeNode left;
BTreeNode right;
Integer data;
int lst_size;

public BTreeNode(){
	
}

public BTreeNode(Integer data){
	this.data = data;
}

public BTreeNode(BTreeNode left, BTreeNode right, Integer data){
	super();
	this.left = left;
	this.right = right;
	this.data = data;
}

}
