package crackcode.TreesAndGraphs;


public class PathSum {

	public static void main(String[] args) {
		BTNode root = new BTNode();
		root.data = 10;
		BTNode n5 = new BTNode(5);
		BTNode n3 = new BTNode(3);
		BTNode n2 = new BTNode(2);
		BTNode n1 = new BTNode(1);
		BTNode n8 = new BTNode(8);
		root.left = n5;
		root.right = n8;
		n5.left = n3;
		n5.right = n2;
		n2.right = n1;
		
	}

}
