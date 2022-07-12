package org.itmo.java.lesson10;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("files/text.txt");
        File file2 = new File("files/output.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(file1);
            os = new FileOutputStream(file2);

            while (is.available() > 0) {
                os.write(is.read());
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (is != null) {
                    is.close();
                }

                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }







    }
}
