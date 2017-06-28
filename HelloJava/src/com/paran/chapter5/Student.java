package com.paran.chapter5;
public class Student {
	String name;
	int stuID;
	boolean getIsMils;

	public Student(String stdName, int stuID, boolean getIsMils) {
		this.name = stdName;
		this.stuID = stuID;
		this.getIsMils = getIsMils;
	}

	public boolean getIsMilser() {
		return getIsMils;
	}

	public void showInfo() {
		System.out.println(name+","+stuID+","+getIsMils);
	}
}