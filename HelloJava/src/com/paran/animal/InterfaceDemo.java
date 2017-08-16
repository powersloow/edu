package com.paran.animal;

public class InterfaceDemo {
	public static void main(String[] args) {
		Animal obj1 = new Memal();
		Animal obj2 = new Aepbian();
		
		
	}
}

interface Animal {
	abstract public void eat();
	abstract public void travel();	
}

class Memal implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		
	}
	
}

class Aepbian implements Animal {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		
	}
}