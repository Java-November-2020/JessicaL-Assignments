// package com.javaoop.zookeeperone;

public class MammalController {

	public static void main(String[] args) {
			Gorilla g = new Gorilla();
			System.out.println("Here is our Gorilla");
			g.displayEnergy();
			g.throwSomething();
            g.eatBanana();
            g.throwSomething();
			g.climb();
			g.eatBanana();
            g.throwSomething();
			g.displayEnergy();
			System.out.print("\n");


		Bat b = new Bat();
		System.out.println("Here is our Bat");
			b.displayEnergy();
			b.attackTown();
			b.fly();
			b.eatHumans();
			b.attackTown();
			b.fly();
			b.attackTown();
			b.eatHumans();
			b.displayEnergy();
	
	}
	
}