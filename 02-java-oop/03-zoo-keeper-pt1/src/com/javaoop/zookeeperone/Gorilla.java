package com.javaoop.zookeeperone;

public class Gorilla extends Mammal {

	public Gorilla(int energyLevel) {
		// TODO Auto-generated constructor stub
		super(energyLevel);
	}
		public void throwSomething() {
			System.out.println("The gorilla threw something.");
			energyLevel -= 5;
		}
		
		public void eatBanana() {
			System.out.println("The gorilla liked his banana.");
			energyLevel += 10;
			
		}
		
		public void climb() {
			System.out.println("The gorilla went climbing.");
			energyLevel -= 10;
		}

}
