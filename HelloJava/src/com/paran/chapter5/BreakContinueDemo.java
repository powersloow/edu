package com.paran.chapter5;

public class BreakContinueDemo {
	public static void main(String[] arg) {
		int count = 10;

		for (int i = 0; i < count; i++) {
			if (i == 0 || i % 2 != 0)
				continue;
			System.out.println(i);
		}

		for (int i = 1; i < count; i++) {
			for (int j = 1; j < count; j++) {
				if (i == 2)
					return;
				// System.out.printf("%-2d*%2d = %2d\t", j, i, i*j);
				System.out.println("inner j :" + j);
			}
			System.out.println("outer i :" + i);
			System.out.println();
		}
	}
}

class factorialDemo {
	public static void main(String[] arg) {
		int count = 190;
		double sumFac = 1;
		String facLine = "";
		for (int i = 1; i <= count; i++) {
			if(i==1)
				facLine = i+facLine;
			else
				facLine = i+"*"+facLine ;
			
			sumFac *= i;
			
			System.out.printf("%2d! => %s = ",i,facLine);
			System.out.println(sumFac);
		}
	}
}
