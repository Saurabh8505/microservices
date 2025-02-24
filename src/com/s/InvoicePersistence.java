package com.s;

public class InvoicePersistence {
	public void saveToFile(Invoice invoice, String filename) {
        System.out.println("Saving invoice to " + filename);
        System.out.println(invoice.generateInvoiceText());
    }
}
