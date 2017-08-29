package OBSERWATOR_StacjaPogodowa;

public class WarunkiBiezace implements IWyswietl, IObserwator {
    private float _temp;
    private float _cisnienie;
    private float _wilgotnosc;
    private IPodmiot _danePogodowe;

    WarunkiBiezace(IPodmiot danePogodowe) {
        _danePogodowe = danePogodowe; //do kogo chce sie podpiac
        _danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %2.1f stC, %2.1f hPA, %s %%\n", _temp, _cisnienie, _wilgotnosc);
    }

    @Override
    public void aktualizuj(float temp, float cisnienie, float wilgotnosc) {
        _temp = temp;
        _cisnienie = cisnienie;
        _wilgotnosc = wilgotnosc;
        wyswietl();
    }
}
