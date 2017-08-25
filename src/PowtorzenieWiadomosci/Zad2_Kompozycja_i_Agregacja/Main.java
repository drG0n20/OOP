package PowtorzenieWiadomosci.Zad2_Kompozycja_i_Agregacja;

public class Main {
    public static void main(String[] args) {

        String Pesel = "450103040109";
        String substringRok = Pesel.substring(0, 2);
        String substringMiesiac = Pesel.substring(2, 4);
        String substringDzien = Pesel.substring(4, 6);
        String substringPlec = Pesel.substring(9, 10);
        System.out.println(substringRok);
        System.out.println(substringMiesiac);
        System.out.println(substringDzien);
        System.out.println(substringPlec);
    }
}
