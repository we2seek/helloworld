package org.itstep.modules.module10.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main8 {
    public static void main(String[] args) {
        String[] arr = "if it is to be it is up to me to delegate".split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String str : arr) {
            Integer freq = map.get(str);
            map.put(str, freq == null ? 1 : freq + 1);
        }

        System.out.println(map.size() + " distinct words:");
        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            TreeSet<>
        }
    }
}
