package com.alg.top20.oop.encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		System.out.println(new Dummy(10,20).add());
	}

}

class Dummy{
	private int a;
	private int b;
	
	public Dummy(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public int add(){
		return (a+b);
	}
	
	public int mul(){
		return (a*b);
	}
	
	public int div(){
		return (a/b);
	}
	
	public int sub(){
		return (a-b);
	}
}
