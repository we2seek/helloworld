package org.itstep.modules.module10.examples;

import java.util.*;

/**
 * Created by well on 11.04.16.
 */
public class Main3 {
    public static void main(String[] args) {
        String[] names = {
                "Michael Douglas",
                "Arnold Schwarzenegger",
                "Robert Downey",
                "Bruce Willis",
                "Kevin Spacey",
                "Robin Williams"
        };

        Set<String> actors = new HashSet<String>(Arrays.asList(names));

        // Порядок обхода кажется случайным (на самом деле по зависит от hash'a добавляемого элемента)
        System.out.println("HashSet:");
        for (String actor : actors) {
            System.out.println(actor);
        }
        System.out.println();

        actors = new LinkedHashSet<>(Arrays.asList(names));

        // В порядке добавления
        System.out.println("LinkedHashSet:");
        for (String actor : actors) {
            System.out.println(actor);
        }
        System.out.println();

        actors = new TreeSet<>(Arrays.asList(names));

        // Отсортированный по возрастанию порядок
        System.out.println("TreeSet:");
        for (String actor : actors) {
            System.out.println(actor);
        }
        System.out.println();
    }
}
