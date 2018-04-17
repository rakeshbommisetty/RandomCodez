package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BST_shortestPath {
   
    public static class Graph {
        
        int size;
        LinkedList[] list;
        
        public Graph(int size) {
           this.size = size;
            list = new LinkedList[size];
            
            for(int i=0;i<size;++i){
                list[i] = new LinkedList<Integer>();
            }
        }

        public void addEdge(int first, int second) {
            list[first].addFirst(second);
            list[second].addFirst(first);
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
            
            
            LinkedList<Integer>  ll = list[startId];
            int[] result = new int[size];
            if(ll.size() == 0){
                
                for(int i=0;i<size;++i){
                    result[i] = -1;
                }
                return result;
            }
            HashMap<Integer, Integer> visited = new HashMap<Integer, Integer>();
            LinkedList<Integer> queue = new LinkedList<Integer>();
            
            visited.put(startId,0);
            queue.add(startId);
            
            int count = 0;
            while(queue.size() != 0){
                count++;
                int s = queue.poll();
                
                Iterator<Integer> i = list[s].listIterator();
                while (i.hasNext())
            {
                int n = i.next();
                if (visited.get(n)==null)
                {
                    visited.put(n,count);
                    queue.add(n);
                }
            }
            }
            
            
            
            for(Map.Entry<Integer,Integer> entry: visited.entrySet()){
                int index = entry.getKey();
                result[index] = entry.getValue()*6;
                
            }
            
            for(int x=0;x<result.length;++x){
                if(result[x]==0)
                    result[x]=-1;
            }
            return result;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
}

