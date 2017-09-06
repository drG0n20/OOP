package Generics;

public class Main {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt();
//        Jeans jeans = new Jeans();
        Suitcase<Tshirt> suitcase = new Suitcase<>();
        suitcase.setThing(tshirt);

        System.out.println(suitcase.getThingName());
        System.out.println(suitcase.getThingSize());
    }
}
