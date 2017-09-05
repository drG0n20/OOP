package simple_ArrayQueue;

public class Person {
    private String _name;
    private String _shoppingList;

    public Person(String name, String shoppinList) {
        _name = name;
        _shoppingList = shoppinList;
    }

    public String getName() {
        return _name;
    }

    public String unpackShopping() {
        return "wypakowuje na tasmociag " + _shoppingList;
    }
}
