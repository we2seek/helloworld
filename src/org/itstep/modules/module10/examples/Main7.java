package org.itstep.modules.module10.examples;

import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("Kyiv", "AAA");
        map.put("Kharkiv", "AAB");
        map.put("Poltava", "ACC");
        map.put("Dnipropetrovs\'k", "AAA+");

        map.put("Kryviy Rig", "BAA");
        map.put("Kyiv", "CAA");

        Set<String> keys = map.keySet();


        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            if("Kyiv".equals(city)){
                iterator.remove();
            }
        }

        System.out.println(keys);


    }
}
