package org.itmo.java.lesson10.homework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FilesMethodLibrary {
    public static List<String> readFileLine(File file) {
        List<String> lineList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineList.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return lineList;
    }

    public static void writeFile(String string, File file) {
        Path path = Paths.get(String.valueOf(file));
        try {
            if(file.exists() && !file.isDirectory()) {
                Files.writeString(path, string + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(path, string + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

    public static void mergeFiles(File file1, File file2, File file3) {
        List<String> firstFile = readFileLine(file1);
        List<String> secondFile = readFileLine(file2);

        for (String s : firstFile) {
            writeFile(s, file3);
        }

        for (String s : secondFile) {
            writeFile(s, file3);
        }
    }

    public static void replaceChars(File file, File file2) {
        List<String> lineList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line;
            while ((line = reader.readLine()) != null) {
                lineList.add(line);
            }

            for (String s : lineList) {
                char[] result = s.toCharArray();
                for (int i = 0; i < result.length; i++) {
                    if (!Character.isLetter(result[i]) && !Character.isDigit(result[i])) {
                        result[i] = '$';
                    }
                }
                writeFile(String.valueOf(result), file2);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
