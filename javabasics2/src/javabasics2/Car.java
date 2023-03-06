package javabasics2;

public class Car extends Vehicle {
	String name="BMW";
	double price=1111111;
	boolean goodQuality=true;
	
	void go() {
		System.out.println("The car is moving");
	}
	void drive(){
		System.out.println("The car is driving");
	}
	void brake() {
		System.out.println("The car is braking");
	}
}
