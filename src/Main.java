public class Main {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Milka","54949490494",200, 0.400);
        Wine wine = new Wine("Chardone","01949450494",1000, 0.75);

        System.out.println(chocolate);
        System.out.println("New price with taxes for chocolate is " + chocolate.calculatePrice());
        System.out.println(wine);
        System.out.println("New price with taxes for wine is " + wine.calculatePrice());
    }
}