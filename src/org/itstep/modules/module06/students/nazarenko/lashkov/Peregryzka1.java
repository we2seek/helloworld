package org.itstep.modules.module06.students.nazarenko.lashkov;

import java.util.Scanner;

public class Peregryzka1 {
    public static void main(String[] args) {
        Peregryzka1 peregr = new Peregryzka1();


        peregr.minmax2((new int[]{1, 1, 0, 1}));
        peregr.minmax2(new byte[]{1, 00, 1});
        peregr.minmax2(new float[]{(float) 3.9, (float) 67.6, 78});
        peregr.minmax2(new short[]{1, 4, 7});
        peregr.minmax2(new double[]{1.0, 1.1, 0.2, 1.3});
    }

    public int[] minmax2(int[] massiv) {
        int n = 0;
        massiv = new int[n];
        int min = massiv[0];
        int max = massiv[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        n = scanner.nextInt();
        for (int i = 1; i < massiv.length; i++) {
            if (i == 1) {
                continue;
            }
            if (massiv[i] < min) {
                min = massiv[i];
            }
            if (massiv[i] > max) {
                max = massiv[i];
            }
            System.out.print(min);
            System.out.print(max);
        }
        return minmax2(massiv);
    }

    public double[] minmax2(double[] massiv) {
        double n = 0;
        massiv = new double[(int) (int) n];
        double min = massiv[0];
        double max = massiv[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        n = scanner.nextDouble();
        for (int i = 1; i < massiv.length; i++) {
            if (i == 1) {
                continue;
            }
            if (massiv[i] < min) {
                min = massiv[i];
            }
            if (massiv[i] > max) {
                max = massiv[i];
            }
            System.out.print(min);
            System.out.print(max);
        }
        return minmax2(massiv);
    }

    public float[] minmax2(float[] massiv) {
        float n = 0;
        massiv = new float[(int) (int) n];
        float min = massiv[0];
        float max = massiv[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        n = scanner.nextFloat();
        for (int i = 1; i < massiv.length; i++) {
            if (i == 1) {
                continue;
            }
            if (massiv[i] < min) {
                min = massiv[i];
            }
            if (massiv[i] > max) {
                max = massiv[i];
            }
            System.out.print(min);
            System.out.print(max);
        }
        return minmax2(massiv);
    }

    public short[] minmax2(short[] massiv) {
        int n = 0;
        massiv = new short[n];
        short min = massiv[0];
        short max = massiv[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        n = scanner.nextShort();
        for (int i = 1; i < massiv.length; i++) {
            if (i == 1) {
                continue;
            }
            if (massiv[i] < min) {
                min = massiv[i];
            }
            if (massiv[i] > max) {
                max = massiv[i];
            }
            System.out.print(min);
            System.out.print(max);
        }
        return minmax2(massiv);
    }

    public byte[] minmax2(byte[] massiv) {
        int n = 0;
        massiv = new byte[n];
        byte min;
        min = massiv[0];
        byte max = massiv[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        n = scanner.nextByte();
        for (int i = 1; i < massiv.length; i++) {
            if (i == 1) {
                continue;
            }
            if (massiv[i] < min) {
                min = massiv[i];
            }
            if (massiv[i] > max) {
                max = massiv[i];
            }
            System.out.print(min);
            System.out.print(max);
        }
        return minmax2(massiv);
    }

    public int max(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            return numberOne;
        } else {
            return numberTwo;
        }
    }

    public double max(double numberOne, double numberTwo) {
        if (numberOne > numberTwo) {
            return numberOne;
        } else {
            return numberTwo;
        }
    }

    public int max(int a, int b, int c) {
        int maxAB = max(a, b);
        return max(maxAB, c);
    }
}
