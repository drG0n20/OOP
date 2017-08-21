package BookAndAuthor;

public class Book {
    private String _name;
    private Author _author;
    private Double _price;
    private Integer _qty = 0;

    public Book(String name, Author author, Double price) {
        _name = name;
        _author = author;
        _price = price;
    }

    public Book(String name, Author author, Double price, Integer qty) {
        _name = name;
        _author = author;
        _price = price;
        _qty = qty;
    }

    public String getName() {
        return _name;
    }

    public Author getAuthor() {
        return _author;
    }

    public Double getPrice() {
        return _price;
    }

    public void setPrice(Double price) {
        _price = price;
    }

    public Integer getQty() {
        return _qty;
    }

    public void setQty(Integer qty) {
        _qty = qty;
    }

    public String toString() {
        return String.format("Book[name=%s, %s, price=%f, qty=%d]", _name, _author.toString(), _price, _qty);
    }


}
