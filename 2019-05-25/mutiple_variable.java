class mutiple_variable {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            System.out.print(i + " ");
            System.out.println(i + 1);
        }
        System.out.println("___________");
        for (int i = 1; i < 12; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                System.out.println(i + 1);
            }
        }
        System.out.println("___________");
        int j = 1;
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
            System.out.println(j);
            j *= 2;
        }
        System.out.println("___________");
        int c = 1;
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
            System.out.print(c + " ");
            System.out.println(i + c);
            c *= 2;
        }
    }
}