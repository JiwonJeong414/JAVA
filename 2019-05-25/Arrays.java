class Arrays {
    public static void main(String[] args) {
        int ar[] = { 1, 4, 2, 5, 3 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxeven = 0;
        int sum = 0;
        int sum1 = 0;
        int count = 0;
        for (int v : ar) {
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
            if (v > maxeven && v % 2 == 0) {
                maxeven = v;
            }
            sum += v;
            if (v % 2 == 0) {
                sum1 += v;
                count += 1;
            }
        }
        System.out.println("maximum:" + max);
        System.out.println("minimum:" + min);
        System.out.println("maximum of even:" + maxeven);
        System.out.println("average:" + (double) sum / ar.length);
        System.out.println("average of even:" + (double) sum1 / count);
    }
}