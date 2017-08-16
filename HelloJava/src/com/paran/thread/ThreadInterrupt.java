package com.paran.thread;

public class ThreadInterrupt implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("main started");
		Thread t = new Thread(new ThreadInterrupt());
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();
		System.out.println("main ends");
	}
}

