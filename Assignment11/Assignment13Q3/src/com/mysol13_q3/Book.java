package com.mysol13_q3;


import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book> {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	public Book() {
		
	}
	public Book(String isbn, double price, String authorName, int quantity) {
	
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	public String getisbn() {
		return isbn;
	}
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void acceptBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Details");
		System.out.print("Enter isbn = ");
		this.isbn=sc.next();
		System.out.print("Enter price = ");
		this.price=sc.nextDouble();
		System.out.print("Enter Author Name = ");
		this.authorName=sc.next();
		System.out.print("Enter quantity = ");
		this.quantity=sc.nextInt();
		
	}
	
	public int compareTo(Book b1) {
		int diff = this.getisbn().compareTo(b1.getisbn());
		return diff;
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(this.isbn);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		if(this.isbn == other.isbn)
//			return true;
//		return false;
//	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
	
	
}


