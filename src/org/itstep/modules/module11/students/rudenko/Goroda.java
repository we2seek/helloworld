package org.itstep.modules.module11.students.rudenko;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Goroda {
    public static void main(String[] args) {
        Gor[] gors = {
                new Gor("Киев", "01001"),
                new Gor("Днепропетровск", "49000"),
                new Gor("Винница", "21000"),
                new Gor("Донецк", "83000"),
                new Gor("Житомир", "10000"),
                new Gor("Запорожье", "69000"),
                new Gor("Ивано-Франковск", "76000"),
                new Gor("Кировоград", "25000"),
                new Gor("Луганск", "91000"),
                new Gor("Луцк", "43000"),
                new Gor("Львов", "79000"),
                new Gor("Тернополь", "46000")};

        List<Gor> gList = Arrays.asList(gors);

        Collections.sort(gList, Gor.GorodComparator());

        for (Gor qwe : gList) {
            System.out.println(qwe);

        }

        System.out.println();

        Collections.sort(gList, Gor.KodComparator());

        for (Gor qwe : gList) {
            System.out.println(qwe);

        }

    }
}