package com.paran.thread;

public class FirstThreadDemo extends Thread{
	public void run() {
		for(int i = 0 ; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("i = > %2d\n",i);
		}
	}
	
	public static void main(String[] args) {
		FirstThreadDemo t = new FirstThreadDemo();
		t.start();
		for(int i = 0 ; i<10; i++) {
			try {
				Thread.sleep(10);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("t = > %2d\n",i);
		}
		System.out.println("main end");
	}
}
