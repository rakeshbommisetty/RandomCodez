package crackcode.TreesAndGraphs;



public class IsBST {

	private static Integer lastElementData= null;
	public static void main(String[] args) {
			/*int[] in = {1,2,3,4,5,6,7,8,9};
			BTNode root = CreateMinHtBST.createBST(in, 0, in.length-1);
			BTNode current = root;
			while(current.left!=null){
				current = current.left;
			}*/
			/*int i=1;
			while(i<5){
			current.left = new BTNode(10);
			current = current.left;
			
			i++;
			}*/
			
		BTNode root = new BTNode(20);
			root.left = new BTNode(10);
			root.right = new BTNode(30);
			
			root.left.right =new BTNode(25);
			
			boolean isBST = isBST(root);
			System.out.println(isBST);
			
			root = new BTNode(20);
			root.left = new BTNode(10);
			root.right = new BTNode(30);
			
			root.left.right =new BTNode(25);
			
			isBST = isBST1(root, null,null);
			System.out.println(isBST);
	}

	private static boolean isBST1(BTNode root, Integer min, Integer max) {
		
		if(root==null){
			return true;
		}
		
		if((min!=null && root.data <= min) || (max!=null && root.data >= max)){
			return false;
		}
		
		if(!isBST1(root.left, min, root.data) || !isBST1(root.right, root.data, max)){
			return false;
		}
		return true;
		
		
	}

	private static boolean isBST(BTNode root) {
		if(root==null){
			return true;
		}

		
		if(!(isBST(root.left))){
			return false;
		}
		
		if(lastElementData !=null &&lastElementData >= root.data)
			return false;
		
		lastElementData = root.data;
		
		if(!(isBST(root.right))){
			return false;
		}
		
		return true;
	
	}
	

}

