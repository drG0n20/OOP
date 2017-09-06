package simple_HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put(null, 1);
        mapa.put("drugi", null);
        System.out.println(mapa.get(null));
        System.out.println(mapa.get("drugi"));

        LinkedHashMap<String, Integer> mapaLinked = new LinkedHashMap<>();
        mapaLinked.put(null, 1);
        mapaLinked.put("drugi", null);
        System.out.println(mapaLinked.get(null));
        System.out.println(mapaLinked.get("drugi"));

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.ceilingEntry("pierwszy", 1);
        treeMap.ceilingEntry("drugi", null);
        treeMap.ceilingEntry(null, 3);
        treeMap.floorEntry("czwarty", 5);
        System.out.println(treeMap.get(null));
        System.out.println(treeMap.get("czwarty"));
    }
}
