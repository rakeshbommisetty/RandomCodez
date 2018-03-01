package crackcode.TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LLatEachLevel {
	
	private static List<LinkedList<BTNode>> al = new ArrayList<LinkedList<BTNode>>();

	public static void main(String[] args) {
		int[] in = {1,2,3,4,5,6,7,8,9};
		BTNode root = CreateMinHtBST.createBST(in, 0, in.length-1);
		
		LinkedList<BTNode> ll = new LinkedList<BTNode>();
		ll.add(root);
		al.add(ll);
		createLL(ll);
	}

	private static void createLL(LinkedList<BTNode> ll) {
		if(ll.getLast() ==null){
			return ;
		}
		
		for(int i=0;i<al.size();++i){
			LinkedList<BTNode> llnodes = al.get(i);
			System.out.println("Printing nodes in the Linked List::"+i);
			
			if(llnodes.size()>0){
			for(BTNode bb:llnodes){
				System.out.println(bb.data);
			}
			
			LinkedList<BTNode> tempLL=new LinkedList<BTNode>();
			for(BTNode n :llnodes){
				
				if(n!=null && n.left!=null){
					tempLL.add(n.left);
				}
				if(n!=null && n.right!=null){
					tempLL.add(n.right);
				}
			}
			
			al.add(tempLL);
			}else{
				break;
			}
		}
		
	}

}
