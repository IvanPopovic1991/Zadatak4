public class Main {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Milka","54949490494",100, 0.400);
        Wine wine = new Wine("Chardonnay","01949450494",1000, 0.75);

        System.out.println(chocolate);
        System.out.println("New price with tax for chocolate is " + chocolate.calculatePrice());
        System.out.println(wine);
        System.out.println("New price with tax for wine is " + wine.calculatePrice());
    }
}