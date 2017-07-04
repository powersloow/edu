package com.paran.chapter14;

public class IngeritanceDemo {
	public static void main(String[] args) {
		/*B instB = new B();
		A instA;
		instB.methodA();
		instB.age = 1;
		// instB.salary = 1;
		
		instA = instB;
		instA.methodA();	*/
		
		B instB = new B(9);
		System.out.println(instB.age);
		
		System.out.println("---------------------------------------------------");
		B b = new B("string");
		
		System.out.println("---------------------------------------------------");
		B bb = new B(30, "첫 메모", "두번째 메모");
		System.out.println(bb.age);
		
		System.out.println("---------------------------------------------------");
		C instC = new C(0);
		System.out.println(instC.age);
		
	}
}

class A{
	public int age;
	
	public A() {		
	}
	
	public void methodA() {
		System.out.println("methodA in A class");
	}
	
	public A(int age) {
		this.age = age;
		System.out.println("A "+this.age);
	}
	
	public A(String memo2) {
		System.out.println("나는 a에요"+memo2);
	}
	
	public A(int age, String memo) {
		this.age = age;
		System.out.println("a "+age);
		System.out.println("a "+memo);
	}
	
}

class B extends A {
	public int age;
	
	public B() {	
	}
	
	@Override
	public void methodA() {
		System.out.println("methodA in B class");
	}
	
	public void methodB() {
		System.out.println("methodB in B class");
	}
	
	public B(int age) {
		super(age+1);
		this.age = age;
		System.out.println("B "+this.age);
	}
	
	public B(String memo) {
		super(memo);
		System.out.println("나는 b에요"+memo);
	}
	
	public B(int age, String memo, String memo2) {
		super(age, memo2);
		this.age = (age+6);
		System.out.println("b "+age);
		System.out.println("b "+memo);
		
	}
}

class C extends B {
	public int age;
	
	public C() {	
	}
	
	public C(int age) {
		super(age+1);
		this.age = age;
		System.out.println("C "+this.age);
	}
}