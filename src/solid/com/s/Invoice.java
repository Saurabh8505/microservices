package solid.com.s;

class Invoice {
    private Book book;
    private int quantity;
    private double discount;
    private double taxRate;

    public Invoice(Book book, int quantity, double discount, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discount = discount;
        this.taxRate = taxRate;
    }

    public double calculateTotal() {
        double subtotal = book.getPrice() * quantity;
        double discountAmount = subtotal * (discount / 100);
        double taxAmount = (subtotal - discountAmount) * (taxRate / 100);
        return subtotal - discountAmount + taxAmount;
    }

    public String generateInvoiceText() {
        return "Invoice for: " + book.getTitle() +
               "\nQuantity: " + quantity +
               "\nTotal Price: " + calculateTotal();
    }
}
