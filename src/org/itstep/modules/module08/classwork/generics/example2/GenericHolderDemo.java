package org.itstep.modules.module08.classwork.generics.example2;

import java.util.Arrays;

public class GenericHolderDemo {
    public static void main(String[] args) {

        // Use int[]
        GenericHolder<int[]> intHolder = new GenericHolder<>();
        int[] dummyNumbers = {5, 6, 7, 87};

        intHolder.setData(dummyNumbers);

        // ...

        System.out.println(Arrays.toString(intHolder.getData()));

        // Use string
        GenericHolder<String> stringHolder = new GenericHolder<>();
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

        stringHolder.setData(lorem);

        System.out.println(stringHolder.getData());
    }
}
