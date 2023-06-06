class three_numbers {
    public static void main(String[] args) {
        System.out.println("_______________");
        for (int i = 1; i < 101; i++) {
            if (i % 100 == 0) {
                System.out.println(i);
            } else if (i % 3 == 1) {
                System.out.print(i + " ");
                System.out.print(i + 1 + " ");
                System.out.println(i + 2);
            }
        }
        System.out.println("_______________");
        for (int i = 1; i < 101; i++) {
            if (i % 6 == 1) {
                System.out.print(i + " ");
                System.out.print(i + 1 + " ");
                System.out.println(i + 2);
            } else if (i % 3 == 1) {
                System.out.print(i + 2 + " ");
                System.out.print(i + 1 + " ");
                System.out.println(i);
            }
        }
    }
}