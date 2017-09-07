package PowtorzenieWiad07092017.Zad4_Kalendarze;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
//        Calendar calendar = new GregorianCalendar(2017, 12, 4, 2, 1, 1);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
//        System.out.println(dateFormat.format(calendar.getTime()));

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
