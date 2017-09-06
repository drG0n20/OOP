package Exceptions_ArraySearcher;

public class Main {

    public static void main(String[] args) {
        String[] strArr = new String[]{"ZZZ", "AAA", "CCC"};
        ArraySearcher as = new ArraySearcher();

        try {
            as.findElement(strArr, "SSS");
        } catch (Exception e) {
            System.out.println("Nie udalo sie :(");
        }
    }
}
