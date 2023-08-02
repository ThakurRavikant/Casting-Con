package com.xworkz.testprogram.things;

public class Oyo {

	final String email="test@gmail.com";
	final String password="test";
	static int[] seats= {1,2,3,4,5,6,7,8,9,10};
	int setsBooked;


	public void check(String email,String password) {
		if(email=="test@gmail.com" && password=="test" ) {
			System.out.println("Welcome to Oyo");
		}else  {
			System.out.println("Enter Correct Email and Password");
		}
	}
		public void check1(String email,String password,int seats1) {
			
		for(int i=0;i<seats.length;i++){
			if(email=="test@gmail.com" && password=="test" && seats[i]==seats1 ) {
				System.out.println("Available");
			}else  {
				System.out.println("Not Available");
			}	
		}
	}
	public void bookin(int seatNumber) {
		for(int i=0;i<seats.length;i++) {
			//	System.out.println(seats[i]);
			if(seats[i]==seatNumber && seatNumber>0 && seatNumber<=10) {
				System.out.println("Your seats is Booked:"+seatNumber);
				break;
			}
		}
	}
}
