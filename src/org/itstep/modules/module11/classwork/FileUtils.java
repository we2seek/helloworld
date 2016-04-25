package org.itstep.modules.module11.classwork;

import org.itstep.modules.module10.home.SetOfCats;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by well on 13.04.16.
 */
public class FileUtils {
    /**
     * Получить путь к текущему пакету, чтобы файл сохранялся не в корне проекта.
     *
     * @return Получить путь к текущему пакету, например, "src/com/example/package/"
     */
    private static String getPathToCurrentPackage() {
        String dirSeparator = File.separator;
        String outputDir = SetOfCats.class.getCanonicalName().replace(".", dirSeparator);
        outputDir = outputDir.substring(0, outputDir.lastIndexOf(dirSeparator));
        outputDir = "src" + dirSeparator + outputDir + dirSeparator;
        return outputDir;
    }

    public static <T extends Comparable<? super T>> void writeToFile(String filename, List<T> list) {

        filename = getPathToCurrentPackage() + filename;

        if (list.size() == 0) {
            return;
        }

//        Collections.sort(list);

        try (FileWriter fileWriter = new FileWriter(filename)) {
            int totalSize = list.size();
            int currentLine = 0;

            for (T line : list) {
                fileWriter.write(line + System.getProperty("line.separator"));
                int part = (int) ((double) ++currentLine / totalSize * 100);
                System.out.println(String.format("SAVE %3d%% %s", part, line));

            }
        } catch (FileNotFoundException e) {
            System.err.println("No such file or directory: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> readNamesFromFile(String filename) {
        ArrayList<String> result = new ArrayList<>();
        File file = null;
        Scanner scanner = null;

        filename = getPathToCurrentPackage() + filename;

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
}
