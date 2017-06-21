package javaProject;

public class Car extends Vehicle {

public Car(String isdevice){
	super(isdevice);
}
public Car()
{
	super();
}

public String add (String s){
	System.out.println("I am in Car");
	return s;
	
}
}
