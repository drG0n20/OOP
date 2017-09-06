package Generics_FruitBasket;

public class FruitBasket<T extends IFruit> {
    T _fruit;

    public T getFruit() {
        return _fruit;
    }

    public void setFruit(T fruit) {
        _fruit = fruit;
    }

    public String getFruitColor() {
        return _fruit.getColor();
    }

    public String getFruitName() {
        return _fruit.getName();
    }
}
