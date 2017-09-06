package Generics;

public class Tshirt extends Clothes implements ICanBeFolded {
    @Override
    public String getDescription() {
        return "Black T-shirt";
    }

    @Override
    public String getName() {
        return "t-shirt";
    }

    @Override
    public String getSize() {
        return "XL";
    }
}
