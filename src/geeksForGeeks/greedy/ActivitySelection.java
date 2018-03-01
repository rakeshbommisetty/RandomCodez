package geeksForGeeks.greedy;

import java.util.Arrays;
import java.util.Comparator;
class Node implements Comparator {
	public Integer start;
	public Integer finish;
	
/*	public boolean equals(Object obj){
		Node n = (Node)obj;
		return this.finish == n.finish;
	}*/

	
	public int compare(Object o1, Object o2) {
		Node n1 = (Node)o1;
		Node n2 = (Node)o2;
		return n1.finish - n2.finish;
	}
	
	/*public int compareTo	(Object o1){
		Node n1 = (Node)o1;
		return this.finish - n1.finish;
	}*/
}

public class ActivitySelection {
	


	public static void main(String[] args) {
		 	int s[] =  {5,0, 1, 3, 5, 8};
		    int f[] =  {9,6, 2, 4, 7, 9};
		    Node[] nodes = new Node[s.length];
		    Node node = new Node();
		    
		    for(int i=0;i<s.length;++i){
		    	nodes[i] = new Node();
		    	nodes[i].start = s[i];
		    	nodes[i].finish = f[i];
		    }
		    int n = s.length;
		    
		    Arrays.sort(nodes, node);
		    System.out.println("sorted nodes is");
		    int i=0;
		    for(Node nn : nodes){
		    	
		    	s[i] = nn.start;
		    	f[i] = nn.finish;
		    	System.out.println(nn.start+":"+nn.finish);
		    	++i;
		    }
		    System.out.println();  
		    printMaxActivities(s, f, n);
		    
	}

	private static void printMaxActivities(int[] s, int[] f, int n) {
		int x = 0;
		System.out.println(x);
		for(int y=1; y<s.length;++y){
			if(s[y]>=f[x]){
				System.out.println(y);
				x=y;
			}
		}
	}
	

}
