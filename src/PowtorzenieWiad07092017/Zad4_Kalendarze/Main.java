package PowtorzenieWiad07092017.Zad4_Kalendarze;

public class Main {
    public static void main(String[] args) {

        SpanishCalendar spanishCalendar = new SpanishCalendar();
        spanishCalendar.wyswietlDate();

        AmericanCalendar americanCalendar = new AmericanCalendar();
        americanCalendar.wyswietlDate();

        FrenchCalendar frenchCalendar = new FrenchCalendar();
        frenchCalendar.wyswietlDate();
    }
}
