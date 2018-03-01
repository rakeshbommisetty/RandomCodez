package geeksForGeeks.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

/*Don't get confused with the images shown in geeksForGeeks, it is not the internal structure of minHeap, it is the internal structure of
the nodes and the children we are adding . We are building minHeap in below process and so PriorityQueue always gives out min value from the minHeap.
PriorityQueue, is giving min values from the nodes which we add. Setting left and right doesn't mean we are adding those nodes. We are adding only one node, left and right nodes
are just memory addresses as like other primitives in HuffmanNode. PriorityQueue used comparator logic to arrive at the min value and keeps that as root, so that with constant
time it ll give out the min element in the minHeap.*/

class HuffmanNode{
	char c;
	int freq;
	HuffmanNode left;
	HuffmanNode right;
	
	public HuffmanNode(){
		
	}
	
	public HuffmanNode(char c,int freq){
		this.c = c;
		this.freq = freq;
		this.left = null;
		this.right = null;
	}
}

class NodeComparator implements Comparator<HuffmanNode>{
	public int compare(HuffmanNode h1, HuffmanNode h2){
		return h1.freq - h2.freq;
	}
}
public class HuffmanCoding {

	public static void main(String[] args) {
		char[] chars = {'a','b','c','d','e','f'};
		int[] freqs = {5,9,12,13,16,45};
		
		PriorityQueue<HuffmanNode> pq= createMinHeap(chars,freqs);
		
		PriorityQueue<HuffmanNode> hfpq = createHuffManPQ(pq);
		
		printPrefixCodes(hfpq);
	}

	private static void printPrefixCodes(PriorityQueue<HuffmanNode> hfpq) {
		HuffmanNode	root = hfpq.peek();
		auxPrefixCodes(root, new String());
	}

	private static void auxPrefixCodes(HuffmanNode root,String s) {
		
		if(root.left==null && root.right==null && root.c!='I'){
			System.out.println(root.c +" - "+ s);
			return;
		}
		
		auxPrefixCodes(root.left, s+"0");
		auxPrefixCodes(root.right, s+"1");
	}

	private static PriorityQueue<HuffmanNode> createHuffManPQ(PriorityQueue<HuffmanNode> pq) {
		
		if(pq==null){
			return null;
		}
		
		
		
		while(pq.size()>1){
			
			HuffmanNode n1 = pq.poll();
			HuffmanNode n2 = pq.poll();
			
			HuffmanNode hf = new HuffmanNode('I', n1.freq+n2.freq);
			
			hf.left = n1;
			hf.right = n2;
			
			pq.add(hf);
			
		}
		
		return pq;
		
		
	}

	private static PriorityQueue<HuffmanNode> createMinHeap(char[] chars, int[] freqs) {
		
		PriorityQueue<HuffmanNode> pq = new PriorityQueue<HuffmanNode>(chars.length,new NodeComparator() );
		
		for(int i=0;i<chars.length;++i){
			pq.add(new HuffmanNode(chars[i], freqs[i]));
		}
		
		return pq;
	}

}
