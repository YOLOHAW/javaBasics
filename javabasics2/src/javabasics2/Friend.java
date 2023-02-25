package javabasics2;

public class Friend {
	String name;
	static int numberofFriends;
	
	//constructor
	Friend(String name){
		this.name=name;
		numberofFriends++;
	}
	static void displayFriends() {
		System.out.println("You have"+numberofFriends+" total friends");
	}
}
