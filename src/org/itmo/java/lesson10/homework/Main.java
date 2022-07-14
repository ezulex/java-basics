package org.itmo.java.lesson10.homework;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("src/org/itmo/java/lesson10/homework/files/firstfile.txt");
        File file2 = new File("src/org/itmo/java/lesson10/homework/files/secondfile.txt");
        File file3 = new File("src/org/itmo/java/lesson10/homework/files/thirdfile.txt");
        File file4 = new File("src/org/itmo/java/lesson10/homework/files/forthfile.txt");

//        List<String> resultReadFile = FilesMethodLibrary.readFileLine(file1);
//        System.out.println(resultReadFile);
//
//        FilesMethodLibrary.writeFile("Hello", file2);
//        System.out.println(FilesMethodLibrary.readFileLine(file2));
//
//        FilesMethodLibrary.mergeFiles(file1, file2, file3);
//        System.out.println(FilesMethodLibrary.readFileLine(file3));

        FilesMethodLibrary.replaceChars(file3, file4);
        System.out.println(FilesMethodLibrary.readFileLine(file3));

    }
}
