package list;

import java.util.Arrays;

public class ArrayList implements IList {
	
	private int size;
	private int[] al = null;
	
	public ArrayList(){
		al= new int[11];
		size =0;
		
		
		
	}
	
	public ArrayList(int capacity){
		al = new int[capacity];
		size=0;
	}

	@Override
	public void add(int i) {
		if(size==al.length){
			doubling();
		}
		
		al[size++] = i;
	}

	private void doubling() {
		int[] temp = new int[al.length*2];
		
		for(int i=0;i<al.length;++i){
			temp[i] = al[i];
		}
		
		al = temp;
		temp = null;
	}

	@Override
	public int remove(int index) {
		if(index<al.length){
		int temp = al[index];
		int i;
		for(i=index;i<al.length-1;++i){
			al[i] = al[i+1];
		}
		al[i] = 0;
		size--;
		return temp;
		}else{
			throw new ArrayIndexOutOfBoundsException(index);
		}

	}

	@Override
	public boolean removeAll() {
		Arrays.fill(al, 0);
		size=0;
		return true;

	}

	@Override
	public int get(int index) {
		if(index<al.length)
			return al[index];
		else
			throw new ArrayIndexOutOfBoundsException(index);

	}

	@Override
	public void display() {
		for(int i=0;i<al.length;++i){
			System.out.print(" "+al[i]);
		}
	}

	@Override
	public int size() {

		return size;

	}

}
