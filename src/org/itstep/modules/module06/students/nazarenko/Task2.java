package org.itstep.modules.module06.students.nazarenko;

import java.util.Random;

/**
 * 2. Написать класс, с методами:
 * 2.1. Создает матрицу заданной длины и высоты NxM типа int, char. Заполняет её случайными значениями
 * 2.2. Возвращает отформатированную для вывода в консоль строку со всеми элементами созданной матрицы (метод toString())
 * 2.3. Находит максимальное и минимальное значение для каждой строки.
 */
public class Task2 {


    public void createArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public void createArray(char[][] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (char) (r.nextInt(26) + 'a');
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    private void countArray(int[][] arrayInt) {
        int min = arrayInt[0][0];
        int max = arrayInt[0][0];
        System.out.println();
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[0].length; j++) {
                if (min > arrayInt[i][j]) {
                    min = arrayInt[i][j];
                }
                if (max < arrayInt[i][j]) {
                    max = arrayInt[i][j];
                }
            }
            System.out.print("Строка № " + i + ":" + " MAX= " + max + " MIN=" + min + " \n");
        }
    }

    private void countArray(char[][] arrayChar) {
        char min = arrayChar[0][0];
        char max = arrayChar[0][0];

        System.out.println();
        for (int i = 0; i < arrayChar.length; i++) {
            for (int j = 0; j < arrayChar[0].length; j++) {
                if (min > arrayChar[i][j]) {
                    min = arrayChar[i][j];
                }
                if (max < arrayChar[i][j]) {
                    max = arrayChar[i][j];
                }
            }
            System.out.print("Строка № " + i + ":" + " MAX= " + max + " MIN=" + min + " \n");
        }

    }

    public static void main(String[] args) {
        Task2 task = new Task2();
        final int NUMBER_OF_COLUMNS = 10;
        final int NUMBER_OF_LINES = 10;
        int[][] arrayInt = new int[NUMBER_OF_COLUMNS][NUMBER_OF_LINES];
        char[][] arrayChar = new char[NUMBER_OF_COLUMNS][NUMBER_OF_LINES];
        task.createArray(arrayInt);
        task.createArray(arrayChar);
        task.countArray(arrayInt);
        task.countArray(arrayChar);
    }


}

