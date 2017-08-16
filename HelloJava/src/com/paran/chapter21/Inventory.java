package com.paran.chapter21;

public class Inventory<T> {
	public T item;
	
	public Inventory(T item) {
		this.item = item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
}
