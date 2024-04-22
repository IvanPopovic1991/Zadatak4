public abstract class Product {
    protected String productName;
    protected String barcode;
    protected double basePrice;
    public static final double tax = 20;

    public Product(String productName, String barcode, double price) {
        this.productName = productName;
        this.barcode = barcode;
        this.basePrice = price;
    }

    public abstract double calculatePrice();
}
