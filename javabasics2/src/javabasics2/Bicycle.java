package javabasics2;

public class Bicycle extends Vehicle {
	double wheels=2;
	
	@Override
	void go() {
		System.out.println("The bicycle is moving");
	}
}
