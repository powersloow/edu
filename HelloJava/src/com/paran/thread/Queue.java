package com.paran.thread;


public class Queue<T> {
	T item;
	boolean available = false;

	public Queue(T item) {
		this.item = item;
	}

	public synchronized void put(T value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		item = value;
		available = true;
		notify();
	}

	public synchronized T get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notify();
		return item;
	}
}
