package org.itstep.modules.module05.home;

/**
 * Created by Vitaliy Timchenko on 27.03.16 17:28.
 * 2. Заполнить двумерный массив [10,10] вертикальной змейкой:
 * 1 6 7
 * 2 5 8
 * 3 4 9
 */
public class Task2 {
    public static void main(String[] args) {
        // Используем разные константы для гибкости - можно задавать не разные размеры
        final int ROWS = 10;
        final int COLS = 10;
        int counter = 0;
        int[][] arr = new int[ROWS][COLS];

        // Заполняем массив
        for (int i = 0; i < COLS; i++) {
            if ((i % 2) == 0) {
                for (int j = 0; j < ROWS; j++) {
                    arr[j][i] = ++counter;
                }
            } else {
                for (int j = ROWS - 1; j >= 0; j--) {
                    arr[j][i] = ++counter;
                }
            }
        }

        // Выводим массив на экран
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 10) {
                    buffer.append(' ');
                }

                if (arr[i][j] < 100) {
                    buffer.append(' ');
                }

                buffer.append(arr[i][j]);
                buffer.append(' ');
            }
            buffer.append('\n');
        }

        System.out.println(buffer.toString());
    }
}
