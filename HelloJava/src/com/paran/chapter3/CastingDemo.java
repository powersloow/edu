package com.paran.chapter3;

public class CastingDemo {
	int num1;
	long num2;
	float num3;

	public static void main(String[] args) {
		CastingDemo cd = new CastingDemo();
		cd.num1 = 1000000000;
		cd.num2 = 10000000000l;
		cd.num3 = 12.45f;
	}

}

class studentScore {
	int engScore;
	int korScore;
	String stdName;

	public studentScore(String stdName, int korScore, int engScore) {
		this.stdName = stdName;
		this.engScore = engScore;
		this.korScore = korScore;
	}

	public void studentInfo() {
		System.out.println("==========정보 출력 시작==========");
		System.out.println("이름" + stdName);
		System.out.println("영어점수" + engScore);
		System.out.println("국어점수" + korScore);
		System.out.println("==========정보 출력 종료==========");
	}

	public double getAvg() {
		return (engScore + korScore) / 2.0;
	}
}

class OperatorDemo {
	public static void main(String[] args) {
		studentScore st1 = new studentScore("홍길동", 100, 80);
		studentScore st2 = new studentScore("임꺽정", 50, 40);
		studentScore st3 = new studentScore("변사또", 80, 80);

		st1.studentInfo();
		st2.studentInfo();
		st3.studentInfo();

		if (st1.getAvg() >= 90.0 && st1.getAvg() <= 100.0) {
			st1.studentInfo();
		}

		if (st2.getAvg() >= 90.0 && st2.getAvg() <= 100.0) {
			st1.studentInfo();
		}

		if (st3.getAvg() >= 90.0 && st3.getAvg() <= 100.0) {
			st1.studentInfo();
		}

		int a = 1;
		//int sum = ++a + 3;
		
		a += 1 + 2;
		
		System.out.println(a);

		//System.out.println(sum + " " + a);
	}
}
