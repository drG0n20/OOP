package Exceptions_ArraySearcher;

public class ArraySearcher {
    public String findElement(String[] strArr, String element) {
        for (int i = 0; i < strArr.length; i++) {
            if (element.equals(strArr[i])) {
                return element;
            }
        }
        throw new ArrayStoreException("Nie znaleziono elementu!");
    }
}
