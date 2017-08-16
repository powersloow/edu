package com.paran.chapter21;

public class FirstGenericDemo {
	public static void main(String[] args) {

		Inventory<String> inst1 = new Inventory<String>("아이템1");
		Inventory<Item> inst2 = new Inventory<Item>(new Item());
		Inventory<?> inst3 = new Inventory<String>("아이템1");
		Inventory<Object> inst4 = new Inventory<Object>(new Object());

		showInvenItemA(inst3);
		showInvenItemA(inst1);
		showInvenItemA(inst2);
		showInvenItemA(inst4);

		// showInvenItemB(inst1);
		showInvenItemB(inst2);
		// showInvenItemB(inst3);

		// showInvenItemC(inst1);
		showInvenItemC(inst2);
		// showInvenItemC(inst3);
		
		// showInvenItemD(inst1);
		showInvenItemD(inst2);
		// showInvenItemD(inst3);
	}

	// type argument가 뭐든지 pass
	public static void showInvenItemA(Inventory<?> inven) {

	}

	// type argument 가 Item is-a relation
	public static void showInvenItemB(Inventory<? extends Item> inven) {

	}

	//
	public static void showInvenItemC(Inventory<? super Item> inven) {

	}

	public static void showInvenItemD(Inventory<Item> inven) {

	}
}
