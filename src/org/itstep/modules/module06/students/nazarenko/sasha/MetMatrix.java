package org.itstep.modules.module06.students.nazarenko.sasha;

import java.util.Arrays;
import java.util.Random;

class Matrix {
    int ant;
    int bent;
    private int[][] arr;


    Matrix(int a, int b) {
        ant = a;
        bent = b;
        this.arr = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = (int) Math.floor(Math.random() * 90 + 10);
            }
        }
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "ant=" + ant +
                ", bent=" + bent +
                ", arr=" + Arrays.deepToString(arr) +
                '}';
    }
}

public class MetMatrix {
    public static void main(String args[]) {

        Matrix matr = new Matrix(5, 5);
        System.out.println(matr);
    }

}
