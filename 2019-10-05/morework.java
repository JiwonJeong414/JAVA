class morework {
    public static void main(String[] args) {
        int[][] ar = new int[4][4];

        ar[0][0] = 1;
        ar[0][1] = 2;
        ar[0][2] = 3;
        ar[0][3] = 4;
        ar[3][1] = 5;
        ar[3][2] = 6;
        ar[3][3] = 7;
        ar[0][0] = 1;
        ar[0][0] = 1;
        ar[0][0] = 1;
        ar[0][0] = 1;
        ar[0][0] = 1;
        ar[0][0] = 1;
        ar[0][0] = 1;
        ar[0][0] = 1;
        ar[0][0] = 1;

        spiral(ar);
    }

    static void spiral(int[][] ar) {
        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                System.out.print(ar[r][c] + " ");
            }
            System.out.println();
        }
    }
}