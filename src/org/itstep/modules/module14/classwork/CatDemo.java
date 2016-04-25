package org.itstep.modules.module14.classwork;

import java.util.*;

class Cat implements Comparable<Cat> {

    private static char[] letters;
    private static Random r = new Random();

    static {
        letters = new char[52];
        for (int i = 0; i < letters.length / 2; i++) {
            letters[i] = (char) (i + 97);
            letters[i + 26] = (char) (i + 65);
        }
    }

    String name;
    double mass;

    Cat(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    Cat() {
        this.name = genRandomName(10);
        this.mass = genRandomMass();
    }

    public String genRandomName(int size) {
        // Cat.letters
        StringBuilder sb = new StringBuilder(size);

        for (int i = 0; i < size; i++) {
            int index = r.nextInt(letters.length);
            sb.append(letters[index]);
        }

        return sb.toString();
    }

    public double genRandomMass() {
        return r.nextDouble() * 3.5 + 2.5;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", mass=" + String.format("%.2f", mass) +
                '}';
    }

    @Override
    public int compareTo(Cat o) {

        return Double.valueOf(this.mass)
                .compareTo(o.mass);
    }
}

public class CatDemo {
    public static void main(String[] args) {
        Set<Cat> cats = new TreeSet<>();
        final int CATS_COUNT = 10;
        for (int i = 0; i < CATS_COUNT; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }

        double totalWeight = 0;
        for (Cat cat : cats) {
            System.out.println(cat);
            totalWeight += cat.mass;
        }
        System.out.printf("%.2f\n", totalWeight);

        List<Cat> tempList = new ArrayList<>(cats);
        Set<Cat> lowCats = new TreeSet<>(tempList.subList(0, 3));
        Set<Cat> highCats = new TreeSet<>(tempList.subList(tempList.size() - 3, tempList.size()));

        System.out.println("Lowest cats:");
        for (Cat cat : lowCats) {
            System.out.println(cat);
        }
        System.out.println("Highest cats:");
        for (Cat cat : highCats) {
            System.out.println(cat);
        }
    }

}
