public class Student {

    public String getFood() {
        return "Pizza";
    }

    public String getInfo() {
        return getFood();
    }

    public static void main(String[] args) {
        Student s1 = new GradStudent();
        System.out.println(s1.getInfo());
    }
}

class GradStudent extends Student {

    public String getFood() {
        return "Taco";
    }

}