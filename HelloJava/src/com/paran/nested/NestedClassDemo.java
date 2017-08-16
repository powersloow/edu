package com.paran.nested;

public class NestedClassDemo {
	private int age;
	class InnerClass {
		public void showAge() {
			System.out.println("age = "+age);
		}
	}
}
