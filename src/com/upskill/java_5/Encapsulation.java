package com.upskill.java_5;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "abc";				//write & read
	private int ssn = 512456125;				//write only
	private String username = "UpSkill";		//read only
	
	//Setter Method - name
	public void setName(String value){			//set the data, write
		name = value;
	}
	
	//Getter Method - name
	public String getName(){					//get the data, read
		return name;
	}
	
	//Setter Method - ssn
	public void setSSN(int value){				//set the data, write
		ssn = value;
	}
	
	//Getter Method - username
	public String getUsername(){				//get the data, read
		return username;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Zahid");
		System.out.println(obj.getName());
		obj.setSSN(45213523);
		System.out.println(obj.getUsername());
	}
}
