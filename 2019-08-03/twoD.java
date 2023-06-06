class twoD {
    public static void main(String[] args) {
        int[][] ar = new int[3][3];

        int[][] ar2 = { { 1, 2 }, { 3, 4 } };

        // change the 4 corners to 1
        ar[0][0] = 1;
        ar[0][2] = 1;
        ar[2][0] = 1;
        ar[2][2] = 1;
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                System.out.print(ar[r][c] + " ");
            }
            System.out.println();
        }
        for (int r = 0; r < ar2.length; r++) {
            for (int c = 0; c < ar2[r].length; c++) {
                System.out.print(ar2[r][c] + " ");
            }
            System.out.println();
        }
        // Homework
        // change every single array slots 0 ~ 99 with using for loop
        int[][] homework = new int[10][10];
        int i = 0;
        for (int r = 0; r < homework.length; r++) {
            for (int c = 0; c < homework[r].length; c++) {
                homework[r][c] = i;
                i++;
            }
        }
        for (int r = 0; r < homework.length; r++) {
            for (int c = 0; c < homework[r].length; c++) {
                System.out.print(homework[r][c] + " ");
            }
            System.out.println();
        }
    }
}