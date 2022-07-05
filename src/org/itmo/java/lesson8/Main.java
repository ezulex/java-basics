package org.itmo.java.lesson8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Main {

    static Logger logger = Logger.getLogger("Logger");

    public static void main(String[] args) {
        try {
            methodWithException();
        } catch (NumberFormatException e) {
//            System.err.println(e.getMessage());
            logger.warning(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }

//        uncheckedExceptionMethod();
    }

    public static void methodWithException() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        logger.info(String.valueOf(i));
    }

    public static void uncheckedExceptionMethod() throws MyUncheckedException {
        throw new MyUncheckedException("MyUncheckedException");
    }
}
