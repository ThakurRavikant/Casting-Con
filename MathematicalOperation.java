package com.xworkz.testprogram.things;

public class MathematicalOperation {
	
	
	public int calculation(String operator, int number1,int number2) {
		System.out.println("Welcome to Operations");
		if(operator=="+") {
			return number1+number2;
		}else if (operator=="-") {
			return number1-number2;
		}else if (operator=="*") {
			return number1*number2;
		}else if (operator=="/") {
			return number1/number2;
		}else {
			System.out.println("Invaild Opertaor");
		return 0;
		}
	}
}
		
	
 
	