package com.paran.thread;

public class SecondThreadDemo extends Thread {
	String name;

	public SecondThreadDemo(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("name : %s / i = > %2d\n", name, i);
		}
	}

	public static void main(String[] args) {
		SecondThreadDemo t1 = new SecondThreadDemo("t1");
		t1.start();
		SecondThreadDemo t2 = new SecondThreadDemo("t2");
		t2.start();
		SecondThreadDemo t3 = new SecondThreadDemo("t3");
		t3.start();
	}
}
