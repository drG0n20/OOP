package PowtorzenieWiadomosci25082017.Zad1_MyTime;

public class Main {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(23, 59, 59);
        int k = 86400;
        for (int i = 0; i < k; i++) {
            myTime.previousSecond();
            System.out.println(myTime);
        }
    }
}
