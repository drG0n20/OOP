package simple_HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("pierwszy", 1);
        mapa.put(null, 1);
        mapa.put("drugi", null);
        mapa.put(null, null);
        System.out.println(mapa.get(null));
        System.out.println(mapa.get("drugi"));

        LinkedHashMap<String, Integer> mapaLinked = new LinkedHashMap<>();
        mapaLinked.put("pierwszy", 1);
        mapaLinked.put(null, 2);
        mapaLinked.put("drugi", null);
        mapaLinked.put(null, null);
        System.out.println(mapaLinked.get(null));
        System.out.println(mapaLinked.get("drugi"));

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.ceilingEntry("pierwszy");
        treeMap.ceilingEntry("drugi");
        treeMap.ceilingEntry(null);
        treeMap.floorEntry(null);
        System.out.println(treeMap.get(null));
        System.out.println(treeMap.get("drugi"));
    }
}
