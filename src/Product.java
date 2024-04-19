public abstract class Product {
    public String productName;
    public String barcode;
    public double basePrice;
    public static final double tax = 20;

    public Product(String productName, String barcode, double price) {
        this.productName = productName;
        this.barcode = barcode;
        this.basePrice = price;
    }

    public abstract double calculatePrice();
}
