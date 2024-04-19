public class Wine extends Product{
    double volume;
    public static final double extraTax = 10;

    public Wine(String productName, String barcode, double price,double volume) {
        super(productName, barcode, price);
        this.volume=volume;
    }
    @Override
    public double calculatePrice(){
        double priceWithTax = this.basePrice +(this.basePrice *tax/100);
        double priceWithExtraTax = priceWithTax+(priceWithTax*extraTax/100);
        return priceWithExtraTax;
    }
    @Override
    public String toString() {
        return "Product Name : " + this.productName + " Barcode : " + this.barcode + " Product price :" + this.basePrice +
                " Product volume: " + this.volume;
    }
}
