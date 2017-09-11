package PowtorzenieWiad07092017.Zad4_Kalendarze;

import java.text.DateFormat;
import java.util.Locale;

public class SpanishCalendar implements IWyswietlanieDaty {
    @Override
    public void wyswietlDate() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, new Locale("es", "ES", "ES"));
        System.out.println(df.format(new Date()));
    }
}
