package javabasics2;

public class Main {

	public static void main(String[] args) {
		
		//OverLoaded methods
		System.out.println(add(1,2,3,4));
		
		//printf control format and display (two arguments)
		
		boolean condition=true;
		char alphabet='y';
		String name="Cr7";
		double bigNum=1111111;
		int Num=7;
		
		System.out.printf("%b",condition);
		System.out.printf("%c",alphabet);
		System.out.printf("%s",name);
		System.out.printf("%f",bigNum);
		System.out.printf("%d",Num);
		
		System.out.printf("Hello %10s",name);//width
		System.out.printf("New number is %.2f",bigNum);//precision and flags(+,-,0,,)
		
		//final keyword dont change and can't change
		
		final double pi=3.14;
		System.out.println(pi);
		
		//OOP object an instance of class that may contain attributes and methods
		//New Car Class
		
		Car car1=new Car();
		Car car2=new Car();
		System.out.println(car1.price);
		car2.drive();
		
		//Constructors special method that is called when the object is created
		//New Human Class
		
		Human human1=new Human("Kevin Debruyne",31,true);
		Human human2=new Human("Cristiano Ronaldo",38,true);
		
		System.out.println(human1.age);
		System.out.println(human2.name);
		human1.eat();
		human2.drink();
		
		//Variable scopes local and global
		//New Dice class
		Dice dice=new Dice();
		
		//Overloaded methods multiple constructors within a class with same name,but have different params
		//New Me class
		
		Me me1=new Me("Non-Stop","Handsome");
		Me me2=new Me("Non-Stop","Football",1111111,true);
		
		System.out.println(me1.weakness);
		System.out.println(me2.power);
		
		//toString Method
		//New toString class
		toString tstr=new toString();
		System.out.println(tstr.toString());//implict
		System.out.println(tstr);//explict
		
		//Array of objs
		//New Food class
		
//		Food[] refrigerator=new Food[3];
	
		Food food1=new Food("Avocado");
		Food food2=new Food("Banana");
		Food food3=new Food("Potato");
		
//		refrigerator[0]=food1;
//		refrigerator[1]=food2;
//		refrigerator[2]=food3;
		
		Food[] refrigerator= {food1,food2,food3};
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
		//Obj Passing Car,Garage
		//New Tesla,Garage classes
		
		Garage garage=new Garage();
		
		Tesla tesla=new Tesla("whiteTesla");
		Tesla tesla2=new Tesla("purpleTesla");
		
		garage.park(tesla);
		garage.park(tesla2);
		
		//Static Keyword a single copy of var/meth is created and shared ,class owns static member
		//New Friend class
		
		Friend friend1=new Friend("Me");
		Friend friend2=new Friend("BetterMe");
		Friend friend3=new Friend("BestMe");
		
		System.out.println(Friend.numberofFriends);
		Friend.displayFriends();
		
		//Inheritance one class acquires the attributes and methods of another
		//New Vehicle,Bike,Bicycle classes
		
		Bike bike=new Bike();
		Bicycle bicycle=new Bicycle();
		
		bike.go();
		bicycle.stop();
		
		//Method overriding children method() > parent method()
		//New Animal,Dog classes
		
		Dog dog=new Dog();
		dog.speak();
		
		//Super Keyword superclass of an obj very similar to "this" keyword
		//New Person,Hero classes
		
		Hero hero1=new Hero("CR7",38,"Invincible");
		System.out.println(hero1.toString());
		
		//Abstraction can have sub class declared without an implementation
		//New Music,Rap classes
		
		Rap rap=new Rap();
		rap.listen();
		
		//Access Modifiers public protected private noModifier 
		//New package1,package2
		//Class Package Subclass World
		
		//Encapsulation attributes of classes will be hidden or private,access only through methods(getters and setters)
		
		Laptop laptop1=new Laptop("MSI","UltimateGen",1111111);
		
		laptop1.setPrice(11111);
		System.out.println(laptop1.getPrice());
		System.out.println(laptop1.getMake());
		
		
		
		
	}
	static int add(int x,int y) {
		return x+y;
	}
	static int add(int x,int y,int z) {
		return x+y+z;
	}
	static int add(int x,int y,int z,int a) {
		return x+y+z+a;
	}

}