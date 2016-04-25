package org.itstep.modules.module12.classwork;

public class Main_12 {

    public static boolean isTimeBetween(String time, String start, String end) {
        boolean result;

        // eg 18:00 - 23:00
        if (start.compareTo(end) < 0) {
            result = time.compareTo(start) >= 0 && time.compareTo(end) < 0;
        }
        // eg 23:00 - 06:00
        else {
            result = time.compareTo(start) >= 0 || time.compareTo(end) < 0;
        }

        return result;
    }

    public static void main(String[] args) {
        String time = "48:00";
        String message = "";

        if (isTimeBetween(time, "09:00", "18:00")) {
            message = "Good day!";
        } else if (isTimeBetween(time, "18:00", "23:00")) {
            message = "Good evening!";
        } else if (isTimeBetween(time, "23:00", "06:00")) {
            message = "Good night!";
        } else if (isTimeBetween(time, "06:00", "09:00")) {
            message = "Good morning!";
        }

        System.out.println(message);

    }
}
