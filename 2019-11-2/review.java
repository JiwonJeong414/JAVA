import java.util.*;

class review {
    public static void main(String[] args) {
        // data structures
        // arrays
        int[] ar = new int[5];
        // array lists
        ArrayList<Integer> list = new ArrayList<>();
        // 2d Arrays
        int[][] ar2d = new int[5][5];
        // hash sets
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
        System.out.println(set.size());

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Matthew", 10);
        map.put("Tony", 20);
        map.put("Matthew", 31);

        System.out.println(map);

        map.remove("Tony");
        System.out.println(map);
        System.out.println(map.get("Matthew"));

        System.out.println(map.containsKey("Matthew"));
        System.out.println(map.containsKey("David"));

        map.put("Matthew", map.get("Matthew") + 1);

        System.out.println(map);

        System.out.println(map.get("David"));

        map.put("David", map.getOrDefault("David", 0) + 1);

        // if (map.containsKey("David")) {
        // map.put("David", map.get("David") + 1);
        // } else {
        // map.put("David", 1);
        // }

        System.out.println(map);
        map.put("David", map.getOrDefault("David", 0) + 1);

        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println();
        }
        ar = new int[] { 100, 200, 300, 400 };
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        for (int value : ar) {
            System.out.println(value);
        }
    }
}