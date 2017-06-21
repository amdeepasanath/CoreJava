package javaProject;

public class SubStrin {

	public static  void main(String args[]){
	
	String test =  "This/ is/ a /sentence";
	String lastWord = test.substring(test.lastIndexOf("/")+1);
	System.out.println(lastWord);
	
	
}
}