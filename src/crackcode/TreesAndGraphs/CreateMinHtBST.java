package crackcode.TreesAndGraphs;

class BTNode{
	int data;
	BTNode left;
	BTNode right;
	
	public BTNode(){
		
	}
	
	public BTNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class CreateMinHtBST {

	public static void main(String[] args) {
		int[] in = {1,2,3,4,5,6,7,8,9};
		BTNode root = createBST(in, 0, in.length-1);
		
		display(root);
		
	}

	private static void display(BTNode root) {
		if(root==null){
			return;
		}
		display(root.left);
		System.out.print(root.data);
		display(root.right);
		
	}

	public static BTNode createBST(int[] in, int start, int end) {
		if(start>end){
			return null;
		}
		int mid = (start + end)/2;
		BTNode btn = new BTNode(in[mid]);
		btn.left = createBST(in, start, mid-1);
		btn.right = createBST(in, mid +1, end);
		
		return btn;
		
	}

}
