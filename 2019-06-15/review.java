class review {
    public static void main(String[] args) {
        int[] ar = { 2, 1, 1, 2, 2, 1, 2, 1 };
        // looking to the right neighbor
        for (int i = 0; i < ar.length - 1; i++) {

        }
        // looking to the left neighbor
        for (int i = 1; i < ar.length; i++) {

        }
        // looking both left and right neighbor
        for (int i = 1; i < ar.length - 1; i++) {

        }
        System.out.println("_____________");
        // the location of where a 2 is next to another 2 (right)
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == 2 && ar[i + 1] == 2) {
                System.out.println(i);
                System.out.println(i + 1);
            }
        }
        System.out.println("_____________");
        // the location of where a 2 is next to another 2 (left)
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] == 2 && ar[i - 1] == 2) {
                System.out.println(i);
                System.out.println(i - 1);
            }
        }
        System.out.println("_____________");
        // front edge case
        int ar2[] = { 3, 1, 2, 5, 4, -1, 3 };
        if (ar2[0] > ar2[1]) {
            System.out.println("peak: " + ar2[0]);
            System.out.println("location: " + 0);
        }
        // peaks from the array (highest number in the array)
        for (int i = 1; i < ar2.length - 1; i++) {
            if (ar2[i] > ar2[i + 1] && ar2[i] < ar2[i - 1]) {
                System.out.println("peak: " + ar2[i]);
                System.out.println("location: " + i);
            }
        }
        // end edge case
        if (ar2[ar2.length - 1] > ar2[ar2.length - 2]) {
            System.out.println("peak: " + (ar2.length - 1));
            System.out.println("location: " + (ar2.length - 2));
        }
    }
}