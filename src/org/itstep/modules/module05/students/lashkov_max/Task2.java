package org.itstep.modules.module05.students.lashkov_max;

/**
 * 2. Заполнить двумерный массив [10,10] вертикальной змейкой:
 * 1 6 7
 * 2 5 8
 * 3 4 9
 */
public class Task2 {
    public static void main(String[] args) {
        int arr[][] = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j % 2 == 0) {
                    int k = 1;
                    arr[i][j] = (arr.length * j + k++) + i;
                }
                if (j % 2 == 1) {
                    int d = 10;
                    arr[i][j] = (d-- + arr.length * j) - i;
                }
                System.out.printf("%02d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
