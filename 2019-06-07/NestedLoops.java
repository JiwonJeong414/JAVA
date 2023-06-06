class NestedLoops {
    public static void main(String[] args) {
        for (int j = 5; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("____________");
        String stars = "";
        for (int j = 5; j > 0; j--) {
            for (int i = 1; i < j; i++) {
                System.out.print("-");
            }
            System.out.print(stars);
            stars = stars + "*";
            System.out.println();
        }
        System.out.println("____________");
        for (int i = 1; i < 6; i++) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("____________");
        for (int j = 1; j < 6; j++) {
            for (int i = 1; i < j + 1; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("____________");
        for (int j = 5; j > 0; j--) {
            for (int i = 1; i < j + 1; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("____________");
        for (int j = 1; j < 6; j++) {
            for (int i = j; i < 6; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("____________");
        int b = 1;
        for (int j = 1; j < 6; j++) {
            System.out.print(b + " ");
            b++;
            for (int i = 1; i < j + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("____________");
        int a = 1;
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < j + 1; i++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
        System.out.println("____________");
        for (int j = 5; j > 0; j--) {

            for (int i = 1; i < j + 1; i++) {
                System.out.print(i);
            }
            System.out.print(" ");
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("____________");
        int p = 1;
        int l = 1;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(p);
                p++;
            }
            System.out.print(" ");
            for (int i = 0; i < 3; i++) {
                if (l % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("e");
                }
                l++;
            }
            System.out.println();
        }
        System.out.println("____________");
        for (int j = 1; j < 6; j++) {
            for (int i = 1; i < 6; i++) {
                if (i == j) {
                    System.out.print("#");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
        System.out.println("____________");
        for (int j = 1; j < 6; j++) {
            for (int i = 1; i < 6; i++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("____________");
        String m = "*";
        for (int j = 5; j > 1; j--) {
            for (int i = 1; i < j; i++) {
                System.out.print("-");
            }
            System.out.print(m);
            m = m + "*" + "*";
            for (int i = 1; i < j; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        String w = "-";
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(w);
            }
            if (j % 2 == 0) {
                System.out.print(" | ");
            }
        }
    }
}