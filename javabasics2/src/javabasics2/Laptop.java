package javabasics2;

public class Laptop {
	private String make;
	private String model;
	private double price;
	
	Laptop(String make,String model,double price){
		this.setMake(make);
		this.setModel(model);
		this.setPrice(price);
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void copy(Laptop y) {
		this.setMake(y.getMake());
		this.setModel(y.getModel());
		this.setPrice(y.getPrice());
	}
}
