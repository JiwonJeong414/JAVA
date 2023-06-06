class questions2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.scores(45); // above 50 is passing
        s.scores(60);
        s.scores(70);

        s.printInfo();
    }
}

class Student {
    int passed;
    int failed;
    int average;

    void scores(int scores) {

        average = scores + average;
        if (scores > 50) {
            passed = passed + 1;
        }
        if (scores <= 50) {
            failed = failed + 1;
        }
    }

    void printInfo() {
        System.out.println("passed: " + passed);
        System.out.println("failed: " + failed);
        System.out.println("average:" + (double) average / (passed + failed));
    }
}