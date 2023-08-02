package com.xworkz.testprogram.things;

public class Product {
	int price;
	int quantity;
	double gst;
	double sst;
	double ist;
	String review;
	double totalPrice;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
		
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public int getQuantity() {
		return this.quantity;
		
	}
	public void setGst(double gst) {
		this.gst=gst;
	}
	public double getGst() {
		return this.gst;
		
	}
	public void setSst(double sst) {
		this.sst=sst;
	}
	public double getSst() {
		return this.sst;
		
	}
	public void setIst(double ist) {
		this.ist=ist;
	}
	public double getIst() {
		return this.ist;
		
	}
	public void setReview(String review) {
		this.review=review;
	}
	public String getReview() {
		return this.review;
		
	}
	public double calculation(double totalPrice) {
		totalPrice=quantity*(price*((gst+sst+ist)/100));
		return totalPrice;
	}
}
