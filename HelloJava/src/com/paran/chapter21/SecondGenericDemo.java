package com.paran.chapter21;

public class SecondGenericDemo {
	public static void main(String[] args) {
		Plants refPlants;
		Fruit<Seed> refFruit;
		// Fruit<SeedSeed> refFruitrefFruit;
		Apple<Seed, String> refApple = new Apple<>(new Seed(), "1111");
		Mango<Seed> refMango;
		
		refFruit = refApple;
	}
}

interface Plants {
	public int photoSynthersize(int amountOfCo2);
}

class Fruit<T> implements Plants {
	public T seedType;
	
	@Override
	public int photoSynthersize(int amountOfCo2) {
		
		return amountOfCo2;
	}
}

class Apple<T extends Seed, S> extends Fruit<T> {
	public S var;
	public Apple(T seedType, S var) {
		this.seedType = seedType;
		this.var = var;
	}
}

class Mango<T extends Seed> extends Fruit<T> {
	
}

class Seed {
	
}