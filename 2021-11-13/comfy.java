import java.util.*;
import java.io.*;

class comfy {
    static int N;
    static int SIZE = 9; // 1002;
    static int[] dy = { -1, 1, 0, 0, 0 };
    static int[] dx = { 0, 0, -1, 1, 0 };
    static boolean[][] cow;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("comfy.in"));
        N = in.nextInt();

        // int[][] adj = new int[SIZE * 2][SIZE * 2];
        cow = new boolean[SIZE * 2][SIZE * 2];

        for (int i = 0; i < N; i++) {
            int cnt = -1;
            Deque<int[]> toPlace = new LinkedList<>();
            Deque<int[]> history = new LinkedList<>();
            int inputX = in.nextInt() + 2;
            int inputY = in.nextInt() + 2;
            toPlace.add(new int[] { inputY, inputX });

            while (!toPlace.isEmpty()) {
                int[] cur = toPlace.remove();
                history.add(cur);
                int y = cur[0];
                int x = cur[1];
                // System.out.println("adding to: " + y + "," + x);
                if (cow[y][x])
                    continue;
                cnt++;

                // PLACE a cow
                cow[y][x] = true;

                // check if we have a new comfy cow
                for (int j = 0; j < 5; j++) {
                    int yy = y + dy[j];
                    int xx = x + dx[j];
                    if (countAdj(yy, xx) == 3 && cow[yy][xx]) {
                        for (int k = 0; k < 4; k++) {
                            int yyy = yy + dy[k];
                            int xxx = xx + dx[k];
                            if (cow[yyy][xxx] == false) {
                                toPlace.add(new int[] { yyy, xxx });
                            }
                        }
                    }
                }
            }

            for (int[] c : history) {
                int y = c[0];
                int x = c[1];
                cow[y][x] = false;
            }
            cow[inputY][inputX] = true;

            for (boolean[] row : cow) {
                for (boolean b : row) {
                    System.out.print(b ? "*" : "-");
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();

            System.out.println(cnt);
        }
    }

    private static int countAdj(int yy, int xx) {
        return 0;
    }
}