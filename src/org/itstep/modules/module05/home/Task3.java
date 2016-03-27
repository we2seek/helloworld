package org.itstep.modules.module05.home;

/**
 * Created by Vitaliy Timchenko on 27.03.16 20:17
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 0 0 0 0
 * 0 0 0 0 0
 */
public class Task3 {
    public static void main(String[] args) {
        final int ROWS = 5;
        final int COLS = 5;
        byte[][] arr = new byte[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                // 1 0 0 0 0
                // 1 1 0 0 0
                // 1 1 1 0 0
                // 1 1 1 1 0
                // 1 1 1 1 1
                /*
                if (i >= j) {
                    arr[i][j] = 1;
                }
                */

                // 1 1 1 1 1
                // 0 1 1 1 1
                // 0 0 1 1 1
                // 0 0 0 1 1
                // 0 0 0 0 1
                /*
                if (j >= i) {
                    arr[i][j] = 1;
                }
                */

                // 1 1 1 1 1
                // 1 1 1 1 0
                // 1 1 1 0 0
                // 1 1 0 0 0
                // 1 0 0 0 0
                /*
                if (j < COLS - i) {
                    arr[i][j] = 1;
                }
                */

                // 0 0 0 0 1
                // 0 0 0 1 1
                // 0 0 1 1 1
                // 0 1 1 1 1
                // 1 1 1 1 1
                /*
                if (j >= COLS - i - 1) {
                    arr[i][j] = 1;
                }
                */

                // 1 1 1 1 1
                // 0 1 1 1 0
                // 0 0 1 0 0
                // 0 0 0 0 0
                // 0 0 0 0 0
                if (j < COLS - i && j >= i) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
