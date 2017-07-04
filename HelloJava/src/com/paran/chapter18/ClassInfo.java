package com.paran.chapter18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassInfo {	
	int count;
	
	String stuId;
	String name;
	String code;
	int korScor;
	int engScor;

	List<Student> stuList = new ArrayList<Student>();

	public void insertStudent() {
		String fileName = "학생리스트.txt";
		try {
			BufferedReader in = new BufferedReader(new FileReader("D:\\dg\\Test\\"+fileName));
			String s;

			while ((s = in.readLine()) != null) {
				count++;
				String[] split = s.split("\t");

				stuId = split[0].trim();
				name = split[1].trim();
				code = split[2].trim();
				korScor = Integer.valueOf(split[3]);
				engScor = Integer.valueOf(split[4]);
				if (split[5].trim().equals("내국인")) {
					stuList.add(new DomeStudent(stuId, name, code, korScor, engScor));
				} else {
					stuList.add(new ForeStudent(stuId, name, code, korScor, engScor));
				}
			}
			in.close();
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		StuRank sRank = new StuRank();
		ClassInfo infoStudent = new ClassInfo();
		infoStudent.insertStudent();
		sRank.rankCheck(infoStudent);
	}
}

abstract class Student {
	private String name;
	private String stuId;
	private int korScor;
	private int engScor;
	private int totScor;
	private float avgScor;

	public int getTotScor() {
		return totScor;
	}
	public float getAvgScor() {
		return avgScor;
	}
	public int getKorScor() {
		return korScor;
	}
	public int getEngScor() {
		return engScor;
	}
	public String getName() {
		return name;
	}
	public String getStuId() {
		return stuId;
	}
	
	public void setTotScor() {
		this.totScor = korScor + engScor;
	}
	public void setAvgScor() {
		this.avgScor = totScor / 2;
	}
	public void setKorScor(int korScor) {
		this.korScor = korScor;
	}
	public void setEngScor(int engScor) {
		this.engScor = engScor;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public abstract void showInfo();
}

class DomeStudent extends Student {
	private String resiId;

	public String getResiId() {
		return resiId;
	}
	public void setResiId(String resiId) {
		this.resiId = resiId;
	}

	public DomeStudent(String stuId, String name, String code, int korScor, int engScor) {
		super();
		setStuId(stuId);
		setName(name);
		setResiId(code);
		setKorScor(korScor);
		setEngScor(engScor);
		setTotScor();
		setAvgScor();
	}

	public void showInfo() {
		System.out.print("name : " + getName());
		System.out.print("\t stuId : " + getStuId());
		System.out.print("\t korScor : " + getKorScor());
		System.out.print("\t engScor : " + getEngScor());
		System.out.print("\t totScor : " + getTotScor());
		System.out.print("\t avgScor : " + getAvgScor());
		System.out.print("\t resiId :\t" + getResiId());
		System.out.println();
	}
}

class ForeStudent extends Student {
	private String foreignId;

	public String getForeignId() {
		return foreignId;
	}
	public void setForeignId(String foreignId) {
		this.foreignId = foreignId;
	}
	
	public ForeStudent(String stuId, String name, String code, int korScor, int engScor) {
		super();
		setStuId(stuId);
		setName(name);
		setForeignId(code);
		setKorScor(korScor);
		setEngScor(engScor);
		setTotScor();
		setAvgScor();
	}

	public void showInfo() {
		System.out.print("name : " + getName());
		System.out.print("\t stuId : " + getStuId());
		System.out.print("\t korScor : " + getKorScor());
		System.out.print("\t engScor : " + getEngScor());
		System.out.print("\t totScor : " + getTotScor());
		System.out.print("\t avgScor : " + getAvgScor());
		System.out.print("\t foreignId :\t" + getForeignId());
		System.out.println();
	}
}

class StuRank {
	Student[] stuR;
	
	public void insertArr(ClassInfo infoStudent) {
		stuR = new Student[infoStudent.count];
	
		for(int i = 0; i<stuR.length; i++) {
			stuR[i] = infoStudent.stuList.get(i);
		}
	}

	public void rankCheck(ClassInfo infoStudent) {
		insertArr(infoStudent);

		int size = stuR.length;
        int max;
        Student temp;
        
        for(int i=0; i<size-1; i++){
        	max = i;
            for(int j=i+1; j<size; j++){
                if(stuR[max].getAvgScor() < stuR[j].getAvgScor()){
                	max = j;
                }
            }
            temp = stuR[max];
            stuR[max] = stuR[i];
            stuR[i] = temp;
        }
		printStuRank();
	}

	private void printStuRank() {
		for(int i = 0; i<stuR.length;i++) {
			System.out.print("rank : "+(i+1)+"\t");
			stuR[i].showInfo();
		}
	}
}