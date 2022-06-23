package org.itmo.java.lesson3.homework;

public class JavaProgram {
    public static void main(String[] args) {
        Study st = new Study("Изучение Java - это просто!");
        String res = st.printCourse();
        System.out.println(res);

        Car car = new Car();
        Car car1 = new Car("black");

        car.setColor("white");
        car.setName("Skoda");
        car.setWeight(3500);

        car1.setName("Mazda");
        car1.setWeight(3200);

        System.out.println(car);
        System.out.println(car1);

        House h1 = new House();
        House h2 = new House();

        h1.setFloorsCount(3);
        h1.setYear(1990);
        h1.setName("A");

        h2.setFloorsCount(13);
        h2.setYear(2000);
        h2.setName("C");

        System.out.println(h1.getAge() + " " + h1.getFloorsCount() + " " + h1.getYear() + " " + h1.getName());
        System.out.println(h2.getAge() + " " + h2.getFloorsCount() + " " + h2.getYear() + " " + h2.getName());

        Tree t1 = new Tree(15, "Липа");
        Tree t2 = new Tree(20, true, "Дуб");
        Tree t3 = new Tree();

        System.out.println(t1);
        System.out.println(t2);
    }
}
