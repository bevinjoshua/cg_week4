package collections;

import java.util.*;

public class InvertMap {
    public static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> inverted = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            inverted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return inverted;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A",1,"B",2,"C",1);
        System.out.println(invert(map)); // {1=[A, C], 2=[B]}
    }
}
