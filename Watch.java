package com.xworkz.testprogram.things;

public class Watch {

	byte price;
	short type;
	int numOfEmployee;
	long estd;
	float profit;
	double loss;
	boolean rating;
	char watch;
	String brand;
	
	@Override
	public String toString() {
		return "Watch [price=" + price + ", type=" + type + ", numOfEmployee=" + numOfEmployee + ", estd=" + estd
				+ ", profit=" + profit + ", loss=" + loss + ", rating=" + rating + ", watch=" + watch + ", brand="
				+ brand + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Watch other = (Watch) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (estd != other.estd)
			return false;
		if (Double.doubleToLongBits(loss) != Double.doubleToLongBits(other.loss))
			return false;
		if (numOfEmployee != other.numOfEmployee)
			return false;
		if (price != other.price)
			return false;
		if (Float.floatToIntBits(profit) != Float.floatToIntBits(other.profit))
			return false;
		if (rating != other.rating)
			return false;
		if (type != other.type)
			return false;
		if (watch != other.watch)
			return false;
		return true;
	}

	public byte getPrice() {
		return price;
	}

	public void setPrice(byte price) {
		this.price = price;
	}

	public short getType() {
		return type;
	}

	public void setType(short type) {
		this.type = type;
	}

	public int getNumOfEmployee() {
		return numOfEmployee;
	}

	public void setNumOfEmployee(int numOfEmployee) {
		this.numOfEmployee = numOfEmployee;
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

	public char getWatch() {
		return watch;
	}

	public void setWatch(char watch) {
		this.watch = watch;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
}
