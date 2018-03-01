package com.alg.top20.oop.extensibility;

public interface IList {
	int get(Integer ind);
	int size();
	void add(Integer e);
	void add(Integer ind, Integer e);
	void remove(Integer ind);
	void set(Integer ind, Integer e);
	void display();
	boolean contains(Integer e);
	void reverse();
}
