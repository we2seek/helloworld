package org.itstep.modules.module12.classwork.filewriter;

import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] names = {"aaa", "aac", "aab", "ada"};
        File file = new File("names.txt");
        FileWriter writer = new FileWriter(file);
        String newLine = System.getProperty("line.separator");

        for (String name : names) {
            writer.write(name + newLine);
        }

        writer.close();
    }
}
