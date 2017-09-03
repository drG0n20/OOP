package PowtorzenieWiadomosci25082017.Zad1_MyTime;

public class Main {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(00, 00, 01);
        System.out.println(myTime);
        myTime.previousSecond();
        System.out.println(myTime);
        myTime.previousSecond();
        System.out.println(myTime);

    }
}
