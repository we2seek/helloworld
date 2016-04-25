package org.itstep.modules.module14.classwork;

import java.util.*;

public class CitySort {
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {

        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    public static void main(String[] args) {
        Map<String, String> cities = new HashMap<>();
        cities.put("Kyiv", "44");
        cities.put("Dnipropetrovs\'k", "56");
        cities.put("Kriviy Rig", "564");
        cities.put("Kharkiv", "57");
        cities.put("Donetsk", "62");
        cities.put("Lviv", "32");
        cities.put("Dniprodzherzhyns\'k", "569");
        cities.put("Oleksandriya", "569");
        cities.put("Oleksandriya", "569");
        cities.put("Sumy", "54");

        sortByValue(cities);

        Set<Map.Entry<String, String>> entries = cities.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
