package com.xworkz.testprogram.things;

public class MedicalShop {
	byte charge;
	short numOfShops;
	int numOfMedician;
	long estd;
	float profit;
	double loss;
	boolean rating;
	char shop;
	String name;
	
	
	@Override
	public String toString() {
		return "MedicalShop [charge=" + charge + ", numOfShops=" + numOfShops + ", numOfMedician=" + numOfMedician
				+ ", estd=" + estd + ", profit=" + profit + ", loss=" + loss + ", rating=" + rating + ", shop=" + shop
				+ ", name=" + name + "]";
	}


	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicalShop other = (MedicalShop) obj;
		if (charge != other.charge)
			return false;
		if (estd != other.estd)
			return false;
		if (Double.doubleToLongBits(loss) != Double.doubleToLongBits(other.loss))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numOfMedician != other.numOfMedician)
			return false;
		if (numOfShops != other.numOfShops)
			return false;
		if (Float.floatToIntBits(profit) != Float.floatToIntBits(other.profit))
			return false;
		if (rating != other.rating)
			return false;
		if (shop != other.shop)
			return false;
		return true;
	}



	public byte getCharge() {
		return charge;
	}



	public void setCharge(byte charge) {
		this.charge = charge;
	}



	public short getNumOfShops() {
		return numOfShops;
	}



	public void setNumOfShops(short numOfShops) {
		this.numOfShops = numOfShops;
	}



	public int getNumOfMedician() {
		return numOfMedician;
	}



	public void setNumOfMedician(int numOfMedician) {
		this.numOfMedician = numOfMedician;
	}



	public long getEstd() {
		return estd;
	}



	public void setEstd(long estd) {
		this.estd = estd;
	}



	public float getProfit() {
		return profit;
	}



	public void setProfit(float profit) {
		this.profit = profit;
	}



	public double getLoss() {
		return loss;
	}



	public void setLoss(double loss) {
		this.loss = loss;
	}



	public boolean isRating() {
		return rating;
	}



	public void setRating(boolean rating) {
		this.rating = rating;
	}



	public char getShop() {
		return shop;
	}



	public void setShop(char shop) {
		this.shop = shop;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
