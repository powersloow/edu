package com.paran.chapter13;

public class StaticTest {
	static String name = "홍길동";
	
	String address = "대한민국 순천시 조래동";
	
	public void showAddress() {
		System.out.println(address);
	}
	
	public static void showName() {
		System.out.println(name);
		// System.out.println(address); // 불가능
		// System.out.println(this.name); // 불가능
		// showAddress(); // 불가능
		
		StaticTest obj = new StaticTest();
		System.out.println(obj.address);
	}
}
