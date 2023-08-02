package com.xworkz.testprogram.things;

public class Tea {
	byte numOrder;
	short numOfShops;
	int numOfEmployee;
	long estd;
	float profit;
	double loss;
	boolean service;
	char tea;
	String companyName;
	
	
	
	@Override
	public String toString() {
		return "Tea [numOrder=" + numOrder + ", numOfShops=" + numOfShops + ", numOfEmployee=" + numOfEmployee
				+ ", estd=" + estd + ", profit=" + profit + ", loss=" + loss + ", service=" + service + ", tea=" + tea
				+ ", companyName=" + companyName + "]";
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return false;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tea other = (Tea) obj;
		if (this.numOrder == other.numOrder && this.numOfShops==other.numOfShops && this.numOfEmployee==other.numOfEmployee && this.estd==other.estd 
				&& this.profit==profit && this.loss==other.loss && this.service==other.service && this.tea==other.tea && this.companyName==other.companyName) {
			return true;
		}
			
		return false;
	}
	public byte getNumOrder() {
		return numOrder;
	}
	public void setNumOrder(byte numOrder) {
		this.numOrder = numOrder;
	}
	public short getNumOfShops() {
		return numOfShops;
	}
	public void setNumOfShops(short numOfShops) {
		this.numOfShops = numOfShops;
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
	public boolean isService() {
		return service;
	}
	public void setService(boolean service) {
		this.service = service;
	}
	public char getTea() {
		return tea;
	}
	public void setTea(char tea) {
		this.tea = tea;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	 
	
	

}
