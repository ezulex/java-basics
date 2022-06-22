package org.itmo.java.lesson2.homework;

public class Beast {
    private String name;
    private String kind;

    public Beast() {
    }

    public Beast(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Beast{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Beast beast = new Beast();
        Beast beast1 = new Beast("Корова", "Млекопитающее");

        System.out.println(beast1.getName());
        System.out.println(beast1.getKind());

        System.out.println(beast);
        beast.setName("Котт");
        System.out.println(beast);
    }
}
