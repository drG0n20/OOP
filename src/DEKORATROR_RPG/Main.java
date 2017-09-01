package DEKORATROR_RPG;

public class Main {
    public static void main(String[] args) {
        Bohater bohater = new Bohater("Janusz");
        PlecakBezDna plecakBezDna = new PlecakBezDna();
        PD_FoliaNaPlecak foliaNaPlecak = new PD_FoliaNaPlecak(plecakBezDna);

        Bohater bohater2 = new Bohater("Gerald");
        MieczSwietlny mieczSwietlny = new MieczSwietlny();
        MD_LuskaSmoka md_luskaSmoka = new MD_LuskaSmoka(mieczSwietlny);

        Bohater bohater3 = new Bohater("Sebek");
        TarczaAzbestowa tarczaAzbestowa = new TarczaAzbestowa();
        TD_PtasieDzioby td_ptasieDzioby = new TD_PtasieDzioby(tarczaAzbestowa);
        TD_DiodyLed tdDiodyLed = new TD_DiodyLed(td_ptasieDzioby);
        TD_TrupieCzachy tdTrupieCzachy = new TD_TrupieCzachy(tdDiodyLed);


        System.out.printf("%s znalazles %s.\nOtrzymujesz +%.1f do miejsca.\n", bohater.toString(),
                foliaNaPlecak.pobierzOpis(), foliaNaPlecak.miejsce());
        System.out.println();
        System.out.printf("%s znalazles %s.\nOtrzymujesz +%.1f do ataku.\n", bohater2.toString(),
                md_luskaSmoka.pobierzOpis(), md_luskaSmoka.atak());
        System.out.println();
        System.out.printf("%s znalazles %s.\nOtrzymujesz +%.1f do obrony.\n", bohater3.toString(),
                tdTrupieCzachy.pobierzOpis(), tdTrupieCzachy.obrona());
    }
}
