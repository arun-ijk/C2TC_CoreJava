package com.tnsif.interfaces;

public class Client {

	public static void main(String[] args) {

		Animal animal1 = new Tiger();
		animal1.eat();
		animal1.legs();
		
		Animal animal2 = new Cow();
		animal2.eat();
		animal2.legs();

	}

}
