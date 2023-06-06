class Classes {
    public static void main(String[] args) {
        Person p = new Person("Steve", 48);
        // Person p2 = new Person();
        System.out.println(p.getName());
        System.out.println(p.getAge());

        p.setName("Jiwon");
        p.setAge(13);

        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}