package hackerRank;

import java.util.Scanner;

//Java implementation to check if given Binary tree
//is a BST or not

/* Class containing left and right child of current
node and key value*/
class Node
{
 int data;
 Node left, right;

 public Node(int item)
 {
     data = item;
     left = right = null;
 }
}

public class BinaryTreeIsBST
{
 // Root of the Binary Tree
 static Node root;

 // To keep tract of previous node in Inorder Traversal
 Node prev;

 boolean isBST()  {
     prev = null;
     return isBST(root);
 }

 /* Returns true if given search tree is binary
    search tree (efficient version) */
 boolean isBST(Node node)
 {
     // traverse the tree in inorder fashion and
     // keep a track of previous node
     if (node != null)
     {
         if (!isBST(node.left))
             return false;

         // allows only distinct values node
         if (prev != null && node.data <= prev.data )
             return false;
         prev = node;
         return isBST(node.right);
     }
     return true;
 }

 /* Driver program to test above functions */
 public static void main(String args[])
 {
	 
	 Scanner sc = new Scanner(System.in);
	 int checkFor = sc.nextInt();
	 
	 for(int j=0;j<checkFor;++j){
		 
	 int size = sc.nextInt();
	 int[] in = new int[size];
	 
	 for(int i=0;i<size;++i){
		 in[i] = sc.nextInt();
	 }
	 BinaryTreeIsBST tree = new BinaryTreeIsBST();
	 tree.root = constTreeWithPreOrder(in,0,in.length-1);
	 
	 
   /*  BinaryTreeIsBST tree = new BinaryTreeIsBST();
     tree.root = new Node(4);
     tree.root.left = new Node(2);
     tree.root.right = new Node(5);
     tree.root.left.left = new Node(1);
     tree.root.left.right = new Node(3); */

     if (tree.isBST())
         System.out.println("YES");
     else
         System.out.println("NO");
     
	 }
 }
 
  

private static Node constTreeWithPreOrder(int[] in, int min, int max) {
	
	if(min == max){
		return new Node(in[min]);
	}
	
	if(min>max){
		return null;
	}
	
	Node parent = new Node(in[min]);
	int i=min;
	for(;i < in.length && in[i]<=in[min];++i){
		continue;
	}
	
	parent.left = constTreeWithPreOrder(in, min+1 , i-1);
	parent.right = constTreeWithPreOrder(in, i, max);
			
	return parent;
	
}


}
