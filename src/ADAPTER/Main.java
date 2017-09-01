package ADAPTER;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DzikaKaczka kaczka = new DzikaKaczka();
        DzikiIndyk indyk = new DzikiIndyk();
        IndykAdapter ia = new IndykAdapter(indyk);
        KaczkaAdapter ka = new KaczkaAdapter(kaczka);

//        ArrayList<IKaczka> ptaki = new ArrayList<>();
//        ptaki.add(kaczka);
//        ptaki.add(ia);
//        uruchomKwakanieILatanie(ptaki);
        ArrayList<IIndyk> ptaki = new ArrayList<>();
        ptaki.add(indyk);
        ptaki.add(kaczka);
        uruchomGulganieILatanie(ptaki);
    }

    public static void uruchomKwakanieILatanie(ArrayList<IKaczka> ptaki) {
        for (IKaczka kaczka : ptaki) {
            kaczka.kwacz();
            kaczka.lataj();
        }
    }

    public static void uruchomGulganieILatanie(ArrayList<IIndyk> ptaki) {
        for (IIndyk indyk : ptaki) {
            indyk.gulgocze();
            indyk.lataj();
        }
    }
}
