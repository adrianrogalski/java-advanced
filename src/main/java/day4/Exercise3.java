package day4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercise3 {
    public static void main(String[] args) {
        Map<Double, String> map = new TreeMap<>();
        map.put(1.45, "AAA");
        map.put(2.67, "BBB");
        map.put(1.78, "VVV");

        System.out.println(map.keySet());

        System.out.println(map.get(1.78));

        map.remove(1.45);

        for (Map.Entry<Double, String> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
