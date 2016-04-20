package org.itstep.modules.module13.classwork.regex.demo00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Поиск совпадений. Для выхода введите \"exit\".");

        while (true) {
            System.out.print("Введите регулярное выражение: ");
            String regEx = reader.readLine();
            if ("exit".equalsIgnoreCase(regEx)) {
                break;
            }

            System.out.print("Введите строку: ");
            String text = reader.readLine();

            if ("exit".equalsIgnoreCase(text)) {
                break;
            }

            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(text);

            boolean found = false;

            while (matcher.find()) {
                System.out.printf("Найдено совпадение: \"%s\" начало %d, конец %d.%n",
                        matcher.group(),
                        matcher.start(),
                        matcher.end()
                );
                found = true;
            }

            if (!found) {
                System.out.println("Совпадений не найдено");
            }

        }

    }
}
