package com.upskill.java_1;

public class Variable {
	
//	Variables in Java
	
	public String country = "USA";				//Instance OR global variable - Variables declared in Class level, outside method

	public static String region = "America";	//Static variable - variables belong to class and don't required creating object
	
	public static void main(String[] args) {
		
		String city = "Bloomfield";					//Local variable - variables declared in methods
		
		String name = "Naim";
		int age = 32;
		
		System.out.println("Method 1 : " + name);
		System.out.println("Method 1 : " + region);
		
		
		Variable obj = new Variable();
		
//		ClassName ObjectName = new ClassName();
		
		obj.myMethod("USA");
		System.out.println("Method 1 : " + obj.country);
	}
	
	public void myMethod(String county){		//Method parameter - variables used as method parameter
		
		String myCounty = county;
		
		String name = "Rushdi";
		int age = 30;
		
		System.out.println("Method 2 : " + name);
		System.out.println("Method 2 : " + region);
		System.out.println("Method 1 : " + country);
	}
	
	
	
}