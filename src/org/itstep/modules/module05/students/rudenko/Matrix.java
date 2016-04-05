package org.itstep.modules.module05.students.rudenko;

/**
 * Created by Санек on 27.03.2016.
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 0 0 0 0
 * 0 0 0 0 0
 */
public class Matrix {
    public static void main(String[] args) {
        int arr[][] = new int[9][9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if ((i <= (arr.length / 2)) & (i <= j) & (j < arr[0].length - i)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
