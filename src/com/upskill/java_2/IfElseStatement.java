package com.upskill.java_2;

public class IfElseStatement {
	
	public static int age = 105;

	public static void main(String[] args) {
		conditionalStatement();
	}
	
	public static void conditionalStatement(){
		//If Else Statement
		if(age<13){
			System.out.println("You are children");
		} else if(age>13 && age<18){
			System.out.println("You are Teenager");
		} else if(age>65){
			//Nested If Else Statement
			if(age > 100){
				System.out.println("You are Hero");
			} else {
			System.out.println("You are Senior");
			}
		} else {
			System.out.println("You are adult");
		}
	}
}
