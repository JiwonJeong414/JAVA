import java.util.*;

class stuff {
    public static void main(String[] args) {
        String s = "hello";
        char[] ar = s.toCharArray();

        System.out.println(Arrays.toString(ar));

        char d = s.charAt(0);
        System.out.println(d);
        System.out.println((int) d);

        // ---------------------------------------------------------

        Integer[] ar2 = { 1, 5, 6, 3, -1, 0 };
        String[] ar3 = { "jane", "john", "aaron", "mary", "zack" };

        Arrays.sort(ar2, (a, b) -> b - a);
        Arrays.sort(ar3, (a, b) -> b.length() - a.length());

        System.out.println(Arrays.toString(ar2));
        System.out.println(Arrays.toString(ar3));

        // ---------------------------------------------------------

        int x[] = { 1, 2, 1 };

        for (int v : x)
            System.out.println(v);

        int pts[][] = { { 1, 1 }, { 2, 1 }, { 0, -1 }, };

        Arrays.sort(pts, (a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));

        for (int[] pt : pts) {
            System.out.println("(" + pt[0] + ", " + pt[1] + ") ");
        }

        // ----------------------------------------------------------

        Pt[] ptss = { new Pt(1, 1), new Pt(2, 1), new Pt(0, -1) };

        Arrays.sort(ptss, (a, b) -> a.x - b.x);

        for (Pt pt : ptss) {
            System.out.println("(" + pt.x + ", " + pt.y + ")");
        }
    }
}

class Pt {
    int x, y;

    Pt(int x, int y) {
        this.x = x;
        this.y = y;
    }
}