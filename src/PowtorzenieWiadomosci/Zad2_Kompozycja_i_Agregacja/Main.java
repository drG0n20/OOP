package PowtorzenieWiadomosci.Zad2_Kompozycja_i_Agregacja;

public class Main {
    public static void main(String[] args) {

        birthDay birthDay = new birthDay("00230509099");

        System.out.println(birthDay.getGender());
        System.out.println(birthDay.PrintDate() + birthDay.getGender());
    }
}
