package javaProject;

public class Vehicle {
	String isDevice;
	
	public Vehicle(){
		
	}
	
	public Vehicle(String isDevice){
		this.isDevice = isDevice;
	}
	
public String add(String a){
	System.out.println("I am in super class" + a);
	return a;
}
}
