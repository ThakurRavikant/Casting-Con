package com.xworkz.testprogram.runner;



import com.xworkz.testprogram.things.MathematicalOperation;

public class MathematicalOperationRunner {
	public static void main(String[] args) {
	MathematicalOperation mp = new MathematicalOperation();
	 int result=mp.calculation("+", 7, 7);
	 int result2=mp.calculation("-", 7, 7);
	 int result3=mp.calculation("*", 7, 7);
	 int result4=mp.calculation("/", 7, 7);
	 System.out.println("Adding result:"+result);
	 System.out.println("Sub result:"+result2);
	 System.out.println("Multiple result:"+result3);
	 System.out.println("Division result:"+result4);
	
	}

}
