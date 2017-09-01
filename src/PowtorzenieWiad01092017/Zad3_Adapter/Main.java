package PowtorzenieWiad01092017.Zad3_Adapter;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DolceGusto dg = new DolceGusto();
        Tassimo tassimo = new Tassimo();
        DolceGustotoTassimoAdapter adapter = new DolceGustotoTassimoAdapter(dg);
        ArrayList<ITassimo> kawy = new ArrayList<>();
        kawy.add(tassimo);
        kawy.add(adapter);
        parzenieKawy(kawy);
    }

    public static void parzenieKawy(ArrayList<ITassimo> kawy) {
        for (ITassimo tassimo : kawy) {
            tassimo.kapsulkiTassimo();
        }
    }
}
