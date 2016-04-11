package org.itstep.modules.module10.examples;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        int [] oldArray = {0, -1, 3, -9};
        int oldLength = oldArray.length;

        int newLength = oldLength + 10;
        int [] newArray = Arrays.copyOf(oldArray, newLength);

        newArray[oldLength] = 11;
        newArray[oldLength + 1] = 15;

        System.out.println(Arrays.toString(oldArray));
        System.out.println(Arrays.toString(newArray));


        // Нет защиты от изменения.
        // final относится к ссылке на массив
        final int[] array = new int[]{1, 2, -1, 15, 10};

        array[0] = 0xff;
        array[1] = 0b11111111;
        array[2] = 255;

        System.out.println(Arrays.toString(array));
    }
}
