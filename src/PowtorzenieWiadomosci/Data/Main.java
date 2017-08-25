package PowtorzenieWiadomosci.Data;

public class Main {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(23, 59, 58);

        System.out.println(myTime);
        myTime.nextSecond();
        System.out.println(myTime);
        myTime.nextHour();
        System.out.println(myTime);
    }
}
