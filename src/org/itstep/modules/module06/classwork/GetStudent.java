package org.itstep.modules.module06.classwork;

import java.util.Random;

/**
 * Created by timchenko on 28.03.2016.
 */
public class GetStudent {

    public static String[] students = {
            "Лашков Максим",
            "Назаренко Дима",
            "Оголь Екатерина",
            "Онуфриенко Яна",
            "Осенникова Дарья",
            "Руденко Александр"
    };
    final static int TIMES = 100;

    public static int getRandomInt(final int min, final int max) {
        int result = 0;
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }

    public static String toString(int[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            builder.append(' ');
        }
        return builder.toString();
    }

    public static String toString(String[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(i);
            builder.append(". ");
            builder.append(arr[i]);
            builder.append('\n');
        }
        return builder.toString();
    }

    public static String toString(String[] arr, int[] counter) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(i + 1);
            builder.append(". [");
            builder.append(counter[i]);
            builder.append("] ");
            builder.append(arr[i]);
            builder.append('\t');
            builder.append('\n');
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        int[] counter = new int[students.length];
        for (int i = 0; i < TIMES; i++) {
            counter[getRandomInt(0, 5)]++;
        }

//        Arrays.sort(counter);

//        System.out.println(toString(students));
        System.out.println(toString(students, counter));
    }
}
