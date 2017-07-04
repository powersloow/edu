package com.paran.chapter13;

public class TenaryOperatorDemo {

	public static void main(String[] args) {
		String result = 1 > 3 ? "크다" : "작다";
		System.out.println(result);

		int reulst2 = 1 > 3 ? 1 : 1 > 2 ? 1 : 2;
		System.out.println(reulst2);
	}

}
