package com.paran.chapter9;

import com.paran.chapter7.Student;

public class UniStudente extends Student{
	public UniStudente(String stdName, String stuID, boolean getIsMils) {
		super(stdName, stuID, getIsMils);
	}
	
	public void showInfo() {
		super.showInfo();	
		System.out.println("제대 여부"+isMilser);
	}
	
}
