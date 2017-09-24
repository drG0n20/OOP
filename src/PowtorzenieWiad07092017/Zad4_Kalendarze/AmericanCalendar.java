package PowtorzenieWiad07092017.Zad4_Kalendarze;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class AmericanCalendar implements IWyswietlanieDaty {
    @Override
    public void wyswietlDate() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, new Locale("us", "US", "US"));
        System.out.println(df.format(new Date()));
    }
}
