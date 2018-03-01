package geeksForGeeks.greedy;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class HuffmanWithQueue {

	public static void main(String[] args) {
		char[] chars = {'a','b','c','d','e','f'};
		int[] freqs = {5,9,12,13,16,45};
		
		Queue<HuffmanNode> q1 = new LinkedList<HuffmanNode>();
		Queue<HuffmanNode> q2 = new LinkedList<HuffmanNode>();
		
		for(int i=0;i<chars.length;++i){
			q1.add(new HuffmanNode(chars[i], freqs[i]));
		}
		
		while((q1.size()+q2.size())>1){
			
			HuffmanNode min1; HuffmanNode min2;
			
			if(!q2.isEmpty() && !q1.isEmpty()){
				min1 = (q1.peek().freq < q2.peek().freq) ? q1.poll() : q2.poll();
				
			}else if(!q1.isEmpty()){
				min1 = q1.poll();
				
			}else{
				min1 = q2.poll();
				
			}
			
			
			if(!q2.isEmpty() && !q1.isEmpty()){
				
				min2 = (q1.peek().freq < q2.peek().freq) ? q1.poll() : q2.poll();
			}else if(!q1.isEmpty()){
				
				min2 = q1.poll();
			}else{
				
				min2 = q2.poll();
			}
			
			HuffmanNode hf = new HuffmanNode('I', min1.freq + min2.freq);
			hf.left = min1; hf.right = min2;
			q2.add(hf);
		}
		
		auxPrefixCodes(q2.peek(), new String());
		
	}
	
	
	private static void auxPrefixCodes(HuffmanNode root,String s) {
		
		if(root.left==null && root.right==null && root.c!='I'){
			System.out.println(root.c +" - "+ s);
			return;
		}
		
		auxPrefixCodes(root.left, s+"0");
		auxPrefixCodes(root.right, s+"1");
	}

}
