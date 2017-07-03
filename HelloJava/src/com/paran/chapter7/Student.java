package com.paran.chapter7;
public class Student {
	String name;
	String stuID;
	protected boolean isMilser;

	public Student(String stdName, String stuID, boolean isMilser) {
		this.name = stdName;
		this.stuID = stuID;
		this.isMilser = isMilser;
	}

	public boolean getIsMilser() {
		return isMilser;
	}

	public void showInfo() {
		System.out.println(name+","+stuID+","+isMilser);
	}
}