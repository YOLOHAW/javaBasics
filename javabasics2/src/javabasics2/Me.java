package javabasics2;

public class Me {
	String power;
	String weakness;
	String favSport;
	int salary;
	boolean hardWorking;
	
	Me(String power,String weakness){
		this.power=power;
		this.weakness=weakness;
	}
	Me(String power,String favSport,int salary,boolean hardWorking){
		this.power=power;
		this.favSport=favSport;
		this.salary=salary;
		this.hardWorking=hardWorking;
	}
}
