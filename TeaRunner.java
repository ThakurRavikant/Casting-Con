package com.xworkz.testprogram.runner;

import com.xworkz.testprogram.things.Tea;

public class TeaRunner {
public static void main(String[] args) {
	Tea tea = new Tea();
	tea.setNumOrder((byte)6);
	System.out.println("Byte datatype is:"+tea.getNumOrder());
	
	//String to Primitive DataType
	String companyName="123";
	byte val1=(byte)Byte.parseByte(companyName);
	System.out.println("String to byte:"+val1);
	
	Short val2=Short.parseShort(companyName);
	System.out.println("String to Short:"+val2);
	
	Integer val3=Integer.parseInt(companyName);
	System.out.println("String to Integer:"+val3);
	
	Long val4=Long.parseLong(companyName);
	System.out.println("String to Long:"+val4);
	
	Float val5=Float.parseFloat(companyName);
	System.out.println("String to Float:"+val4);
	
	Double val6=Double.parseDouble(companyName);
	System.out.println("String to Double:"+val6);
	
	Boolean val7=Boolean.parseBoolean(companyName);
	System.out.println("String to Boolean:"+val7);
	
	System.out.println("------------");
	
	
	
	// Casting primative datatype into String//
	
	
	Byte b= 2;
	System.out.println("Byte to String:"+b.toString());
	
	Short s=5;
	System.out.println("Short to String:"+s.toString());
	
	Integer i=10;
	System.out.println("Integer to String:"+i.toString());
	
	Long l=10231421l;
	System.out.println("Long to String:"+l.toString());
	
	Float f=1345611.14f;
	System.out.println("Float to String:"+f.toString());
	
	Double d=1230231.02;
	System.out.println("Double to String:"+d.toString());
	
	Boolean b1=true;
	System.out.println("Boolean to String:"+b1.toString());
	
	Character c='T';
	System.out.println("Character to String:"+c.toString());
	
	
	
}
}
