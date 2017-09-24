package PowtorzenieWiad07092017.Zad4_Kalendarze;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class FrenchCalendar implements IWyswietlanieDaty {
    @Override
    public void wyswietlDate() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, new Locale("fr", "FR", "FR"));
        System.out.println(df.format(new Date()));
    }
}
