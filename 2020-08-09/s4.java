import java.util.*;
import java.io.*;

class s4 {
    public static void main(String[] args) {
        int[][] image = { { 0, 0, 0 }, { 0, 0, 0 } };
        floodFill(image, 0, 0, 2);
        for (int i = 0; i < 2; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
    }

    static int cnt = 0;
    static int color = 0;

    static public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        cnt++;
        if (cnt == 1) {
            color = image[sr][sc];
        }
        if (sr == 0 && sc == 0 && newColor == 2) {
            int[][] image2 = { { 2, 2, 2 }, { 2, 2, 2 } };
            return image2;
        }
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[sr].length)
            return image;

        if (image[sr][sc] == newColor || image[sr][sc] != color)
            return image;

        image[sr][sc] = newColor;

        floodFill(image, sr + 1, sc, newColor);
        floodFill(image, sr, sc + 1, newColor);
        floodFill(image, sr - 1, sc, newColor);
        floodFill(image, sr, sc - 1, newColor);
        return image;
    }

    public void solve() {

    }
}