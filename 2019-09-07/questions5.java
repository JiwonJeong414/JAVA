class questions5 {
    public static void main(String[] args) {
        Student s = new Student();
        s.eng(4);
        s.math(12);
        s.sci(7);
        s.sci(14);
        s.sci(2);
        s.eng(20);

        s.printScores();
    }
}

class Student {
    int eng;
    int math;
    int sci;

    void eng(int hours) {
        eng = hours + eng;
    }

    void math(int hours) {
        math = hours + math;
    }

    void sci(int hours) {
        sci = hours + sci;
    }

    void printScores() {
        System.out.println("eng: " + (90 + (eng / 10)));
        System.out.println("math: " + (90 + (math / 10)));
        System.out.println("sci: " + (90 + (sci / 10)));
        System.out.println("avg: " + (double) ((90 + (eng / 10)) + (90 + (math / 10)) + (90 + (sci / 10))) / 3);
    }
}