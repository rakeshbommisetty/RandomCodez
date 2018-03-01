package set;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeSet implements ISortedSet {
	private BTreeNode root;
	private int size;
	

	@Override
	public boolean add(Integer i) {
		BTreeNode result;
		if(root==null){
			root = auxAdd(root,i);
			if(root==null) return false;
		}else{
			result = auxAdd(root,i);
			if(result==null) return false;
		}

		return true;

	}

	private BTreeNode auxAdd(BTreeNode current, Integer i) {
		BTreeNode left, right;
		if(current==null){
			++size;
			return new BTreeNode(i);
		}
		
		int res = i.compareTo(current.data);
		
		 if(res==0){
			 return null;
		 }else if(res < 0){
			 
			 left = auxAdd(current.left,i);
			 if(left== null){
				 return null;
			 }else{
				 ++current.lst_size;
				 current.left = left;
			 }
		 }else{
			 
			 right = auxAdd(current.right,i);
			 if(right == null) return null;
			 else{
				 current.right = right;
			 }
		 }
		
		return current;
		
		
	}

	@Override
	public boolean remove(Integer i) {

		return false;

	}

	@Override
	public boolean contains(Integer i) {
		BTreeNode current = root;
		
		int res = i.compareTo(current.data);
		
		while(current!=null){
		if(res==0)
			return true;
		else if(res<0)
			current = current.left;
		else
			current = current.right;
		
		}

		return false;

	}

	@Override
	public void display() {
		Queue<BTreeNode> nodes = new LinkedList<BTreeNode>();
		
		BTreeNode current = root;
		nodes.add(current);
		nodes.add(null);
	
		while(!nodes.isEmpty()){
			BTreeNode node = nodes.remove();
			if(node==null){
				if(!nodes.isEmpty())
				nodes.add(null);
				System.out.println();
			}else{
			System.out.print("("+node.data+","+node.lst_size+")");
			
			if(node.left!=null){
				nodes.add(node.left);
				
			}if(node.right!=null){
				nodes.add(node.right);
				
			}
			}
			
			
		}
	}
	
	@Override
	public int size() {

		return size;

	}

	@Override
	public Integer findMin() {
		BTreeNode current = root;
		if(current==null) return null;
		while(current.left!=null){
			current = current.left;
		}

		return current.data;

	}

	@Override
	public Integer select(int k) {
		BTreeNode current = root;
		Stack<BTreeNode> stack = new Stack<BTreeNode>();
		if(current==null) return null;
		int count=0;
		
		while(true){
		while(current!=null){
			stack.push(current);
			current= current.left;
		}
		if(stack.empty()){
			break;
		}
		
		current = (BTreeNode) stack.pop();
		if(++count==k) return current.data;
		current = current.right;
		}

		return null;

	}
	
	public Integer select1(int k) {
		BTreeNode current = root;
		while(current != null){
		if(k==current.lst_size+1){
			return current.data;
		}else if(k<current.lst_size+1){
			current = current.left;
		}else{
			k=k-(current.lst_size+1);
			current = current.right;
		}
		}
		return null;	
	}

}
