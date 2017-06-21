package javaProject;

public class GenericsTest {
@SuppressWarnings("static-access")
public static void main(String args[]){
	
	GenericsTest gt = new GenericsTest();
	gt.button(Car.class);
}
/*private void button(Class<Car> class1) {
	// TODO Auto-generated method stub
	
}*/
@SuppressWarnings("unchecked")
public static  <T extends Vehicle>  T button(Class<T> type){
	T target = null;
	try {
		String s ="deepa";
	//	target = (T) new Vehicle(isDevice);
		T t = type.newInstance();
	  t.add(s);
	} catch (InstantiationException e) {
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		e.printStackTrace();
	}
	return target;
}
	
}
