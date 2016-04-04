package org.itstep.modules.module06.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by timchenko on 04.04.2016.
 */
public class Task2_1 {

    /**
     * 2.1. Создает матрицу заданной длины и высоты NxM типа int, char.
     * Заполняет её случайными значениями
     * @return
     */
    public int [][] createArray(int[][] startArray){
        Random r = new Random();
        for (int i = 0; i < startArray.length; i++) {
            for (int j = 0; j < startArray[i].length; j++) {
                startArray[i][j] = r.nextInt(10);
            }
        }
        return startArray;
    }

    public char [][] createArray(char[][] startArray){
        Random r = new Random();
        for (int i = 0; i < startArray.length; i++) {
            for (int j = 0; j < startArray[i].length; j++) {
                startArray[i][j] = (char) (r.nextInt(26) + 97);
            }
        }
        return startArray;
    }

    public static void main(String[] args) {
        Task2_1 task = new Task2_1();
        final int SIZE = 5;
        int [][] arrayInt = new int[SIZE][SIZE];
        char [][] arrayChar = new char[SIZE][SIZE];
        task.createArray(arrayInt);
        System.out.println(Arrays.deepToString(arrayInt));
        task.createArray(arrayChar);
        System.out.println(Arrays.deepToString(arrayChar));
    }
}
