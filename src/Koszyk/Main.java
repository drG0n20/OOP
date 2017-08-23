package Koszyk;

public class Main {
    public static void main(String[] args) {
        IProduct harryPotter = new HarryPotter();

        harryPotter.setProductName("Tom Trzeci Harego");
        System.out.println(harryPotter.getProductName());

        IProduct zdrajca = new ZdrajcaMetalu();
        zdrajca.setPrice(23);
        zdrajca.setPrice(67);
        zdrajca.setPrice(56);
        System.out.println(zdrajca.getPrice());

    }
}
