package simple_LISTS;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] integers2 = new Integer[]{10, 11, 12, 13,};

        List l1 = Arrays.asList(ints);
        List l2 = Arrays.asList(integers);
        List l22 = Arrays.asList(integers2);

        List<Integer> l3 = new ArrayList<>();
        l3.addAll(l2);

        List<Integer> l4 = new ArrayList<>();
        l4.addAll(l2);
        l4.addAll(l22);
//        System.out.println(l4.hashCode());
        Instant ins = Instant.now();
        System.out.println(ins.hashCode());
        ins = Instant.now();
        System.out.println(ins.hashCode());
    }
}