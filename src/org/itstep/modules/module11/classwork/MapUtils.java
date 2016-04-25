package org.itstep.modules.module11.classwork;

import java.util.*;

/**
 * http://stackoverflow.com/a/2581754
 */
public class MapUtils {
    /**
     * Sort given map by values
     *
     * @param map
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map, boolean ascending) {

        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                int result;
                if (ascending) {
                    result = (o1.getValue()).compareTo(o2.getValue());
                } else {
                    result = (o2.getValue()).compareTo(o1.getValue());

                }
                return result;
            }
        });

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
