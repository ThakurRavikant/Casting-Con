package com.xworkz.testprogram.runner;

import com.xworkz.testprogram.things.Product;

public class ProductRunner {
	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.setPrice(30);
		System.out.println("Price of product is:"+product.getPrice());
		
		product.setQuantity(30);;
		System.out.println("Quanrty of peoduct:"+product.getQuantity());
		
		product.setGst(18);
		System.out.println("GST of Product:"+product.getGst());
		
		product.setSst(5);
		System.out.println("SST of Product:"+product.getSst());
		
		product.setIst(3);
		System.out.println("IST of peoduct:"+product.getIst());
		
		//mrp=product.setPrice(30)+product.setQuantity(30)+product.setGst(0.18)+product.setSst(0.05)+product.setIst(0.3);
		
		product.setReview("Good");
		String result=product.getReview();
		
		
		if(result.equals("Good")) {
			System.out.println("Now, we can buy Goods:"+result);
		}  else {
			System.out.println("Review is not Good");
		}
		System.out.println("Total price of Product With all Tax is:"+product.calculation(50));
	}

}
