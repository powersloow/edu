package com.paran.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionDemo {
	static void methodA() {
		try {
			methodB();
		} catch(Exception e) {
			System.out.println("=====error=====");
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println("===============");
		}
	}
	
	static void methodB() {
		System.out.println("c부르기 전");
		methodC();
		System.out.println("c부른 후");
	}
	static void methodC() {
		System.out.println("before exception occured");
		int i = 0;
		i = 1/0;
		System.out.println("after exception occured in methodC");
	}
	
	public static void main(String[] args) {
		methodA();
		System.out.println("main 끗");
	}
	
}

class ThorwnDemo {
	public final static int SIZE = 100;
	public static void method() throws IOException {
		PrintWriter out = new PrintWriter (new FileWriter("OutFile.txt"));
		for(int i = 0 ; i<SIZE ; i++) {
			
		}
		out.close();
	}
	
	public static void main(String[] args) throws IOException {
		method();
	}
}
