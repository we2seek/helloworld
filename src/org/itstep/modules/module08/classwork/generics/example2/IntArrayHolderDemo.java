package org.itstep.modules.module08.classwork.generics.example2;

import java.util.Arrays;

public class IntArrayHolderDemo {
    public static void main(String[] args) {
        IntArrayHolder intArrayHolder = new IntArrayHolder();
        int [] numbers = {1, 9, 2};
        intArrayHolder.setData(numbers);

        // ...

        System.out.println(Arrays.toString(intArrayHolder.getData()));
    }
}
