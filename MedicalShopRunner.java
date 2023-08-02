package com.xworkz.testprogram.runner;

import com.xworkz.testprogram.things.MedicalShop;

public class MedicalShopRunner {
public static void main(String[] args) {
	MedicalShop ms = new MedicalShop();
	ms.setCharge((byte)20);
	System.out.println("Charge:"+ms.getCharge());
	
	//String to Primitive DataType
	String shopName="2500";
	byte val1=(byte)Byte.parseByte(shopName);
	System.out.println("String to byte:"+val1);

	Short val2=Short.parseShort(shopName);
	System.out.println("String to Short:"+val2);

	Integer val3=Integer.parseInt(shopName);
	System.out.println("String to Integer:"+val3);

	Long val4=Long.parseLong(shopName);
	System.out.println("String to Long:"+val4);

	Float val5=Float.parseFloat(shopName);
	System.out.println("String to Float:"+val4);

	Double val6=Double.parseDouble(shopName);
	System.out.println("String to Double:"+val6);

	Boolean val7=Boolean.parseBoolean(shopName);
	System.out.println("String to Boolean:"+val7);

	System.out.println("------------");



	// Casting primative datatype into String//


	Byte b= 12;
	System.out.println("Byte to String:"+b.toString());

	Short s=50;
	System.out.println("Short to String:"+s.toString());

	Integer i=10;
	System.out.println("Integer to String:"+i.toString());

	Long l=10531421l;
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

