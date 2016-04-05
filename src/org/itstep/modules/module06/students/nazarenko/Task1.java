package org.itstep.modules.module06.students.nazarenko;

/**
 * Описать методы, которые возвращают минумум и максимум из двух, трех и четырех чисел ЛЮБЫХ ТИПОВ(byte, short, int, float, double)
 */
public class Task1 {
    public static void main(String[] args) {

        minAndMax(5,6.0);
    }

    //Float
    public static void minAndMax(float a, float b) {
        float[] mass = new float[2];
        mass[0] = a;
        mass[1] = b;
        float min = mass[0];
        float max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    public static void minAndMax(float a, float b, float c) {
        float[] mass = new float[3];
        mass[0] = a;
        mass[1] = b;
        mass[2] = c;
        float min = mass[0];
        float max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    public static void minAndMax(float a, float b, float c, float d) {
        float[] mass = new float[4];
        mass[0] = a;
        mass[1] = b;
        mass[2] = c;
        mass[3] = d;
        float min = mass[0];
        float max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    //Int
    public static void minAndMax(int a, int b) {
        int[] mass = new int[2];
        mass[0] = a;
        mass[1] = b;
        int min = mass[0];
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    public static void minAndMax(int a, int b, int c) {
        int[] mass = new int[3];
        mass[0] = a;
        mass[1] = b;
        mass[2] = c;
        int min = mass[0];
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    public static void minAndMax(int a, int b, int c, int d) {

        int[] mass = new int[4];
        mass[0] = a;
        mass[1] = b;
        mass[2] = c;
        mass[3] = d;
        int min = mass[0];
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    //Short
    public static void minAndMax(short a, short b) {

        short[] mass = new short[2];
        mass[0] = a;
        mass[1] = b;
        short min = mass[0];
        short max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    public static void minAndMax(short a, short b, short c) {

        short[] mass = new short[3];
        mass[0] = a;
        mass[1] = b;
        mass[2] = c;
        short min = mass[0];
        short max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    public static void minAndMax(short a, short b, short c, short d) {

        short[] mass = new short[4];
        mass[0] = a;
        mass[1] = b;
        mass[2] = c;
        mass[3] = d;
        short min = mass[0];
        short max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    //Byte
    public static void minAndMax(byte a, byte b, byte c, byte d) {
        byte[] mass = new byte[4];
        mass[0] = a;
        mass[1] = b;
        mass[2] = c;
        mass[3] = d;
        byte min = mass[0];
        byte max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    public static void minAndMax(byte a, byte b, byte c) {
        byte[] mass = new byte[3];
        mass[0] = a;
        mass[1] = b;
        mass[2] = c;
        byte min = mass[0];
        byte max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    public static void minAndMax(byte a, byte b) {
        byte[] mass = new byte[2];
        mass[0] = a;
        mass[1] = b;
        byte min = mass[0];
        byte max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    //Double
    public static void minAndMax(double a, double b, double c, double d) {
        double[] mass = new double[4];
        mass[0] = a;
        mass[1] = b;
        mass[2] = c;
        mass[3] = d;
        double min = mass[0];
        double max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    public static void minAndMax(double a, double b, double c) {
        double[] mass = new double[3];
        mass[0] = a;
        mass[1] = b;
        mass[2] = c;
        double min = mass[0];
        double max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }

    public static void minAndMax(double a, double b) {
        double[] mass = new double[2];
        mass[0] = a;
        mass[1] = b;
        double min = mass[0];
        double max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.print("MAX= " + max + " \n" + "MIN= " + min + " \n");
    }
}
