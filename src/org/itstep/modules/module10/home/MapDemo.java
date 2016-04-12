package org.itstep.modules.module10.home;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Kyiv", 44);
        m.put("Dnipropetrovs\'k", 56);
        m.put("Kharkiv", 57);
        m.put("Odessa", 48);
        m.put("Bar", 4341);
        m.put("Bohodukhiv", 5758);
        m.put("Donetsk", 62);
        m.put("Avdiyivka", 6236);
        m.put("Poltava", 532);
        m.put("Krasnohrag", 5744);

        System.out.println(mapToString(MapUtil.sortByValue(m)));


    }

    public static String mapToString(Map<?, ?> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(": ");
            sb.append(entry.getValue());
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
