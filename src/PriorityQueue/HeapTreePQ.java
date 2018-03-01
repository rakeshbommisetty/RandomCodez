package PriorityQueue;

import java.util.ArrayList;

public class HeapTreePQ implements IPQueue {
	
	private ArrayList<Integer> heapTree;
	
	public HeapTreePQ(){
		
		heapTree = new ArrayList<Integer>();
	}

	@Override
	public void add(Integer a) {
		heapTree.add(a);
		Integer lastIndex = heapTree.size()-1;
		while(lastIndex>0){
			Integer parentIndex = (lastIndex-1)/2;
			int res = heapTree.get(lastIndex).compareTo(heapTree.get(parentIndex));
			if(res<0){
				swap(lastIndex,parentIndex);
				lastIndex= parentIndex;
			}else{
				break;
			}
			
		}
	}

	private void swap(Integer lastIndex, Integer parentIndex) {
		int temp = heapTree.get(lastIndex);
		heapTree.set(lastIndex, heapTree.get(parentIndex));
		heapTree.set(parentIndex, temp);
	}

	@Override
	public Integer removeMin() {
		int current =0;
		int rem = heapTree.remove(current);
		heapTree.add(current,heapTree.remove(heapTree.size()-1));
	  
	  
	  
	  while(current<heapTree.size()-1)
	    {
	  
	  int leftIndex = 2*current+1;
	  int rightIndex =2*current+2;
	  int minChildIndex = leftIndex;
	  
	  if(leftIndex > heapTree.size()-1){
	    break;
	  }
	  
	  if(rightIndex < heapTree.size()){
	   int res = heapTree.get(leftIndex).compareTo(heapTree.get(rightIndex));
	    if(res>0)
	    
	      minChildIndex = rightIndex;
	  }
	  
	    int result =   heapTree.get(current).compareTo(heapTree.get(minChildIndex));
	    if(result > 0){
	      swap(current, minChildIndex);
	      current = minChildIndex;
	    }else
	      break;
	  } 
	  
	  return rem;
	  }

	@Override
	public Integer size() {
		
		return heapTree.size();
		
		
	}

	@Override
	public Integer findMin() {
		
		return heapTree.get(0);
		
		
	}

	@Override
	public void display() {
		System.out.println(heapTree);
	}

	@Override
	public boolean isEmpty() {
		
		return heapTree.isEmpty();
		
		
	}

}
