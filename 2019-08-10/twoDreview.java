class twoDreview {
    public static void main(String[] args) {
        int[][] ar = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        display2d(ar);
        ar[0][0] = 0;
        ar[2][2] = 0;
        ar[2][0] = 0;
        ar[0][2] = 0;
        display2d(ar);

        int[][] ar2 = new int[10][10];
        for (int r = 0; r < ar2.length; r++) {
            for (int c = 0; c < ar2[r].length; c++) {
                ar2[r][c] = (r * 10) + c;
            }
        }
        display2d(ar2);

        // create a boolean 2d array of 10 * 10
        // create a new method called displayFlag
        boolean[][] ar3 = new boolean[8][16];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 8; c++) {
                ar3[r][c] = true;
            }
        }
        displayFlag(ar3);
        boolean[][] ar4 = new boolean[10][10];
        for (int r = 0; r < ar4.length; r++) {
            for (int c = 0; c < ar4[r].length; c++) {
                if (r == 0 || r == 9) {
                    ar4[r][c] = true;
                }
                if (c == 0 || c == 9) {
                    ar4[r][c] = true;
                }
                if (c == r) {
                    ar4[r][c] = true;
                }
                if (r + c == 9) {
                    ar4[r][c] = true;
                }
            }
        }
        displayFlag(ar4);
    }

    public static void displayFlag(boolean[][] ar3) {
        // if the array location ar[r][c] is false, display "-"
        // if the array location ar[r][c] is true, display "*"
        for (int r = 0; r < ar3.length; r++) {
            for (int c = 0; c < ar3[r].length; c++) {
                if (ar3[r][c] == false) {
                    System.out.print("- ");
                }
                if (ar3[r][c] == true) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void display2d(int[][] ar) {
        // display the 2d array
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                System.out.print(ar[r][c] + " ");
            }
            System.out.println();
        }

    }
}