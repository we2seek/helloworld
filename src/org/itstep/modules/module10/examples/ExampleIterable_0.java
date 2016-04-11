package org.itstep.modules.module10.examples;

/**
 * Created by well on 10.04.16.
 */
public class ExampleIterable_0 {
    public static void main(String[] args) {
        String[] array = {"AAA", "AAB", "AAC"};

        int i = 0;
        while (i < array.length) {
            System.out.print(array[i++] + ' ');
        }
        System.out.println();

        for (int j = 0; j < array.length; j++) {
            System.out.print(j + ": " + array[j] + ' ');
        }
        System.out.println();

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + ' ');
        }
        System.out.println();

        for (String value : array) {
            System.out.print(value + " ");
        }

    }
}
