package org.itstep.modules.module08.classwork.generics.example2;

import java.util.Arrays;

public class ObjectHolderDemo {
    public static void main(String[] args) {
        ObjectHolder objectHolder = new ObjectHolder();
        objectHolder.setData("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

        // ... Some acts

        String str = (String) objectHolder.getData();
        System.out.println(str);

        objectHolder.setData(new int [] {15, 10, -2012});

        // ... Some acts

        int[] intArr = (int[]) objectHolder.getData();
        System.out.println(Arrays.toString(intArr));
    }
}
