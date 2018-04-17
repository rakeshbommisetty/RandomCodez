package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningMedian {
//approach 1
  /*  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int a_i=0; a_i < n; a_i++){
            a.add(in.nextInt());
            Collections.sort(a);
            int x = (a_i+1)/2;
            if((a_i+1)%2==0){
                double f = (double)(a.get(x)+a.get(x-1))/2;
               System.out.println(String.format("%.1f",f));
            }else{
                double f = (double)a.get(x);
               System.out.println(String.format("%.1f",f));
            }
        }
    }*/
	
	//approach 2 works, approach 1 is not efficient
	
	public static void main(String[] args) {
        PriorityQueue<Integer> upperHalf = new PriorityQueue<Integer>();
       // PriorityQueue<Integer>  lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> lowerHalf = new PriorityQueue<>(Collections.reverseOrder()); 
        //double[] medians = new double[];
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int a_i=0; a_i < n; a_i++){
            //a.add(in.nextInt());
            addElement(in.nextInt(), lowerHalf, upperHalf);
            balanceHeaps(lowerHalf, upperHalf);
            double d = getMedian(lowerHalf, upperHalf);
            System.out.println(d);
            
        }
    
    }
    
    public static void addElement(int number, PriorityQueue<Integer> lowerHalf, PriorityQueue<Integer> upperHalf){
        if(lowerHalf.size()==0 || number < lowerHalf.peek()){
            lowerHalf.add(number);
        }else{
            upperHalf.add(number);
        }
    }
    
    public static void balanceHeaps(PriorityQueue<Integer> lowerHalf, PriorityQueue<Integer> upperHalf){
        PriorityQueue<Integer> smallerHeap = lowerHalf.size() < upperHalf.size() ? lowerHalf : upperHalf;
        PriorityQueue<Integer> biggerHeap =  lowerHalf.size() < upperHalf.size() ? upperHalf : lowerHalf;
        
        if(biggerHeap.size() - smallerHeap.size() >= 2) {
            smallerHeap.add(biggerHeap.poll());
        }
    }
    
     public static double getMedian(PriorityQueue<Integer> lowerHalf, PriorityQueue<Integer> upperHalf){
         PriorityQueue<Integer> smallerHeap = lowerHalf.size() < upperHalf.size() ? lowerHalf : upperHalf;
        PriorityQueue<Integer> biggerHeap =  lowerHalf.size() < upperHalf.size() ? upperHalf : lowerHalf;
         
        if(smallerHeap.size() == biggerHeap.size()){
            return ((double)smallerHeap.peek() + biggerHeap.peek())/2;
        }else{
            return biggerHeap.peek();
        }
    }
}

