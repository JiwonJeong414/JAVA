public class subarraysum {
    public static void main(String[] args) {
        int[] ar = { 1, 3, 2, 5, 1, 1, 2, 3 };
        int target = 8;
        // naive
        for (int i = 0; i < ar.length; i++) {
            int sum = ar[i];
            for (int j = i + 1; j < ar.length; j++) {
                sum += ar[j];
                if (sum == target) {
                    printsubArray(ar, i, j);
                }
            }
        }
        // two-pointer
        int i = 0;
        int j = 1;
        int sum = ar[i];
        while (j < ar.length) {
            printsubArray(ar, i, j);
            if (sum < target) {
                sum += ar[j++];
            } else if (sum > target) {
                sum -= ar[i++];
            } else {
                break;
            }
        }
    }

    static void printsubArray(int[] ar, int i, int j) {
        while (i < j) {
            System.out.print(ar[i++] + " ");
        }
        System.out.println();
    }
}
