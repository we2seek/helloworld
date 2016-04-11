package org.itstep.modules.module10.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main7 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("Kyiv", "AAA");
        map.put("Kharkiv", "AAB");
        map.put("Poltava", "ACC");
        map.put("Dnipropetrovs\'k", "AAA");

        System.out.println(map);

        map.put("Kryviy Rig", "BAA");
        map.put("Kyiv", "CAA");

        System.out.println(map);
    }
}
