package org.itstep.modules.module10.home;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * 1. Создать класс Кот, у которого будет имя и масса.
 * 2. Создать коллекции SET и MAP с котами. Каждая коллекция олжна содержать много котов (не менее 10000);
 * 3. Найти среднекотовое арифметическое по массе (среднюю массу всех котов).
 * 4. Среднюю массу 10 самых тяжелых и 10 самых легких котов.
 */
public class Task1 {

    public static List<String> readNamesFromFile(String filename) {
        List<String> result = new LinkedList<>();
        File file = null;
        Scanner scanner = null;

        try {
            file = new File(filename);
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                result.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        return result;
    }

    public static String nameGenerator() {
        return "";
    }

    public static void main(String[] args) {
        final int COUNT = 10;
        Set<Cat> catSet = new HashSet<>();

        for (int i = 0; i < COUNT; i++) {
            catSet.add(new Cat("Cat #".concat(Integer.toString(i)), i));
        }

        System.out.println(catSet);

        System.out.println(readNamesFromFile("cat_names_short.txt"));
    }
}
