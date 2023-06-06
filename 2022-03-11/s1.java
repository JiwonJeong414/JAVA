import java.util.*;
import java.io.*;

class s1 {
    public static void main(String[] args) throws Exception {
        char[][] mat = { { 'x', 'o', 'o' }, { 'x', 'o', 'x' }, { 'o', 'x', 'x' } };
        if (mat[0][0] == mat[0][1] && mat[0][1] == (mat[0][2])) {
            System.out.println("hi");
        }
    }
}
