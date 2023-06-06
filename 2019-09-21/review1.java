import java.util.*;

class review1 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int p = 5; p > i; p--) {
                System.out.print("-");
            }
            System.out.println();
        }

        int[] day0 = { 1, 0, 2, 3, 4, 0, 5 };
        int[] day1 = new int[day0.length];

        for (int i = 0; i < day0.length; i++) {
            day1[i] = day0[i];
        }
        for (int i = 0; i < day0.length; i++) {
            if (day0[i] == 0) {
                day1[i - 1] = 0;
                day1[i + 1] = 0;
            }
        }
        System.out.println(Arrays.toString(day1));
    }
}