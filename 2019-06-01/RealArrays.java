import java.util.Arrays;

class RealArrays {
    public static void main(String[] args) {
        String b = "*";
        for (int i = 1; i < 6; i++) {
            System.out.println(b);
            b = b + "*";
        }
        String d = "";
        for (int i = 1; i < 6; i++) {
            d += i;
            System.out.println(d);
        }
        String e = "";
        for (int i = 5; i > 0; i--) {
            e += i; // e = e + i;
            System.out.println(e);
        }
        int[] ar = { 1, 2, 3, 4 };
        System.out.println("length: " + ar.length);
        System.out.println("first array slot: " + ar[0]);
        System.out.println("last array slot " + ar[ar.length - 1]);

        int[] ar2 = new int[5];
        int x = 5;
        for (int i = 0; i < 5; i++) {
            ar2[i] = x;
            x = x - 1;
        }

        int[] ar3 = new int[5];
        for (int i = 0; i < ar3.length; i++) {
            ar3[i] = ar3.length - i;
        }
        for (int i = 0; i < ar3.length; i++) {
            System.out.print("index: " + i);
            System.out.println(" value: " + ar3[i]);
        }
        int[] ar4 = { 5, 9, 7, 8, 6 };
        // max
        int max = ar4[0];
        for (int i = 0; i < ar4.length; i++) {
            if (max < ar4[i]) {
                max = ar4[i];
            }
        }
        System.out.println("maximum: " + max);

        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (min > ar[i]) {
                min = ar[i];
            }
        }
        System.out.println("minimum: " + min);

        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        System.out.println("sum: " + sum);
        System.out.println("average: " + (double) sum / ar.length);

        int sumeven = 0;
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                sumeven += ar[i];
                count += 1;
            }
        }
        System.out.println("average of even: " + (double) sumeven / count);
    }
}