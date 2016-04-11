package org.itstep.modules.module10.examples;

import java.util.*;

/**
 * Created by well on 11.04.16.
 */
public class Main4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aac");
        list.add("aab");
        list.add("aac");
        list.add("aab");
        list.add("aac");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();

        Set<String> set = new TreeSet<>(list);
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println();
    }}
