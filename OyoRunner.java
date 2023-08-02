package com.xworkz.testprogram.runner;

import com.xworkz.testprogram.things.Oyo;

public class OyoRunner {
	public static void main(String[] args) {
		Oyo oyo = new Oyo();
		oyo.check("test@gmail.com", "test");
		oyo.check1("test@gmail.com", "test",1);
		oyo.bookin(5);
		

	}

}
   