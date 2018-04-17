package hackerRank;

import hackerRank.Trie.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrieHM {

	public static void main(String[]  args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node root = new Node();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            
            switch(op){
                case "add" : 
                root.add(contact);
                break;
                
                case "find" : 
                System.out.println(root.findCount(contact, 0));
                break;
                
                default : 
                System.out.println("Invalid Input");
            }
        }
    
	}
	
	public static class Node{
		int size=0;
		Map<Character, Node> children = new HashMap<Character, Node>();
		
		public void add(String str){
			add(str, 0);
		}

		private void add(String str, int i) {
			
			if(i==str.length()){
				return;
			}
			size++;
			Node child = children.get(str.charAt(i));
			if(child==null){
				child = new Node();
				children.put(str.charAt(i), child);
			}
			
			child.add(str, i+1);
		}
		
		public int findCount(String str, int i){
			if(i==str.length()){
				return size;
			}
			
			Node child = children.get(str.charAt(i));
			
			if(child==null){
				return 0;
			}
			
			return child.findCount(str, i+1);
		}
		
	}
}
