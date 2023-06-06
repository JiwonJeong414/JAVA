import java.util.*;
import java.io.*;

class classone {
    public static void main(String[] args) throws Exception {
        Pet p1 = new Pet();
        Pet p2 = new Pet("Risbah", 17);

        p1.setName("Joshua");
        p1.setAge(19);
        System.out.println(p1.toString());
        System.out.println(p2.getName());
        System.out.println(p2.toString());
    }
}

class Pet {
    private String name;
    private int age;

    public Pet() {
        name = "";
        age = 0;
    }

    public Pet(String initName, int initAge) {
        name = initName;
        age = initAge;
    }

    public void setName(String initName) {
        name = initName;
    }

    public void setAge(int initAge) {
        age = initAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}