package com.paran.nested;

class Student {
	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(String name, int score) {
		setName(name);
		setScore(score);
	}
}

interface IInterface {
	boolean test(Student stu);
}

public class NestedDemo {
	public static void main(String[] arg) {
		int size = 3;
		Student[] stuArr = new Student[size];

		stuArr[0] = new Student("홍길동", 100);
		stuArr[1] = new Student("임 꺽정", 30);
		stuArr[2] = new Student("변사또", 120);

		checkScoreFifty(stuArr, new IInterface() {
			public boolean test(Student stu) {
				if (stu.getScore() >= 50)
					return true;
				return false;
			}
		});

	}

	public static void checkScoreFifty(Student[] stuArr, IInterface tester) {
		for (Student ele : stuArr) {
			if (tester.test(ele)) {
				System.out.println(ele.getName());
				System.out.println(ele.getScore());
			}
		}
	}
}