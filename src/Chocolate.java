public class Chocolate extends Product {
    private double weight;

    public Chocolate(String productName, String barcode, double price, double weight) {
        super(productName, barcode, price);
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        double priceWithTax = this.basePrice +(this.basePrice *tax/100);
        return priceWithTax;
    }

    @Override
    public String toString() {
        return "Product Name - " + this.productName + " ; Barcode - " + this.barcode + " ; Product price - " + this.basePrice +
                " ; Product volume - " + this.weight + " .";
    }


}
