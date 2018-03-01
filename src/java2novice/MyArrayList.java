package java2novice;

import java.awt.List;

public class MyArrayList{
private int initial_capacity = 10;
private int threshold = (int) (0.75 * initial_capacity);
private int size =0;
private Object[] myArray = null;

public MyArrayList(){
	myArray = new Object[initial_capacity];
}

public MyArrayList(int size){
	initial_capacity = size;
	myArray = new Object[initial_capacity];
}

public boolean add(Object input){
	if(size == threshold){
		Object[] myTempArray = new Object[2*initial_capacity];
		reArrange(myTempArray);
	}
	
	myArray[size++] = input;
	return true;
}

public void remove(int index) throws ArrayIndexOutOfBoundsException{
	
	if(index >= myArray.length)
	{	
		throw new ArrayIndexOutOfBoundsException();
	    
	}
	
	
	for(int i=index; i<size-1; ++i){
		myArray[i] = myArray[i+1];
	}
	myArray[size-1] = null;
	size--;
}

public void removeAll(){
	for(int i=0; i<size;i++){
		myArray[i] = null;
	}
}

public Object get(int index){
	if(index<=size-1)
	return myArray[index];
	
	else 
		throw new ArrayIndexOutOfBoundsException();
}

private void reArrange(Object[] myTempArray) {
	int i=0;
	for(Object o:myArray){
		myTempArray[i] = o;
		i++;
	}
	
	myArray = myTempArray;
	myTempArray = null;
}







}
