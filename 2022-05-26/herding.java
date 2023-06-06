import java.util.*;
import java.io.*;

public class herding {
    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));
    }

    public static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.substring(0, 1).equals("x")) {
            System.out.println("hello");
            return countX(str.substring(1)) + 1;
        } else {
            return countX(str.substring(1));
        }
    }

}
