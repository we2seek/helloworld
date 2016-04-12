package org.itstep.modules.module10.home;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class MapOfCats {
    public static void main(String[] args) {
        // Имена для котанов
        ArrayList<String> names = MyUtils.readNamesFromFile("cat_names.txt");
        // Количество котов
        final int COUNT = 10;
        double sumMass = 0.0;

        Random random = new Random();

        Map<Double, Cat> catMap = new TreeMap<>();
        while (catMap.size() < COUNT) {
            // Случайный номер имени кота в коллекции имен
            int position = random.nextInt(names.size());
            String name = names.get(position);

            // Случайная масса кота от 2.5 до 6.0 кг
            double mass = random.nextDouble() * 3.5 + 2.5;
            sumMass += mass;

            catMap.put(mass, new Cat(name, mass));
        }

        System.out.println(catMap);
    }
}
