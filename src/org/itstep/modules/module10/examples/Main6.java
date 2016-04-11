package org.itstep.modules.module10.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main6 {
    public static void main(String[] args) {
        String str1 = "aaa bbb ccc";
        String str2 = "bbb ccc ddd";

        String [] array1 = str1.split(" ");
        String [] array2 = str2.split(" ");

        Set<String> set1 = new HashSet<>(Arrays.asList(array1));
        Set<String> set2 = new HashSet<>(Arrays.asList(array2));

        System.out.println(set1);
        System.out.println(set2);

//        set1.addAll(set2);
//        set1.retainAll(set2);
        set1.removeAll(set2);
        System.out.println();

        System.out.println(set1);

    }
}
