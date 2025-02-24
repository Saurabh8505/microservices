package com.s;

public class Test {
	 public static void main(String[] args) {
	        Book book = new Book("Clean Code", "Robert C. Martin", 500);
	        Invoice invoice = new Invoice(book, 2, 10, 5); // 10% discount, 5% tax

	        InvoicePersistence persistence = new InvoicePersistence();
	        persistence.saveToFile(invoice, "invoice.txt");
	    }
}
