package Koszyk;

public abstract class MusicCD implements IProduct {
    protected int _price;
    protected String _name;
    protected String _title;
    protected String _performer;

    public int getPrice() {
        return _price;
    }

    public void setProductName(String name) {
        _name = name;
    }

    public void setPrice(int price) {
        _price = price;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getPerformer() {
        return _performer;
    }

    public void setPerformer(String performer) {
        _performer = performer;
    }
}
