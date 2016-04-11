package org.itstep.modules.module10.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main5 {
    public static void main(String[] args) {
        String str = "i came i saw i left";

        List<String> list = Arrays.asList(str.split(" "));
        System.out.println("LIST: " + list);

        Set<String> noDups = new HashSet<>(list);
        System.out.println("No Duplicates: " + noDups);

    }
}
