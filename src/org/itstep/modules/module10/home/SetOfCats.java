package org.itstep.modules.module10.home;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * 1. Создать класс Кот, у которого будет имя и масса.
 * 2. Создать коллекции SET и MAP с котами. Каждая коллекция олжна содержать много котов (не менее 10000);
 * 3. Найти среднекотовое арифметическое по массе (среднюю массу всех котов).
 * 4. Среднюю массу 10 самых тяжелых и 10 самых легких котов.
 */
public class SetOfCats {



    public static void main(String[] args) {
        // Имена для котанов
        ArrayList<String> names = MyUtils.readNamesFromFile("cat_names.txt");
        // Количество котов
        final int COUNT = 10000;
        double sumMass = 0.0;

        Random random = new Random();

        SortedSet<Cat> catSet = new TreeSet<>();

        while (catSet.size() < COUNT) {
            // Случайный номер имени кота в коллекции имен
            int position = random.nextInt(names.size());
            String name = names.get(position);

            // Случайная масса кота от 2.5 до 6.0 кг
            double mass = random.nextDouble() * 3.5 + 2.5;
            sumMass += mass;
            catSet.add(new Cat(name, mass));
        }

        for (Cat cat : catSet) {
            System.out.println(cat);
        }

        // 10 самых тяжелых и самых лёгких котов
        List<Cat> tempList = new ArrayList<>(catSet);
        Set<Cat> lowCats = new TreeSet<>(tempList.subList(0, 10));
        Set<Cat>  highCats = new TreeSet<>(tempList.subList(tempList.size() - 10, tempList.size()));

        System.out.println();
        System.out.println("Всего котов: " + catSet.size());
        System.out.printf("Средняя масса: %.2f", sumMass / catSet.size());
        System.out.println();
        System.out.println();

        System.out.println("10 самых тяжелых котов:");
        double sumOfHigh = 0.0;
        for (Cat cat : highCats) {
            System.out.println(cat);
            sumOfHigh += cat.getMass();
        }
        System.out.printf("Средняя масса: %.4f", sumOfHigh / highCats.size());
        System.out.println();
        System.out.println();

        System.out.println("10 самых лёгких котов:");
        double sumOfLow = 0.0;
        for (Cat cat : lowCats) {
            System.out.println(cat);
            sumOfLow += cat.getMass();
        }
        System.out.printf("Средняя масса: %.4f", sumOfLow / lowCats.size());
        System.out.println();

    }
}
