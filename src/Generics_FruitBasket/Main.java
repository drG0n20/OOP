package Generics_FruitBasket;

public class Main {
    public static void main(String[] args) {
        Jablko jablko = new Jablko();
        FruitBasket<Jablko> basket = new FruitBasket<>();

        basket.setFruit(jablko);
        System.out.println(basket.getFruitName());
        System.out.println(basket.getFruitColor());
    }
}
