package com.alg.top20.list;

public class ArrayList_rak implements IList {

	
	private int[] array;
	private int size;
	private static final int DEFAULT_CAPACITY = 11;
	
	public ArrayList_rak(){
		array = new int[DEFAULT_CAPACITY];
		size=0;
	}
	
	@Override
	public int get(int ind) {
		
		return 0;
		
		
	}

	@Override
	public int size() {
		
		return 0;
		
		
	}

	@Override
	public void add(int e) {
		
		if(size == array.length){
			doubling(size);
		}
		
		array[size++] = e;
	}

	private void doubling(int size) {
		int[] newarray = new int[2*array.length];
		for(int i=0;i<array.length;++i){
			newarray[i] = array[i];
			
		}
		array = newarray;
	}

	@Override
	public void add(int ind, int e) {
	}

	@Override
	public void remove(int ind) {
	}

	@Override
	public void set(int ind, int e) {
	}

	@Override
	public void display() {
	}

	@Override
	public boolean contains(int e) {
		
		return false;
		
		
	}

	@Override
	public void reverse() {
	}

}
