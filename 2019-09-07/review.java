class review {
    public static void main(String[] args) {
        // create an instance
        Person p = new Person();
        Person p2 = new Person("Billy", 9);

        System.out.println(p);
        p.name = "Bob";
        p.age = 17;
        System.out.println(p.name);
        System.out.println(p.age);

        System.out.println(p2.name);
        System.out.println(p2.age);

        p.print();
        p2.print();
    }
}

class Person {
    // instance variables
    String name;
    int age;

    // constructors
    Person() {

    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // instance methods
    void print() {
        System.out.println("Hello I am " + this.name);
    }
}