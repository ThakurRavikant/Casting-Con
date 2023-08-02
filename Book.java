package com.xworkz.testprogram.things;

public class Book {
	byte price;
	short page;
	int numOfBook;
	long estd;
	float profit;
	double loss;
	boolean rating;
	char book;
	String bookName;

	@Override
	public String toString() {
		return "Book [price=" + price + ", page=" + page + ", numOfBook=" + numOfBook + ", estd=" + estd + ", profit="
				+ profit + ", loss=" + loss + ", rating=" + rating + ", book=" + book + ", bookName=" + bookName + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (book != other.book)
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (estd != other.estd)
			return false;
		if (Double.doubleToLongBits(loss) != Double.doubleToLongBits(other.loss))
			return false;
		if (numOfBook != other.numOfBook)
			return false;
		if (page != other.page)
			return false;
		if (price != other.price)
			return false;
		if (Float.floatToIntBits(profit) != Float.floatToIntBits(other.profit))
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}



	public byte getPrice() {
		return price;
	}



	public void setPrice(byte price) {
		this.price = price;
	}



	public short getPage() {
		return page;
	}



	public void setPage(short page) {
		this.page = page;
	}



	public int getNumOfBook() {
		return numOfBook;
	}



	public void setNumOfBook(int numOfBook) {
		this.numOfBook = numOfBook;
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



	public char getBook() {
		return book;
	}



	public void setBook(char book) {
		this.book = book;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



}
