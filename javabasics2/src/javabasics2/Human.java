package javabasics2;

public class Human {
	
	String name;
	int age;
	boolean power;
	
	//Constructor 
	Human(String name,int age,boolean power){
		this.name=name;
		this.age=age;
		this.power=power;
	}
	
	void eat() {
		System.out.println(this.name+" is eating healthfully");
	}
	void drink() {
		System.out.println(this.name+" is drinking water");
	}
}
