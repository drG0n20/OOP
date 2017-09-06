package Generics;

public class Sweater extends Clothes {
    @Override
    public String getDescription() {
        return "Christmas sweater";
    }

    @Override
    public String getName() {
        return "sweater";
    }

    @Override
    public String getSize() {
        return "M";
    }
}
