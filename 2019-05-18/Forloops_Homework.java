class Forloops_Homework {
    public static void main(String[] args) {
        System.out.println("_______________");
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("_______________");
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("_______________");
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("_______________");
        for (int i = 1; i < 16; i++) {
            if (i % 3 == 0) {
                System.out.println("three");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("_______________");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("THREE!");
            }
        }
        System.out.println("_______________");
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
            System.out.println(i * 10);
        }
        System.out.println("_______________");
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                System.out.println("even");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("_______________");
        for (int i = 1; i < 9; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                System.out.println(i + 1);
            }
        }
        System.out.println("_______________");
        for (int i = 1; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println("_______________");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("THREE!");
            }
        }
        System.out.println("_______________");
        for (int i = 1; i <= 20; i++) {
            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("_______________");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("_______________");
        for (int i = 1; i < 13; i++) {
            if (i % 4 == 1) {
                System.out.print(i + " ");
                System.out.println(i + 1);
            } else if (i % 4 == 3) {
                System.out.print(i + 1 + " ");
                System.out.println(i);
            }
        }

    }
}