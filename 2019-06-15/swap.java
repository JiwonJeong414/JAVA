import java.util.Arrays;

class swap {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int temp = 0;

        System.out.println(x);
        System.out.println(y);

        // swap the 2
        temp = y;
        y = x;
        x = temp;
        System.out.println(x);
        System.out.println(y);

        int[] ar = { 1, 2, 3 };
        int[] ar2 = new int[ar.length];

        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));

        for (int i = 0; i < ar.length; i++) {
            ar2[i] = ar[i];
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));

        ar[0] = 100;
        ar2[2] = 100;

        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));
    }
}