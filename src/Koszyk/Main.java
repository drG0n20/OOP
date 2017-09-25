package Koszyk;

public class Main {
    public static void main(String[] args) {
        IProduct harryPotter = new HarryPotter();

        harryPotter.setProductName("Tom Trzeci Harego");
        System.out.println(harryPotter.getProductName());

        MusicCD zdrajca = new ZdrajcaMetalu();
        zdrajca.setPrice(23);
        zdrajca.setProductName("Plyta CD");
        zdrajca.setPerformer("Nocny Kochanek");
        zdrajca.setTitle("Zdrajca Metalu");
        System.out.println(zdrajca.getProductName() + " " + zdrajca.getPerformer() + " "
                + zdrajca.getTitle() + " cena: " + zdrajca.getPrice() + " zl.");


    }
}
