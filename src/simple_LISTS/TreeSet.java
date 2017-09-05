package simple_LISTS;

import java.util.HashSet;

public class TreeSet {
    public static void main(String[] args) {
//        TreeSet<String> nazwiska = new TreeSet<String>();
//        nazwiska.add("Janusz");
//        nazwiska.add("Marcin");
//        nazwiska.add("Wojtek");
//        nazwiska.add("Bolek");
//        nazwiska.add("Wacek");
//        System.out.println(nazwiska);

        HashSet<String> lista1 = new HashSet<>();
        lista1.add("jablko");
        lista1.add("chleb");
        lista1.add("wisnia");

        HashSet<String> lista2 = new HashSet<>();
        lista2.add("jablko");
        lista2.add("chleb");
        lista2.add("bulka");

        lista1.retainAll(lista2);

        for (String list : lista1) {
            System.out.println(list);
        }
    }
}
