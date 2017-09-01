package PowtorzenieWiad01092017.Zad3_Adapter;

public class DolceGustotoTassimoAdapter implements ITassimo {
    private IDolceGusto _dolceGusto;

    public DolceGustotoTassimoAdapter(IDolceGusto dolceGusto) {
        _dolceGusto = dolceGusto;
    }

    @Override
    public void kapsulkiTassimo() {
        _dolceGusto.kaspulkiDolceGusto();
    }
}
