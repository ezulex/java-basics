package org.itmo.java.lesson3.homework;

public class JavaProgram {
    public static void main(String[] args) {
        Study st = new Study("Изучение Java - это просто!");
        String res = st.printCourse();
        System.out.println(res);
    }
}
