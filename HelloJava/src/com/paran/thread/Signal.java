package com.paran.thread;

public class Signal {

	public static void main(String[] args) {
		String buffer = new String();
		Queue<String> queue = new Queue<String>(buffer);
		Thread rThread = new Thread(new ReadThread<String>(queue));
		Thread wThread = new Thread(new WriteThread<String>(queue));
		wThread.start();
		rThread.start();
	}
}

class ReadThread<T> implements Runnable {
	Queue<T> buffer;

	public ReadThread(Queue<T> buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			Long time = System.currentTimeMillis();
			try {
				T ele = (T) buffer.get();
				System.out.println(ele);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("R" + e.getMessage());
				// break;
			}
		}
	}
}

class WriteThread<T> implements Runnable {
	Queue<T> buffer;

	public WriteThread(Queue<T> buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			Long time = System.currentTimeMillis();
			try {
				buffer.put((T) time.toString());
				System.out.println("write completely" + time);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("w" + e.getMessage());
			}
		}

	}

}