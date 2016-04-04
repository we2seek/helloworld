package org.itstep.modules.module05.students.ogol_katya;

/**
 * Заполнить двумерный массив [10,10] вертикальной змейкой:
 * 1 6 7
 * 2 5 8
 * 3 4 9
 */
public class Task2 {
    public static void main(String[] args) {
        int k = 1;
        int n = 10;
        int m = 10;
        int arr[][] = new int[n][m];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (j % 2 != 0) {
                    arr[n - i - 1][j] = k;
                } else
                    arr[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}


